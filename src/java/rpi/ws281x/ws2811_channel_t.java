package rpi.ws281x;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ws2811_channel_t extends Structure {
    /** < GPIO Pin with PWM alternate function, 0 if unused */
    public int gpionum;
    /** < Invert output signal */
    public int invert;
    /** < Number of LEDs, 0 if channel is unused */
    public int count;
    /** < Strip color layout -- one of WS2811_STRIP_xxx constants */
    public int strip_type;
    /**
     * < LED buffers, allocated by driver based on count<br>
     * C type : ws2811_led_t*
     */
    public IntByReference leds;
    /** < Brightness value between 0 and 255 */
    public byte brightness;
    /** < White shift value */
    public byte wshift;
    /** < Red shift value */
    public byte rshift;
    /** < Green shift value */
    public byte gshift;
    /** < Blue shift value */
    public byte bshift;
    public ws2811_channel_t() {
        super();
    }
    protected List<String> getFieldOrder() {
        return Arrays.asList("gpionum", "invert", "count", "strip_type", "leds", "brightness", "wshift", "rshift", "gshift", "bshift");
    }
    public ws2811_channel_t(int gpionum,int invert,int count, byte brightness, int strip_type) {
        super();
        this.gpionum = gpionum;
        this.invert = invert;
        this.count = count;
        this.brightness = brightness;
        this.strip_type = strip_type;
    }
    public ws2811_channel_t(Pointer peer) {
        super(peer);
    }
    public static class ByReference extends ws2811_channel_t implements Structure.ByReference {

    };
    public static class ByValue extends ws2811_channel_t implements Structure.ByValue {

    };
}

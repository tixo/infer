package java.util;

import com.facebook.infer.models.InferUndefined;

import javax.xml.parsers.DocumentBuilder;
import java.io.*;

public class Properties extends Hashtable<Object, Object> {

    private static long serialVersionUID;

    private transient DocumentBuilder builder;

    private static String PROP_DTD_NAME;

    private static String PROP_DTD;

    protected Properties defaults;

    private static int NONE, SLASH, UNICODE, CONTINUE, KEY_DONE, IGNORE;


    public Properties() {
    }

    public Properties(Properties defaults) {
        this.defaults = defaults;
    }

    public synchronized void load(Reader reader) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public synchronized void load(InputStream inStream) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void store(Writer writer, String comments) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void store(OutputStream out, String comments) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public synchronized void loadFromXML(InputStream in) throws IOException,
            InvalidPropertiesFormatException {
        in.close();
    }

    public synchronized void storeToXML(OutputStream os, String comment)
            throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public synchronized void storeToXML(OutputStream os, String comment,
                                        String encoding) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

}

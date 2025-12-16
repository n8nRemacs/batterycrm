package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ba3 implements cz9 {
    public static final Logger a = Logger.getLogger(ba3.class.getName());

    @Override // defpackage.cz9
    public final InputStream n(String str) {
        InputStream resourceAsStream = ba3.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}

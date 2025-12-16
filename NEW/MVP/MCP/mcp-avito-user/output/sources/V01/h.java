package V01;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class h {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}

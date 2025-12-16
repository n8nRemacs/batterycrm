package Z71;

import java.io.IOException;
import java.io.InputStream;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: IOUtil.java */
/* loaded from: classes7.dex */
public final class a {
    public static void a(InputStream inputStream) throws IOException {
        try {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    throw new MockitoException("Problems closing stream: " + inputStream, e12);
                }
            }
        } catch (MockitoException unused) {
        }
    }
}

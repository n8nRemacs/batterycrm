package wW0;

import com.facebook.common.internal.u;
import com.facebook.imagepipeline.memory.z;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PooledByteBufferOutputStream.java */
@Nullsafe
/* loaded from: classes5.dex */
public abstract class i extends OutputStream {
    public abstract z a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e12) {
            u.a(e12);
            throw null;
        }
    }

    public abstract int size();
}

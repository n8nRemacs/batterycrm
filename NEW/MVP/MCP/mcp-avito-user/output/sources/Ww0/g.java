package wW0;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.memory.z;
import java.io.InputStream;

/* compiled from: PooledByteBufferFactory.java */
/* loaded from: classes5.dex */
public interface g {
    z a(InputStream inputStream);

    z b(int i12, InputStream inputStream);

    MemoryPooledByteBufferOutputStream c();

    z d(byte[] bArr);

    MemoryPooledByteBufferOutputStream e(int i12);
}

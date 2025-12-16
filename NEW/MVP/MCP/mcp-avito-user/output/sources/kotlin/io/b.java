package kotlin.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* compiled from: IOStreams.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class b {
    public static final long a(@Y61.k InputStream inputStream, @Y61.k OutputStream outputStream, int i12) throws IOException {
        byte[] bArr = new byte[i12];
        int i13 = inputStream.read(bArr);
        long j12 = 0;
        while (i13 >= 0) {
            outputStream.write(bArr, 0, i13);
            j12 += i13;
            i13 = inputStream.read(bArr);
        }
        return j12;
    }

    @InterfaceC42733c0
    @Y61.k
    public static final byte[] c(@Y61.k InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream, 8192);
        return byteArrayOutputStream.toByteArray();
    }
}

package androidx.media3.datasource;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: ByteArrayDataSink.java */
@J
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f48230a;

    @Override // androidx.media3.datasource.i
    public final void close() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.f48230a;
        int i12 = M.f47887a;
        byteArrayOutputStream.close();
    }

    @Override // androidx.media3.datasource.i
    public final void e(o oVar) {
        long j12 = oVar.f48251g;
        if (j12 == -1) {
            this.f48230a = new ByteArrayOutputStream();
        } else {
            C23110a.b(j12 <= 2147483647L);
            this.f48230a = new ByteArrayOutputStream((int) j12);
        }
    }

    @Override // androidx.media3.datasource.i
    public final void write(byte[] bArr, int i12, int i13) {
        ByteArrayOutputStream byteArrayOutputStream = this.f48230a;
        int i14 = M.f47887a;
        byteArrayOutputStream.write(bArr, i12, i13);
    }
}

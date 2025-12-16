package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.a;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: Id3Peeker.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.util.z f50353a = new androidx.media3.common.util.z(10);

    @P
    public final Metadata a(C23191j c23191j, @P a.InterfaceC1853a interfaceC1853a) throws EOFException, InterruptedIOException {
        androidx.media3.common.util.z zVar = this.f50353a;
        Metadata metadataC = null;
        int i12 = 0;
        while (true) {
            try {
                c23191j.a(zVar.f47962a, 0, 10, false);
                zVar.F(0);
                if (zVar.w() != 4801587) {
                    break;
                }
                zVar.G(3);
                int iT2 = zVar.t();
                int i13 = iT2 + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i13];
                    System.arraycopy(zVar.f47962a, 0, bArr, 0, 10);
                    c23191j.a(bArr, 10, iT2, false);
                    metadataC = new androidx.media3.extractor.metadata.id3.a(interfaceC1853a).c(i13, bArr);
                } else {
                    c23191j.k(iT2, false);
                }
                i12 += i13;
            } catch (EOFException unused) {
            }
        }
        c23191j.f50585f = 0;
        c23191j.k(i12, false);
        return metadataC;
    }
}

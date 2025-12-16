package androidx.media3.extractor;

import androidx.media3.common.C23108t;
import androidx.media3.common.InterfaceC23102m;
import androidx.media3.extractor.J;
import j.P;
import java.io.EOFException;

/* compiled from: DummyTrackOutput.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23196o implements J {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f51082a = new byte[4096];

    @Override // androidx.media3.extractor.J
    public final int c(InterfaceC23102m interfaceC23102m, int i12, boolean z12) throws EOFException {
        byte[] bArr = this.f51082a;
        int i13 = interfaceC23102m.read(bArr, 0, Math.min(bArr.length, i12));
        if (i13 != -1) {
            return i13;
        }
        if (z12) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.J
    public final void d(int i12, androidx.media3.common.util.z zVar) {
        zVar.G(i12);
    }

    @Override // androidx.media3.extractor.J
    public final void b(C23108t c23108t) {
    }

    @Override // androidx.media3.extractor.J
    public final void f(long j12, int i12, int i13, int i14, @P J.a aVar) {
    }
}

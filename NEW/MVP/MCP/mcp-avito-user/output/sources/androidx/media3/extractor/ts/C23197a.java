package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.extractor.C23183b;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.ts.D;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: Ac3Extractor.java */
@J
/* renamed from: androidx.media3.extractor.ts.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23197a implements androidx.media3.extractor.p {

    /* renamed from: a, reason: collision with root package name */
    public final C23198b f51545a = new C23198b();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.z f51546b = new androidx.media3.common.util.z(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f51547c;

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f51547c = false;
        this.f51545a.a();
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(androidx.media3.extractor.q qVar) throws EOFException, InterruptedIOException {
        C23191j c23191j;
        int iA2;
        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(10);
        int i12 = 0;
        while (true) {
            c23191j = (C23191j) qVar;
            c23191j.a(zVar.f47962a, 0, 10, false);
            zVar.F(0);
            if (zVar.w() != 4801587) {
                break;
            }
            zVar.G(3);
            int iT2 = zVar.t();
            i12 += iT2 + 10;
            c23191j.k(iT2, false);
        }
        c23191j.f50585f = 0;
        c23191j.k(i12, false);
        int i13 = 0;
        int i14 = i12;
        while (true) {
            c23191j.a(zVar.f47962a, 0, 6, false);
            zVar.F(0);
            if (zVar.z() != 2935) {
                c23191j.f50585f = 0;
                i14++;
                if (i14 - i12 >= 8192) {
                    return false;
                }
                c23191j.k(i14, false);
                i13 = 0;
            } else {
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.f47962a;
                if (bArr.length < 6) {
                    iA2 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA2 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b12 = bArr[4];
                    iA2 = C23183b.a((b12 & 192) >> 6, b12 & 63);
                }
                if (iA2 == -1) {
                    return false;
                }
                c23191j.k(iA2 - 6, false);
            }
        }
    }

    @Override // androidx.media3.extractor.p
    public final int h(androidx.media3.extractor.q qVar, androidx.media3.extractor.F f12) throws EOFException, InterruptedIOException {
        androidx.media3.common.util.z zVar = this.f51546b;
        int i12 = ((C23191j) qVar).read(zVar.f47962a, 0, 2786);
        if (i12 == -1) {
            return -1;
        }
        zVar.F(0);
        zVar.E(i12);
        boolean z12 = this.f51547c;
        C23198b c23198b = this.f51545a;
        if (!z12) {
            c23198b.d(4, 0L);
            this.f51547c = true;
        }
        c23198b.c(zVar);
        return 0;
    }

    @Override // androidx.media3.extractor.p
    public final void i(androidx.media3.extractor.r rVar) {
        this.f51545a.e(rVar, new D.e(0, 1));
        rVar.b();
        rVar.e(new H.b(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}

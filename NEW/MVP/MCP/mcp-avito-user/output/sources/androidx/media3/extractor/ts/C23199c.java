package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.ts.D;
import java.io.EOFException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.Http2;

/* compiled from: Ac4Extractor.java */
@J
/* renamed from: androidx.media3.extractor.ts.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23199c implements androidx.media3.extractor.p {

    /* renamed from: a, reason: collision with root package name */
    public final C23200d f51560a = new C23200d();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.z f51561b = new androidx.media3.common.util.z(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f51562c;

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f51562c = false;
        this.f51560a.a();
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(androidx.media3.extractor.q qVar) throws EOFException, InterruptedIOException {
        C23191j c23191j;
        int i12;
        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(10);
        int i13 = 0;
        while (true) {
            c23191j = (C23191j) qVar;
            c23191j.a(zVar.f47962a, 0, 10, false);
            zVar.F(0);
            if (zVar.w() != 4801587) {
                break;
            }
            zVar.G(3);
            int iT2 = zVar.t();
            i13 += iT2 + 10;
            c23191j.k(iT2, false);
        }
        c23191j.f50585f = 0;
        c23191j.k(i13, false);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            int i16 = 7;
            c23191j.a(zVar.f47962a, 0, 7, false);
            zVar.F(0);
            int iZ2 = zVar.z();
            if (iZ2 == 44096 || iZ2 == 44097) {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] bArr = zVar.f47962a;
                if (bArr.length < 7) {
                    i12 = -1;
                } else {
                    int i17 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i17 == 65535) {
                        i17 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i16 = 4;
                    }
                    if (iZ2 == 44097) {
                        i16 += 2;
                    }
                    i12 = i17 + i16;
                }
                if (i12 == -1) {
                    return false;
                }
                c23191j.k(i12 - 7, false);
            } else {
                c23191j.f50585f = 0;
                i15++;
                if (i15 - i13 >= 8192) {
                    return false;
                }
                c23191j.k(i15, false);
                i14 = 0;
            }
        }
    }

    @Override // androidx.media3.extractor.p
    public final int h(androidx.media3.extractor.q qVar, androidx.media3.extractor.F f12) throws EOFException, InterruptedIOException {
        androidx.media3.common.util.z zVar = this.f51561b;
        int i12 = ((C23191j) qVar).read(zVar.f47962a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i12 == -1) {
            return -1;
        }
        zVar.F(0);
        zVar.E(i12);
        boolean z12 = this.f51562c;
        C23200d c23200d = this.f51560a;
        if (!z12) {
            c23200d.d(4, 0L);
            this.f51562c = true;
        }
        c23200d.c(zVar);
        return 0;
    }

    @Override // androidx.media3.extractor.p
    public final void i(androidx.media3.extractor.r rVar) {
        this.f51560a.e(rVar, new D.e(0, 1));
        rVar.b();
        rVar.e(new H.b(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}

package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import v61.InterfaceC49174e;

/* compiled from: OggExtractor.java */
@J
/* loaded from: classes.dex */
public class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f51102a;

    /* renamed from: b, reason: collision with root package name */
    public h f51103b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51104c;

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        h hVar = this.f51103b;
        if (hVar != null) {
            d dVar = hVar.f51120a;
            e eVar = dVar.f51105a;
            eVar.f51110a = 0;
            eVar.f51111b = 0L;
            eVar.f51112c = 0;
            eVar.f51113d = 0;
            eVar.f51114e = 0;
            dVar.f51106b.C(0);
            dVar.f51107c = -1;
            dVar.f51109e = false;
            if (j12 == 0) {
                hVar.d(!hVar.f51131l);
                return;
            }
            if (hVar.f51127h != 0) {
                long j14 = (hVar.f51128i * j13) / 1000000;
                hVar.f51124e = j14;
                f fVar = hVar.f51123d;
                int i12 = M.f47887a;
                fVar.c(j14);
                hVar.f51127h = 2;
            }
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        try {
            return c((C23191j) qVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @InterfaceC49174e
    public final boolean c(C23191j c23191j) {
        boolean zD2;
        e eVar = new e();
        if (eVar.a(c23191j, true) && (eVar.f51110a & 2) == 2) {
            int iMin = Math.min(eVar.f51114e, 8);
            z zVar = new z(iMin);
            c23191j.a(zVar.f47962a, 0, iMin, false);
            zVar.F(0);
            if (zVar.a() >= 5 && zVar.u() == 127 && zVar.v() == 1179402563) {
                this.f51103b = new b();
            } else {
                zVar.F(0);
                try {
                    zD2 = androidx.media3.extractor.M.d(1, zVar, true);
                } catch (ParserException unused) {
                    zD2 = false;
                }
                if (zD2) {
                    this.f51103b = new i();
                } else {
                    zVar.F(0);
                    if (g.e(zVar, g.f51117o)) {
                        this.f51103b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r21, androidx.media3.extractor.F r22) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.c.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f51102a = rVar;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}

package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.extractor.ts.D;

/* compiled from: SectionReader.java */
@J
/* loaded from: classes.dex */
public final class y implements D {

    /* renamed from: a, reason: collision with root package name */
    public final x f51838a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.z f51839b = new androidx.media3.common.util.z(32);

    /* renamed from: c, reason: collision with root package name */
    public int f51840c;

    /* renamed from: d, reason: collision with root package name */
    public int f51841d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51842e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51843f;

    public y(x xVar) {
        this.f51838a = xVar;
    }

    @Override // androidx.media3.extractor.ts.D
    public final void a() {
        this.f51843f = true;
    }

    @Override // androidx.media3.extractor.ts.D
    public final void b(androidx.media3.common.util.G g12, androidx.media3.extractor.r rVar, D.e eVar) {
        this.f51838a.b(g12, rVar, eVar);
        this.f51843f = true;
    }

    @Override // androidx.media3.extractor.ts.D
    public final void c(int i12, androidx.media3.common.util.z zVar) {
        boolean z12 = (i12 & 1) != 0;
        int iU2 = z12 ? zVar.f47963b + zVar.u() : -1;
        if (this.f51843f) {
            if (!z12) {
                return;
            }
            this.f51843f = false;
            zVar.F(iU2);
            this.f51841d = 0;
        }
        while (zVar.a() > 0) {
            int i13 = this.f51841d;
            androidx.media3.common.util.z zVar2 = this.f51839b;
            if (i13 < 3) {
                if (i13 == 0) {
                    int iU3 = zVar.u();
                    zVar.F(zVar.f47963b - 1);
                    if (iU3 == 255) {
                        this.f51843f = true;
                        return;
                    }
                }
                int iMin = Math.min(zVar.a(), 3 - this.f51841d);
                zVar.e(this.f51841d, iMin, zVar2.f47962a);
                int i14 = this.f51841d + iMin;
                this.f51841d = i14;
                if (i14 == 3) {
                    zVar2.F(0);
                    zVar2.E(3);
                    zVar2.G(1);
                    int iU4 = zVar2.u();
                    int iU5 = zVar2.u();
                    this.f51842e = (iU4 & 128) != 0;
                    int i15 = (((iU4 & 15) << 8) | iU5) + 3;
                    this.f51840c = i15;
                    byte[] bArr = zVar2.f47962a;
                    if (bArr.length < i15) {
                        zVar2.b(Math.min(4098, Math.max(i15, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zVar.a(), this.f51840c - this.f51841d);
                zVar.e(this.f51841d, iMin2, zVar2.f47962a);
                int i16 = this.f51841d + iMin2;
                this.f51841d = i16;
                int i17 = this.f51840c;
                if (i16 != i17) {
                    continue;
                } else {
                    if (!this.f51842e) {
                        zVar2.E(i17);
                    } else {
                        if (M.m(0, i17, -1, zVar2.f47962a) != 0) {
                            this.f51843f = true;
                            return;
                        }
                        zVar2.E(this.f51840c - 4);
                    }
                    zVar2.F(0);
                    this.f51838a.c(zVar2);
                    this.f51841d = 0;
                }
            }
        }
    }
}

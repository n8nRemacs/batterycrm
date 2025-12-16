package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;

/* compiled from: Id3Reader.java */
@J
/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: b, reason: collision with root package name */
    public androidx.media3.extractor.J f51752b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51753c;

    /* renamed from: e, reason: collision with root package name */
    public int f51755e;

    /* renamed from: f, reason: collision with root package name */
    public int f51756f;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.util.z f51751a = new androidx.media3.common.util.z(10);

    /* renamed from: d, reason: collision with root package name */
    public long f51754d = -9223372036854775807L;

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51753c = false;
        this.f51754d = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
        int i12;
        C23110a.h(this.f51752b);
        if (this.f51753c && (i12 = this.f51755e) != 0 && this.f51756f == i12) {
            long j12 = this.f51754d;
            if (j12 != -9223372036854775807L) {
                this.f51752b.f(j12, 1, i12, 0, null);
            }
            this.f51753c = false;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void c(androidx.media3.common.util.z zVar) {
        C23110a.h(this.f51752b);
        if (this.f51753c) {
            int iA2 = zVar.a();
            int i12 = this.f51756f;
            if (i12 < 10) {
                int iMin = Math.min(iA2, 10 - i12);
                byte[] bArr = zVar.f47962a;
                int i13 = zVar.f47963b;
                androidx.media3.common.util.z zVar2 = this.f51751a;
                System.arraycopy(bArr, i13, zVar2.f47962a, this.f51756f, iMin);
                if (this.f51756f + iMin == 10) {
                    zVar2.F(0);
                    if (73 != zVar2.u() || 68 != zVar2.u() || 51 != zVar2.u()) {
                        androidx.media3.common.util.s.g();
                        this.f51753c = false;
                        return;
                    } else {
                        zVar2.G(3);
                        this.f51755e = zVar2.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA2, this.f51755e - this.f51756f);
            this.f51752b.e(iMin2, zVar);
            this.f51756f += iMin2;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if ((i12 & 4) == 0) {
            return;
        }
        this.f51753c = true;
        if (j12 != -9223372036854775807L) {
            this.f51754d = j12;
        }
        this.f51755e = 0;
        this.f51756f = 0;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 5);
        this.f51752b = jC2;
        C23108t.b bVar = new C23108t.b();
        eVar.b();
        bVar.f47777a = eVar.f51542e;
        bVar.f47787k = "application/id3";
        jC2.b(bVar.a());
    }
}

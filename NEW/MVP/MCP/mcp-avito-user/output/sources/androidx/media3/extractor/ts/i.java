package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;
import java.util.Collections;
import java.util.List;

/* compiled from: DvbSubtitleReader.java */
@J
/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List<D.a> f51621a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.extractor.J[] f51622b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51623c;

    /* renamed from: d, reason: collision with root package name */
    public int f51624d;

    /* renamed from: e, reason: collision with root package name */
    public int f51625e;

    /* renamed from: f, reason: collision with root package name */
    public long f51626f = -9223372036854775807L;

    public i(List<D.a> list) {
        this.f51621a = list;
        this.f51622b = new androidx.media3.extractor.J[list.size()];
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51623c = false;
        this.f51626f = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
        if (this.f51623c) {
            if (this.f51626f != -9223372036854775807L) {
                for (androidx.media3.extractor.J j12 : this.f51622b) {
                    j12.f(this.f51626f, 1, this.f51625e, 0, null);
                }
            }
            this.f51623c = false;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void c(androidx.media3.common.util.z zVar) {
        boolean z12;
        boolean z13;
        if (this.f51623c) {
            if (this.f51624d == 2) {
                if (zVar.a() == 0) {
                    z13 = false;
                } else {
                    if (zVar.u() != 32) {
                        this.f51623c = false;
                    }
                    this.f51624d--;
                    z13 = this.f51623c;
                }
                if (!z13) {
                    return;
                }
            }
            if (this.f51624d == 1) {
                if (zVar.a() == 0) {
                    z12 = false;
                } else {
                    if (zVar.u() != 0) {
                        this.f51623c = false;
                    }
                    this.f51624d--;
                    z12 = this.f51623c;
                }
                if (!z12) {
                    return;
                }
            }
            int i12 = zVar.f47963b;
            int iA2 = zVar.a();
            for (androidx.media3.extractor.J j12 : this.f51622b) {
                zVar.F(i12);
                j12.e(iA2, zVar);
            }
            this.f51625e += iA2;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if ((i12 & 4) == 0) {
            return;
        }
        this.f51623c = true;
        if (j12 != -9223372036854775807L) {
            this.f51626f = j12;
        }
        this.f51625e = 0;
        this.f51624d = 2;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        int i12 = 0;
        while (true) {
            androidx.media3.extractor.J[] jArr = this.f51622b;
            if (i12 >= jArr.length) {
                return;
            }
            D.a aVar = this.f51621a.get(i12);
            eVar.a();
            eVar.b();
            androidx.media3.extractor.J jC2 = rVar.c(eVar.f51541d, 3);
            C23108t.b bVar = new C23108t.b();
            eVar.b();
            bVar.f47777a = eVar.f51542e;
            bVar.f47787k = "application/dvbsubs";
            bVar.f47789m = Collections.singletonList(aVar.f51534b);
            bVar.f47779c = aVar.f51533a;
            jC2.b(bVar.a());
            jArr[i12] = jC2;
            i12++;
        }
    }
}

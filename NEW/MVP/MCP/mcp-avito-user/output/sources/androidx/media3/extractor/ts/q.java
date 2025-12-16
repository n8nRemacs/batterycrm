package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.D;
import androidx.media3.extractor.ts.D;
import j.P;

/* compiled from: MpegAudioReader.java */
@J
/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.util.z f51778a;

    /* renamed from: b, reason: collision with root package name */
    public final D.a f51779b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f51780c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.media3.extractor.J f51781d;

    /* renamed from: e, reason: collision with root package name */
    public String f51782e;

    /* renamed from: f, reason: collision with root package name */
    public int f51783f;

    /* renamed from: g, reason: collision with root package name */
    public int f51784g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51785h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51786i;

    /* renamed from: j, reason: collision with root package name */
    public long f51787j;

    /* renamed from: k, reason: collision with root package name */
    public int f51788k;

    /* renamed from: l, reason: collision with root package name */
    public long f51789l;

    public q() {
        this(null);
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51783f = 0;
        this.f51784g = 0;
        this.f51786i = false;
        this.f51789l = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void c(androidx.media3.common.util.z zVar) {
        C23110a.h(this.f51781d);
        while (zVar.a() > 0) {
            int i12 = this.f51783f;
            androidx.media3.common.util.z zVar2 = this.f51778a;
            if (i12 == 0) {
                byte[] bArr = zVar.f47962a;
                int i13 = zVar.f47963b;
                int i14 = zVar.f47964c;
                while (true) {
                    if (i13 >= i14) {
                        zVar.F(i14);
                        break;
                    }
                    byte b12 = bArr[i13];
                    boolean z12 = (b12 & 255) == 255;
                    boolean z13 = this.f51786i && (b12 & 224) == 224;
                    this.f51786i = z12;
                    if (z13) {
                        zVar.F(i13 + 1);
                        this.f51786i = false;
                        zVar2.f47962a[1] = bArr[i13];
                        this.f51784g = 2;
                        this.f51783f = 1;
                        break;
                    }
                    i13++;
                }
            } else if (i12 == 1) {
                int iMin = Math.min(zVar.a(), 4 - this.f51784g);
                zVar.e(this.f51784g, iMin, zVar2.f47962a);
                int i15 = this.f51784g + iMin;
                this.f51784g = i15;
                if (i15 >= 4) {
                    zVar2.F(0);
                    int iG2 = zVar2.g();
                    D.a aVar = this.f51779b;
                    if (aVar.a(iG2)) {
                        this.f51788k = aVar.f50367c;
                        if (!this.f51785h) {
                            this.f51787j = (aVar.f50371g * 1000000) / aVar.f50368d;
                            C23108t.b bVar = new C23108t.b();
                            bVar.f47777a = this.f51782e;
                            bVar.f47787k = aVar.f50366b;
                            bVar.f47788l = 4096;
                            bVar.f47800x = aVar.f50369e;
                            bVar.f47801y = aVar.f50368d;
                            bVar.f47779c = this.f51780c;
                            this.f51781d.b(bVar.a());
                            this.f51785h = true;
                        }
                        zVar2.F(0);
                        this.f51781d.e(4, zVar2);
                        this.f51783f = 2;
                    } else {
                        this.f51784g = 0;
                        this.f51783f = 1;
                    }
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(zVar.a(), this.f51788k - this.f51784g);
                this.f51781d.e(iMin2, zVar);
                int i16 = this.f51784g + iMin2;
                this.f51784g = i16;
                int i17 = this.f51788k;
                if (i16 >= i17) {
                    long j12 = this.f51789l;
                    if (j12 != -9223372036854775807L) {
                        this.f51781d.f(j12, 1, i17, 0, null);
                        this.f51789l += this.f51787j;
                    }
                    this.f51784g = 0;
                    this.f51783f = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51789l = j12;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51782e = eVar.f51542e;
        eVar.b();
        this.f51781d = rVar.c(eVar.f51541d, 1);
    }

    public q(@P String str) {
        this.f51783f = 0;
        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(4);
        this.f51778a = zVar;
        zVar.f47962a[0] = -1;
        this.f51779b = new D.a();
        this.f51789l = -9223372036854775807L;
        this.f51780c = str;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}

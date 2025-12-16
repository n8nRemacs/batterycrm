package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.C23184c;
import androidx.media3.extractor.ts.D;
import j.P;

/* compiled from: Ac4Reader.java */
@J
/* renamed from: androidx.media3.extractor.ts.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23200d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.util.y f51563a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.z f51564b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f51565c;

    /* renamed from: d, reason: collision with root package name */
    public String f51566d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.media3.extractor.J f51567e;

    /* renamed from: f, reason: collision with root package name */
    public int f51568f;

    /* renamed from: g, reason: collision with root package name */
    public int f51569g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51570h;

    /* renamed from: i, reason: collision with root package name */
    public long f51571i;

    /* renamed from: j, reason: collision with root package name */
    public C23108t f51572j;

    /* renamed from: k, reason: collision with root package name */
    public int f51573k;

    /* renamed from: l, reason: collision with root package name */
    public long f51574l;

    public C23200d() {
        this(null);
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51568f = 0;
        this.f51569g = 0;
        this.f51570h = false;
        this.f51574l = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void c(androidx.media3.common.util.z zVar) {
        C23110a.h(this.f51567e);
        while (zVar.a() > 0) {
            int i12 = this.f51568f;
            androidx.media3.common.util.z zVar2 = this.f51564b;
            if (i12 == 0) {
                while (zVar.a() > 0) {
                    if (this.f51570h) {
                        int iU2 = zVar.u();
                        this.f51570h = iU2 == 172;
                        if (iU2 == 64 || iU2 == 65) {
                            boolean z12 = iU2 == 65;
                            this.f51568f = 1;
                            byte[] bArr = zVar2.f47962a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z12 ? 65 : 64);
                            this.f51569g = 2;
                        }
                    } else {
                        this.f51570h = zVar.u() == 172;
                    }
                }
            } else if (i12 == 1) {
                byte[] bArr2 = zVar2.f47962a;
                int iMin = Math.min(zVar.a(), 16 - this.f51569g);
                zVar.e(this.f51569g, iMin, bArr2);
                int i13 = this.f51569g + iMin;
                this.f51569g = i13;
                if (i13 == 16) {
                    androidx.media3.common.util.y yVar = this.f51563a;
                    yVar.l(0);
                    C23184c.b bVarB = C23184c.b(yVar);
                    C23108t c23108t = this.f51572j;
                    int i14 = bVarB.f50485a;
                    int i15 = bVarB.f50486b;
                    if (c23108t == null || i15 != c23108t.f47770z || i14 != c23108t.f47737A || !"audio/ac4".equals(c23108t.f47757m)) {
                        C23108t.b bVar = new C23108t.b();
                        bVar.f47777a = this.f51566d;
                        bVar.f47787k = "audio/ac4";
                        bVar.f47800x = i15;
                        bVar.f47801y = i14;
                        bVar.f47779c = this.f51565c;
                        C23108t c23108tA = bVar.a();
                        this.f51572j = c23108tA;
                        this.f51567e.b(c23108tA);
                    }
                    this.f51573k = bVarB.f50487c;
                    this.f51571i = (bVarB.f50488d * 1000000) / this.f51572j.f47737A;
                    zVar2.F(0);
                    this.f51567e.e(16, zVar2);
                    this.f51568f = 2;
                }
            } else if (i12 == 2) {
                int iMin2 = Math.min(zVar.a(), this.f51573k - this.f51569g);
                this.f51567e.e(iMin2, zVar);
                int i16 = this.f51569g + iMin2;
                this.f51569g = i16;
                int i17 = this.f51573k;
                if (i16 == i17) {
                    long j12 = this.f51574l;
                    if (j12 != -9223372036854775807L) {
                        this.f51567e.f(j12, 1, i17, 0, null);
                        this.f51574l += this.f51571i;
                    }
                    this.f51568f = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51574l = j12;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51566d = eVar.f51542e;
        eVar.b();
        this.f51567e = rVar.c(eVar.f51541d, 1);
    }

    public C23200d(@P String str) {
        androidx.media3.common.util.y yVar = new androidx.media3.common.util.y(new byte[16], 16);
        this.f51563a = yVar;
        this.f51564b = new androidx.media3.common.util.z(yVar.f47955a);
        this.f51568f = 0;
        this.f51569g = 0;
        this.f51570h = false;
        this.f51574l = -9223372036854775807L;
        this.f51565c = str;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}

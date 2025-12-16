package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23152c;
import androidx.media3.exoplayer.source.C23164o;
import androidx.media3.exoplayer.source.InterfaceC23174z;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    public final Object f48507a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f48508b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.P[] f48509c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f48510d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48511e;

    /* renamed from: f, reason: collision with root package name */
    public K f48512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48513g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f48514h;

    /* renamed from: i, reason: collision with root package name */
    public final d0[] f48515i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.r f48516j;

    /* renamed from: k, reason: collision with root package name */
    public final U f48517k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public J f48518l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.media3.exoplayer.source.Y f48519m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.media3.exoplayer.trackselection.s f48520n;

    /* renamed from: o, reason: collision with root package name */
    public long f48521o;

    public J(d0[] d0VarArr, long j12, androidx.media3.exoplayer.trackselection.r rVar, androidx.media3.exoplayer.upstream.b bVar, U u12, K k12, androidx.media3.exoplayer.trackselection.s sVar) {
        this.f48515i = d0VarArr;
        this.f48521o = j12;
        this.f48516j = rVar;
        this.f48517k = u12;
        A.b bVar2 = k12.f48522a;
        this.f48508b = bVar2.f47212a;
        this.f48512f = k12;
        this.f48519m = androidx.media3.exoplayer.source.Y.f49705e;
        this.f48520n = sVar;
        this.f48509c = new androidx.media3.exoplayer.source.P[d0VarArr.length];
        this.f48514h = new boolean[d0VarArr.length];
        u12.getClass();
        int i12 = AbstractC23132a.f48622i;
        Pair pair = (Pair) bVar2.f47212a;
        Object obj = pair.first;
        A.b bVarB = bVar2.b(pair.second);
        U.c cVar = (U.c) u12.f48569d.get(obj);
        cVar.getClass();
        u12.f48572g.add(cVar);
        U.b bVar3 = u12.f48571f.get(cVar);
        if (bVar3 != null) {
            bVar3.f48580a.g(bVar3.f48581b);
        }
        cVar.f48585c.add(bVarB);
        InterfaceC23174z interfaceC23174zM = cVar.f48583a.e(bVarB, bVar, k12.f48523b);
        u12.f48568c.put(interfaceC23174zM, cVar);
        u12.c();
        long j13 = k12.f48525d;
        this.f48507a = j13 != -9223372036854775807L ? new C23152c(interfaceC23174zM, true, 0L, j13) : interfaceC23174zM;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    public final long a(androidx.media3.exoplayer.trackselection.s sVar, long j12, boolean z12, boolean[] zArr) {
        d0[] d0VarArr;
        androidx.media3.exoplayer.source.P[] pArr;
        int i12 = 0;
        while (true) {
            boolean z13 = true;
            if (i12 >= sVar.f50037a) {
                break;
            }
            if (z12 || !sVar.a(this.f48520n, i12)) {
                z13 = false;
            }
            this.f48514h[i12] = z13;
            i12++;
        }
        int i13 = 0;
        while (true) {
            d0VarArr = this.f48515i;
            int length = d0VarArr.length;
            pArr = this.f48509c;
            if (i13 >= length) {
                break;
            }
            if (d0VarArr[i13].m() == -2) {
                pArr[i13] = null;
            }
            i13++;
        }
        b();
        this.f48520n = sVar;
        c();
        long jD2 = this.f48507a.d(sVar.f50039c, this.f48514h, this.f48509c, zArr, j12);
        for (int i14 = 0; i14 < d0VarArr.length; i14++) {
            if (d0VarArr[i14].m() == -2 && this.f48520n.b(i14)) {
                pArr[i14] = new C23164o();
            }
        }
        this.f48511e = false;
        for (int i15 = 0; i15 < pArr.length; i15++) {
            if (pArr[i15] != null) {
                C23110a.g(sVar.b(i15));
                if (d0VarArr[i15].m() != -2) {
                    this.f48511e = true;
                }
            } else {
                C23110a.g(sVar.f50039c[i15] == null);
            }
        }
        return jD2;
    }

    public final void b() {
        if (this.f48518l != null) {
            return;
        }
        int i12 = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.s sVar = this.f48520n;
            if (i12 >= sVar.f50037a) {
                return;
            }
            boolean zB2 = sVar.b(i12);
            androidx.media3.exoplayer.trackselection.k kVar = this.f48520n.f50039c[i12];
            if (zB2 && kVar != null) {
                kVar.N();
            }
            i12++;
        }
    }

    public final void c() {
        if (this.f48518l != null) {
            return;
        }
        int i12 = 0;
        while (true) {
            androidx.media3.exoplayer.trackselection.s sVar = this.f48520n;
            if (i12 >= sVar.f50037a) {
                return;
            }
            boolean zB2 = sVar.b(i12);
            androidx.media3.exoplayer.trackselection.k kVar = this.f48520n.f50039c[i12];
            if (zB2 && kVar != null) {
                kVar.j();
            }
            i12++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.Q, java.lang.Object] */
    public final long d() {
        if (!this.f48510d) {
            return this.f48512f.f48523b;
        }
        long bufferedPositionUs = this.f48511e ? this.f48507a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f48512f.f48526e : bufferedPositionUs;
    }

    public final long e() {
        return this.f48512f.f48523b + this.f48521o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.z, java.lang.Object] */
    public final void f() {
        b();
        ?? r02 = this.f48507a;
        try {
            boolean z12 = r02 instanceof C23152c;
            U u12 = this.f48517k;
            if (z12) {
                u12.f(((C23152c) r02).f49737b);
            } else {
                u12.f(r02);
            }
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.d("Period release failed.", e12);
        }
    }

    public final androidx.media3.exoplayer.trackselection.s g(float f12, androidx.media3.common.P p12) {
        androidx.media3.exoplayer.trackselection.s sVarF = this.f48516j.f(this.f48515i, this.f48519m, this.f48512f.f48522a, p12);
        for (androidx.media3.exoplayer.trackselection.k kVar : sVarF.f50039c) {
            if (kVar != null) {
                kVar.e(f12);
            }
        }
        return sVarF;
    }

    public final void h() {
        Object obj = this.f48507a;
        if (obj instanceof C23152c) {
            long j12 = this.f48512f.f48525d;
            if (j12 == -9223372036854775807L) {
                j12 = Long.MIN_VALUE;
            }
            C23152c c23152c = (C23152c) obj;
            c23152c.f49741f = 0L;
            c23152c.f49742g = j12;
        }
    }
}

package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.source.C36540c;
import com.google.android.exoplayer2.source.C36551n;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes6.dex */
final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f343670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f343671b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.M[] f343672c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f343673d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f343674e;

    /* renamed from: f, reason: collision with root package name */
    public S f343675f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f343676g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f343677h;

    /* renamed from: i, reason: collision with root package name */
    public final i0[] f343678i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.t f343679j;

    /* renamed from: k, reason: collision with root package name */
    public final X f343680k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public Q f343681l;

    /* renamed from: m, reason: collision with root package name */
    public com.google.android.exoplayer2.source.W f343682m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.exoplayer2.trackselection.u f343683n;

    /* renamed from: o, reason: collision with root package name */
    public long f343684o;

    public Q(i0[] i0VarArr, long j12, com.google.android.exoplayer2.trackselection.t tVar, InterfaceC36572b interfaceC36572b, X x12, S s5, com.google.android.exoplayer2.trackselection.u uVar) {
        this.f343678i = i0VarArr;
        this.f343684o = j12;
        this.f343679j = tVar;
        this.f343680k = x12;
        y.b bVar = s5.f343685a;
        this.f343671b = bVar.f346696a;
        this.f343675f = s5;
        this.f343682m = com.google.android.exoplayer2.source.W.f346153e;
        this.f343683n = uVar;
        this.f343672c = new com.google.android.exoplayer2.source.M[i0VarArr.length];
        this.f343677h = new boolean[i0VarArr.length];
        x12.getClass();
        int i12 = AbstractC36502a.f343739e;
        Pair pair = (Pair) bVar.f346696a;
        Object obj = pair.first;
        y.b bVarB = bVar.b(pair.second);
        X.c cVar = (X.c) x12.f343714d.get(obj);
        cVar.getClass();
        x12.f343719i.add(cVar);
        X.b bVar2 = x12.f343718h.get(cVar);
        if (bVar2 != null) {
            bVar2.f343727a.u(bVar2.f343728b);
        }
        cVar.f343732c.add(bVarB);
        InterfaceC36559w interfaceC36559wJ = cVar.f343730a.c(bVarB, interfaceC36572b, s5.f343686b);
        x12.f343713c.put(interfaceC36559wJ, cVar);
        x12.c();
        long j13 = s5.f343688d;
        this.f343670a = j13 != -9223372036854775807L ? new C36540c(interfaceC36559wJ, true, 0L, j13) : interfaceC36559wJ;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    public final long a(com.google.android.exoplayer2.trackselection.u uVar, long j12, boolean z12, boolean[] zArr) {
        i0[] i0VarArr;
        com.google.android.exoplayer2.source.M[] mArr;
        int i12 = 0;
        while (true) {
            boolean z13 = true;
            if (i12 >= uVar.f347336a) {
                break;
            }
            if (z12 || !uVar.a(this.f343683n, i12)) {
                z13 = false;
            }
            this.f343677h[i12] = z13;
            i12++;
        }
        int i13 = 0;
        while (true) {
            i0VarArr = this.f343678i;
            int length = i0VarArr.length;
            mArr = this.f343672c;
            if (i13 >= length) {
                break;
            }
            if (i0VarArr[i13].m() == -2) {
                mArr[i13] = null;
            }
            i13++;
        }
        b();
        this.f343683n = uVar;
        c();
        long jF2 = this.f343670a.f(uVar.f347338c, this.f343677h, this.f343672c, zArr, j12);
        for (int i14 = 0; i14 < i0VarArr.length; i14++) {
            if (i0VarArr[i14].m() == -2 && this.f343683n.b(i14)) {
                mArr[i14] = new C36551n();
            }
        }
        this.f343674e = false;
        for (int i15 = 0; i15 < mArr.length; i15++) {
            if (mArr[i15] != null) {
                C36585a.d(uVar.b(i15));
                if (i0VarArr[i15].m() != -2) {
                    this.f343674e = true;
                }
            } else {
                C36585a.d(uVar.f347338c[i15] == null);
            }
        }
        return jF2;
    }

    public final void b() {
        if (this.f343681l != null) {
            return;
        }
        int i12 = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.u uVar = this.f343683n;
            if (i12 >= uVar.f347336a) {
                return;
            }
            boolean zB2 = uVar.b(i12);
            com.google.android.exoplayer2.trackselection.k kVar = this.f343683n.f347338c[i12];
            if (zB2 && kVar != null) {
                kVar.N();
            }
            i12++;
        }
    }

    public final void c() {
        if (this.f343681l != null) {
            return;
        }
        int i12 = 0;
        while (true) {
            com.google.android.exoplayer2.trackselection.u uVar = this.f343683n;
            if (i12 >= uVar.f347336a) {
                return;
            }
            boolean zB2 = uVar.b(i12);
            com.google.android.exoplayer2.trackselection.k kVar = this.f343683n.f347338c[i12];
            if (zB2 && kVar != null) {
                kVar.j();
            }
            i12++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.exoplayer2.source.N, java.lang.Object] */
    public final long d() {
        if (!this.f343673d) {
            return this.f343675f.f343686b;
        }
        long bufferedPositionUs = this.f343674e ? this.f343670a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f343675f.f343689e : bufferedPositionUs;
    }

    public final long e() {
        return this.f343675f.f343686b + this.f343684o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.source.w, java.lang.Object] */
    public final void f() {
        b();
        ?? r02 = this.f343670a;
        try {
            boolean z12 = r02 instanceof C36540c;
            X x12 = this.f343680k;
            if (z12) {
                x12.f(((C36540c) r02).f346204b);
            } else {
                x12.f(r02);
            }
        } catch (RuntimeException e12) {
            C36605v.a("Period release failed.", e12);
        }
    }

    public final com.google.android.exoplayer2.trackselection.u g(float f12, s0 s0Var) {
        com.google.android.exoplayer2.trackselection.u uVarD = this.f343679j.d(this.f343678i, this.f343682m, this.f343675f.f343685a, s0Var);
        for (com.google.android.exoplayer2.trackselection.k kVar : uVarD.f347338c) {
            if (kVar != null) {
                kVar.e(f12);
            }
        }
        return uVarD;
    }

    public final void h() {
        Object obj = this.f343670a;
        if (obj instanceof C36540c) {
            long j12 = this.f343675f.f343688d;
            if (j12 == -9223372036854775807L) {
                j12 = Long.MIN_VALUE;
            }
            C36540c c36540c = (C36540c) obj;
            c36540c.f346208f = 0L;
            c36540c.f346209g = j12;
        }
    }
}

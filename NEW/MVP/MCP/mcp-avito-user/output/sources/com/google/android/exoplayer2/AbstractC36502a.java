package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.s0;

/* compiled from: AbstractConcatenatedTimeline.java */
/* renamed from: com.google.android.exoplayer2.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36502a extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f343739e = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f343740c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.O f343741d;

    public AbstractC36502a(com.google.android.exoplayer2.source.O o12) {
        this.f343741d = o12;
        this.f343740c = o12.getLength();
    }

    @Override // com.google.android.exoplayer2.s0
    public final int a(boolean z12) {
        if (this.f343740c == 0) {
            return -1;
        }
        int iE2 = z12 ? this.f343741d.e() : 0;
        while (y(iE2).p()) {
            iE2 = w(iE2, z12);
            if (iE2 == -1) {
                return -1;
            }
        }
        return y(iE2).a(z12) + v(iE2);
    }

    @Override // com.google.android.exoplayer2.s0
    public final int b(Object obj) {
        int iB2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ2 = q(obj2);
        if (iQ2 == -1 || (iB2 = y(iQ2).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ2) + iB2;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int c(boolean z12) {
        int i12 = this.f343740c;
        if (i12 == 0) {
            return -1;
        }
        int iB2 = z12 ? this.f343741d.b() : i12 - 1;
        while (y(iB2).p()) {
            iB2 = x(iB2, z12);
            if (iB2 == -1) {
                return -1;
            }
        }
        return y(iB2).c(z12) + v(iB2);
    }

    @Override // com.google.android.exoplayer2.s0
    public final int e(int i12, int i13, boolean z12) {
        int iS2 = s(i12);
        int iV2 = v(iS2);
        int iE2 = y(iS2).e(i12 - iV2, i13 == 2 ? 0 : i13, z12);
        if (iE2 != -1) {
            return iV2 + iE2;
        }
        int iW2 = w(iS2, z12);
        while (iW2 != -1 && y(iW2).p()) {
            iW2 = w(iW2, z12);
        }
        if (iW2 != -1) {
            return y(iW2).a(z12) + v(iW2);
        }
        if (i13 == 2) {
            return a(z12);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public final s0.b f(int i12, s0.b bVar, boolean z12) {
        int iR2 = r(i12);
        int iV2 = v(iR2);
        y(iR2).f(i12 - u(iR2), bVar, z12);
        bVar.f345872d += iV2;
        if (z12) {
            Object objT = t(iR2);
            Object obj = bVar.f345871c;
            obj.getClass();
            bVar.f345871c = Pair.create(objT, obj);
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.s0
    public final s0.b g(Object obj, s0.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ2 = q(obj2);
        int iV2 = v(iQ2);
        y(iQ2).g(obj3, bVar);
        bVar.f345872d += iV2;
        bVar.f345871c = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int k(int i12, int i13, boolean z12) {
        int iS2 = s(i12);
        int iV2 = v(iS2);
        int iK2 = y(iS2).k(i12 - iV2, i13 == 2 ? 0 : i13, z12);
        if (iK2 != -1) {
            return iV2 + iK2;
        }
        int iX2 = x(iS2, z12);
        while (iX2 != -1 && y(iX2).p()) {
            iX2 = x(iX2, z12);
        }
        if (iX2 != -1) {
            return y(iX2).c(z12) + v(iX2);
        }
        if (i13 == 2) {
            return c(z12);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public final Object l(int i12) {
        int iR2 = r(i12);
        return Pair.create(t(iR2), y(iR2).l(i12 - u(iR2)));
    }

    @Override // com.google.android.exoplayer2.s0
    public final s0.d m(int i12, s0.d dVar, long j12) {
        int iS2 = s(i12);
        int iV2 = v(iS2);
        int iU2 = u(iS2);
        y(iS2).m(i12 - iV2, dVar, j12);
        Object objT = t(iS2);
        if (!s0.d.f345877s.equals(dVar.f345880b)) {
            objT = Pair.create(objT, dVar.f345880b);
        }
        dVar.f345880b = objT;
        dVar.f345894p += iU2;
        dVar.f345895q += iU2;
        return dVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i12);

    public abstract int s(int i12);

    public abstract Object t(int i12);

    public abstract int u(int i12);

    public abstract int v(int i12);

    public final int w(int i12, boolean z12) {
        if (z12) {
            return this.f343741d.d(i12);
        }
        if (i12 < this.f343740c - 1) {
            return i12 + 1;
        }
        return -1;
    }

    public final int x(int i12, boolean z12) {
        if (z12) {
            return this.f343741d.a(i12);
        }
        if (i12 > 0) {
            return i12 - 1;
        }
        return -1;
    }

    public abstract s0 y(int i12);
}

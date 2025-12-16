package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.P;

/* compiled from: AbstractConcatenatedTimeline.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23132a extends androidx.media3.common.P {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48622i = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f48623g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.S f48624h;

    public AbstractC23132a(androidx.media3.exoplayer.source.S s5) {
        this.f48624h = s5;
        this.f48623g = s5.getLength();
    }

    public abstract int A(int i12);

    public abstract Object B(int i12);

    public abstract int C(int i12);

    public abstract int D(int i12);

    public final int E(int i12, boolean z12) {
        if (z12) {
            return this.f48624h.d(i12);
        }
        if (i12 < this.f48623g - 1) {
            return i12 + 1;
        }
        return -1;
    }

    public final int F(int i12, boolean z12) {
        if (z12) {
            return this.f48624h.a(i12);
        }
        if (i12 > 0) {
            return i12 - 1;
        }
        return -1;
    }

    public abstract androidx.media3.common.P G(int i12);

    @Override // androidx.media3.common.P
    public final int b(boolean z12) {
        if (this.f48623g == 0) {
            return -1;
        }
        int iE2 = z12 ? this.f48624h.e() : 0;
        while (G(iE2).x()) {
            iE2 = E(iE2, z12);
            if (iE2 == -1) {
                return -1;
            }
        }
        return G(iE2).b(z12) + D(iE2);
    }

    @Override // androidx.media3.common.P
    public final int g(Object obj) {
        int iG2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iY2 = y(obj2);
        if (iY2 == -1 || (iG2 = G(iY2).g(obj3)) == -1) {
            return -1;
        }
        return C(iY2) + iG2;
    }

    @Override // androidx.media3.common.P
    public final int j(boolean z12) {
        int i12 = this.f48623g;
        if (i12 == 0) {
            return -1;
        }
        int iB2 = z12 ? this.f48624h.b() : i12 - 1;
        while (G(iB2).x()) {
            iB2 = F(iB2, z12);
            if (iB2 == -1) {
                return -1;
            }
        }
        return G(iB2).j(z12) + D(iB2);
    }

    @Override // androidx.media3.common.P
    public final int m(int i12, int i13, boolean z12) {
        int iA2 = A(i12);
        int iD2 = D(iA2);
        int iM2 = G(iA2).m(i12 - iD2, i13 == 2 ? 0 : i13, z12);
        if (iM2 != -1) {
            return iD2 + iM2;
        }
        int iE2 = E(iA2, z12);
        while (iE2 != -1 && G(iE2).x()) {
            iE2 = E(iE2, z12);
        }
        if (iE2 != -1) {
            return G(iE2).b(z12) + D(iE2);
        }
        if (i13 == 2) {
            return b(z12);
        }
        return -1;
    }

    @Override // androidx.media3.common.P
    public final P.b n(int i12, P.b bVar, boolean z12) {
        int iZ2 = z(i12);
        int iD2 = D(iZ2);
        G(iZ2).n(i12 - C(iZ2), bVar, z12);
        bVar.f47381d += iD2;
        if (z12) {
            Object objB = B(iZ2);
            Object obj = bVar.f47380c;
            obj.getClass();
            bVar.f47380c = Pair.create(objB, obj);
        }
        return bVar;
    }

    @Override // androidx.media3.common.P
    public final P.b o(Object obj, P.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iY2 = y(obj2);
        int iD2 = D(iY2);
        G(iY2).o(obj3, bVar);
        bVar.f47381d += iD2;
        bVar.f47380c = obj;
        return bVar;
    }

    @Override // androidx.media3.common.P
    public final int s(int i12, int i13, boolean z12) {
        int iA2 = A(i12);
        int iD2 = D(iA2);
        int iS2 = G(iA2).s(i12 - iD2, i13 == 2 ? 0 : i13, z12);
        if (iS2 != -1) {
            return iD2 + iS2;
        }
        int iF2 = F(iA2, z12);
        while (iF2 != -1 && G(iF2).x()) {
            iF2 = F(iF2, z12);
        }
        if (iF2 != -1) {
            return G(iF2).j(z12) + D(iF2);
        }
        if (i13 == 2) {
            return j(z12);
        }
        return -1;
    }

    @Override // androidx.media3.common.P
    public final Object t(int i12) {
        int iZ2 = z(i12);
        return Pair.create(B(iZ2), G(iZ2).t(i12 - C(iZ2)));
    }

    @Override // androidx.media3.common.P
    public final P.d u(int i12, P.d dVar, long j12) {
        int iA2 = A(i12);
        int iD2 = D(iA2);
        int iC2 = C(iA2);
        G(iA2).u(i12 - iD2, dVar, j12);
        Object objB = B(iA2);
        if (!P.d.f47399s.equals(dVar.f47407b)) {
            objB = Pair.create(objB, dVar.f47407b);
        }
        dVar.f47407b = objB;
        dVar.f47421p += iC2;
        dVar.f47422q += iC2;
        return dVar;
    }

    public abstract int y(Object obj);

    public abstract int z(int i12);
}

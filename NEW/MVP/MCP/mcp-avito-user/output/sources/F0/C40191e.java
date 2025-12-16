package f0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TrieNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lf0/e;", "E", "", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40191e<E> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f395516d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C40191e f395517e = new C40191e(0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f395518a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public Object[] f395519b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i0.f f395520c;

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf0/e$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40191e(int i12, @k Object[] objArr, @l i0.f fVar) {
        this.f395518a = i12;
        this.f395519b = objArr;
        this.f395520c = fVar;
    }

    public static C40191e h(int i12, Object obj, int i13, Object obj2, int i14, i0.f fVar) {
        if (i14 > 30) {
            return new C40191e(0, new Object[]{obj, obj2}, fVar);
        }
        int iC2 = h.c(i12, i14);
        int iC3 = h.c(i13, i14);
        if (iC2 != iC3) {
            return new C40191e((1 << iC2) | (1 << iC3), iC2 < iC3 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, fVar);
        }
        return new C40191e(1 << iC2, new Object[]{h(i12, obj, i13, obj2, i14 + 5, fVar)}, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final C40191e a(int i12, int i13, Object obj) {
        int iC2 = 1 << h.c(i12, i13);
        if (f(iC2)) {
            return new C40191e(this.f395518a | iC2, h.a(obj, this.f395519b, g(iC2)), null);
        }
        int iG2 = g(iC2);
        Object obj2 = this.f395519b[iG2];
        if (obj2 instanceof C40191e) {
            C40191e<E> c40191e = (C40191e) obj2;
            C40191e<E> c40191e2 = i13 == 30 ? C42756l.h(obj, c40191e.f395519b) ? c40191e : new C40191e<>(0, h.a(obj, c40191e.f395519b, 0), null) : c40191e.a(i12, i13 + 5, obj);
            return c40191e == c40191e2 ? this : q(iG2, c40191e2);
        }
        if (L.f(obj, obj2)) {
            return this;
        }
        Object[] objArr = this.f395519b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[iG2] = i(iG2, i12, obj, i13, null);
        return new C40191e(this.f395518a, objArrCopyOf, null);
    }

    public final int b() {
        if (this.f395518a == 0) {
            return this.f395519b.length;
        }
        int iB2 = 0;
        for (Object obj : this.f395519b) {
            iB2 += obj instanceof C40191e ? ((C40191e) obj).b() : 1;
        }
        return iB2;
    }

    public final boolean c(int i12, int i13, Object obj) {
        int iC2 = 1 << h.c(i12, i13);
        if (f(iC2)) {
            return false;
        }
        Object obj2 = this.f395519b[g(iC2)];
        if (!(obj2 instanceof C40191e)) {
            return L.f(obj, obj2);
        }
        C40191e c40191e = (C40191e) obj2;
        return i13 == 30 ? C42756l.h(obj, c40191e.f395519b) : c40191e.c(i12, i13 + 5, obj);
    }

    public final boolean d(int i12, @k C40191e c40191e) {
        if (this == c40191e) {
            return true;
        }
        if (i12 > 30) {
            for (Object obj : c40191e.f395519b) {
                if (!C42756l.h(obj, this.f395519b)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = this.f395518a;
        int i14 = c40191e.f395518a;
        int i15 = i13 & i14;
        if (i15 != i14) {
            return false;
        }
        while (i15 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i15);
            int iG2 = g(iLowestOneBit);
            int iG3 = c40191e.g(iLowestOneBit);
            Object obj2 = this.f395519b[iG2];
            Object obj3 = c40191e.f395519b[iG3];
            boolean z12 = obj2 instanceof C40191e;
            boolean z13 = obj3 instanceof C40191e;
            if (z12 && z13) {
                if (!((C40191e) obj2).d(i12 + 5, (C40191e) obj3)) {
                    return false;
                }
            } else if (z12) {
                if (!((C40191e) obj2).c(obj3 != null ? obj3.hashCode() : 0, i12 + 5, obj3)) {
                    return false;
                }
            } else if (z13 || !L.f(obj2, obj3)) {
                return false;
            }
            i15 ^= iLowestOneBit;
        }
        return true;
    }

    public final boolean e(C40191e<E> c40191e) {
        if (this == c40191e) {
            return true;
        }
        if (this.f395518a != c40191e.f395518a) {
            return false;
        }
        int length = this.f395519b.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f395519b[i12] != c40191e.f395519b[i12]) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(int i12) {
        return (i12 & this.f395518a) == 0;
    }

    public final int g(int i12) {
        return Integer.bitCount((i12 - 1) & this.f395518a);
    }

    public final C40191e<E> i(int i12, int i13, E e12, int i14, i0.f fVar) {
        Object obj = this.f395519b[i12];
        return h(obj != null ? obj.hashCode() : 0, obj, i13, e12, i14 + 5, fVar);
    }

    @k
    public final C40191e<E> j(int i12, E e12, int i13, @k C40188b<?> c40188b) {
        C40191e<E> c40191eJ;
        int iC2 = 1 << h.c(i12, i13);
        boolean zF2 = f(iC2);
        i0.f fVar = this.f395520c;
        if (zF2) {
            c40188b.d(c40188b.f395508f + 1);
            i0.f fVar2 = c40188b.f395505c;
            int iG2 = g(iC2);
            if (fVar != fVar2) {
                return new C40191e<>(this.f395518a | iC2, h.a(e12, this.f395519b, iG2), fVar2);
            }
            this.f395519b = h.a(e12, this.f395519b, iG2);
            this.f395518a |= iC2;
            return this;
        }
        int iG3 = g(iC2);
        Object obj = this.f395519b[iG3];
        if (obj instanceof C40191e) {
            C40191e<E> c40191e = (C40191e) obj;
            if (i13 != 30) {
                c40191eJ = c40191e.j(i12, e12, i13 + 5, c40188b);
            } else if (C42756l.h(e12, c40191e.f395519b)) {
                c40191eJ = c40191e;
            } else {
                c40188b.d(c40188b.f395508f + 1);
                if (c40191e.f395520c == c40188b.f395505c) {
                    c40191e.f395519b = h.a(e12, c40191e.f395519b, 0);
                    c40191eJ = c40191e;
                } else {
                    c40191eJ = new C40191e<>(0, h.a(e12, c40191e.f395519b, 0), c40188b.f395505c);
                }
            }
            return c40191e == c40191eJ ? this : o(iG3, c40191eJ, c40188b.f395505c);
        }
        if (L.f(e12, obj)) {
            return this;
        }
        c40188b.d(c40188b.f395508f + 1);
        i0.f fVar3 = c40188b.f395505c;
        if (fVar == fVar3) {
            this.f395519b[iG3] = i(iG3, i12, e12, i13, fVar3);
            return this;
        }
        Object[] objArr = this.f395519b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[iG3] = i(iG3, i12, e12, i13, fVar3);
        return new C40191e<>(this.f395518a, objArrCopyOf, fVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final C40191e<E> k(@k C40191e<E> c40191e, int i12, @k i0.b bVar, @k C40188b<?> c40188b) {
        Object objH;
        if (this == c40191e) {
            bVar.f398333a = b() + bVar.f398333a;
            return this;
        }
        i0.f fVar = this.f395520c;
        if (i12 > 30) {
            i0.f fVar2 = c40188b.f395505c;
            if (this == c40191e) {
                bVar.a(this.f395519b.length);
            } else {
                Object[] objArr = this.f395519b;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + c40191e.f395519b.length);
                Object[] objArr2 = c40191e.f395519b;
                int length = this.f395519b.length;
                int i13 = 0;
                for (int i14 = 0; i14 < objArr2.length; i14++) {
                    if (!C42756l.h(objArr2[i14], this.f395519b)) {
                        objArrCopyOf[length + i13] = objArr2[i14];
                        i13++;
                    }
                }
                int length2 = i13 + this.f395519b.length;
                bVar.a(objArrCopyOf.length - length2);
                if (length2 != this.f395519b.length) {
                    if (length2 == c40191e.f395519b.length) {
                        return c40191e;
                    }
                    if (length2 != objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
                    }
                    if (!L.f(fVar, fVar2)) {
                        return new C40191e<>(0, objArrCopyOf, fVar2);
                    }
                    this.f395519b = objArrCopyOf;
                }
            }
            return this;
        }
        int i15 = this.f395518a;
        int i16 = c40191e.f395518a | i15;
        C40191e<E> c40191e2 = (i16 == i15 && L.f(fVar, c40188b.f395505c)) ? this : new C40191e<>(i16, new Object[Integer.bitCount(i16)], c40188b.f395505c);
        int i17 = 0;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            int iG2 = g(iLowestOneBit);
            int iG3 = c40191e.g(iLowestOneBit);
            Object[] objArr3 = c40191e2.f395519b;
            if (f(iLowestOneBit)) {
                objH = c40191e.f395519b[iG3];
            } else if (c40191e.f(iLowestOneBit)) {
                objH = this.f395519b[iG2];
            } else {
                Object obj = this.f395519b[iG2];
                Object obj2 = c40191e.f395519b[iG3];
                boolean z12 = obj instanceof C40191e;
                boolean z13 = obj2 instanceof C40191e;
                if (z12 && z13) {
                    objH = ((C40191e) obj).k((C40191e) obj2, i12 + 5, bVar, c40188b);
                } else if (z12) {
                    C40191e c40191e3 = (C40191e) obj;
                    int i18 = c40188b.f395508f;
                    objH = c40191e3.j(obj2 != null ? obj2.hashCode() : 0, obj2, i12 + 5, c40188b);
                    if (c40188b.f395508f == i18) {
                        bVar.f398333a++;
                    }
                    G0 g02 = G0.f406611a;
                } else if (z13) {
                    C40191e c40191e4 = (C40191e) obj2;
                    int i19 = c40188b.f395508f;
                    objH = c40191e4.j(obj != null ? obj.hashCode() : 0, obj, i12 + 5, c40188b);
                    if (c40188b.f395508f == i19) {
                        bVar.f398333a++;
                    }
                    G0 g03 = G0.f406611a;
                } else if (L.f(obj, obj2)) {
                    bVar.f398333a++;
                    G0 g04 = G0.f406611a;
                    objH = obj;
                } else {
                    objH = h(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i12 + 5, c40188b.f395505c);
                }
            }
            objArr3[i17] = objH;
            i17++;
            i16 ^= iLowestOneBit;
        }
        return e(c40191e2) ? this : c40191e.e(c40191e2) ? c40191e : c40191e2;
    }

    @k
    public final C40191e<E> l(int i12, E e12, int i13, @k C40188b<?> c40188b) {
        C40191e<E> c40191eL;
        int iC2 = 1 << h.c(i12, i13);
        if (f(iC2)) {
            return this;
        }
        int iG2 = g(iC2);
        Object obj = this.f395519b[iG2];
        boolean z12 = obj instanceof C40191e;
        i0.f fVar = this.f395520c;
        if (!z12) {
            if (!L.f(e12, obj)) {
                return this;
            }
            c40188b.d(c40188b.f395508f - 1);
            i0.f fVar2 = c40188b.f395505c;
            if (fVar != fVar2) {
                return new C40191e<>(this.f395518a ^ iC2, h.b(iG2, this.f395519b), fVar2);
            }
            this.f395519b = h.b(iG2, this.f395519b);
            this.f395518a ^= iC2;
            return this;
        }
        C40191e<E> c40191e = (C40191e) obj;
        if (i13 == 30) {
            int iH2 = C42756l.H(e12, c40191e.f395519b);
            if (iH2 != -1) {
                c40188b.d(c40188b.f395508f - 1);
                i0.f fVar3 = c40188b.f395505c;
                if (c40191e.f395520c == fVar3) {
                    c40191e.f395519b = h.b(iH2, c40191e.f395519b);
                    c40191eL = c40191e;
                } else {
                    c40191eL = new C40191e<>(0, h.b(iH2, c40191e.f395519b), fVar3);
                }
            } else {
                c40191eL = c40191e;
            }
        } else {
            c40191eL = c40191e.l(i12, e12, i13 + 5, c40188b);
        }
        i0.f fVar4 = c40188b.f395505c;
        return (fVar == fVar4 || c40191e != c40191eL) ? o(iG2, c40191eL, fVar4) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@Y61.k f0.C40191e<E> r18, int r19, @Y61.k i0.b r20, @Y61.k f0.C40188b<?> r21) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C40191e.m(f0.e, int, i0.b, f0.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k f0.C40191e<E> r18, int r19, @Y61.k i0.b r20, @Y61.k f0.C40188b<?> r21) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C40191e.n(f0.e, int, i0.b, f0.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final C40191e<E> o(int i12, C40191e<E> c40191e, i0.f fVar) {
        ?? r02 = c40191e.f395519b;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof C40191e)) {
                if (this.f395519b.length == 1) {
                    c40191e.f395518a = this.f395518a;
                    return c40191e;
                }
                c40191e = r03;
            }
        }
        if (this.f395520c == fVar) {
            this.f395519b[i12] = c40191e;
            return this;
        }
        Object[] objArr = this.f395519b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i12] = c40191e;
        return new C40191e<>(this.f395518a, objArrCopyOf, fVar);
    }

    @k
    public final C40191e p(int i12, int i13, Object obj) {
        C40191e<E> c40191eP;
        int iC2 = 1 << h.c(i12, i13);
        if (f(iC2)) {
            return this;
        }
        int iG2 = g(iC2);
        Object obj2 = this.f395519b[iG2];
        if (!(obj2 instanceof C40191e)) {
            if (L.f(obj, obj2)) {
                return new C40191e(this.f395518a ^ iC2, h.b(iG2, this.f395519b), null);
            }
            return this;
        }
        C40191e<E> c40191e = (C40191e) obj2;
        if (i13 == 30) {
            int iH2 = C42756l.H(obj, c40191e.f395519b);
            c40191eP = iH2 != -1 ? new C40191e<>(0, h.b(iH2, c40191e.f395519b), null) : c40191e;
        } else {
            c40191eP = c40191e.p(i12, i13 + 5, obj);
        }
        return c40191e == c40191eP ? this : q(iG2, c40191eP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final C40191e<E> q(int i12, C40191e<E> c40191e) {
        ?? r02 = c40191e.f395519b;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof C40191e)) {
                if (this.f395519b.length == 1) {
                    c40191e.f395518a = this.f395518a;
                    return c40191e;
                }
                c40191e = r03;
            }
        }
        Object[] objArr = this.f395519b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i12] = c40191e;
        return new C40191e<>(this.f395518a, objArrCopyOf, null);
    }
}

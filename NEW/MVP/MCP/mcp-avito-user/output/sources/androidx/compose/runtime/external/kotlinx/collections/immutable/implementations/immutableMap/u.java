package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.P1;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TrieNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "K", "V", "", "a", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u<K, V> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f38351e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final u f38352f = new u(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f38353a;

    /* renamed from: b, reason: collision with root package name */
    public int f38354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final i0.f f38355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object[] f38356d;

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrieNode.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u$b;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public u<K, V> f38357a;

        /* renamed from: b, reason: collision with root package name */
        public final int f38358b;

        public b(@Y61.k u<K, V> uVar, int i12) {
            this.f38357a = uVar;
            this.f38358b = i12;
        }
    }

    public u(int i12, int i13, @Y61.k Object[] objArr, @Y61.l i0.f fVar) {
        this.f38353a = i12;
        this.f38354b = i13;
        this.f38355c = fVar;
        this.f38356d = objArr;
    }

    public static u j(int i12, Object obj, Object obj2, int i13, Object obj3, Object obj4, int i14, i0.f fVar) {
        if (i14 > 30) {
            return new u(0, 0, new Object[]{obj, obj2, obj3, obj4}, fVar);
        }
        int iD2 = y.d(i12, i14);
        int iD3 = y.d(i13, i14);
        if (iD2 != iD3) {
            return new u((1 << iD2) | (1 << iD3), 0, iD2 < iD3 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, fVar);
        }
        return new u(0, 1 << iD2, new Object[]{j(i12, obj, obj2, i13, obj3, obj4, i14 + 5, fVar)}, fVar);
    }

    public final Object[] a(int i12, int i13, int i14, K k12, V v12, int i15, i0.f fVar) {
        Object obj = this.f38356d[i12];
        u uVarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i12), i14, k12, v12, i15 + 5, fVar);
        int iT2 = t(i13);
        int i16 = iT2 + 1;
        Object[] objArr = this.f38356d;
        Object[] objArr2 = new Object[objArr.length - 1];
        C42756l.s(objArr, 0, objArr2, i12, 6);
        C42756l.o(objArr, i12, objArr2, i12 + 2, i16);
        objArr2[iT2 - 1] = uVarJ;
        C42756l.o(objArr, iT2, objArr2, i16, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f38354b == 0) {
            return this.f38356d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f38353a);
        int length = this.f38356d.length;
        for (int i12 = iBitCount * 2; i12 < length; i12++) {
            iBitCount += s(i12).b();
        }
        return iBitCount;
    }

    public final boolean c(K k12) {
        kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, this.f38356d.length), 2);
        int i12 = jVarP.f406905b;
        int i13 = jVarP.f406906c;
        int i14 = jVarP.f406907d;
        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
            while (!L.f(k12, this.f38356d[i12])) {
                if (i12 != i13) {
                    i12 += i14;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i12, int i13, Object obj) {
        int iD2 = 1 << y.d(i12, i13);
        if (h(iD2)) {
            return L.f(obj, this.f38356d[f(iD2)]);
        }
        if (!i(iD2)) {
            return false;
        }
        u<K, V> uVarS = s(t(iD2));
        return i13 == 30 ? uVarS.c(obj) : uVarS.d(i12, i13 + 5, obj);
    }

    public final boolean e(u<K, V> uVar) {
        if (this == uVar) {
            return true;
        }
        if (this.f38354b != uVar.f38354b || this.f38353a != uVar.f38353a) {
            return false;
        }
        int length = this.f38356d.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f38356d[i12] != uVar.f38356d[i12]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i12) {
        return Integer.bitCount((i12 - 1) & this.f38353a) * 2;
    }

    @Y61.l
    public final Object g(int i12, int i13, Object obj) {
        int iD2 = 1 << y.d(i12, i13);
        if (h(iD2)) {
            int iF2 = f(iD2);
            if (L.f(obj, this.f38356d[iF2])) {
                return x(iF2);
            }
            return null;
        }
        if (!i(iD2)) {
            return null;
        }
        u<K, V> uVarS = s(t(iD2));
        if (i13 != 30) {
            return uVarS.g(i12, i13 + 5, obj);
        }
        kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, uVarS.f38356d.length), 2);
        int i14 = jVarP.f406905b;
        int i15 = jVarP.f406906c;
        int i16 = jVarP.f406907d;
        if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
            return null;
        }
        while (!L.f(obj, uVarS.f38356d[i14])) {
            if (i14 == i15) {
                return null;
            }
            i14 += i16;
        }
        return uVarS.x(i14);
    }

    public final boolean h(int i12) {
        return (i12 & this.f38353a) != 0;
    }

    public final boolean i(int i12) {
        return (i12 & this.f38354b) != 0;
    }

    public final u<K, V> k(int i12, f<K, V> fVar) {
        fVar.e(fVar.f38339g - 1);
        fVar.f38337e = x(i12);
        Object[] objArr = this.f38356d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f38355c != fVar.f38335c) {
            return new u<>(0, 0, y.b(i12, objArr), fVar.f38335c);
        }
        this.f38356d = y.b(i12, objArr);
        return this;
    }

    @Y61.k
    public final u<K, V> l(int i12, K k12, V v12, int i13, @Y61.k f<K, V> fVar) {
        u<K, V> uVarL;
        int iD2 = 1 << y.d(i12, i13);
        boolean zH2 = h(iD2);
        i0.f fVar2 = this.f38355c;
        if (zH2) {
            int iF2 = f(iD2);
            if (!L.f(k12, this.f38356d[iF2])) {
                fVar.e(fVar.f38339g + 1);
                i0.f fVar3 = fVar.f38335c;
                if (fVar2 != fVar3) {
                    return new u<>(this.f38353a ^ iD2, this.f38354b | iD2, a(iF2, iD2, i12, k12, v12, i13, fVar3), fVar3);
                }
                this.f38356d = a(iF2, iD2, i12, k12, v12, i13, fVar3);
                this.f38353a ^= iD2;
                this.f38354b |= iD2;
                return this;
            }
            fVar.f38337e = x(iF2);
            if (x(iF2) == v12) {
                return this;
            }
            if (fVar2 == fVar.f38335c) {
                this.f38356d[iF2 + 1] = v12;
                return this;
            }
            fVar.f38338f++;
            Object[] objArr = this.f38356d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF2 + 1] = v12;
            return new u<>(this.f38353a, this.f38354b, objArrCopyOf, fVar.f38335c);
        }
        if (!i(iD2)) {
            fVar.e(fVar.f38339g + 1);
            i0.f fVar4 = fVar.f38335c;
            int iF3 = f(iD2);
            if (fVar2 != fVar4) {
                return new u<>(this.f38353a | iD2, this.f38354b, y.a(k12, v12, this.f38356d, iF3), fVar4);
            }
            this.f38356d = y.a(k12, v12, this.f38356d, iF3);
            this.f38353a |= iD2;
            return this;
        }
        int iT2 = t(iD2);
        u<K, V> uVarS = s(iT2);
        if (i13 == 30) {
            kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, uVarS.f38356d.length), 2);
            int i14 = jVarP.f406905b;
            int i15 = jVarP.f406906c;
            int i16 = jVarP.f406907d;
            if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
                fVar.e(fVar.f38339g + 1);
                uVarL = new u<>(0, 0, y.a(k12, v12, uVarS.f38356d, 0), fVar.f38335c);
                break;
            }
            while (!L.f(k12, uVarS.f38356d[i14])) {
                if (i14 == i15) {
                    fVar.e(fVar.f38339g + 1);
                    uVarL = new u<>(0, 0, y.a(k12, v12, uVarS.f38356d, 0), fVar.f38335c);
                    break;
                }
                i14 += i16;
            }
            fVar.f38337e = uVarS.x(i14);
            if (uVarS.f38355c == fVar.f38335c) {
                uVarS.f38356d[i14 + 1] = v12;
                uVarL = uVarS;
            } else {
                fVar.f38338f++;
                Object[] objArr2 = uVarS.f38356d;
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                objArrCopyOf2[i14 + 1] = v12;
                uVarL = new u<>(0, 0, objArrCopyOf2, fVar.f38335c);
            }
        } else {
            uVarL = uVarS.l(i12, k12, v12, i13 + 5, fVar);
        }
        return uVarS == uVarL ? this : r(iT2, uVarL, fVar.f38335c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u<K, V>] */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u] */
    /* JADX WARN: Type inference failed for: r4v21, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u] */
    /* JADX WARN: Type inference failed for: r4v22, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u] */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    @Y61.k
    public final u<K, V> m(@Y61.k u<K, V> uVar, int i12, @Y61.k i0.b bVar, @Y61.k f<K, V> fVar) {
        ?? r17;
        int i13;
        int i14;
        u<K, V> uVarS;
        if (this == uVar) {
            bVar.a(b());
            return this;
        }
        int i15 = 0;
        if (i12 > 30) {
            i0.f fVar2 = fVar.f38335c;
            int i16 = uVar.f38354b;
            Object[] objArr = this.f38356d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + uVar.f38356d.length);
            int length = this.f38356d.length;
            kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, uVar.f38356d.length), 2);
            int i17 = jVarP.f406905b;
            int i18 = jVarP.f406906c;
            int i19 = jVarP.f406907d;
            if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                while (true) {
                    if (c(uVar.f38356d[i17])) {
                        bVar.f398333a++;
                    } else {
                        Object[] objArr2 = uVar.f38356d;
                        objArrCopyOf[length] = objArr2[i17];
                        objArrCopyOf[length + 1] = objArr2[i17 + 1];
                        length += 2;
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17 += i19;
                }
            }
            return length == this.f38356d.length ? this : length == uVar.f38356d.length ? uVar : length == objArrCopyOf.length ? new u<>(0, 0, objArrCopyOf, fVar2) : new u<>(0, 0, Arrays.copyOf(objArrCopyOf, length), fVar2);
        }
        int i22 = this.f38354b | uVar.f38354b;
        int i23 = this.f38353a;
        int i24 = uVar.f38353a;
        int i25 = (i23 ^ i24) & (~i22);
        int i26 = i23 & i24;
        int i27 = i25;
        while (i26 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i26);
            if (L.f(this.f38356d[f(iLowestOneBit)], uVar.f38356d[uVar.f(iLowestOneBit)])) {
                i27 |= iLowestOneBit;
            } else {
                i22 |= iLowestOneBit;
            }
            i26 ^= iLowestOneBit;
        }
        if ((i22 & i27) != 0) {
            P1.b("Check failed.");
        }
        u<K, V> uVar2 = (L.f(this.f38355c, fVar.f38335c) && this.f38353a == i27 && this.f38354b == i22) ? this : new u<>(i27, i22, new Object[Integer.bitCount(i22) + (Integer.bitCount(i27) * 2)], null);
        int i28 = i22;
        int i29 = 0;
        while (i28 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i28);
            Object[] objArr3 = uVar2.f38356d;
            int length2 = (objArr3.length - 1) - i29;
            if (i(iLowestOneBit2)) {
                ?? S12 = s(t(iLowestOneBit2));
                if (uVar.i(iLowestOneBit2)) {
                    uVarS = (u<K, V>) S12.m(uVar.s(uVar.t(iLowestOneBit2)), i12 + 5, bVar, fVar);
                } else {
                    uVarS = S12;
                    if (uVar.h(iLowestOneBit2)) {
                        int iF2 = uVar.f(iLowestOneBit2);
                        Object obj = uVar.f38356d[iF2];
                        V vX2 = uVar.x(iF2);
                        int i32 = fVar.f38339g;
                        r17 = objArr3;
                        i13 = i27;
                        i14 = iLowestOneBit2;
                        uVarS = (u<K, V>) S12.l(obj != null ? obj.hashCode() : i15, obj, vX2, i12 + 5, fVar);
                        if (fVar.f38339g == i32) {
                            bVar.f398333a++;
                        }
                    }
                }
                r17 = objArr3;
                i13 = i27;
                i14 = iLowestOneBit2;
            } else {
                r17 = objArr3;
                i13 = i27;
                i14 = iLowestOneBit2;
                if (uVar.i(i14)) {
                    uVarS = uVar.s(uVar.t(i14));
                    if (h(i14)) {
                        int iF3 = f(i14);
                        Object obj2 = this.f38356d[iF3];
                        int i33 = i12 + 5;
                        if (uVarS.d(obj2 != null ? obj2.hashCode() : 0, i33, obj2)) {
                            bVar.f398333a++;
                        } else {
                            uVarS = (u<K, V>) uVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF3), i33, fVar);
                        }
                    }
                } else {
                    int iF4 = f(i14);
                    Object obj3 = this.f38356d[iF4];
                    Object objX = x(iF4);
                    int iF5 = uVar.f(i14);
                    Object obj4 = uVar.f38356d[iF5];
                    uVarS = (u<K, V>) j(obj3 != null ? obj3.hashCode() : 0, obj3, objX, obj4 != null ? obj4.hashCode() : 0, obj4, uVar.x(iF5), i12 + 5, fVar.f38335c);
                }
            }
            r17[length2] = uVarS;
            i29++;
            i28 ^= i14;
            i27 = i13;
            i15 = 0;
        }
        int i34 = 0;
        while (i27 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i27);
            int i35 = i34 * 2;
            if (uVar.h(iLowestOneBit3)) {
                int iF6 = uVar.f(iLowestOneBit3);
                Object[] objArr4 = uVar2.f38356d;
                objArr4[i35] = uVar.f38356d[iF6];
                objArr4[i35 + 1] = uVar.x(iF6);
                if (h(iLowestOneBit3)) {
                    bVar.f398333a++;
                }
            } else {
                int iF7 = f(iLowestOneBit3);
                Object[] objArr5 = uVar2.f38356d;
                objArr5[i35] = this.f38356d[iF7];
                objArr5[i35 + 1] = x(iF7);
            }
            i34++;
            i27 ^= iLowestOneBit3;
        }
        return e(uVar2) ? this : uVar.e(uVar2) ? uVar : uVar2;
    }

    @Y61.l
    public final u<K, V> n(int i12, K k12, int i13, @Y61.k f<K, V> fVar) {
        u<K, V> uVarN;
        int iD2 = 1 << y.d(i12, i13);
        if (h(iD2)) {
            int iF2 = f(iD2);
            return L.f(k12, this.f38356d[iF2]) ? p(iF2, iD2, fVar) : this;
        }
        if (!i(iD2)) {
            return this;
        }
        int iT2 = t(iD2);
        u<K, V> uVarS = s(iT2);
        if (i13 == 30) {
            kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, uVarS.f38356d.length), 2);
            int i14 = jVarP.f406905b;
            int i15 = jVarP.f406906c;
            int i16 = jVarP.f406907d;
            if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
                uVarN = uVarS;
                break;
            }
            while (!L.f(k12, uVarS.f38356d[i14])) {
                if (i14 == i15) {
                    uVarN = uVarS;
                    break;
                }
                i14 += i16;
            }
            uVarN = uVarS.k(i14, fVar);
        } else {
            uVarN = uVarS.n(i12, k12, i13 + 5, fVar);
        }
        return q(uVarS, uVarN, iT2, iD2, fVar.f38335c);
    }

    @Y61.l
    public final u<K, V> o(int i12, K k12, V v12, int i13, @Y61.k f<K, V> fVar) {
        u<K, V> uVarO;
        int iD2 = 1 << y.d(i12, i13);
        if (h(iD2)) {
            int iF2 = f(iD2);
            return (L.f(k12, this.f38356d[iF2]) && L.f(v12, x(iF2))) ? p(iF2, iD2, fVar) : this;
        }
        if (!i(iD2)) {
            return this;
        }
        int iT2 = t(iD2);
        u<K, V> uVarS = s(iT2);
        if (i13 == 30) {
            kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, uVarS.f38356d.length), 2);
            int i14 = jVarP.f406905b;
            int i15 = jVarP.f406906c;
            int i16 = jVarP.f406907d;
            if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
                uVarO = uVarS;
            } else {
                while (true) {
                    if (!L.f(k12, uVarS.f38356d[i14]) || !L.f(v12, uVarS.x(i14))) {
                        if (i14 == i15) {
                            break;
                        }
                        i14 += i16;
                    } else {
                        uVarO = uVarS.k(i14, fVar);
                        break;
                    }
                }
                uVarO = uVarS;
            }
        } else {
            uVarO = uVarS.o(i12, k12, v12, i13 + 5, fVar);
        }
        return q(uVarS, uVarO, iT2, iD2, fVar.f38335c);
    }

    public final u<K, V> p(int i12, int i13, f<K, V> fVar) {
        fVar.e(fVar.f38339g - 1);
        fVar.f38337e = x(i12);
        Object[] objArr = this.f38356d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f38355c != fVar.f38335c) {
            return new u<>(i13 ^ this.f38353a, this.f38354b, y.b(i12, objArr), fVar.f38335c);
        }
        this.f38356d = y.b(i12, objArr);
        this.f38353a ^= i13;
        return this;
    }

    public final u<K, V> q(u<K, V> uVar, u<K, V> uVar2, int i12, int i13, i0.f fVar) {
        i0.f fVar2 = this.f38355c;
        if (uVar2 == null) {
            Object[] objArr = this.f38356d;
            if (objArr.length == 1) {
                return null;
            }
            if (fVar2 != fVar) {
                return new u<>(this.f38353a, i13 ^ this.f38354b, y.c(i12, objArr), fVar);
            }
            this.f38356d = y.c(i12, objArr);
            this.f38354b ^= i13;
        } else if (fVar2 == fVar || uVar != uVar2) {
            return r(i12, uVar2, fVar);
        }
        return this;
    }

    public final u<K, V> r(int i12, u<K, V> uVar, i0.f fVar) {
        Object[] objArr = this.f38356d;
        if (objArr.length == 1 && uVar.f38356d.length == 2 && uVar.f38354b == 0) {
            uVar.f38353a = this.f38354b;
            return uVar;
        }
        if (this.f38355c == fVar) {
            objArr[i12] = uVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i12] = uVar;
        return new u<>(this.f38353a, this.f38354b, objArrCopyOf, fVar);
    }

    @Y61.k
    public final u<K, V> s(int i12) {
        return (u) this.f38356d[i12];
    }

    public final int t(int i12) {
        return (this.f38356d.length - 1) - Integer.bitCount((i12 - 1) & this.f38354b);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3 A[RETURN] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.b<K, V> u(int r12, K r13, V r14, int r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.u(int, java.lang.Object, java.lang.Object, int):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u$b");
    }

    @Y61.l
    public final u v(int i12, int i13, Object obj) {
        u<K, V> uVarV;
        int iD2 = 1 << y.d(i12, i13);
        if (h(iD2)) {
            int iF2 = f(iD2);
            if (!L.f(obj, this.f38356d[iF2])) {
                return this;
            }
            Object[] objArr = this.f38356d;
            if (objArr.length == 2) {
                return null;
            }
            return new u(this.f38353a ^ iD2, this.f38354b, y.b(iF2, objArr), null);
        }
        if (!i(iD2)) {
            return this;
        }
        int iT2 = t(iD2);
        u<K, V> uVarS = s(iT2);
        if (i13 == 30) {
            kotlin.ranges.j jVarP = kotlin.ranges.s.p(kotlin.ranges.s.r(0, uVarS.f38356d.length), 2);
            int i14 = jVarP.f406905b;
            int i15 = jVarP.f406906c;
            int i16 = jVarP.f406907d;
            if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
                uVarV = uVarS;
                break;
            }
            while (!L.f(obj, uVarS.f38356d[i14])) {
                if (i14 == i15) {
                    uVarV = uVarS;
                    break;
                }
                i14 += i16;
            }
            Object[] objArr2 = uVarS.f38356d;
            uVarV = objArr2.length == 2 ? null : new u<>(0, 0, y.b(i14, objArr2), null);
        } else {
            uVarV = uVarS.v(i12, i13 + 5, obj);
        }
        if (uVarV != null) {
            return uVarS != uVarV ? w(iT2, iD2, uVarV) : this;
        }
        Object[] objArr3 = this.f38356d;
        if (objArr3.length == 1) {
            return null;
        }
        return new u(this.f38353a, iD2 ^ this.f38354b, y.c(iT2, objArr3), null);
    }

    public final u<K, V> w(int i12, int i13, u<K, V> uVar) {
        Object[] objArr = uVar.f38356d;
        if (objArr.length != 2 || uVar.f38354b != 0) {
            Object[] objArr2 = this.f38356d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i12] = uVar;
            return new u<>(this.f38353a, this.f38354b, objArrCopyOf, null);
        }
        if (this.f38356d.length == 1) {
            uVar.f38353a = this.f38354b;
            return uVar;
        }
        int iF2 = f(i13);
        Object[] objArr3 = this.f38356d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        C42756l.o(objArrCopyOf2, i12 + 2, objArrCopyOf2, i12 + 1, objArr3.length);
        C42756l.o(objArrCopyOf2, iF2 + 2, objArrCopyOf2, iF2, i12);
        objArrCopyOf2[iF2] = obj;
        objArrCopyOf2[iF2 + 1] = obj2;
        return new u<>(this.f38353a ^ i13, i13 ^ this.f38354b, objArrCopyOf2, null);
    }

    public final V x(int i12) {
        return (V) this.f38356d[i12 + 1];
    }
}

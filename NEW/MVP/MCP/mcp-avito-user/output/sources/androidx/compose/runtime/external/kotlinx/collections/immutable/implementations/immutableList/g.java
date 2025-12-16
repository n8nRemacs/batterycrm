package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.P1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.internal.P;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42744f;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentVectorBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/g;", "E", "Lkotlin/collections/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g<E> extends AbstractC42744f<E> implements g.a<E> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends E> f38301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object[] f38302c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object[] f38303d;

    /* renamed from: e, reason: collision with root package name */
    public int f38304e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public i0.f f38305f = new i0.f();

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Object[] f38306g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public Object[] f38307h;

    /* renamed from: i, reason: collision with root package name */
    public int f38308i;

    /* compiled from: PersistentVectorBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<E, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f38309l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f38309l = collection;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f38309l.contains(obj));
        }
    }

    public g(@Y61.k b bVar, @Y61.l Object[] objArr, @Y61.k Object[] objArr2, int i12) {
        this.f38301b = bVar;
        this.f38302c = objArr;
        this.f38303d = objArr2;
        this.f38304e = i12;
        this.f38306g = this.f38302c;
        this.f38307h = this.f38303d;
        this.f38308i = this.f38301b.size();
    }

    public static void d(Object[] objArr, int i12, Iterator it) {
        while (i12 < 32 && it.hasNext()) {
            objArr[i12] = it.next();
            i12++;
        }
    }

    public final Object[] C(int i12, int i13, Object[] objArr) {
        if (!(i13 >= 0)) {
            P1.a("shift should be positive");
        }
        if (i13 == 0) {
            return objArr;
        }
        int iA2 = m.a(i12, i13);
        Object objC = C(i12, i13 - 5, (Object[]) objArr[iA2]);
        if (iA2 < 31) {
            int i14 = iA2 + 1;
            if (objArr[i14] != null) {
                if (r(objArr)) {
                    Arrays.fill(objArr, i14, 32, (Object) null);
                }
                Object[] objArrW = w();
                System.arraycopy(objArr, 0, objArrW, 0, i14);
                objArr = objArrW;
            }
        }
        if (objC == objArr[iA2]) {
            return objArr;
        }
        Object[] objArrT = t(objArr);
        objArrT[iA2] = objC;
        return objArrT;
    }

    public final Object[] E(Object[] objArr, int i12, int i13, e eVar) {
        Object[] objArrE;
        int iA2 = m.a(i13 - 1, i12);
        if (i12 == 5) {
            eVar.f38296a = objArr[iA2];
            objArrE = null;
        } else {
            objArrE = E((Object[]) objArr[iA2], i12 - 5, i13, eVar);
        }
        if (objArrE == null && iA2 == 0) {
            return null;
        }
        Object[] objArrT = t(objArr);
        objArrT[iA2] = objArrE;
        return objArrT;
    }

    public final void I(int i12, int i13, Object[] objArr) {
        if (i13 == 0) {
            this.f38306g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f38307h = objArr;
            this.f38308i = i12;
            this.f38304e = i13;
            return;
        }
        e eVar = new e(null);
        Object[] objArrE = E(objArr, i13, i12, eVar);
        this.f38307h = (Object[]) eVar.f38296a;
        this.f38308i = i12;
        if (objArrE[1] == null) {
            this.f38306g = (Object[]) objArrE[0];
            this.f38304e = i13 - 5;
        } else {
            this.f38306g = objArrE;
            this.f38304e = i13;
        }
    }

    public final Object[] K(Object[] objArr, int i12, int i13, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            P1.a("invalid buffersIterator");
        }
        if (!(i13 >= 0)) {
            P1.a("negative shift");
        }
        if (i13 == 0) {
            return it.next();
        }
        Object[] objArrT = t(objArr);
        int iA2 = m.a(i12, i13);
        int i14 = i13 - 5;
        objArrT[iA2] = K((Object[]) objArrT[iA2], i12, i14, it);
        while (true) {
            iA2++;
            if (iA2 >= 32 || !it.hasNext()) {
                break;
            }
            objArrT[iA2] = K((Object[]) objArrT[iA2], 0, i14, it);
        }
        return objArrT;
    }

    public final Object[] N(Object[] objArr, int i12, Object[][] objArr2) {
        Iterator<Object[]> itA = C42809i.a(objArr2);
        int i13 = i12 >> 5;
        int i14 = this.f38304e;
        Object[] objArrK = i13 < (1 << i14) ? K(objArr, i12, i14, itA) : t(objArr);
        while (itA.hasNext()) {
            this.f38304e += 5;
            objArrK = y(objArrK);
            int i15 = this.f38304e;
            K(objArrK, 1 << i15, i15, itA);
        }
        return objArrK;
    }

    public final void O(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i12 = this.f38308i;
        int i13 = i12 >> 5;
        int i14 = this.f38304e;
        if (i13 > (1 << i14)) {
            this.f38306g = P(y(objArr), objArr2, this.f38304e + 5);
            this.f38307h = objArr3;
            this.f38304e += 5;
            this.f38308i++;
            return;
        }
        if (objArr == null) {
            this.f38306g = objArr2;
            this.f38307h = objArr3;
            this.f38308i = i12 + 1;
        } else {
            this.f38306g = P(objArr, objArr2, i14);
            this.f38307h = objArr3;
            this.f38308i++;
        }
    }

    public final Object[] P(Object[] objArr, Object[] objArr2, int i12) {
        int iA2 = m.a(getF406668c() - 1, i12);
        Object[] objArrT = t(objArr);
        if (i12 == 5) {
            objArrT[iA2] = objArr2;
        } else {
            objArrT[iA2] = P((Object[]) objArrT[iA2], objArr2, i12 - 5);
        }
        return objArrT;
    }

    public final int Q(Y41.l lVar, Object[] objArr, int i12, int i13, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (r(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) eVar.f38296a;
        Object[] objArrW = objArr2;
        for (int i14 = 0; i14 < i12; i14++) {
            Object obj = objArr[i14];
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i13 == 32) {
                    objArrW = !arrayList.isEmpty() ? (Object[]) C22026a.b(1, arrayList) : w();
                    i13 = 0;
                }
                objArrW[i13] = obj;
                i13++;
            }
        }
        eVar.f38296a = objArrW;
        if (objArr2 != objArrW) {
            arrayList2.add(objArr2);
        }
        return i13;
    }

    public final int R(Y41.l<? super E, Boolean> lVar, Object[] objArr, int i12, e eVar) {
        Object[] objArrT = objArr;
        int i13 = i12;
        boolean z12 = false;
        for (int i14 = 0; i14 < i12; i14++) {
            Object obj = objArr[i14];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z12) {
                    objArrT = t(objArr);
                    z12 = true;
                    i13 = i14;
                }
            } else if (z12) {
                objArrT[i13] = obj;
                i13++;
            }
        }
        eVar.f38296a = objArrT;
        return i13;
    }

    public final boolean S(@Y61.k Y41.l<? super E, Boolean> lVar) {
        int i12;
        int iZ2 = Z();
        Object[] objArrC = null;
        e eVar = new e(null);
        boolean z12 = false;
        if (this.f38306g == null) {
            int iR2 = R(lVar, this.f38307h, iZ2, eVar);
            if (iR2 == iZ2) {
                iR2 = iZ2;
            } else {
                Object[] objArr = (Object[]) eVar.f38296a;
                Arrays.fill(objArr, iR2, iZ2, (Object) null);
                this.f38307h = objArr;
                this.f38308i -= iZ2 - iR2;
            }
            if (iR2 != iZ2) {
                z12 = true;
            }
        } else {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a aVarS = s(0);
            int i13 = 32;
            int iR3 = 32;
            while (iR3 == 32 && aVarS.hasNext()) {
                iR3 = R(lVar, (Object[]) aVarS.next(), 32, eVar);
            }
            if (iR3 == 32) {
                aVarS.hasNext();
                int iR4 = R(lVar, this.f38307h, iZ2, eVar);
                if (iR4 == iZ2) {
                    iR4 = iZ2;
                } else {
                    Object[] objArr2 = (Object[]) eVar.f38296a;
                    Arrays.fill(objArr2, iR4, iZ2, (Object) null);
                    this.f38307h = objArr2;
                    this.f38308i -= iZ2 - iR4;
                }
                if (iR4 == 0) {
                    I(this.f38308i, this.f38304e, this.f38306g);
                }
                if (iR4 != iZ2) {
                }
            } else {
                int iPreviousIndex = aVarS.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iQ2 = iR3;
                while (aVarS.hasNext()) {
                    iQ2 = Q(lVar, (Object[]) aVarS.next(), 32, iQ2, eVar, arrayList2, arrayList);
                    iPreviousIndex = iPreviousIndex;
                    i13 = i13;
                }
                int i14 = iPreviousIndex;
                int iQ3 = Q(lVar, this.f38307h, iZ2, iQ2, eVar, arrayList2, arrayList);
                Object[] objArr3 = (Object[]) eVar.f38296a;
                Arrays.fill(objArr3, iQ3, i13, (Object) null);
                Object[] objArrK = arrayList.isEmpty() ? this.f38306g : K(this.f38306g, i14, this.f38304e, arrayList.iterator());
                int size = i14 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    P1.a("invalid size");
                }
                if (size == 0) {
                    this.f38304e = 0;
                } else {
                    int i15 = size - 1;
                    while (true) {
                        i12 = this.f38304e;
                        if ((i15 >> i12) != 0) {
                            break;
                        }
                        this.f38304e = i12 - 5;
                        objArrK = objArrK[0];
                    }
                    objArrC = C(i15, i12, objArrK);
                }
                this.f38306g = objArrC;
                this.f38307h = objArr3;
                this.f38308i = size + iQ3;
            }
            z12 = true;
        }
        if (z12) {
            ((AbstractList) this).modCount++;
        }
        return z12;
    }

    public final Object[] T(Object[] objArr, int i12, int i13, e eVar) {
        int iA2 = m.a(i13, i12);
        if (i12 == 0) {
            Object obj = objArr[iA2];
            Object[] objArrT = t(objArr);
            int i14 = iA2 + 1;
            System.arraycopy(objArr, i14, objArrT, iA2, 32 - i14);
            objArrT[31] = eVar.f38296a;
            eVar.f38296a = obj;
            return objArrT;
        }
        int iA3 = objArr[31] == null ? m.a(V() - 1, i12) : 31;
        Object[] objArrT2 = t(objArr);
        int i15 = i12 - 5;
        int i16 = iA2 + 1;
        if (i16 <= iA3) {
            while (true) {
                objArrT2[iA3] = T((Object[]) objArrT2[iA3], i15, 0, eVar);
                if (iA3 == i16) {
                    break;
                }
                iA3--;
            }
        }
        objArrT2[iA2] = T((Object[]) objArrT2[iA2], i15, i13, eVar);
        return objArrT2;
    }

    public final Object U(Object[] objArr, int i12, int i13, int i14) {
        int f38308i = getF406668c() - i12;
        if (f38308i == 1) {
            Object obj = this.f38307h[0];
            I(i12, i13, objArr);
            return obj;
        }
        Object[] objArr2 = this.f38307h;
        Object obj2 = objArr2[i14];
        Object[] objArrT = t(objArr2);
        int i15 = i14 + 1;
        System.arraycopy(objArr2, i15, objArrT, i14, f38308i - i15);
        objArrT[f38308i - 1] = null;
        this.f38306g = objArr;
        this.f38307h = objArrT;
        this.f38308i = (i12 + f38308i) - 1;
        this.f38304e = i13;
        return obj2;
    }

    public final int V() {
        int i12 = this.f38308i;
        if (i12 <= 32) {
            return 0;
        }
        return (i12 - 1) & (-32);
    }

    public final Object[] X(Object[] objArr, int i12, int i13, E e12, e eVar) {
        int iA2 = m.a(i13, i12);
        Object[] objArrT = t(objArr);
        if (i12 != 0) {
            objArrT[iA2] = X((Object[]) objArrT[iA2], i12 - 5, i13, e12, eVar);
            return objArrT;
        }
        if (objArrT != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f38296a = objArrT[iA2];
        objArrT[iA2] = e12;
        return objArrT;
    }

    public final void Y(Collection<? extends E> collection, int i12, Object[] objArr, int i13, Object[][] objArr2, int i14, Object[] objArr3) {
        Object[] objArrW;
        if (i14 < 1) {
            P1.a("requires at least one nullBuffer");
        }
        Object[] objArrT = t(objArr);
        objArr2[0] = objArrT;
        int i15 = i12 & 31;
        int size = ((collection.size() + i12) - 1) & 31;
        int i16 = (i13 - i15) + size;
        if (i16 < 32) {
            C42756l.o(objArrT, size + 1, objArr3, i15, i13);
        } else {
            int i17 = i16 - 31;
            if (i14 == 1) {
                objArrW = objArrT;
            } else {
                objArrW = w();
                i14--;
                objArr2[i14] = objArrW;
            }
            int i18 = i13 - i17;
            C42756l.o(objArrT, 0, objArr3, i18, i13);
            C42756l.o(objArrT, size + 1, objArrW, i15, i18);
            objArr3 = objArrW;
        }
        Iterator<? extends E> it = collection.iterator();
        d(objArrT, i15, it);
        for (int i19 = 1; i19 < i14; i19++) {
            Object[] objArrW2 = w();
            d(objArrW2, 0, it);
            objArr2[i19] = objArrW2;
        }
        d(objArr3, 0, it);
    }

    public final int Z() {
        int i12 = this.f38308i;
        return i12 <= 32 ? i12 : i12 - ((i12 - 1) & (-32));
    }

    @Override // kotlin.collections.AbstractC42744f
    public final E a(int i12) {
        i0.e.a(i12, getF406668c());
        ((AbstractList) this).modCount++;
        int iV2 = V();
        if (i12 >= iV2) {
            return (E) U(this.f38306g, iV2, this.f38304e, i12 - iV2);
        }
        e eVar = new e(this.f38307h[0]);
        U(T(this.f38306g, this.f38304e, i12, eVar), iV2, this.f38304e, 0);
        return (E) eVar.f38296a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        i0.e.b(i12, getF406668c());
        if (i12 == getF406668c()) {
            add(e12);
            return;
        }
        ((AbstractList) this).modCount++;
        int iV2 = V();
        if (i12 >= iV2) {
            l(e12, this.f38306g, i12 - iV2);
            return;
        }
        e eVar = new e(null);
        l(eVar.f38296a, h(this.f38306g, this.f38304e, i12, e12, eVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, @Y61.k Collection<? extends E> collection) {
        Object[] objArrW;
        i0.e.b(i12, this.f38308i);
        if (i12 == this.f38308i) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i13 = (i12 >> 5) << 5;
        int size = ((collection.size() + (this.f38308i - i13)) - 1) / 32;
        if (size == 0) {
            int i14 = i12 & 31;
            int size2 = ((collection.size() + i12) - 1) & 31;
            Object[] objArr = this.f38307h;
            Object[] objArrT = t(objArr);
            System.arraycopy(objArr, i14, objArrT, size2 + 1, Z() - i14);
            d(objArrT, i14, collection.iterator());
            this.f38307h = objArrT;
            this.f38308i = collection.size() + this.f38308i;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iZ2 = Z();
        int size3 = collection.size() + this.f38308i;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i12 >= V()) {
            objArrW = w();
            Y(collection, i12, this.f38307h, iZ2, objArr2, size, objArrW);
        } else if (size3 > iZ2) {
            int i15 = size3 - iZ2;
            objArrW = v(i15, this.f38307h);
            g(collection, i12, i15, objArr2, size, objArrW);
        } else {
            Object[] objArr3 = this.f38307h;
            objArrW = w();
            int i16 = iZ2 - size3;
            System.arraycopy(objArr3, i16, objArrW, 0, iZ2 - i16);
            int i17 = 32 - i16;
            Object[] objArrV = v(i17, this.f38307h);
            int i18 = size - 1;
            objArr2[i18] = objArrV;
            g(collection, i12, i17, objArr2, i18, objArrV);
        }
        this.f38306g = N(this.f38306g, i13, objArr2);
        this.f38307h = objArrW;
        this.f38308i = collection.size() + this.f38308i;
        return true;
    }

    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> b() {
        f fVar;
        if (this.f38306g == this.f38302c && this.f38307h == this.f38303d) {
            fVar = this.f38301b;
        } else {
            this.f38305f = new i0.f();
            Object[] objArr = this.f38306g;
            this.f38302c = objArr;
            Object[] objArr2 = this.f38307h;
            this.f38303d = objArr2;
            if (objArr != null) {
                fVar = new f(this.f38306g, this.f38308i, this.f38304e, this.f38307h);
            } else if (objArr2.length == 0) {
                k.f38317d.getClass();
                fVar = k.f38318e;
            } else {
                fVar = new k(Arrays.copyOf(this.f38307h, this.f38308i));
            }
        }
        this.f38301b = fVar;
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.g<E>) fVar;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection<? extends E> collection, int i12, int i13, Object[][] objArr, int i14, Object[] objArr2) {
        if (this.f38306g == null) {
            throw new IllegalStateException("root is null");
        }
        int i15 = i12 >> 5;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a aVarS = s(V() >> 5);
        int i16 = i14;
        Object[] objArrV = objArr2;
        while (aVarS.previousIndex() != i15) {
            Object[] objArr3 = (Object[]) aVarS.previous();
            C42756l.o(objArr3, 0, objArrV, 32 - i13, 32);
            objArrV = v(i13, objArr3);
            i16--;
            objArr[i16] = objArrV;
        }
        Object[] objArr4 = (Object[]) aVarS.previous();
        int iV2 = i14 - (((V() >> 5) - 1) - i15);
        if (iV2 < i14) {
            objArr2 = objArr[iV2];
        }
        Y(collection, i12, objArr4, 32, objArr, iV2, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        Object[] objArr;
        i0.e.a(i12, getF406668c());
        if (V() <= i12) {
            objArr = this.f38307h;
        } else {
            objArr = this.f38306g;
            for (int i13 = this.f38304e; i13 > 0; i13 -= 5) {
                objArr = (Object[]) objArr[m.a(i12, i13)];
            }
        }
        return (E) objArr[i12 & 31];
    }

    @Override // kotlin.collections.AbstractC42744f
    /* renamed from: getSize, reason: from getter */
    public final int getF406668c() {
        return this.f38308i;
    }

    public final Object[] h(Object[] objArr, int i12, int i13, Object obj, e eVar) {
        Object obj2;
        int iA2 = m.a(i13, i12);
        if (i12 == 0) {
            eVar.f38296a = objArr[31];
            Object[] objArrT = t(objArr);
            System.arraycopy(objArr, iA2, objArrT, iA2 + 1, 31 - iA2);
            objArrT[iA2] = obj;
            return objArrT;
        }
        Object[] objArrT2 = t(objArr);
        int i14 = i12 - 5;
        objArrT2[iA2] = h((Object[]) objArrT2[iA2], i14, i13, obj, eVar);
        while (true) {
            iA2++;
            if (iA2 >= 32 || (obj2 = objArrT2[iA2]) == null) {
                break;
            }
            objArrT2[iA2] = h((Object[]) obj2, i14, 0, eVar.f38296a, eVar);
        }
        return objArrT2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @Y61.k
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void l(Object obj, Object[] objArr, int i12) {
        int iZ2 = Z();
        Object[] objArrT = t(this.f38307h);
        if (iZ2 < 32) {
            C42756l.o(this.f38307h, i12 + 1, objArrT, i12, iZ2);
            objArrT[i12] = obj;
            this.f38306g = objArr;
            this.f38307h = objArrT;
            this.f38308i++;
            return;
        }
        Object[] objArr2 = this.f38307h;
        Object obj2 = objArr2[31];
        C42756l.o(objArr2, i12 + 1, objArrT, i12, 31);
        objArrT[i12] = obj;
        O(objArr, objArrT, y(obj2));
    }

    @Override // java.util.AbstractList, java.util.List
    @Y61.k
    public final ListIterator<E> listIterator(int i12) {
        i0.e.b(i12, this.f38308i);
        return new i(this, i12);
    }

    public final boolean r(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f38305f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        return S(new a(collection));
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a s(int i12) {
        Object[] objArr = this.f38306g;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iV2 = V() >> 5;
        i0.e.b(i12, iV2);
        int i13 = this.f38304e;
        return i13 == 0 ? new j(objArr, i12) : new l(objArr, i12, iV2, i13 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        i0.e.a(i12, getF406668c());
        if (V() > i12) {
            e eVar = new e(null);
            this.f38306g = X(this.f38306g, this.f38304e, i12, e12, eVar);
            return (E) eVar.f38296a;
        }
        Object[] objArrT = t(this.f38307h);
        if (objArrT != this.f38307h) {
            ((AbstractList) this).modCount++;
        }
        int i13 = i12 & 31;
        E e13 = (E) objArrT[i13];
        objArrT[i13] = e12;
        this.f38307h = objArrT;
        return e13;
    }

    public final Object[] t(Object[] objArr) {
        if (objArr == null) {
            return w();
        }
        if (r(objArr)) {
            return objArr;
        }
        Object[] objArrW = w();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C42756l.s(objArr, 0, objArrW, length, 6);
        return objArrW;
    }

    public final Object[] v(int i12, Object[] objArr) {
        if (r(objArr)) {
            System.arraycopy(objArr, 0, objArr, i12, 32 - i12);
            return objArr;
        }
        Object[] objArrW = w();
        System.arraycopy(objArr, 0, objArrW, i12, 32 - i12);
        return objArrW;
    }

    public final Object[] w() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f38305f;
        return objArr;
    }

    public final Object[] y(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f38305f;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    @Y61.k
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        ((AbstractList) this).modCount++;
        int iZ2 = Z();
        if (iZ2 < 32) {
            Object[] objArrT = t(this.f38307h);
            objArrT[iZ2] = e12;
            this.f38307h = objArrT;
            this.f38308i = getF406668c() + 1;
        } else {
            O(this.f38306g, this.f38307h, y(e12));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@Y61.k Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iZ2 = Z();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iZ2 >= collection.size()) {
            Object[] objArrT = t(this.f38307h);
            d(objArrT, iZ2, it);
            this.f38307h = objArrT;
            this.f38308i = collection.size() + this.f38308i;
        } else {
            int size = ((collection.size() + iZ2) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrT2 = t(this.f38307h);
            d(objArrT2, iZ2, it);
            objArr[0] = objArrT2;
            for (int i12 = 1; i12 < size; i12++) {
                Object[] objArrW = w();
                d(objArrW, 0, it);
                objArr[i12] = objArrW;
            }
            this.f38306g = N(this.f38306g, V(), objArr);
            Object[] objArrW2 = w();
            d(objArrW2, 0, it);
            this.f38307h = objArrW2;
            this.f38308i = collection.size() + this.f38308i;
        }
        return true;
    }
}

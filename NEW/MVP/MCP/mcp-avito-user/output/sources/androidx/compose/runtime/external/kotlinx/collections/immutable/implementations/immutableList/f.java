package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.P1;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentVector.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<E> extends b<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object[] f38297c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object[] f38298d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38299e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38300f;

    public f(@Y61.k Object[] objArr, int i12, int i13, @Y61.k Object[] objArr2) {
        this.f38297c = objArr;
        this.f38298d = objArr2;
        this.f38299e = i12;
        this.f38300f = i13;
        if (!(getF406660f() > 32)) {
            P1.a("Trie-based persistent vector should have at least 33 elements, got " + getF406660f());
        }
        int length = objArr2.length;
    }

    public static Object[] a(Object[] objArr, int i12, int i13, Object obj, e eVar) {
        int iA2 = m.a(i13, i12);
        if (i12 == 0) {
            Object[] objArrCopyOf = iA2 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            C42756l.o(objArr, iA2 + 1, objArrCopyOf, iA2, 31);
            eVar.f38296a = objArr[31];
            objArrCopyOf[iA2] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i14 = i12 - 5;
        objArrCopyOf2[iA2] = a((Object[]) objArr[iA2], i14, i13, obj, eVar);
        while (true) {
            iA2++;
            if (iA2 >= 32 || objArrCopyOf2[iA2] == null) {
                break;
            }
            objArrCopyOf2[iA2] = a((Object[]) objArr[iA2], i14, 0, eVar.f38296a, eVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] d(Object[] objArr, int i12, int i13, e eVar) {
        Object[] objArrD;
        int iA2 = m.a(i13, i12);
        if (i12 == 5) {
            eVar.f38296a = objArr[iA2];
            objArrD = null;
        } else {
            objArrD = d((Object[]) objArr[iA2], i12 - 5, i13, eVar);
        }
        if (objArrD == null && iA2 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iA2] = objArrD;
        return objArrCopyOf;
    }

    public static Object[] s(int i12, int i13, Object obj, Object[] objArr) {
        int iA2 = m.a(i13, i12);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i12 == 0) {
            objArrCopyOf[iA2] = obj;
        } else {
            objArrCopyOf[iA2] = s(i12 - 5, i13, obj, (Object[]) objArrCopyOf[iA2]);
        }
        return objArrCopyOf;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> X4(int i12) {
        i0.e.a(i12, this.f38299e);
        int iR2 = r();
        Object[] objArr = this.f38297c;
        int i13 = this.f38300f;
        return i12 >= iR2 ? l(objArr, iR2, i13, i12 - iR2) : l(h(objArr, i13, i12, new e(this.f38298d[0])), iR2, i13, 0);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(E e12) {
        int iR2 = r();
        int i12 = this.f38299e;
        int i13 = i12 - iR2;
        Object[] objArr = this.f38297c;
        Object[] objArr2 = this.f38298d;
        if (i13 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i13] = e12;
            return new f(objArr, i12 + 1, this.f38300f, objArrCopyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = e12;
        return e(objArr, objArr2, objArr3);
    }

    public final f b(Object obj, Object[] objArr, int i12) {
        int iR2 = r();
        int i13 = this.f38299e;
        int i14 = i13 - iR2;
        Object[] objArr2 = this.f38298d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i14 < 32) {
            C42756l.o(objArr2, i12 + 1, objArrCopyOf, i12, i14);
            objArrCopyOf[i12] = obj;
            return new f(objArr, i13 + 1, this.f38300f, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        C42756l.o(objArr2, i12 + 1, objArrCopyOf, i12, i14 - 1);
        objArrCopyOf[i12] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return e(objArr, objArrCopyOf, objArr3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    public final g builder() {
        return new g(this, this.f38297c, this.f38298d, this.f38300f);
    }

    public final f<E> e(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i12 = this.f38299e;
        int i13 = i12 >> 5;
        int i14 = this.f38300f;
        if (i13 <= (1 << i14)) {
            return new f<>(g(objArr, objArr2, i14), i12 + 1, i14, objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i15 = i14 + 5;
        return new f<>(g(objArr4, objArr2, i15), i12 + 1, i15, objArr3);
    }

    public final Object[] g(Object[] objArr, Object[] objArr2, int i12) {
        int iA2 = m.a(getF406660f() - 1, i12);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i12 == 5) {
            objArrCopyOf[iA2] = objArr2;
        } else {
            objArrCopyOf[iA2] = g((Object[]) objArrCopyOf[iA2], objArr2, i12 - 5);
        }
        return objArrCopyOf;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final E get(int i12) {
        Object[] objArr;
        i0.e.a(i12, getF406660f());
        if (r() <= i12) {
            objArr = this.f38298d;
        } else {
            objArr = this.f38297c;
            for (int i13 = this.f38300f; i13 > 0; i13 -= 5) {
                objArr = (Object[]) objArr[m.a(i12, i13)];
            }
        }
        return (E) objArr[i12 & 31];
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize, reason: from getter */
    public final int getF406660f() {
        return this.f38299e;
    }

    public final Object[] h(Object[] objArr, int i12, int i13, e eVar) {
        int iA2 = m.a(i13, i12);
        if (i12 == 0) {
            Object[] objArrCopyOf = iA2 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            C42756l.o(objArr, iA2, objArrCopyOf, iA2 + 1, 32);
            objArrCopyOf[31] = eVar.f38296a;
            eVar.f38296a = objArr[iA2];
            return objArrCopyOf;
        }
        int iA3 = objArr[31] == null ? m.a(r() - 1, i12) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i14 = i12 - 5;
        int i15 = iA2 + 1;
        if (i15 <= iA3) {
            while (true) {
                objArrCopyOf2[iA3] = h((Object[]) objArrCopyOf2[iA3], i14, 0, eVar);
                if (iA3 == i15) {
                    break;
                }
                iA3--;
            }
        }
        objArrCopyOf2[iA2] = h((Object[]) objArrCopyOf2[iA2], i14, i13, eVar);
        return objArrCopyOf2;
    }

    public final b l(Object[] objArr, int i12, int i13, int i14) {
        int i15 = this.f38299e - i12;
        if (i15 != 1) {
            Object[] objArr2 = this.f38298d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i16 = i15 - 1;
            if (i14 < i16) {
                C42756l.o(objArr2, i14, objArrCopyOf, i14 + 1, i15);
            }
            objArrCopyOf[i16] = null;
            return new f(objArr, (i12 + i15) - 1, i13, objArrCopyOf);
        }
        if (i13 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new k(objArr);
        }
        e eVar = new e(null);
        Object[] objArrD = d(objArr, i13, i12 - 1, eVar);
        Object[] objArr3 = (Object[]) eVar.f38296a;
        return objArrD[1] == null ? new f((Object[]) objArrD[0], i12, i13 - 5, objArr3) : new f(objArrD, i12, i13, objArr3);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    @Y61.k
    public final ListIterator<E> listIterator(int i12) {
        i0.e.b(i12, this.f38299e);
        return new h(this.f38297c, i12, this.f38298d, this.f38299e, (this.f38300f / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> q5(@Y61.k Y41.l<? super E, Boolean> lVar) {
        g gVar = new g(this, this.f38297c, this.f38298d, this.f38300f);
        gVar.S(lVar);
        return gVar.b();
    }

    public final int r() {
        return (this.f38299e - 1) & (-32);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> set(int i12, E e12) {
        int i13 = this.f38299e;
        i0.e.a(i12, i13);
        int iR2 = r();
        Object[] objArr = this.f38297c;
        Object[] objArr2 = this.f38298d;
        int i14 = this.f38300f;
        if (iR2 > i12) {
            return new f(s(i14, i12, e12, objArr), i13, i14, objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i12 & 31] = e12;
        return new f(objArr, i13, i14, objArrCopyOf);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(int i12, E e12) {
        int i13 = this.f38299e;
        i0.e.b(i12, i13);
        if (i12 == i13) {
            return add((f<E>) e12);
        }
        int iR2 = r();
        Object[] objArr = this.f38297c;
        if (i12 >= iR2) {
            return b(e12, objArr, i12 - iR2);
        }
        e eVar = new e(null);
        return b(eVar.f38296a, a(objArr, this.f38300f, i12, e12, eVar), 0);
    }
}

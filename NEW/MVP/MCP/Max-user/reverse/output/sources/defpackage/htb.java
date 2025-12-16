package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class htb extends f3 implements ftb {
    public Object[] X;
    public Object[] Y;
    public int Z;
    public l3 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public lcj o = new lcj(24);

    public htb(l3 l3Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = l3Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.X = objArr;
        this.Y = objArr2;
        this.Z = l3Var.getSize();
    }

    public static void c(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, Object obj, h08 h08Var) {
        int iF = yoi.f(i2, i);
        Object[] objArrJ = j(objArr);
        if (i == 0) {
            if (objArrJ != objArr) {
                ((AbstractList) this).modCount++;
            }
            h08Var.b = objArrJ[iF];
            objArrJ[iF] = obj;
            return objArrJ;
        }
        Object obj2 = objArrJ[iF];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrJ[iF] = A((Object[]) obj2, i - 5, i2, obj, h08Var);
        return objArrJ;
    }

    public final void B(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrL;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrJ = j(objArr);
        objArr2[0] = objArrJ;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ys.l(size + 1, i4, i2, objArrJ, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrL = objArrJ;
            } else {
                objArrL = l();
                i3--;
                objArr2[i3] = objArrL;
            }
            int i7 = i2 - i6;
            ys.l(0, i7, i2, objArrJ, objArr3);
            ys.l(size + 1, i4, i7, objArrJ, objArrL);
            objArr3 = objArrL;
        }
        Iterator it = collection.iterator();
        c(objArrJ, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrL2 = l();
            c(objArrL2, 0, it);
            objArr2[i8] = objArrL2;
        }
        c(objArr3, 0, it);
    }

    public final int C() {
        int i = this.Z;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.f3
    public final Object a(int i) {
        hqi.c(i, getSize());
        ((AbstractList) this).modCount++;
        int iZ = z();
        if (i >= iZ) {
            return y(this.X, iZ, this.d, i - iZ);
        }
        h08 h08Var = new h08(26, this.Y[0]);
        y(x(this.X, this.d, i, h08Var), iZ, this.d, 0);
        return h08Var.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        hqi.d(i, getSize());
        if (i == getSize()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iZ = z();
        if (i >= iZ) {
            g(i - iZ, obj, this.X);
        } else {
            h08 h08Var = new h08(26, (Object) null);
            g(0, h08Var.b, f(this.X, this.d, i, obj, h08Var));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        htb htbVar;
        Object[] objArrL;
        hqi.d(i, this.Z);
        if (i == this.Z) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.Z - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.Y;
            Object[] objArrJ = j(objArr);
            System.arraycopy(objArr, i3, objArrJ, size2 + 1, C() - i3);
            c(objArrJ, i3, collection.iterator());
            this.Y = objArrJ;
            this.Z = collection.size() + this.Z;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iC = C();
        int size3 = collection.size() + this.Z;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= z()) {
            objArrL = l();
            collection2 = collection;
            B(collection2, i, this.Y, iC, objArr2, size, objArrL);
            htbVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            htbVar = this;
            if (size3 > iC) {
                int i4 = size3 - iC;
                Object[] objArrK = k(i4, htbVar.Y);
                htbVar.e(collection2, i, i4, objArr2, size, objArrK);
                objArr2 = objArr2;
                objArrL = objArrK;
            } else {
                Object[] objArr3 = htbVar.Y;
                objArrL = l();
                int i5 = iC - size3;
                System.arraycopy(objArr3, i5, objArrL, 0, iC - i5);
                int i6 = 32 - i5;
                Object[] objArrK2 = k(i6, htbVar.Y);
                int i7 = size - 1;
                objArr2[i7] = objArrK2;
                htbVar.e(collection2, i, i6, objArr2, i7, objArrK2);
                collection2 = collection2;
            }
        }
        htbVar.X = r(htbVar.X, i2, objArr2);
        htbVar.Y = objArrL;
        htbVar.Z = collection2.size() + htbVar.Z;
        return true;
    }

    public final l3 b() {
        l3 f5fVar;
        Object[] objArr = this.X;
        if (objArr == this.b && this.Y == this.c) {
            f5fVar = this.a;
        } else {
            this.o = new lcj(24);
            this.b = objArr;
            Object[] objArr2 = this.Y;
            this.c = objArr2;
            f5fVar = objArr == null ? objArr2.length == 0 ? f5f.b : new f5f(Arrays.copyOf(objArr2, this.Z)) : new gtb(objArr, objArr2, this.Z, this.d);
        }
        this.a = f5fVar;
        return f5fVar;
    }

    public final int d() {
        return ((AbstractList) this).modCount;
    }

    public final void e(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.X == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        j2 j2VarI = i(z() >> 5);
        int i5 = i3;
        Object[] objArrK = objArr2;
        while (j2VarI.a - 1 != i4) {
            Object[] objArr3 = (Object[]) j2VarI.previous();
            ys.l(0, 32 - i2, 32, objArr3, objArrK);
            objArrK = k(i2, objArr3);
            i5--;
            objArr[i5] = objArrK;
        }
        Object[] objArr4 = (Object[]) j2VarI.previous();
        int iZ = i3 - (((z() >> 5) - 1) - i4);
        if (iZ < i3) {
            objArr2 = objArr[iZ];
        }
        B(collection, i, objArr4, 32, objArr, iZ, objArr2);
    }

    public final Object[] f(Object[] objArr, int i, int i2, Object obj, h08 h08Var) {
        int iF = yoi.f(i2, i);
        if (i == 0) {
            h08Var.b = objArr[31];
            Object[] objArrJ = j(objArr);
            System.arraycopy(objArr, iF, objArrJ, iF + 1, 31 - iF);
            objArrJ[iF] = obj;
            return objArrJ;
        }
        Object[] objArrJ2 = j(objArr);
        int i3 = i - 5;
        Object obj2 = objArrJ2[iF];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrJ2[iF] = f((Object[]) obj2, i3, i2, obj, h08Var);
        int i4 = iF + 1;
        while (i4 < 32) {
            int i5 = i4 + 1;
            Object obj3 = objArrJ2[i4];
            if (obj3 == null) {
                break;
            }
            objArrJ2[i4] = f((Object[]) obj3, i3, 0, h08Var.b, h08Var);
            i4 = i5;
        }
        return objArrJ2;
    }

    public final void g(int i, Object obj, Object[] objArr) {
        int iC = C();
        Object[] objArrJ = j(this.Y);
        if (iC >= 32) {
            Object[] objArr2 = this.Y;
            Object obj2 = objArr2[31];
            ys.l(i + 1, i, 31, objArr2, objArrJ);
            objArrJ[i] = obj;
            s(objArr, objArrJ, m(obj2));
            return;
        }
        ys.l(i + 1, i, iC, this.Y, objArrJ);
        objArrJ[i] = obj;
        this.X = objArr;
        this.Y = objArrJ;
        this.Z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        hqi.c(i, getSize());
        if (z() <= i) {
            objArr = this.Y;
        } else {
            objArr = this.X;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[yoi.f(i, i2)];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.f3
    public final int getSize() {
        return this.Z;
    }

    public final boolean h(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.o;
    }

    public final j2 i(int i) {
        if (this.X == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iZ = z() >> 5;
        hqi.d(i, iZ);
        int i2 = this.d;
        if (i2 == 0) {
            return new av0(i, this.X);
        }
        return new tig(this.X, i, iZ, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr) {
        if (objArr == null) {
            return l();
        }
        if (h(objArr)) {
            return objArr;
        }
        Object[] objArrL = l();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ys.m(0, length, 6, objArr, objArrL);
        return objArrL;
    }

    public final Object[] k(int i, Object[] objArr) {
        if (h(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrL = l();
        System.arraycopy(objArr, 0, objArrL, i, 32 - i);
        return objArrL;
    }

    public final Object[] l() {
        Object[] objArr = new Object[33];
        objArr[32] = this.o;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hqi.d(i, this.Z);
        return new jtb(this, i);
    }

    public final Object[] m(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.o;
        return objArr;
    }

    public final Object[] n(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iF = yoi.f(i, i2);
        Object obj = objArr[iF];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object objN = n(i, i2 - 5, (Object[]) obj);
        if (iF < 31) {
            int i3 = iF + 1;
            if (objArr[i3] != null) {
                if (h(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrL = l();
                System.arraycopy(objArr, 0, objArrL, 0, i3);
                objArr = objArrL;
            }
        }
        if (objN == objArr[iF]) {
            return objArr;
        }
        Object[] objArrJ = j(objArr);
        objArrJ[iF] = objN;
        return objArrJ;
    }

    public final Object[] o(Object[] objArr, int i, int i2, h08 h08Var) {
        Object[] objArrO;
        int iF = yoi.f(i2 - 1, i);
        if (i == 5) {
            h08Var.b = objArr[iF];
            objArrO = null;
        } else {
            Object obj = objArr[iF];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrO = o((Object[]) obj, i - 5, i2, h08Var);
        }
        if (objArrO == null && iF == 0) {
            return null;
        }
        Object[] objArrJ = j(objArr);
        objArrJ[iF] = objArrO;
        return objArrJ;
    }

    public final void p(int i, int i2, Object[] objArr) {
        Object obj = null;
        if (i2 == 0) {
            this.X = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.Y = objArr;
            this.Z = i;
            this.d = i2;
            return;
        }
        h08 h08Var = new h08(26, obj);
        Object[] objArrO = o(objArr, i2, i, h08Var);
        Object obj2 = h08Var.b;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.Y = (Object[]) obj2;
        this.Z = i;
        if (objArrO[1] == null) {
            this.X = (Object[]) objArrO[0];
            this.d = i2 - 5;
        } else {
            this.X = objArrO;
            this.d = i2;
        }
    }

    public final Object[] q(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrJ = j(objArr);
        int iF = yoi.f(i, i2);
        int i3 = i2 - 5;
        objArrJ[iF] = q((Object[]) objArrJ[iF], i, i3, it);
        while (true) {
            iF++;
            if (iF >= 32 || !it.hasNext()) {
                break;
            }
            objArrJ[iF] = q((Object[]) objArrJ[iF], 0, i3, it);
        }
        return objArrJ;
    }

    public final Object[] r(Object[] objArr, int i, Object[][] objArr2) {
        f2 f2Var = new f2(2, objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrQ = i2 < (1 << i3) ? q(objArr, i, i3, f2Var) : j(objArr);
        while (f2Var.hasNext()) {
            this.d += 5;
            objArrQ = m(objArrQ);
            int i4 = this.d;
            q(objArrQ, 1 << i4, i4, f2Var);
        }
        return objArrQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0 != r15) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (w(r1, r15, r5) != r15) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htb.removeAll(java.util.Collection):boolean");
    }

    public final void s(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.Z;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.X = t(m(objArr), objArr2, this.d + 5);
            this.Y = objArr3;
            this.d += 5;
            this.Z++;
            return;
        }
        if (objArr == null) {
            this.X = objArr2;
            this.Y = objArr3;
            this.Z = i + 1;
        } else {
            this.X = t(objArr, objArr2, i3);
            this.Y = objArr3;
            this.Z++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        hqi.c(i, getSize());
        if (z() > i) {
            h08 h08Var = new h08(26, (Object) null);
            this.X = A(this.X, this.d, i, obj, h08Var);
            return h08Var.b;
        }
        Object[] objArrJ = j(this.Y);
        if (objArrJ != this.Y) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrJ[i2];
        objArrJ[i2] = obj;
        this.Y = objArrJ;
        return obj2;
    }

    public final Object[] t(Object[] objArr, Object[] objArr2, int i) {
        int iF = yoi.f(getSize() - 1, i);
        Object[] objArrJ = j(objArr);
        if (i == 5) {
            objArrJ[iF] = objArr2;
            return objArrJ;
        }
        objArrJ[iF] = t((Object[]) objArrJ[iF], objArr2, i - 5);
        return objArrJ;
    }

    public final int u(i0 i0Var, Object[] objArr, int i, int i2, h08 h08Var, ArrayList arrayList, ArrayList arrayList2) {
        if (h(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = h08Var.b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrL = objArr2;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            Object obj2 = objArr[i3];
            if (((Boolean) i0Var.invoke(obj2)).booleanValue()) {
                i3 = i4;
            } else {
                if (i2 == 32) {
                    objArrL = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : l();
                    i2 = 0;
                }
                objArrL[i2] = obj2;
                i3 = i4;
                i2++;
            }
        }
        h08Var.b = objArrL;
        if (objArr2 != objArrL) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int v(i0 i0Var, Object[] objArr, int i, h08 h08Var) {
        int i2 = 0;
        Object[] objArrJ = objArr;
        int i3 = i;
        boolean z = false;
        while (i2 < i) {
            int i4 = i2 + 1;
            Object obj = objArr[i2];
            if (((Boolean) i0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrJ = j(objArr);
                    z = true;
                    i3 = i2;
                }
            } else if (z) {
                i2 = i3 + 1;
                objArrJ[i3] = obj;
                i3 = i2;
            }
            i2 = i4;
        }
        h08Var.b = objArrJ;
        return i3;
    }

    public final int w(i0 i0Var, int i, h08 h08Var) {
        int iV = v(i0Var, this.Y, i, h08Var);
        if (iV == i) {
            return i;
        }
        Object obj = h08Var.b;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iV, i, (Object) null);
        this.Y = objArr;
        this.Z -= i - iV;
        return iV;
    }

    public final Object[] x(Object[] objArr, int i, int i2, h08 h08Var) {
        int iF = yoi.f(i2, i);
        if (i == 0) {
            Object obj = objArr[iF];
            Object[] objArrJ = j(objArr);
            int i3 = iF + 1;
            System.arraycopy(objArr, i3, objArrJ, iF, 32 - i3);
            objArrJ[31] = h08Var.b;
            h08Var.b = obj;
            return objArrJ;
        }
        int iF2 = objArr[31] == null ? yoi.f(z() - 1, i) : 31;
        Object[] objArrJ2 = j(objArr);
        int i4 = i - 5;
        int i5 = iF + 1;
        if (i5 <= iF2) {
            while (true) {
                int i6 = iF2 - 1;
                Object obj2 = objArrJ2[iF2];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrJ2[iF2] = x((Object[]) obj2, i4, 0, h08Var);
                if (iF2 == i5) {
                    break;
                }
                iF2 = i6;
            }
        }
        Object obj3 = objArrJ2[iF];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrJ2[iF] = x((Object[]) obj3, i4, i2, h08Var);
        return objArrJ2;
    }

    public final Object y(Object[] objArr, int i, int i2, int i3) {
        int size = getSize() - i;
        if (size == 1) {
            Object obj = this.Y[0];
            p(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.Y;
        Object obj2 = objArr2[i3];
        Object[] objArrJ = j(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrJ, i3, size - i4);
        objArrJ[size - 1] = null;
        this.X = objArr;
        this.Y = objArrJ;
        this.Z = (i + size) - 1;
        this.d = i2;
        return obj2;
    }

    public final int z() {
        int i = this.Z;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iC = C();
        if (iC < 32) {
            Object[] objArrJ = j(this.Y);
            objArrJ[iC] = obj;
            this.Y = objArrJ;
            this.Z = getSize() + 1;
        } else {
            s(this.X, this.Y, m(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iC = C();
        Iterator it = collection.iterator();
        if (32 - iC >= collection.size()) {
            Object[] objArrJ = j(this.Y);
            c(objArrJ, iC, it);
            this.Y = objArrJ;
            this.Z = collection.size() + this.Z;
            return true;
        }
        int size = ((collection.size() + iC) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrJ2 = j(this.Y);
        c(objArrJ2, iC, it);
        objArr[0] = objArrJ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrL = l();
            c(objArrL, 0, it);
            objArr[i] = objArrL;
        }
        this.X = r(this.X, z(), objArr);
        Object[] objArrL2 = l();
        c(objArrL2, 0, it);
        this.Y = objArrL2;
        this.Z = collection.size() + this.Z;
        return true;
    }
}

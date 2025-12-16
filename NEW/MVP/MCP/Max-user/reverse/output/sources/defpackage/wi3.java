package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class wi3 extends AbstractMap implements Serializable {
    public static final Object u0 = new Object();
    public static final Object v0 = new Object();
    public transient int X;
    public transient int Y;
    public transient AbstractSet Z;
    public final /* synthetic */ int a;
    public transient Object b;
    public transient int[] c;
    public transient Object[] d;
    public transient Object[] o;
    public transient AbstractSet s0;
    public transient AbstractCollection t0;

    public wi3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.X = Math.min(Math.max(12, 1), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
                break;
        }
    }

    public static wi3 a(int i) {
        wi3 wi3Var = new wi3(0);
        u5j.c("Expected size must be >= 0", i >= 0);
        wi3Var.X = Math.min(Math.max(i, 1), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return wi3Var;
    }

    public Map b() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int c() {
        return (1 << (this.X & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                if (!f()) {
                    this.X += 32;
                    Map mapB = b();
                    if (mapB == null) {
                        Arrays.fill(i(), 0, this.Y, (Object) null);
                        Arrays.fill(j(), 0, this.Y, (Object) null);
                        Object obj = this.b;
                        Objects.requireNonNull(obj);
                        if (obj instanceof byte[]) {
                            Arrays.fill((byte[]) obj, (byte) 0);
                        } else if (obj instanceof short[]) {
                            Arrays.fill((short[]) obj, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj, 0);
                        }
                        Arrays.fill(h(), 0, this.Y, 0);
                        this.Y = 0;
                        break;
                    } else {
                        this.X = Math.min(Math.max(size(), 3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
                        mapB.clear();
                        this.b = null;
                        this.Y = 0;
                        break;
                    }
                }
                break;
            default:
                if (!q()) {
                    this.X += 32;
                    Map mapO = o();
                    if (mapO == null) {
                        Arrays.fill(m(), 0, this.Y, (Object) null);
                        Arrays.fill(n(), 0, this.Y, (Object) null);
                        Object obj2 = this.b;
                        Objects.requireNonNull(obj2);
                        if (obj2 instanceof byte[]) {
                            Arrays.fill((byte[]) obj2, (byte) 0);
                        } else if (obj2 instanceof short[]) {
                            Arrays.fill((short[]) obj2, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj2, 0);
                        }
                        Arrays.fill(l(), 0, this.Y, 0);
                        this.Y = 0;
                        break;
                    } else {
                        this.X = Math.min(Math.max(size(), 3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
                        mapO.clear();
                        this.b = null;
                        this.Y = 0;
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map mapB = b();
                return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
            default:
                Map mapO = o();
                return mapO != null ? mapO.containsKey(obj) : s(obj) != -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                Map mapB = b();
                if (mapB != null) {
                    return mapB.containsValue(obj);
                }
                for (int i = 0; i < this.Y; i++) {
                    if (uyi.c(obj, j()[i])) {
                        return true;
                    }
                }
                return false;
            default:
                Map mapO = o();
                if (mapO != null) {
                    return mapO.containsValue(obj);
                }
                for (int i2 = 0; i2 < this.Y; i2++) {
                    if (pui.c(obj, n()[i2])) {
                        return true;
                    }
                }
                return false;
        }
    }

    public int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iH = t2i.h(obj);
        int iC = c();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int iE = z4j.e(iH & iC, obj2);
        if (iE == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iH & i;
        do {
            int i3 = iE - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && uyi.c(obj, i()[i3])) {
                return i3;
            }
            iE = i4 & iC;
        } while (iE != 0);
        return -1;
    }

    public void e(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i3];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i3];
        objArrI[i3] = null;
        objArrJ[i3] = null;
        iArrH[i] = iArrH[i3];
        iArrH[i3] = 0;
        int iH = t2i.h(obj2) & i2;
        int iE = z4j.e(iH, obj);
        if (iE == size) {
            z4j.f(iH, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iE - 1;
            int i5 = iArrH[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrH[i4] = z4j.c(i5, i + 1, i2);
                return;
            }
            iE = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                ti3 ti3Var = (ti3) this.s0;
                if (ti3Var != null) {
                    return ti3Var;
                }
                ti3 ti3Var2 = new ti3(this, 0);
                this.s0 = ti3Var2;
                return ti3Var2;
            default:
                dhi dhiVar = (dhi) this.s0;
                if (dhiVar != null) {
                    return dhiVar;
                }
                dhi dhiVar2 = new dhi(this, 0);
                this.s0 = dhiVar2;
                return dhiVar2;
        }
    }

    public boolean f() {
        return this.b == null;
    }

    public Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int iD = z4j.d(obj, null, iC, obj2, h(), i(), null);
            if (iD != -1) {
                Object obj3 = j()[iD];
                e(iD, iC);
                this.Y--;
                this.X += 32;
                return obj3;
            }
        }
        return u0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                Map mapB = b();
                if (mapB != null) {
                    return mapB.get(obj);
                }
                int iD = d(obj);
                if (iD == -1) {
                    return null;
                }
                return j()[iD];
            default:
                Map mapO = o();
                if (mapO != null) {
                    return mapO.get(obj);
                }
                int iS = s(obj);
                if (iS == -1) {
                    return null;
                }
                return n()[iS];
        }
    }

    public int[] h() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] i() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (size() == 0) {
                }
                break;
            default:
                if (size() == 0) {
                }
                break;
        }
        return false;
    }

    public Object[] j() {
        Object[] objArr = this.o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public int k(int i, int i2, int i3, int i4) {
        Object objB = z4j.b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            z4j.f(i3 & i5, i4 + 1, objB);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = z4j.e(i6, obj);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrH[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iE2 = z4j.e(i10, objB);
                z4j.f(i10, iE, objB);
                iArrH[i7] = z4j.c(i9, iE2, i5);
                iE = i8 & i;
            }
        }
        this.b = objB;
        this.X = z4j.c(this.X, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                ti3 ti3Var = (ti3) this.Z;
                if (ti3Var != null) {
                    return ti3Var;
                }
                ti3 ti3Var2 = new ti3(this, 1);
                this.Z = ti3Var2;
                return ti3Var2;
            default:
                dhi dhiVar = (dhi) this.Z;
                if (dhiVar != null) {
                    return dhiVar;
                }
                dhi dhiVar2 = new dhi(this, 1);
                this.Z = dhiVar2;
                return dhiVar2;
        }
    }

    public int[] l() {
        int[] iArr = this.c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] m() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Object[] n() {
        Object[] objArr = this.o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Map o() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public void p(int i, int i2) {
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrL = l();
        Object[] objArrM = m();
        Object[] objArrN = n();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM[i] = null;
            objArrN[i] = null;
            iArrL[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrM[i3];
        objArrM[i] = obj2;
        objArrN[i] = objArrN[i3];
        objArrM[i3] = null;
        objArrN[i3] = null;
        iArrL[i] = iArrL[i3];
        iArrL[i3] = 0;
        int iB = zui.b(obj2) & i2;
        int iD = xui.d(iB, obj);
        if (iD == size) {
            xui.f(iB, i4, obj);
            return;
        }
        while (true) {
            int i5 = iD - 1;
            int i6 = iArrL[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrL[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iD = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0281  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0294 -> B:96:0x027a). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi3.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public boolean q() {
        return this.b == null;
    }

    public int r() {
        return (1 << (this.X & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Map mapB = b();
                if (mapB != null) {
                    return mapB.remove(obj);
                }
                Object objG = g(obj);
                if (objG == u0) {
                    return null;
                }
                return objG;
            default:
                Map mapO = o();
                if (mapO != null) {
                    return mapO.remove(obj);
                }
                Object objU = u(obj);
                if (objU == v0) {
                    return null;
                }
                return objU;
        }
    }

    public int s(Object obj) {
        if (q()) {
            return -1;
        }
        int iB = zui.b(obj);
        int iR = r();
        Object obj2 = this.b;
        Objects.requireNonNull(obj2);
        int iD = xui.d(iB & iR, obj2);
        if (iD != 0) {
            int i = ~iR;
            int i2 = iB & i;
            do {
                int i3 = iD - 1;
                int i4 = l()[i3];
                if ((i4 & i) == i2 && pui.c(obj, m()[i3])) {
                    return i3;
                }
                iD = i4 & iR;
            } while (iD != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                Map mapB = b();
                if (mapB == null) {
                    break;
                } else {
                    break;
                }
            default:
                Map mapO = o();
                if (mapO == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.Y;
    }

    public int t(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objE = xui.e(i2);
        if (i4 != 0) {
            xui.f(i3 & i5, i4 + 1, objE);
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iD = xui.d(i6, obj);
            while (iD != 0) {
                int i7 = iD - 1;
                int i8 = iArrL[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iD2 = xui.d(i10, objE);
                xui.f(i10, iD, objE);
                iArrL[i7] = ((~i5) & i9) | (iD2 & i5);
                iD = i8 & i;
            }
        }
        this.b = objE;
        this.X = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.X & (-32));
        return i5;
    }

    public Object u(Object obj) {
        if (!q()) {
            int iR = r();
            Object obj2 = this.b;
            Objects.requireNonNull(obj2);
            int iC = xui.c(obj, null, iR, obj2, l(), m(), null);
            if (iC != -1) {
                Object obj3 = n()[iC];
                p(iC, iR);
                this.Y--;
                this.X += 32;
                return obj3;
            }
        }
        return v0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.t0;
                if (e3Var != null) {
                    return e3Var;
                }
                e3 e3Var2 = new e3(1, this);
                this.t0 = e3Var2;
                return e3Var2;
            default:
                e3 e3Var3 = (e3) this.t0;
                if (e3Var3 != null) {
                    return e3Var3;
                }
                e3 e3Var4 = new e3(3, this);
                this.t0 = e3Var4;
                return e3Var4;
        }
    }
}

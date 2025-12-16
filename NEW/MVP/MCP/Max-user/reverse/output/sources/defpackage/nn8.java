package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class nn8 implements Map, Serializable, qy7 {
    public static final nn8 x0;
    public int X;
    public int Y;
    public int Z;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int o;
    public int s0;
    public on8 t0;
    public pn8 u0;
    public on8 v0;
    public boolean w0;

    static {
        nn8 nn8Var = new nn8(0);
        nn8Var.w0 = true;
        x0 = nn8Var;
    }

    public nn8() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iF = f(obj);
            int i = this.o * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iF];
                if (i3 <= 0) {
                    int i4 = this.X;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.X = i5;
                        objArr[i4] = obj;
                        this.c[i4] = iF;
                        iArr[iF] = i5;
                        this.s0++;
                        this.Z++;
                        if (i2 > this.o) {
                            this.o = i2;
                        }
                        return i4;
                    }
                    d(1);
                } else {
                    if (fni.a(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        g(this.d.length * 2);
                        break;
                    }
                    iF = iF == 0 ? this.d.length - 1 : iF - 1;
                }
            }
        }
    }

    public final nn8 b() {
        c();
        this.w0 = true;
        return this.s0 > 0 ? this : x0;
    }

    public final void c() {
        if (this.w0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.X - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        fqi.h(0, this.X, this.a);
        Object[] objArr = this.b;
        if (objArr != null) {
            fqi.h(0, this.X, objArr);
        }
        this.s0 = 0;
        this.X = 0;
        this.Z++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.X;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.c[i2] >= 0 && fni.a(this.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    public final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.X;
        int i3 = length - i2;
        int i4 = i2 - this.s0;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            g(this.d.length);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.b;
            this.b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.c = Arrays.copyOf(this.c, i6);
            if (i6 < 1) {
                i6 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i6 * 3);
            if (iHighestOneBit > this.d.length) {
                g(iHighestOneBit);
            }
        }
    }

    public final int e(Object obj) {
        int iF = f(obj);
        int i = this.o;
        while (true) {
            int i2 = this.d[iF];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (fni.a(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iF = iF == 0 ? this.d.length - 1 : iF - 1;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        on8 on8Var = this.v0;
        if (on8Var != null) {
            return on8Var;
        }
        on8 on8Var2 = new on8(0, this);
        this.v0 = on8Var2;
        return on8Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.s0 == map.size()) {
                    for (Object obj2 : map.entrySet()) {
                        if (obj2 != null) {
                            try {
                                Map.Entry entry = (Map.Entry) obj2;
                                int iE = e(entry.getKey());
                                if (!(iE < 0 ? false : fni.a(this.b[iE], entry.getValue()))) {
                                }
                            } catch (ClassCastException unused) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r3[r0] = r7;
        r6.c[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7) {
        /*
            r6 = this;
            int r0 = r6.Z
            int r0 = r0 + 1
            r6.Z = r0
            int r0 = r6.X
            int r1 = r6.s0
            r2 = 0
            if (r0 <= r1) goto L3a
            java.lang.Object[] r0 = r6.b
            r1 = r2
            r3 = r1
        L11:
            int r4 = r6.X
            if (r1 >= r4) goto L2c
            int[] r4 = r6.c
            r4 = r4[r1]
            if (r4 < 0) goto L29
            java.lang.Object[] r4 = r6.a
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L27
            r4 = r0[r1]
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            java.lang.Object[] r1 = r6.a
            defpackage.fqi.h(r3, r4, r1)
            if (r0 == 0) goto L38
            int r1 = r6.X
            defpackage.fqi.h(r3, r1, r0)
        L38:
            r6.X = r3
        L3a:
            int[] r0 = r6.d
            int r1 = r0.length
            if (r7 == r1) goto L4c
            int[] r0 = new int[r7]
            r6.d = r0
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.Y = r7
            goto L50
        L4c:
            int r7 = r0.length
            java.util.Arrays.fill(r0, r2, r7, r2)
        L50:
            int r7 = r6.X
            if (r2 >= r7) goto L84
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.a
            r0 = r0[r2]
            int r0 = r6.f(r0)
            int r1 = r6.o
        L60:
            int[] r3 = r6.d
            r4 = r3[r0]
            if (r4 != 0) goto L6e
            r3[r0] = r7
            int[] r1 = r6.c
            r1[r2] = r0
            r2 = r7
            goto L50
        L6e:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L7c
            int r4 = r0 + (-1)
            if (r0 != 0) goto L7a
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L60
        L7a:
            r0 = r4
            goto L60
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn8.g(int):void");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        return this.b[iE];
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x001f->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.a
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.b
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.c
            r0 = r0[r12]
            int r1 = r11.o
            int r1 = r1 * 2
            int[] r2 = r11.d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1b
            r1 = r2
        L1b:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1f:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r11.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2a
        L29:
            r0 = r5
        L2a:
            int r4 = r4 + 1
            int r5 = r11.o
            r6 = -1
            if (r4 <= r5) goto L36
            int[] r0 = r11.d
            r0[r1] = r2
            goto L67
        L36:
            int[] r5 = r11.d
            r7 = r5[r0]
            if (r7 != 0) goto L3f
            r5[r1] = r2
            goto L67
        L3f:
            if (r7 >= 0) goto L46
            r5[r1] = r6
        L43:
            r1 = r0
            r4 = r2
            goto L60
        L46:
            java.lang.Object[] r5 = r11.a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.f(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L60
            r9[r1] = r7
            int[] r4 = r11.c
            r4[r8] = r1
            goto L43
        L60:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1f
            int[] r0 = r11.d
            r0[r1] = r6
        L67:
            int[] r0 = r11.c
            r0[r12] = r6
            int r12 = r11.s0
            int r12 = r12 + r6
            r11.s0 = r12
            int r12 = r11.Z
            int r12 = r12 + 1
            r11.Z = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn8.h(int):void");
    }

    @Override // java.util.Map
    public final int hashCode() {
        kn8 kn8Var = new kn8(0, this);
        int i = 0;
        while (kn8Var.hasNext()) {
            int i2 = kn8Var.a;
            nn8 nn8Var = (nn8) kn8Var.d;
            if (i2 >= nn8Var.X) {
                throw new NoSuchElementException();
            }
            kn8Var.a = i2 + 1;
            kn8Var.b = i2;
            Object obj = nn8Var.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = nn8Var.b[kn8Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            kn8Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.s0 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        on8 on8Var = this.t0;
        if (on8Var != null) {
            return on8Var;
        }
        on8 on8Var2 = new on8(1, this);
        this.t0 = on8Var2;
        return on8Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        d(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!fni.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        Object obj2 = this.b[iE];
        h(iE);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.s0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.s0 * 3) + 2);
        sb.append("{");
        int i = 0;
        kn8 kn8Var = new kn8(0, this);
        while (kn8Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = kn8Var.a;
            nn8 nn8Var = (nn8) kn8Var.d;
            if (i2 >= nn8Var.X) {
                throw new NoSuchElementException();
            }
            kn8Var.a = i2 + 1;
            kn8Var.b = i2;
            Object obj = nn8Var.a[i2];
            if (obj == nn8Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = nn8Var.b[kn8Var.b];
            if (obj2 == nn8Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            kn8Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        pn8 pn8Var = this.u0;
        if (pn8Var != null) {
            return pn8Var;
        }
        pn8 pn8Var2 = new pn8(0, this);
        this.u0 = pn8Var2;
        return pn8Var2;
    }

    public nn8(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.o = 2;
        this.X = 0;
        this.Y = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}

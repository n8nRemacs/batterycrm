package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uig {
    public static final uig e = new uig(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final lcj c;
    public Object[] d;

    public uig(int i, int i2, Object[] objArr, lcj lcjVar) {
        this.a = i;
        this.b = i2;
        this.c = lcjVar;
        this.d = objArr;
    }

    public static uig k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, lcj lcjVar) {
        if (i3 > 30) {
            return new uig(0, 0, new Object[]{obj, obj2, obj3, obj4}, lcjVar);
        }
        int iC = agi.c(i, i3);
        int iC2 = agi.c(i2, i3);
        if (iC != iC2) {
            return new uig((1 << iC) | (1 << iC2), 0, iC < iC2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, lcjVar);
        }
        return new uig(0, 1 << iC, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, lcjVar)}, lcjVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, lcj lcjVar) {
        Object obj3 = this.d[i];
        uig uigVarK = k(obj3 == null ? 0 : obj3.hashCode(), obj3, v(i), i3, obj, obj2, i4 + 5, lcjVar);
        int iU = u(i2);
        int i5 = iU + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ys.m(0, i, 6, objArr, objArr2);
        ys.l(i, i + 2, i5, objArr, objArr2);
        objArr2[iU - 1] = uigVarK;
        ys.l(iU, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += t(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        ro7 ro7VarG = n7j.g(n7j.h(0, this.d.length), 2);
        int i = ro7VarG.a;
        int i2 = ro7VarG.b;
        int i3 = ro7VarG.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (true) {
            int i4 = i + i3;
            if (fni.a(obj, this.d[i])) {
                return i;
            }
            if (i == i2) {
                return -1;
            }
            i = i4;
        }
    }

    public final boolean d(int i, int i2, Object obj) {
        int iC = 1 << agi.c(i, i2);
        if (i(iC)) {
            return fni.a(obj, this.d[f(iC)]);
        }
        if (!j(iC)) {
            return false;
        }
        uig uigVarT = t(u(iC));
        return i2 == 30 ? uigVarT.c(obj) != -1 : uigVarT.d(i, i2 + 5, obj);
    }

    public final boolean e(uig uigVar) {
        if (this == uigVar) {
            return true;
        }
        if (this.b == uigVar.b && this.a == uigVar.a) {
            int length = this.d.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (this.d[i] == uigVar.d[i]) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.uig r9, defpackage.sm6 r10) {
        /*
            r8 = this;
            if (r8 != r9) goto L4
            goto Lcc
        L4:
            int r0 = r8.a
            int r1 = r9.a
            r2 = 0
            if (r0 != r1) goto Lce
            int r1 = r8.b
            int r3 = r9.b
            if (r1 == r3) goto L13
            goto Lce
        L13:
            r3 = 2
            if (r0 != 0) goto L6e
            if (r1 != 0) goto L6e
            java.lang.Object[] r0 = r8.d
            int r1 = r0.length
            java.lang.Object[] r4 = r9.d
            int r4 = r4.length
            if (r1 == r4) goto L22
            goto Lce
        L22:
            int r0 = r0.length
            to7 r0 = defpackage.n7j.h(r2, r0)
            ro7 r0 = defpackage.n7j.g(r0, r3)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3a
            goto Lcc
        L3a:
            java.util.Iterator r0 = r0.iterator()
        L3e:
            r1 = r0
            so7 r1 = (defpackage.so7) r1
            boolean r1 = r1.c
            if (r1 == 0) goto Lcc
            r1 = r0
            so7 r1 = (defpackage.so7) r1
            int r1 = r1.nextInt()
            java.lang.Object[] r3 = r9.d
            r3 = r3[r1]
            java.lang.Object r1 = r9.v(r1)
            int r3 = r8.c(r3)
            r4 = -1
            if (r3 == r4) goto L6a
            java.lang.Object r3 = r8.v(r3)
            java.lang.Object r1 = r10.invoke(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L6b
        L6a:
            r1 = r2
        L6b:
            if (r1 != 0) goto L3e
            goto Lce
        L6e:
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 * r3
            to7 r1 = defpackage.n7j.h(r2, r0)
            ro7 r1 = defpackage.n7j.g(r1, r3)
            int r3 = r1.a
            int r4 = r1.b
            int r1 = r1.c
            if (r1 <= 0) goto L85
            if (r3 <= r4) goto L89
        L85:
            if (r1 >= 0) goto Lb4
            if (r4 > r3) goto Lb4
        L89:
            int r5 = r3 + r1
            java.lang.Object[] r6 = r8.d
            r6 = r6[r3]
            java.lang.Object[] r7 = r9.d
            r7 = r7[r3]
            boolean r6 = defpackage.fni.a(r6, r7)
            if (r6 != 0) goto L9a
            goto Lce
        L9a:
            java.lang.Object r6 = r8.v(r3)
            java.lang.Object r7 = r9.v(r3)
            java.lang.Object r6 = r10.invoke(r6, r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Laf
            goto Lce
        Laf:
            if (r3 != r4) goto Lb2
            goto Lb4
        Lb2:
            r3 = r5
            goto L89
        Lb4:
            java.lang.Object[] r1 = r8.d
            int r1 = r1.length
        Lb7:
            if (r0 >= r1) goto Lcc
            int r3 = r0 + 1
            uig r4 = r8.t(r0)
            uig r0 = r9.t(r0)
            boolean r0 = r4.g(r0, r10)
            if (r0 != 0) goto Lca
            goto Lce
        Lca:
            r0 = r3
            goto Lb7
        Lcc:
            r9 = 1
            return r9
        Lce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uig.g(uig, sm6):boolean");
    }

    public final Object h(int i, int i2, Object obj) {
        int iC = 1 << agi.c(i, i2);
        if (i(iC)) {
            int iF = f(iC);
            if (fni.a(obj, this.d[iF])) {
                return v(iF);
            }
            return null;
        }
        if (!j(iC)) {
            return null;
        }
        uig uigVarT = t(u(iC));
        if (i2 != 30) {
            return uigVarT.h(i, i2 + 5, obj);
        }
        int iC2 = uigVarT.c(obj);
        if (iC2 != -1) {
            return uigVarT.v(iC2);
        }
        return null;
    }

    public final boolean i(int i) {
        return (i & this.a) != 0;
    }

    public final boolean j(int i) {
        return (i & this.b) != 0;
    }

    public final uig l(int i, xsb xsbVar) {
        xsbVar.e(xsbVar.X - 1);
        xsbVar.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != xsbVar.b) {
            return new uig(0, 0, agi.b(i, objArr), xsbVar.b);
        }
        this.d = agi.b(i, objArr);
        return this;
    }

    public final uig m(int i, Object obj, Object obj2, int i2, xsb xsbVar) {
        xsb xsbVar2;
        uig uigVarM;
        int iC = 1 << agi.c(i, i2);
        boolean zI = i(iC);
        lcj lcjVar = this.c;
        if (zI) {
            int iF = f(iC);
            if (!fni.a(obj, this.d[iF])) {
                xsbVar.e(xsbVar.X + 1);
                lcj lcjVar2 = xsbVar.b;
                if (lcjVar != lcjVar2) {
                    return new uig(this.a ^ iC, this.b | iC, a(iF, iC, i, obj, obj2, i2, lcjVar2), lcjVar2);
                }
                this.d = a(iF, iC, i, obj, obj2, i2, lcjVar2);
                this.a ^= iC;
                this.b |= iC;
                return this;
            }
            xsbVar.d = v(iF);
            if (v(iF) == obj2) {
                return this;
            }
            if (lcjVar == xsbVar.b) {
                this.d[iF + 1] = obj2;
                return this;
            }
            xsbVar.o++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new uig(this.a, this.b, objArrCopyOf, xsbVar.b);
        }
        if (!j(iC)) {
            xsbVar.e(xsbVar.X + 1);
            lcj lcjVar3 = xsbVar.b;
            int iF2 = f(iC);
            if (lcjVar != lcjVar3) {
                return new uig(this.a | iC, this.b, agi.a(this.d, iF2, obj, obj2), lcjVar3);
            }
            this.d = agi.a(this.d, iF2, obj, obj2);
            this.a |= iC;
            return this;
        }
        int iU = u(iC);
        uig uigVarT = t(iU);
        if (i2 == 30) {
            int iC2 = uigVarT.c(obj);
            if (iC2 != -1) {
                xsbVar.d = uigVarT.v(iC2);
                if (uigVarT.c == xsbVar.b) {
                    uigVarT.d[iC2 + 1] = obj2;
                    uigVarM = uigVarT;
                } else {
                    xsbVar.o++;
                    Object[] objArr2 = uigVarT.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2[iC2 + 1] = obj2;
                    uigVarM = new uig(0, 0, objArrCopyOf2, xsbVar.b);
                }
            } else {
                xsbVar.e(xsbVar.X + 1);
                uigVarM = new uig(0, 0, agi.a(uigVarT.d, 0, obj, obj2), xsbVar.b);
            }
            xsbVar2 = xsbVar;
        } else {
            xsbVar2 = xsbVar;
            uigVarM = uigVarT.m(i, obj, obj2, i2 + 5, xsbVar2);
        }
        return uigVarT == uigVarM ? this : s(iU, uigVarM, xsbVar2.b);
    }

    public final uig n(uig uigVar, int i, rt4 rt4Var, xsb xsbVar) {
        Object[] objArr;
        uig uigVarK;
        if (this == uigVar) {
            rt4Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            lcj lcjVar = xsbVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + uigVar.d.length);
            int length = this.d.length;
            ro7 ro7VarG = n7j.g(n7j.h(0, uigVar.d.length), 2);
            int i3 = ro7VarG.a;
            int i4 = ro7VarG.b;
            int i5 = ro7VarG.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    int i6 = i3 + i5;
                    if (c(uigVar.d[i3]) != -1) {
                        rt4Var.a++;
                    } else {
                        Object[] objArr3 = uigVar.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 = i6;
                }
            }
            if (length != this.d.length) {
                if (length != uigVar.d.length) {
                    return length == objArrCopyOf.length ? new uig(0, 0, objArrCopyOf, lcjVar) : new uig(0, 0, Arrays.copyOf(objArrCopyOf, length), lcjVar);
                }
            }
            return this;
        }
        int i7 = this.b | uigVar.b;
        int i8 = this.a;
        int i9 = uigVar.a;
        int i10 = (i8 ^ i9) & (~i7);
        int i11 = i8 & i9;
        int i12 = i10;
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            if (fni.a(this.d[f(iLowestOneBit)], uigVar.d[uigVar.f(iLowestOneBit)])) {
                i12 |= iLowestOneBit;
            } else {
                i7 |= iLowestOneBit;
            }
            i11 ^= iLowestOneBit;
        }
        if ((i7 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        uig uigVar2 = (fni.a(this.c, xsbVar.b) && this.a == i12 && this.b == i7) ? this : new uig(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
        int i13 = i7;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i13);
            Object[] objArr4 = uigVar2.d;
            int length2 = (objArr4.length - 1) - i14;
            if (j(iLowestOneBit2)) {
                uigVarK = t(u(iLowestOneBit2));
                if (uigVar.j(iLowestOneBit2)) {
                    uigVarK = uigVarK.n(uigVar.t(uigVar.u(iLowestOneBit2)), i + 5, rt4Var, xsbVar);
                    objArr = objArr4;
                } else if (uigVar.i(iLowestOneBit2)) {
                    int iF = uigVar.f(iLowestOneBit2);
                    Object obj = uigVar.d[iF];
                    Object objV = uigVar.v(iF);
                    int i15 = xsbVar.X;
                    objArr = objArr4;
                    uigVarK = uigVarK.m(obj == null ? i2 : obj.hashCode(), obj, objV, i + 5, xsbVar);
                    if (xsbVar.X == i15) {
                        rt4Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (uigVar.j(iLowestOneBit2)) {
                    uig uigVarT = uigVar.t(uigVar.u(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i16 = i + 5;
                        if (uigVarT.d(obj2 == null ? 0 : obj2.hashCode(), i16, obj2)) {
                            rt4Var.a++;
                            uigVarK = uigVarT;
                        } else {
                            uigVarK = uigVarT.m(obj2 == null ? 0 : obj2.hashCode(), obj2, v(iF2), i16, xsbVar);
                        }
                    } else {
                        uigVarK = uigVarT;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objV2 = v(iF3);
                    int iF4 = uigVar.f(iLowestOneBit2);
                    Object obj4 = uigVar.d[iF4];
                    uigVarK = k(obj3 == null ? 0 : obj3.hashCode(), obj3, objV2, obj4 == null ? 0 : obj4.hashCode(), obj4, uigVar.v(iF4), i + 5, xsbVar.b);
                }
            }
            objArr[length2] = uigVarK;
            i14++;
            i13 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i17 = 0;
        while (i12 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i12);
            int i18 = i17 * 2;
            if (uigVar.i(iLowestOneBit3)) {
                int iF5 = uigVar.f(iLowestOneBit3);
                Object[] objArr5 = uigVar2.d;
                objArr5[i18] = uigVar.d[iF5];
                objArr5[i18 + 1] = uigVar.v(iF5);
                if (i(iLowestOneBit3)) {
                    rt4Var.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = uigVar2.d;
                objArr6[i18] = this.d[iF6];
                objArr6[i18 + 1] = v(iF6);
            }
            i17++;
            i12 ^= iLowestOneBit3;
        }
        if (!e(uigVar2)) {
            return uigVar.e(uigVar2) ? uigVar : uigVar2;
        }
        return this;
    }

    public final uig o(int i, Object obj, int i2, xsb xsbVar) {
        uig uigVarO;
        int iC = 1 << agi.c(i, i2);
        if (i(iC)) {
            int iF = f(iC);
            if (fni.a(obj, this.d[iF])) {
                return q(iF, iC, xsbVar);
            }
        } else if (j(iC)) {
            int iU = u(iC);
            uig uigVarT = t(iU);
            if (i2 == 30) {
                int iC2 = uigVarT.c(obj);
                uigVarO = iC2 != -1 ? uigVarT.l(iC2, xsbVar) : uigVarT;
            } else {
                uigVarO = uigVarT.o(i, obj, i2 + 5, xsbVar);
            }
            return r(uigVarT, uigVarO, iU, iC, xsbVar.b);
        }
        return this;
    }

    public final uig p(int i, Object obj, Object obj2, int i2, xsb xsbVar) {
        uig uigVarP;
        int iC = 1 << agi.c(i, i2);
        if (i(iC)) {
            int iF = f(iC);
            if (fni.a(obj, this.d[iF]) && fni.a(obj2, v(iF))) {
                return q(iF, iC, xsbVar);
            }
        } else if (j(iC)) {
            int iU = u(iC);
            uig uigVarT = t(iU);
            if (i2 == 30) {
                int iC2 = uigVarT.c(obj);
                uigVarP = (iC2 == -1 || !fni.a(obj2, uigVarT.v(iC2))) ? uigVarT : uigVarT.l(iC2, xsbVar);
            } else {
                uigVarP = uigVarT.p(i, obj, obj2, i2 + 5, xsbVar);
            }
            return r(uigVarT, uigVarP, iU, iC, xsbVar.b);
        }
        return this;
    }

    public final uig q(int i, int i2, xsb xsbVar) {
        xsbVar.e(xsbVar.X - 1);
        xsbVar.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != xsbVar.b) {
            return new uig(i2 ^ this.a, this.b, agi.b(i, objArr), xsbVar.b);
        }
        this.d = agi.b(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final uig r(uig uigVar, uig uigVar2, int i, int i2, lcj lcjVar) {
        if (uigVar2 != null) {
            return uigVar != uigVar2 ? s(i, uigVar2, lcjVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != lcjVar) {
            Object[] objArr2 = new Object[objArr.length - 1];
            ys.m(0, i, 6, objArr, objArr2);
            ys.l(i, i + 1, objArr.length, objArr, objArr2);
            return new uig(this.a, i2 ^ this.b, objArr2, lcjVar);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        ys.m(0, i, 6, objArr, objArr3);
        ys.l(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final uig s(int i, uig uigVar, lcj lcjVar) {
        lcj lcjVar2 = uigVar.c;
        Object[] objArr = this.d;
        if (objArr.length == 1 && uigVar.d.length == 2 && uigVar.b == 0) {
            uigVar.a = this.b;
            return uigVar;
        }
        if (this.c == lcjVar) {
            objArr[i] = uigVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = uigVar;
        return new uig(this.a, this.b, objArrCopyOf, lcjVar);
    }

    public final uig t(int i) {
        Object obj = this.d[i];
        if (obj != null) {
            return (uig) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int u(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    public final Object v(int i) {
        return this.d[i + 1];
    }
}

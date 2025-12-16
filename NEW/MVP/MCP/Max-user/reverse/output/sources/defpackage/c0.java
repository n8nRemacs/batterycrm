package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c0 implements ehh {
    public boolean b;
    public Object c = new Object[4];
    public int a = 0;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.c0 r9, defpackage.pi4 r10, defpackage.ij0 r11) {
        /*
            java.lang.Object r0 = r9.c
            ggg r0 = (defpackage.ggg) r0
            boolean r1 = r11 instanceof defpackage.dy7
            if (r1 == 0) goto L17
            r1 = r11
            dy7 r1 = (defpackage.dy7) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.t0 = r2
            goto L1c
        L17:
            dy7 r1 = new dy7
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.Z
            int r2 = r1.t0
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5e
            if (r2 != r8) goto L56
            java.lang.String r9 = r1.Y
            java.util.LinkedHashMap r10 = r1.X
            c0 r0 = r1.o
            pi4 r2 = r1.d
            defpackage.g8j.b(r11)
            sw7 r11 = (defpackage.sw7) r11
            r10.put(r9, r11)
            java.lang.Object r9 = r0.c
            ggg r9 = (defpackage.ggg) r9
            byte r9 = r9.v()
            if (r9 == r7) goto L51
            if (r9 != r6) goto L47
            goto L9d
        L47:
            java.lang.Object r9 = r0.c
            ggg r9 = (defpackage.ggg) r9
            java.lang.String r10 = "Expected end of the object or comma"
            defpackage.ggg.G(r9, r10, r3, r4, r5)
            throw r4
        L51:
            r11 = r9
            r9 = r0
            r0 = r10
            r10 = r2
            goto L70
        L56:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L5e:
            defpackage.g8j.b(r11)
            byte r11 = r0.w(r5)
            byte r2 = r0.X()
            if (r2 == r7) goto Lb3
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L70:
            java.lang.Object r2 = r9.c
            ggg r2 = (defpackage.ggg) r2
            boolean r3 = r2.s()
            if (r3 == 0) goto L9a
            boolean r11 = r9.b
            if (r11 == 0) goto L83
            java.lang.String r11 = r2.B()
            goto L87
        L83:
            java.lang.String r11 = r2.A()
        L87:
            r3 = 5
            r2.w(r3)
            r1.d = r10
            r1.o = r9
            r1.X = r0
            r1.Y = r11
            r1.t0 = r8
            r10.b = r1
            g84 r9 = defpackage.g84.a
            return r9
        L9a:
            r10 = r0
            r0 = r9
            r9 = r11
        L9d:
            java.lang.Object r11 = r0.c
            ggg r11 = (defpackage.ggg) r11
            if (r9 != r5) goto La7
            r11.w(r6)
            goto La9
        La7:
            if (r9 == r7) goto Laf
        La9:
            kx7 r9 = new kx7
            r9.<init>(r10)
            return r9
        Laf:
            defpackage.koi.e(r11)
            throw r4
        Lb3:
            java.lang.String r9 = "Unexpected leading comma"
            defpackage.ggg.G(r0, r9, r3, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0.d(c0, pi4, ij0):java.lang.Object");
    }

    @Override // defpackage.ehh
    public void a() {
        this.b = true;
    }

    @Override // defpackage.ehh
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.ehh
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.s0 = null;
        super/*android.view.View*/.setVisibility(this.a);
    }

    public sw7 e() {
        sw7 kx7Var;
        Object obj;
        ggg gggVar = (ggg) this.c;
        byte bX = gggVar.X();
        if (bX == 1) {
            return g(true);
        }
        if (bX == 0) {
            return g(false);
        }
        if (bX != 6) {
            if (bX == 8) {
                return f();
            }
            ggg.G(gggVar, "Cannot read Json element because of unexpected ".concat(api.g(bX)), 0, null, 6);
            throw null;
        }
        int i = this.a + 1;
        this.a = i;
        if (i == 200) {
            cy7 cy7Var = new cy7(this, null);
            pi4 pi4Var = new pi4();
            pi4Var.a = cy7Var;
            pi4Var.b = pi4Var;
            g84 g84Var = g84.a;
            pi4Var.c = g84Var;
            while (true) {
                obj = pi4Var.c;
                Continuation continuation = pi4Var.b;
                if (continuation == null) {
                    break;
                }
                if (g84Var.equals(obj)) {
                    try {
                        cy7 cy7Var2 = pi4Var.a;
                        uog.d(3, cy7Var2);
                        cy7 cy7Var3 = new cy7(cy7Var2.o, continuation);
                        cy7Var3.d = pi4Var;
                        Object objN = cy7Var3.n(qqg.a);
                        if (objN != g84Var) {
                            continuation.resumeWith(objN);
                        }
                    } catch (Throwable th) {
                        continuation.resumeWith(new ipd(th));
                    }
                } else {
                    pi4Var.c = g84Var;
                    continuation.resumeWith(obj);
                }
            }
            g8j.b(obj);
            kx7Var = (sw7) obj;
        } else {
            byte bW = gggVar.w((byte) 6);
            if (gggVar.X() == 4) {
                ggg.G(gggVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!gggVar.s()) {
                    break;
                }
                String strB = this.b ? gggVar.B() : gggVar.A();
                gggVar.w((byte) 5);
                linkedHashMap.put(strB, e());
                bW = gggVar.v();
                if (bW != 4) {
                    if (bW != 7) {
                        ggg.G(gggVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bW == 6) {
                gggVar.w((byte) 7);
            } else if (bW == 4) {
                koi.e(gggVar);
                throw null;
            }
            kx7Var = new kx7(linkedHashMap);
        }
        this.a--;
        return kx7Var;
    }

    public gw7 f() {
        ggg gggVar = (ggg) this.c;
        byte bV = gggVar.v();
        if (gggVar.X() == 4) {
            ggg.G(gggVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (gggVar.s()) {
            arrayList.add(e());
            bV = gggVar.v();
            if (bV != 4) {
                boolean z = bV == 9;
                int i = gggVar.b;
                if (!z) {
                    ggg.G(gggVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bV == 8) {
            gggVar.w((byte) 9);
        } else if (bV == 4) {
            koi.d(gggVar, "array");
            throw null;
        }
        return new gw7(arrayList);
    }

    public tx7 g(boolean z) {
        ggg gggVar = (ggg) this.c;
        String strB = (this.b || !z) ? gggVar.B() : gggVar.A();
        return (z || !fni.a(strB, "null")) ? new dx7(strB, z) : hx7.INSTANCE;
    }

    public void h(Object obj) {
        obj.getClass();
        i(this.a + 1);
        Object[] objArr = (Object[]) this.c;
        int i = this.a;
        this.a = i + 1;
        objArr[i] = obj;
    }

    public void i(int i) {
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        if (length >= i) {
            if (this.b) {
                this.c = (Object[]) objArr.clone();
                this.b = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.c = Arrays.copyOf(objArr, i2);
        this.b = false;
    }

    public cji j() {
        this.b = true;
        Object[] objArr = (Object[]) this.c;
        int i = this.a;
        vhi vhiVar = zhi.b;
        return i == 0 ? cji.o : new cji(i, objArr);
    }
}

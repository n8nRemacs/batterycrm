package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class a9 implements fj5 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public a9(aa aaVar, zid zidVar, mbd mbdVar) {
        this.e = aaVar;
        this.f = zidVar;
        hd5 hd5Var = hd5.a;
        this.b = hd5Var;
        this.d = hd5Var;
        this.c = new ArrayList();
        this.b = new un5(this, 1, aaVar.a).a();
        this.a = 0;
    }

    public void A(z8 z8Var) {
        y6i y6iVar = (y6i) this.e;
        ((ArrayList) this.d).add(z8Var);
        int i = z8Var.a;
        if (i == 1) {
            y6iVar.w(z8Var.b, z8Var.d);
            return;
        }
        if (i == 2) {
            int i2 = z8Var.b;
            int i3 = z8Var.d;
            RecyclerView recyclerView = (RecyclerView) y6iVar.b;
            recyclerView.d0(i2, i3, false);
            recyclerView.u1 = true;
            return;
        }
        if (i == 4) {
            y6iVar.u(z8Var.b, z8Var.d, z8Var.c);
        } else if (i == 8) {
            y6iVar.x(z8Var.b, z8Var.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + z8Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B() {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9.B():void");
    }

    public void C(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z8 z8Var = (z8) arrayList.get(i);
            z8Var.c = null;
            ((d6c) this.b).b(z8Var);
        }
        arrayList.clear();
    }

    public void D(Runnable runnable) {
        wwf wwfVar = (wwf) this.b;
        if (wwfVar.a.getLooper().getThread().isAlive()) {
            wwfVar.d(runnable);
        }
    }

    public void E(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((i21) this.d) == null) {
                this.d = new i21(3);
            }
            i21 i21Var = (i21) this.d;
            i21Var.d = colorStateList;
            i21Var.c = true;
        } else {
            this.d = null;
        }
        j();
    }

    public void F(int i) {
        hsi.g(i >= 0);
        this.a = i;
        q(i);
    }

    public void G(ColorStateList colorStateList) {
        if (((i21) this.e) == null) {
            this.e = new i21(3);
        }
        i21 i21Var = (i21) this.e;
        i21Var.d = colorStateList;
        i21Var.c = true;
        j();
    }

    public void H(PorterDuff.Mode mode) {
        if (((i21) this.e) == null) {
            this.e = new i21(3);
        }
        i21 i21Var = (i21) this.e;
        i21Var.e = mode;
        i21Var.b = true;
        j();
    }

    public int I(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z8 z8Var = (z8) arrayList.get(size);
            int i5 = z8Var.a;
            if (i5 == 8) {
                int i6 = z8Var.b;
                int i7 = z8Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            z8Var.b = i6 + 1;
                            z8Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            z8Var.b = i6 - 1;
                            z8Var.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        z8Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        z8Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        z8Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        z8Var.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = z8Var.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= z8Var.d;
                    } else if (i5 == 2) {
                        i += z8Var.d;
                    }
                } else if (i2 == 1) {
                    z8Var.b = i8 + 1;
                } else if (i2 == 2) {
                    z8Var.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            z8 z8Var2 = (z8) arrayList.get(size2);
            if (z8Var2.a == 8) {
                int i9 = z8Var2.d;
                if (i9 == z8Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    z8Var2.c = null;
                    ((d6c) this.b).b(z8Var2);
                }
            } else if (z8Var2.d <= 0) {
                arrayList.remove(size2);
                z8Var2.c = null;
                ((d6c) this.b).b(z8Var2);
            }
        }
        return i;
    }

    public void J(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        em5 em5Var = ((ql5) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        em5Var.A1();
        em5Var.m1(1, 10, num);
        em5Var.m1(2, 10, num);
        em5Var.x0.f(21, new cj4(iIntValue, 2));
    }

    public void K(j17 j17Var, String str) {
        vv0 vv0Var = (vv0) this.f;
        if (this.a != 0) {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        vv0Var.I(str).I("\r\n");
        int size = j17Var.size();
        for (int i = 0; i < size; i++) {
            vv0Var.I(j17Var.b(i)).I(": ").I(j17Var.d(i)).I("\r\n");
        }
        vv0Var.I("\r\n");
        this.a = 1;
    }

    @Override // defpackage.fj5
    public x6f a(ood oodVar) {
        if (!v97.a(oodVar)) {
            return w(0L);
        }
        String strA = oodVar.X.a(HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
            ga7 ga7Var = oodVar.a.b;
            if (this.a == 4) {
                this.a = 5;
                return new a87(this, ga7Var);
            }
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        long j = yxg.j(oodVar);
        if (j != -1) {
            return w(j);
        }
        if (this.a == 4) {
            this.a = 5;
            ((qbd) this.d).k();
            return new c87(this);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    @Override // defpackage.fj5
    public void b() {
        ((vv0) this.f).flush();
    }

    @Override // defpackage.fj5
    public b4f c(zmd zmdVar, long j) {
        vfi vfiVar = zmdVar.e;
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(zmdVar.d.a(HTTP.TRANSFER_ENCODING))) {
            if (this.a == 1) {
                this.a = 2;
                return new z77(this);
            }
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.a == 1) {
            this.a = 2;
            return new ls4(this);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    @Override // defpackage.fj5
    public void cancel() throws IOException {
        Socket socket = ((qbd) this.d).b;
        if (socket != null) {
            yxg.d(socket);
        }
    }

    @Override // defpackage.fj5
    public long d(ood oodVar) {
        if (!v97.a(oodVar)) {
            return 0L;
        }
        String strA = oodVar.X.a(HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
            return -1L;
        }
        return yxg.j(oodVar);
    }

    @Override // defpackage.fj5
    public nod e(boolean z) throws IOException {
        v32 v32Var = (v32) this.b;
        int i = this.a;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        try {
            String strJ = ((wv0) v32Var.c).j(v32Var.b);
            v32Var.b -= strJ.length();
            lk6 lk6VarB = kcj.b(strJ);
            int i2 = lk6VarB.b;
            nod nodVar = new nod();
            nodVar.b = (epc) lk6VarB.c;
            nodVar.c = i2;
            nodVar.d = (String) lk6VarB.d;
            nodVar.f = v32Var.c0().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.a = 3;
                return nodVar;
            }
            this.a = 4;
            return nodVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((qbd) this.d).q.a.a.h()), e);
        }
    }

    @Override // defpackage.fj5
    public qbd f() {
        return (qbd) this.d;
    }

    @Override // defpackage.fj5
    public void g(zmd zmdVar) {
        Proxy.Type type = ((qbd) this.d).q.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(zmdVar.c);
        sb.append(' ');
        ga7 ga7Var = zmdVar.b;
        if (ga7Var.a || type != Proxy.Type.HTTP) {
            String strB = ga7Var.b();
            String strD = ga7Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(ga7Var);
        }
        sb.append(" HTTP/1.1");
        K(zmdVar.d, sb.toString());
    }

    @Override // defpackage.fj5
    public void h() {
        ((vv0) this.f).flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(long r9, defpackage.umb r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r8.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            wld r2 = (defpackage.wld) r2
            java.lang.String r4 = defpackage.zxg.a
            long r4 = r2.b
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.lang.Object r2 = r8.c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            umb r2 = new umb
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            umb r2 = (defpackage.umb) r2
        L3d:
            int r4 = r11.a()
            r2.G(r4)
            byte[] r4 = r11.a
            int r11 = r11.b
            byte[] r5 = r2.a
            int r6 = r2.a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f
            wld r11 = (defpackage.wld) r11
            if (r11 == 0) goto L64
            long r4 = r11.b
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L64
            java.util.ArrayList r9 = r11.a
            r9.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            wld r11 = new wld
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            wld r11 = (defpackage.wld) r11
        L76:
            java.util.ArrayList r0 = r11.a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            r7 = 1
        L82:
            defpackage.hsi.b(r7)
            boolean r4 = r0.isEmpty()
            defpackage.hsi.g(r4)
            r11.b = r9
            r0.add(r2)
            r1.add(r11)
            r8.f = r11
            int r9 = r8.a
            if (r9 == r3) goto L9d
            r8.q(r9)
        L9d:
            return
        L9e:
            java.lang.Object r0 = r8.b
            xld r0 = (defpackage.xld) r0
            r0.e(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9.i(long, umb):void");
    }

    public void j() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((i21) this.d) != null) {
                if (((i21) this.f) == null) {
                    this.f = new i21(3);
                }
                i21 i21Var = (i21) this.f;
                i21Var.d = null;
                i21Var.c = false;
                i21Var.e = null;
                i21Var.b = false;
                WeakHashMap weakHashMap = hfh.a;
                ColorStateList colorStateListG = veh.g(view);
                if (colorStateListG != null) {
                    i21Var.c = true;
                    i21Var.d = colorStateListG;
                }
                PorterDuff.Mode modeH = veh.h(view);
                if (modeH != null) {
                    i21Var.b = true;
                    i21Var.e = modeH;
                }
                if (i21Var.c || i21Var.b) {
                    ko.e(background, i21Var, view.getDrawableState());
                    return;
                }
            }
            i21 i21Var2 = (i21) this.e;
            if (i21Var2 != null) {
                ko.e(background, i21Var2, view.getDrawableState());
                return;
            }
            i21 i21Var3 = (i21) this.d;
            if (i21Var3 != null) {
                ko.e(background, i21Var3, view.getDrawableState());
            }
        }
    }

    public boolean k(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            z8 z8Var = (z8) arrayList.get(i2);
            int i3 = z8Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = z8Var.b;
                    int i5 = z8Var.d + i4;
                    while (i4 < i5) {
                        if (p(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (p(z8Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y6i) this.e).l((z8) arrayList.get(i));
        }
        C(arrayList);
        this.a = 0;
    }

    public void m() {
        y6i y6iVar = (y6i) this.e;
        l();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z8 z8Var = (z8) arrayList.get(i);
            int i2 = z8Var.a;
            if (i2 == 1) {
                y6iVar.l(z8Var);
                y6iVar.w(z8Var.b, z8Var.d);
            } else if (i2 == 2) {
                y6iVar.l(z8Var);
                int i3 = z8Var.b;
                int i4 = z8Var.d;
                RecyclerView recyclerView = (RecyclerView) y6iVar.b;
                recyclerView.d0(i3, i4, true);
                recyclerView.u1 = true;
                recyclerView.r1.d += i4;
            } else if (i2 == 4) {
                y6iVar.l(z8Var);
                y6iVar.u(z8Var.b, z8Var.d, z8Var.c);
            } else if (i2 == 8) {
                y6iVar.l(z8Var);
                y6iVar.x(z8Var.b, z8Var.d);
            }
        }
        C(arrayList);
        this.a = 0;
    }

    public void n(z8 z8Var) {
        int i;
        int i2 = z8Var.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int I = I(z8Var.b, i2);
        int i3 = z8Var.b;
        int i4 = z8Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + z8Var);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < z8Var.d; i6++) {
            int I2 = I((i * i6) + z8Var.b, z8Var.a);
            int i7 = z8Var.a;
            if (i7 == 2 ? I2 != I : !(i7 == 4 && I2 == I + 1)) {
                z8 z8VarX = x(z8Var.c, i7, I, i5);
                o(z8VarX, i3);
                z8VarX.c = null;
                ((d6c) this.b).b(z8VarX);
                if (z8Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                I = I2;
            } else {
                i5++;
            }
        }
        Object obj = z8Var.c;
        z8Var.c = null;
        ((d6c) this.b).b(z8Var);
        if (i5 > 0) {
            z8 z8VarX2 = x(obj, z8Var.a, I, i5);
            o(z8VarX2, i3);
            z8VarX2.c = null;
            ((d6c) this.b).b(z8VarX2);
        }
    }

    public void o(z8 z8Var, int i) {
        y6i y6iVar = (y6i) this.e;
        y6iVar.l(z8Var);
        int i2 = z8Var.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            y6iVar.u(i, z8Var.d, z8Var.c);
        } else {
            int i3 = z8Var.d;
            RecyclerView recyclerView = (RecyclerView) y6iVar.b;
            recyclerView.d0(i, i3, true);
            recyclerView.u1 = true;
            recyclerView.r1.d += i3;
        }
    }

    public int p(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            z8 z8Var = (z8) arrayList.get(i2);
            int i3 = z8Var.a;
            if (i3 == 8) {
                int i4 = z8Var.b;
                if (i4 == i) {
                    i = z8Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (z8Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = z8Var.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = z8Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += z8Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public void q(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            wld wldVar = (wld) priorityQueue.poll();
            String str = zxg.a;
            int i2 = 0;
            while (true) {
                arrayList = wldVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((xld) this.b).e(wldVar.b, (umb) arrayList.get(i2));
                ((ArrayDeque) this.c).push((umb) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            wld wldVar2 = (wld) this.f;
            if (wldVar2 != null && wldVar2.b == wldVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(wldVar);
        }
    }

    public ColorStateList r() {
        i21 i21Var = (i21) this.e;
        if (i21Var != null) {
            return (ColorStateList) i21Var.d;
        }
        return null;
    }

    public PorterDuff.Mode s() {
        i21 i21Var = (i21) this.e;
        if (i21Var != null) {
            return (PorterDuff.Mode) i21Var.e;
        }
        return null;
    }

    public boolean t() {
        return this.a < ((List) this.b).size() || !((ArrayList) this.c).isEmpty();
    }

    public boolean u() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void v(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.b;
        jdc jdcVarX = jdc.x(view.getContext(), attributeSet, o6d.ViewBackgroundHelper, i);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        View view2 = (View) this.b;
        hfh.m(view2, view2.getContext(), o6d.ViewBackgroundHelper, attributeSet, (TypedArray) jdcVarX.c, i, 0);
        try {
            if (typedArray.hasValue(o6d.ViewBackgroundHelper_android_background)) {
                this.a = typedArray.getResourceId(o6d.ViewBackgroundHelper_android_background, -1);
                ko koVar = (ko) this.c;
                Context context = view.getContext();
                int i2 = this.a;
                synchronized (koVar) {
                    colorStateListF = koVar.a.f(context, i2);
                }
                if (colorStateListF != null) {
                    E(colorStateListF);
                }
            }
            if (typedArray.hasValue(o6d.ViewBackgroundHelper_backgroundTint)) {
                veh.q(view, jdcVarX.s(o6d.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(o6d.ViewBackgroundHelper_backgroundTintMode)) {
                veh.r(view, d45.c(typedArray.getInt(o6d.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            jdcVarX.B();
        } catch (Throwable th) {
            jdcVarX.B();
            throw th;
        }
    }

    public b87 w(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new b87(this, j);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public z8 x(Object obj, int i, int i2, int i3) {
        z8 z8Var = (z8) ((d6c) this.b).a();
        if (z8Var != null) {
            z8Var.a = i;
            z8Var.b = i2;
            z8Var.d = i3;
            z8Var.c = obj;
            return z8Var;
        }
        z8 z8Var2 = new z8();
        z8Var2.a = i;
        z8Var2.b = i2;
        z8Var2.d = i3;
        z8Var2.c = obj;
        return z8Var2;
    }

    public void y() {
        this.a = -1;
        E(null);
        j();
    }

    public void z(int i) {
        ColorStateList colorStateListF;
        this.a = i;
        ko koVar = (ko) this.c;
        if (koVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (koVar) {
                colorStateListF = koVar.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        E(colorStateListF);
        j();
    }

    public a9(View view) {
        this.a = -1;
        this.b = view;
        this.c = ko.a();
    }

    public a9(sua suaVar, qbd qbdVar, jbd jbdVar, ibd ibdVar) {
        this.c = suaVar;
        this.d = qbdVar;
        this.e = jbdVar;
        this.f = ibdVar;
        this.b = new v32(jbdVar);
    }

    public a9(xld xldVar) {
        this.b = xldVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public a9(y6i y6iVar) {
        this.b = new d6c(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = y6iVar;
        this.f = new ukd(27, this);
    }

    public a9(Object obj, Looper looper, Looper looper2, mwf mwfVar, ql5 ql5Var) {
        this.b = mwfVar.a(looper, null);
        this.c = mwfVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = ql5Var;
    }
}

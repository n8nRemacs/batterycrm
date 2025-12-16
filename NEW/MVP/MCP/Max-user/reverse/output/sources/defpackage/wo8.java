package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class wo8 implements nbc, ecj {
    public Object X;
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public static ViewPager2 f(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.q44 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.qbc
            if (r0 == 0) goto L13
            r0 = r7
            qbc r0 = (defpackage.qbc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qbc r0 = new qbc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            wo8 r1 = r0.o
            wo8 r0 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L58
        L2a:
            r7 = move-exception
            goto L85
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.c     // Catch: java.lang.Throwable -> L83
            k18 r7 = (defpackage.k18) r7     // Catch: java.lang.Throwable -> L83
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L83
            w63 r7 = (defpackage.w63) r7     // Catch: java.lang.Throwable -> L83
            long r4 = r6.a     // Catch: java.lang.Throwable -> L83
            hbd r7 = r7.j(r4)     // Catch: java.lang.Throwable -> L83
            r0.d = r6     // Catch: java.lang.Throwable -> L83
            r0.o = r6     // Catch: java.lang.Throwable -> L83
            r0.Z = r2     // Catch: java.lang.Throwable -> L83
            java.lang.Object r7 = defpackage.gw0.p(r7, r0)     // Catch: java.lang.Throwable -> L83
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L56
            return r0
        L56:
            r0 = r6
            r1 = r0
        L58:
            pb2 r7 = (defpackage.pb2) r7     // Catch: java.lang.Throwable -> L2a
            if (r7 != 0) goto L5e
            r2 = r3
            goto L8a
        L5e:
            lbc r2 = new lbc     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r7.s()     // Catch: java.lang.Throwable -> L2a
            r5g r5 = new r5g     // Catch: java.lang.Throwable -> L2a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            r1.X = r2     // Catch: java.lang.Throwable -> L2a
            qk r1 = new qk     // Catch: java.lang.Throwable -> L2a
            r2 = 16
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L2a
            o98 r1 = defpackage.zui.a(r1)     // Catch: java.lang.Throwable -> L2a
            cbc r2 = new cbc     // Catch: java.lang.Throwable -> L2a
            long r4 = r7.h()     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2a
            goto L8a
        L83:
            r7 = move-exception
            r0 = r6
        L85:
            ipd r2 = new ipd
            r2.<init>(r7)
        L8a:
            java.lang.Object r7 = r0.d
            tcf r7 = (defpackage.tcf) r7
            boolean r0 = r2 instanceof defpackage.ipd
            if (r0 == 0) goto L93
            r2 = r3
        L93:
            if (r2 == 0) goto L9a
            java.util.List r0 = java.util.Collections.singletonList(r2)
            goto L9c
        L9a:
            hd5 r0 = defpackage.hd5.a
        L9c:
            r7.m(r3, r0)
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo8.a(q44):java.lang.Object");
    }

    @Override // defpackage.nbc
    public List b(boolean z) {
        return ve3.j(fbc.d, fbc.o);
    }

    @Override // defpackage.nbc
    public hbd c() {
        return (hbd) this.o;
    }

    @Override // defpackage.ecj
    public lk6 d() {
        int iLimit;
        fyi fyiVar = (fyi) this.b;
        long j = this.a;
        u6j u6jVar = (u6j) this.c;
        c0 c0Var = (c0) this.d;
        c0 c0Var2 = (c0) this.o;
        nm7 nm7Var = (nm7) this.X;
        hk4 hk4Var = new hk4();
        b4 b4Var = new b4();
        b4Var.a = Long.valueOf(j & BuildConfig.MAX_TIME_TO_UPLOAD);
        b4Var.b = u6jVar;
        b4Var.c = Boolean.valueOf(fyi.u0);
        Boolean bool = Boolean.TRUE;
        b4Var.d = bool;
        b4Var.o = bool;
        hk4Var.a = new c6j(b4Var);
        hk4Var.b = zei.a(fyiVar.d);
        hk4Var.c = c0Var.j();
        hk4Var.d = c0Var2.j();
        int i = nm7Var.f;
        fyi.t0.getClass();
        int i2 = nm7Var.f;
        if (i2 == -1) {
            Bitmap bitmap = nm7Var.a;
            s5j.g(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else {
            if (i2 == 17 || i2 == 842094169) {
                s5j.g(null);
                throw null;
            }
            if (i2 != 35) {
                iLimit = 0;
            } else {
                Image.Plane[] planeArrA = nm7Var.a();
                s5j.g(planeArrA);
                iLimit = (planeArrA[0].getBuffer().limit() * 3) / 2;
            }
        }
        aqc aqcVar = new aqc(18);
        aqcVar.b = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? x5j.UNKNOWN_FORMAT : x5j.NV21 : x5j.NV16 : x5j.YV12 : x5j.YUV_420_888 : x5j.BITMAP;
        aqcVar.c = Integer.valueOf(Integer.MAX_VALUE & iLimit);
        hk4Var.o = new y5j(aqcVar);
        ra3 ra3Var = new ra3();
        ra3Var.c = fyiVar.s0 ? t6j.TYPE_THICK : t6j.TYPE_THIN;
        ra3Var.d = new h7j(hk4Var);
        return new lk6(ra3Var, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.nbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.fbc r5, defpackage.cbc r6, java.lang.String r7, boolean r8, defpackage.ts9 r9, defpackage.q44 r10) {
        /*
            r4 = this;
            java.lang.Object r6 = r4.b
            sxd r6 = (defpackage.sxd) r6
            boolean r8 = r10 instanceof defpackage.pbc
            if (r8 == 0) goto L17
            r8 = r10
            pbc r8 = (defpackage.pbc) r8
            int r0 = r8.Y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L17
            int r0 = r0 - r1
            r8.Y = r0
            goto L1c
        L17:
            pbc r8 = new pbc
            r8.<init>(r4, r10)
        L1c:
            java.lang.Object r10 = r8.o
            int r0 = r8.Y
            qqg r1 = defpackage.qqg.a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 == r3) goto L38
            if (r0 != r2) goto L30
            ts9 r9 = r8.d
            defpackage.g8j.b(r10)
            goto L56
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            defpackage.g8j.b(r10)
            return r1
        L3c:
            defpackage.g8j.b(r10)
            int r5 = r5.ordinal()
            r10 = 0
            g84 r0 = defpackage.g84.a
            if (r5 == 0) goto L6b
            if (r5 == r3) goto L4b
            goto L74
        L4b:
            r8.d = r9
            r8.Y = r2
            java.lang.Object r10 = defpackage.sxd.c(r6, r7, r10, r8)
            if (r10 != r0) goto L56
            goto L73
        L56:
            if (r10 == 0) goto L63
            android.net.Uri r10 = (android.net.Uri) r10
            ibc r5 = new ibc
            r5.<init>(r10)
            r9.invoke(r5)
            return r1
        L63:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        L6b:
            r8.Y = r3
            java.lang.Object r5 = defpackage.sxd.c(r6, r7, r10, r8)
            if (r5 != r0) goto L74
        L73:
            return r0
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo8.e(fbc, cbc, java.lang.String, boolean, ts9, q44):java.lang.Object");
    }

    public void g(boolean z) {
        int currentItem;
        a aVar;
        l29 l29Var = (l29) this.X;
        List list = l29Var.w0;
        ek8 ek8Var = l29Var.X;
        ti6 ti6Var = l29Var.o;
        if (ti6Var.P() || ((ViewPager2) this.o).getScrollState() != 0 || ek8Var.g() == 0 || list.size() == 0 || (currentItem = ((ViewPager2) this.o).getCurrentItem()) >= list.size()) {
            return;
        }
        long j = currentItem;
        if ((j != this.a || z) && (aVar = (a) ek8Var.b(j)) != null && aVar.F()) {
            this.a = j;
            ti6Var.getClass();
            ue0 ue0Var = new ue0(ti6Var);
            ArrayList arrayList = new ArrayList();
            a aVar2 = null;
            for (int i = 0; i < ek8Var.g(); i++) {
                long jD = ek8Var.d(i);
                a aVar3 = (a) ek8Var.h(i);
                if (aVar3.F()) {
                    if (jD != this.a) {
                        ue0Var.i(aVar3, l38.d);
                        bh0 bh0Var = l29Var.t0;
                        bh0Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = bh0Var.a.iterator();
                        if (it.hasNext()) {
                            throw ctd.h(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        aVar2 = aVar3;
                    }
                    aVar3.o0(jD == this.a);
                }
            }
            if (aVar2 != null) {
                ue0Var.i(aVar2, l38.o);
                bh0 bh0Var2 = l29Var.t0;
                bh0Var2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = bh0Var2.a.iterator();
                if (it2.hasNext()) {
                    throw ctd.h(it2);
                }
                arrayList.add(arrayList3);
            }
            if (ue0Var.a.isEmpty()) {
                return;
            }
            ue0Var.e();
            Collections.reverse(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                List list2 = (List) it3.next();
                l29Var.t0.getClass();
                bh0.a(list2);
            }
        }
    }

    @Override // defpackage.nbc
    public mbc getTitle() {
        return (lbc) this.X;
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ccb {
    public final WeakReference a;
    public cdb b;
    public final i40 c;
    public final int d;
    public final int e;

    public ccb(FrameLayout frameLayout) {
        WeakReference weakReference = new WeakReference(frameLayout);
        this.a = weakReference;
        this.b = cdb.Z;
        if (frameLayout != null) {
            this.c = new i40(weakReference);
        }
    }

    public final void a(s5g s5gVar) {
        ViewGroup viewGroup;
        Context context;
        cdb cdbVar = this.b;
        CharSequence charSequenceB = null;
        if (s5gVar != null && (viewGroup = (ViewGroup) this.a.get()) != null && (context = viewGroup.getContext()) != null) {
            charSequenceB = s5gVar.b(context);
        }
        this.b = cdb.a(cdbVar, null, null, charSequenceB, null, null, null, null, 123);
    }

    public final void b(CharSequence charSequence) {
        this.b = cdb.a(this.b, null, null, charSequence, null, null, null, null, 123);
    }

    public final void c(kcb kcbVar) {
        this.b = cdb.a(this.b, null, null, null, null, kcbVar, null, null, 111);
    }

    public final void d(dcb dcbVar) {
        i40 i40Var = this.c;
        if (i40Var != null) {
            i40Var.f = dcbVar;
        }
    }

    public final void e(ucb ucbVar) {
        cdb cdbVar = this.b;
        this.b = cdb.a(cdbVar, ucbVar, null, null, null, null, ucbVar instanceof tcb ? ncb.b : cdbVar.X, null, 94);
    }

    public final void f(adb adbVar) {
        this.b = cdb.a(this.b, null, null, null, adbVar, null, null, null, 119);
    }

    public final void g(s5g s5gVar) {
        Context context;
        cdb cdbVar = this.b;
        ViewGroup viewGroup = (ViewGroup) this.a.get();
        CharSequence charSequenceB = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : s5gVar.b(context);
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        this.b = cdb.a(cdbVar, null, charSequenceB, null, null, null, null, null, 125);
    }

    public final void h(CharSequence charSequence) {
        this.b = cdb.a(this.b, null, charSequence, null, null, null, null, null, 125);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bcb i() {
        /*
            r13 = this;
            java.lang.ref.WeakReference r0 = r13.a
            java.lang.Object r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto La
            goto Le
        La:
            i40 r0 = r13.c
            if (r0 != 0) goto Lf
        Le:
            return r1
        Lf:
            cdb r2 = r13.b
            kcb r3 = r2.o
            int r4 = r3.c
            int r5 = r13.d
            int r4 = r4 + r5
            int r5 = r3.b
            int r6 = r13.e
            int r5 = r5 + r6
            r11 = 0
            r12 = 1
            kcb r7 = defpackage.kcb.a(r3, r11, r5, r4, r12)
            r9 = 0
            r10 = 111(0x6f, float:1.56E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            cdb r2 = defpackage.cdb.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.d = r2
            android.os.Handler r3 = defpackage.icb.a
            java.lang.Object r3 = r0.h
            fcb r3 = (defpackage.fcb) r3
            ocb r2 = r2.X
            java.util.concurrent.atomic.AtomicBoolean r4 = defpackage.icb.d
            boolean r5 = r4.compareAndSet(r11, r12)
            if (r5 == 0) goto L95
            hcb r5 = defpackage.icb.b
            if (r5 == 0) goto L50
            java.lang.ref.WeakReference r5 = r5.b
            java.lang.Object r5 = r5.get()
            boolean r5 = defpackage.fni.a(r5, r3)
            goto L51
        L50:
            r5 = r11
        L51:
            if (r5 == 0) goto L65
            hcb r5 = defpackage.icb.b
            if (r5 == 0) goto L59
            ocb r1 = r5.a
        L59:
            lcb r5 = defpackage.lcb.b
            boolean r1 = defpackage.fni.a(r1, r5)
            if (r1 == 0) goto L65
            r4.set(r11)
            goto L95
        L65:
            hcb r1 = defpackage.icb.b
            if (r1 == 0) goto L74
            java.lang.ref.WeakReference r1 = r1.b
            java.lang.Object r1 = r1.get()
            boolean r1 = defpackage.fni.a(r1, r3)
            goto L75
        L74:
            r1 = r11
        L75:
            if (r1 == 0) goto L84
            android.os.Handler r1 = defpackage.icb.a
            hcb r2 = defpackage.icb.b
            r1.removeCallbacksAndMessages(r2)
            hcb r1 = defpackage.icb.b
            defpackage.icb.c(r1)
            goto L92
        L84:
            hcb r1 = new hcb
            r1.<init>(r3, r2)
            defpackage.icb.c = r1
            hcb r1 = defpackage.icb.b
            if (r1 != 0) goto L92
            defpackage.icb.d()
        L92:
            r4.set(r11)
        L95:
            bcb r1 = new bcb
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccb.i():bcb");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ccb(one.me.sdk.arch.Widget r9) {
        /*
            r8 = this;
            r0 = r9
        L1:
            c54 r1 = r0.getParentController()
            if (r1 == 0) goto Lc
            c54 r0 = r0.getParentController()
            goto L1
        Lc:
            android.view.View r0 = r0.getView()
            r1 = 0
            if (r0 == 0) goto L18
            android.view.ViewParent r0 = r0.getParent()
            goto L19
        L18:
            r0 = r1
        L19:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r0 = (android.view.View) r0
            goto L21
        L20:
            r0 = r1
        L21:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L28
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L29
        L28:
            r0 = r1
        L29:
            r8.<init>(r0)
            tcf r0 = defpackage.xz7.f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L44
            android.content.Context r0 = r9.getContext()
            int r0 = defpackage.xz7.a(r0)
            goto L45
        L44:
            r0 = r2
        L45:
            eo7 r3 = r9.getA()
            int r3 = r3.b
            if (r3 != 0) goto L4e
            r3 = r2
        L4e:
            r4 = -1
            if (r3 != 0) goto L53
            r3 = r4
            goto L5b
        L53:
            int[] r5 = defpackage.acb.$EnumSwitchMapping$0
            int r3 = defpackage.az1.v(r3)
            r3 = r5[r3]
        L5b:
            r5 = 1
            r6 = 2
            if (r3 == r5) goto L7a
            if (r3 == r6) goto L63
        L61:
            r3 = r2
            goto L84
        L63:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L61
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r7 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L74
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L75
        L74:
            r3 = r1
        L75:
            if (r3 == 0) goto L61
            int r3 = r3.topMargin
            goto L84
        L7a:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L61
            int r3 = r3.getPaddingTop()
        L84:
            r8.e = r3
            eo7 r3 = r9.getA()
            ms0 r3 = r3.d
            if (r3 == 0) goto L91
            int r3 = r3.a
            goto L92
        L91:
            r3 = r2
        L92:
            if (r3 != 0) goto L95
            goto L9d
        L95:
            int[] r4 = defpackage.acb.$EnumSwitchMapping$0
            int r3 = defpackage.az1.v(r3)
            r4 = r4[r3]
        L9d:
            if (r4 == r5) goto Lb9
            if (r4 == r6) goto La2
            goto Lc3
        La2:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto Lc3
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb3
            r1 = r9
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        Lb3:
            if (r1 == 0) goto Lb7
            int r2 = r1.bottomMargin
        Lb7:
            r0 = r2
            goto Lc3
        Lb9:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto Lc3
            int r0 = r9.getPaddingBottom()
        Lc3:
            r8.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccb.<init>(one.me.sdk.arch.Widget):void");
    }
}

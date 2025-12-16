package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class p2i extends a54 {
    public boolean a;
    public final /* synthetic */ Widget b;

    public p2i(Widget widget) {
        this.b = widget;
    }

    @Override // defpackage.a54
    public final void d(c54 c54Var) {
        Widget widget = this.b;
        View viewRequireView = widget.requireView();
        widget.onViewCreated(viewRequireView);
        zfi.b(viewRequireView, widget.getC(), new i2i(widget, 1));
    }

    @Override // defpackage.a54
    public final void j(c54 c54Var, View view) {
        boolean zA = l54.a(c54Var);
        Widget widget = this.b;
        if (!zA) {
            widget.onViewCreated(view);
            zfi.b(view, widget.getC(), new i2i(widget, 1));
        }
        view.addOnAttachStateChangeListener(new r40(widget, 20, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // defpackage.a54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.c54 r17) {
        /*
            r16 = this;
            r0 = r17
            boolean r1 = r0 instanceof one.me.sdk.arch.Widget
            if (r1 == 0) goto L9
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L6a
            e3i r0 = r0.getViewModelStore()
            if (r0 == 0) goto L6a
            c9a r1 = r0.a
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
        L1f:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L39:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            xfh r12 = (defpackage.xfh) r12
            kotlinx.coroutines.internal.ContextScope r13 = r12.a
            x74 r13 = r13.getCoroutineContext()
            defpackage.eoi.b(r13)
            r12.s()
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L39
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L1f
        L62:
            r1.a()
            c9a r0 = r0.b
            r0.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.k(c54):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    @Override // defpackage.a54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.c54 r17) {
        /*
            r16 = this;
            r0 = r16
            one.me.sdk.arch.Widget r1 = r0.b
            c9a r2 = r1.getCleanActions()
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5d
            r5 = 0
            r6 = r5
        L13:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L58
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2d:
            if (r11 >= r9) goto L56
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L52
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            ha3 r12 = (defpackage.ha3) r12
            rn0 r12 = (defpackage.rn0) r12
            sn0 r13 = r12.b
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference
            java.lang.Object r15 = r13.d
            r14.<init>(r15)
            r13.o = r14
            r14 = 0
            r13.d = r14
            r13 = 1
            r12.a = r13
        L52:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2d
        L56:
            if (r9 != r10) goto L5d
        L58:
            if (r6 == r4) goto L5d
            int r6 = r6 + 1
            goto L13
        L5d:
            boolean r2 = r0.a
            if (r2 == 0) goto L66
            r2 = r17
            one.me.sdk.arch.Widget.access$finalizeCleanActions(r1, r2)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.l(c54):void");
    }

    @Override // defpackage.a54
    public final void n(c54 c54Var, View view) {
        view.addOnAttachStateChangeListener(new rk(11, this.b));
    }
}

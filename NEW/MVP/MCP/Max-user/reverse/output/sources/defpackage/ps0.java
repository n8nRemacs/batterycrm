package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ps0 extends cqi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ps0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cqi
    public int c(View view, int i) {
        int iA;
        int i2;
        switch (this.a) {
            case 0:
                return view.getLeft();
            case 1:
            default:
                return super.c(view, i);
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                z18 z18Var = sideSheetBehavior.a;
                switch (z18Var.a) {
                    case 0:
                        iA = -z18Var.b.l;
                        break;
                    default:
                        iA = z18Var.a();
                        break;
                }
                z18 z18Var2 = sideSheetBehavior.a;
                switch (z18Var2.a) {
                    case 0:
                        i2 = z18Var2.b.o;
                        break;
                    default:
                        i2 = z18Var2.b.m;
                        break;
                }
                return dui.e(i, iA, i2);
            case 3:
                return n7j.c(i, -2147483647, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.cqi
    public int d(View view, int i) {
        switch (this.a) {
            case 0:
                return dui.e(i, ((BottomSheetBehavior) this.b).E(), h(view));
            case 1:
                d52 d52Var = (d52) this.b;
                return n7j.c(i, d52Var.t0, d52Var.s0);
            case 2:
                return view.getTop();
            default:
                return super.d(view, i);
        }
    }

    @Override // defpackage.cqi
    public int g(View view) {
        switch (this.a) {
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            case 3:
                return view.getWidth();
            default:
                return super.g(view);
        }
    }

    @Override // defpackage.cqi
    public int h(View view) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                int i = BottomSheetBehavior.f0;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.h(view);
        }
    }

    @Override // defpackage.cqi
    public void j(int i) {
        switch (this.a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.L(1);
                        break;
                    }
                }
                break;
            case 2:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.y(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.cqi
    public final void k(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.a) {
            case 0:
                ((BottomSheetBehavior) this.b).A(i2);
                return;
            case 1:
                d52 d52Var = (d52) this.b;
                d52Var.u0 = Integer.valueOf(i2);
                d52Var.j(i2);
                d52Var.i();
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    z18 z18Var = sideSheetBehavior.a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (z18Var.a) {
                        case 0:
                            if (left <= z18Var.b.m) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i3 = z18Var.b.m;
                            if (left <= i3) {
                                marginLayoutParams.rightMargin = i3 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                z18 z18Var2 = sideSheetBehavior.a;
                switch (z18Var2.a) {
                    case 0:
                        z18Var2.b();
                        z18Var2.a();
                        break;
                    default:
                        int i4 = z18Var2.b.m;
                        z18Var2.a();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw ctd.h(it);
                }
                return;
            default:
                gvf gvfVar = (gvf) this.b;
                if (i <= (-gvfVar.getWidth()) || i >= gvfVar.getWidth()) {
                    gvfVar.b = true;
                    fvf callback = gvfVar.getCallback();
                    if (callback != null) {
                        callback.j();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0047. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x009f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x00db. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    @Override // defpackage.cqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps0.l(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0072  */
    @Override // defpackage.cqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L46;
                case 1: goto L36;
                case 2: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r6 = r4.b
            gvf r6 = (defpackage.gvf) r6
            fvf r0 = r6.getCallback()
            if (r0 == 0) goto L14
            android.view.View r0 = r0.m()
            goto L15
        L14:
            r0 = 0
        L15:
            if (r5 != r0) goto L1d
            boolean r5 = r6.b
            if (r5 != 0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            return r5
        L1f:
            java.lang.Object r6 = r4.b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2a
            goto L35
        L2a:
            java.lang.ref.WeakReference r6 = r6.p
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L35
            r1 = r2
        L35:
            return r1
        L36:
            java.lang.Object r6 = r4.b
            d52 r6 = (defpackage.d52) r6
            boolean r0 = r6.C0
            if (r0 == 0) goto L44
            android.widget.FrameLayout r6 = r6.I0
            if (r5 != r6) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            return r5
        L46:
            java.lang.Object r0 = r4.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.L
            r2 = 1
            if (r1 != r2) goto L50
            goto L80
        L50:
            boolean r3 = r0.b0
            if (r3 == 0) goto L55
            goto L80
        L55:
            r3 = 3
            if (r1 != r3) goto L72
            int r1 = r0.Z
            if (r1 != r6) goto L72
            java.lang.ref.WeakReference r6 = r0.V
            if (r6 == 0) goto L67
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L68
        L67:
            r6 = 0
        L68:
            if (r6 == 0) goto L72
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L72
            goto L80
        L72:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.U
            if (r6 == 0) goto L80
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L80
            goto L81
        L80:
            r2 = 0
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps0.n(android.view.View, int):boolean");
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class vza extends ViewGroup {
    public static final /* synthetic */ yy7[] z0 = {new z8a(vza.class, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), u45.h(vid.a, vza.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;"), new z8a(vza.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    public tza a;
    public final uza b;
    public final uza c;
    public final uza d;
    public final w8a o;
    public final w8a s0;
    public final w8a t0;
    public final Rect u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;

    public vza(Context context) {
        super(context);
        this.b = new uza(this, 0);
        this.c = new uza(this, 1);
        this.d = new uza(this, 2);
        this.o = new w8a(4);
        this.s0 = new w8a(4);
        this.t0 = new w8a();
        this.u0 = new Rect();
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
    }

    public static rza a(vza vzaVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = vzaVar.getChildCount();
        }
        boolean z = (i2 & 2) == 0;
        rza rzaVar = (rza) vzaVar.getChildAt(i);
        if (rzaVar == null) {
            rzaVar = new rza(vzaVar.getContext());
            if (z) {
                vzaVar.addViewInLayout(rzaVar, vzaVar.getChildCount(), new ViewGroup.LayoutParams(-2, -2));
            } else {
                vzaVar.addView(rzaVar);
            }
        }
        rzaVar.setId(o0d.oneme_buttonstack_more_btn);
        rzaVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        rzaVar.setMode(vzaVar.getMode());
        rzaVar.setAppearance(vzaVar.getAppearance());
        rzaVar.setCustomTheme(vzaVar.getCustomTheme());
        rzaVar.setText(b5d.oneme_button_stack_more);
        rzaVar.setIcon(yud.n1);
        f8j.d(rzaVar, 300L, new ye6(22, vzaVar));
        return rzaVar;
    }

    public static final f1f c(sza szaVar) {
        int i = szaVar.a;
        Integer num = szaVar.b;
        return new f1f(i, num != null ? new n5g(num.intValue()) : s5g.b, szaVar.c, szaVar.d, szaVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d2 -> B:34:0x00c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d4 -> B:34:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r9, java.util.List r10, boolean r11) {
        /*
            r8 = this;
            w8a r0 = r8.o
            r0.d()
            w8a r1 = r8.t0
            r1.d()
            r2 = 0
            r3 = r2
        Lc:
            r4 = 4
            if (r3 >= r4) goto L7c
            java.lang.Object r5 = defpackage.ue3.J(r3, r9)
            sza r5 = (defpackage.sza) r5
            if (r5 == 0) goto L7c
            android.view.View r4 = r8.getChildAt(r3)
            rza r4 = (defpackage.rza) r4
            if (r4 != 0) goto L2b
            rza r4 = new rza
            android.content.Context r6 = r8.getContext()
            r4.<init>(r6)
            r8.addView(r4)
        L2b:
            int r6 = r5.a
            r4.setId(r6)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r4.setLayoutParams(r6)
            r4.setVisibility(r2)
            boolean r6 = r5.f
            r4.setEnabled(r6)
            oza r6 = r8.getMode()
            r4.setMode(r6)
            nza r6 = r8.getAppearance()
            r4.setAppearance(r6)
            yeb r6 = r8.getCustomTheme()
            r4.setCustomTheme(r6)
            java.lang.Integer r6 = r5.b
            if (r6 == 0) goto L61
            int r6 = r6.intValue()
            r4.setText(r6)
        L61:
            java.lang.Integer r6 = r5.d
            if (r6 == 0) goto L6c
            int r6 = r6.intValue()
            r4.setIcon(r6)
        L6c:
            kg6 r6 = new kg6
            r7 = 22
            r6.<init>(r8, r7, r5)
            defpackage.f8j.e(r4, r6)
            r0.b(r5)
            int r3 = r3 + 1
            goto Lc
        L7c:
            if (r3 != r4) goto L86
            int r0 = r9.size()
            if (r0 <= r4) goto L86
            r0 = 1
            goto L87
        L86:
            r0 = r2
        L87:
            boolean r4 = r10.isEmpty()
            if (r0 != 0) goto L8f
            if (r4 != 0) goto Lc5
        L8f:
            boolean r0 = r8.y0
            if (r0 != 0) goto Lc5
            int r0 = r9.size()
            r4 = r3
        L98:
            if (r4 >= r0) goto La4
            java.lang.Object r5 = r9.get(r4)
            r1.b(r5)
            int r4 = r4 + 1
            goto L98
        La4:
            int r9 = r10.size()
            r0 = r2
        La9:
            if (r0 >= r9) goto Lb5
            java.lang.Object r4 = r10.get(r0)
            r1.b(r4)
            int r0 = r0 + 1
            goto La9
        Lb5:
            r9 = 2
            rza r9 = a(r8, r3, r9)
            r9.setVisibility(r2)
            r9.setEnabled(r11)
            r8.v0 = r3
        Lc2:
            int r3 = r3 + 1
            goto Lc8
        Lc5:
            r9 = -1
            r8.v0 = r9
        Lc8:
            int r9 = r8.getChildCount()
            if (r3 >= r9) goto Lda
            android.view.View r9 = r8.getChildAt(r3)
            if (r9 == 0) goto Lc2
            r10 = 8
            r9.setVisibility(r10)
            goto Lc2
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vza.b(java.util.List, java.util.List, boolean):void");
    }

    public final nza getAppearance() {
        yy7 yy7Var = z0[1];
        return (nza) this.c.b;
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = z0[2];
        return (yeb) this.d.b;
    }

    public final tza getListener() {
        return this.a;
    }

    public final oza getMode() {
        yy7 yy7Var = z0[0];
        return (oza) this.b.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int iJ = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.w0;
            if (i5 > this.x0 || i6 > i5) {
                cri.c(childAt, iJ, 0, 0, 12);
                iJ = utb.j(8, vw4.d().getDisplayMetrics().density, childAt.getMeasuredWidth(), iJ);
            } else {
                cri.b(childAt, 0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i3 = 0;
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            int childCount = getChildCount();
            int measuredWidth = 0;
            int iMax = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                childAt.measure(i, i2);
                measuredWidth += childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                i3++;
            }
            setMeasuredDimension((kti.d(8 * vw4.d().getDisplayMetrics().density) * (getChildCount() - 1)) + measuredWidth, iMax);
            return;
        }
        int childCount2 = getChildCount() - 1;
        while (true) {
            if (-1 >= childCount2) {
                childCount2 = -1;
                break;
            }
            View childAt2 = getChildAt(childCount2);
            if (childAt2 != null && childAt2.getVisibility() == 0) {
                break;
            } else {
                childCount2--;
            }
        }
        if (childCount2 == -1) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.w0 = -1;
        this.x0 = -1;
        w8a w8aVar = this.s0;
        w8aVar.d();
        int i4 = childCount2 + 1;
        float f = 8;
        int iD = (size - (kti.d(vw4.d().getDisplayMetrics().density * f) * childCount2)) / i4;
        if (!this.y0) {
            while (iD < kti.d(67 * vw4.d().getDisplayMetrics().density)) {
                int i5 = this.v0;
                boolean z = i5 == -1;
                if (i5 == -1) {
                    this.v0 = getChildCount();
                    a(this, 0, 1);
                }
                int i6 = this.x0;
                if (i6 == -1) {
                    int i7 = this.v0;
                    this.w0 = i7 - (z ? 2 : 1);
                    this.x0 = i7 - (z ? 2 : 1);
                } else {
                    this.w0 = i6 - (z ? 2 : 1);
                }
                w8aVar.a(0, this.o.f(this.w0));
                int i8 = i4 - 1;
                int iD2 = (size - (kti.d(vw4.d().getDisplayMetrics().density * f) * (i4 - 2))) / i8;
                i4 = i8;
                iD = iD2;
            }
        }
        int childCount3 = getChildCount();
        int iMax2 = 0;
        while (i3 < childCount3) {
            int i9 = this.w0;
            if (i3 > this.x0 || i9 > i3) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iD, 1073741824);
                View childAt3 = getChildAt(i3);
                childAt3.measure(iMakeMeasureSpec, i2);
                iMax2 = Math.max(iMax2, childAt3.getMeasuredHeight());
            }
            i3++;
        }
        setMeasuredDimension(size, Math.max(mode, iMax2));
    }

    public final void setAppearance(nza nzaVar) {
        this.c.O(this, z0[1], nzaVar);
    }

    public final void setCustomTheme(yeb yebVar) {
        this.d.O(this, z0[2], yebVar);
    }

    public final void setListener(tza tzaVar) {
        this.a = tzaVar;
    }

    public final void setMode(oza ozaVar) {
        this.b.O(this, z0[0], ozaVar);
    }
}

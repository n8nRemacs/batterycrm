package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.a34;
import defpackage.dhh;
import defpackage.e7;
import defpackage.fcg;
import defpackage.h7;
import defpackage.ho;
import defpackage.mc5;
import defpackage.vf9;
import defpackage.wh4;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue o;
    public TypedValue s0;
    public final Rect t0;
    public a34 u0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        return this.o;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.s0 == null) {
            this.s0 = new TypedValue();
        }
        return this.s0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a34 a34Var = this.u0;
        if (a34Var != null) {
            a34Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h7 h7Var;
        super.onDetachedFromWindow();
        a34 a34Var = this.u0;
        if (a34Var != null) {
            ho hoVar = (ho) ((mc5) a34Var).b;
            wh4 wh4Var = hoVar.B0;
            if (wh4Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) wh4Var;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((fcg) actionBarOverlayLayout.o).a.a;
                if (actionMenuView != null && (h7Var = actionMenuView.o) != null) {
                    h7Var.g();
                    e7 e7Var = h7Var.D0;
                    if (e7Var != null && e7Var.b()) {
                        e7Var.i.dismiss();
                    }
                }
            }
            if (hoVar.G0 != null) {
                hoVar.v0.getDecorView().removeCallbacks(hoVar.H0);
                if (hoVar.G0.isShowing()) {
                    try {
                        hoVar.G0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                hoVar.G0 = null;
            }
            dhh dhhVar = hoVar.I0;
            if (dhhVar != null) {
                dhhVar.b();
            }
            vf9 vf9Var = hoVar.z(0).h;
            if (vf9Var != null) {
                vf9Var.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a34 a34Var) {
        this.u0 = a34Var;
    }
}

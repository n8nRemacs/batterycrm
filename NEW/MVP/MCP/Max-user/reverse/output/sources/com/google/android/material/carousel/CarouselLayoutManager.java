package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.did;
import defpackage.dwc;
import defpackage.hid;
import defpackage.ho7;
import defpackage.iid;
import defpackage.j81;
import defpackage.oy;
import defpackage.q75;
import defpackage.s52;
import defpackage.t52;
import defpackage.u52;
import defpackage.xhd;
import defpackage.z5d;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends a implements hid {
    public final q75 p;
    public oy q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        q75 q75Var = new q75();
        new t52();
        this.r = new j81(1, this);
        this.p = q75Var;
        x0();
        O0(0);
    }

    @Override // androidx.recyclerview.widget.a
    public final int A0(int i, did didVar, iid iidVar) {
        if (!g() || x() == 0 || i == 0) {
            return 0;
        }
        U(didVar.d(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void B(Rect rect, View view) {
        RecyclerView.V(rect, view);
        rect.centerY();
        if (M0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        s52 s52Var = new s52(this, recyclerView.getContext());
        s52Var.a = i;
        K0(s52Var);
    }

    public final boolean M0() {
        return this.q.b == 0;
    }

    public final boolean N0() {
        return M0() && I() == 1;
    }

    public final void O0(int i) {
        u52 u52Var;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ho7.f(i, "invalid orientation:"));
        }
        d(null);
        oy oyVar = this.q;
        if (oyVar == null || i != oyVar.b) {
            if (i == 0) {
                u52Var = new u52(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                u52Var = new u52(this, 0);
            }
            this.q = u52Var;
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean R() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void U(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        q75 q75Var = this.p;
        float dimension = q75Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(dwc.m3_carousel_small_item_size_min);
        }
        q75Var.a = dimension;
        float dimension2 = q75Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(dwc.m3_carousel_small_item_size_max);
        }
        q75Var.b = dimension2;
        x0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.hid
    public final PointF a(int i) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a0(android.view.View r4, int r5, defpackage.did r6, defpackage.iid r7) {
        /*
            r3 = this;
            int r6 = r3.x()
            if (r6 != 0) goto L8
            goto L8a
        L8:
            oy r6 = r3.q
            int r6 = r6.b
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L3a
            r2 = 2
            if (r5 == r2) goto L30
            r2 = 17
            if (r5 == r2) goto L3f
            r2 = 33
            if (r5 == r2) goto L3c
            r2 = 66
            if (r5 == r2) goto L32
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L2e
            java.lang.String r6 = "CarouselLayoutManager"
            java.lang.String r2 = "Unknown focus request:"
            defpackage.u45.o(r5, r2, r6)
        L2c:
            r5 = r7
            goto L48
        L2e:
            if (r6 != r1) goto L2c
        L30:
            r5 = r1
            goto L48
        L32:
            if (r6 != 0) goto L2c
            boolean r5 = r3.N0()
            if (r5 == 0) goto L30
        L3a:
            r5 = r0
            goto L48
        L3c:
            if (r6 != r1) goto L2c
            goto L3a
        L3f:
            if (r6 != 0) goto L2c
            boolean r5 = r3.N0()
            if (r5 == 0) goto L3a
            goto L30
        L48:
            if (r5 != r7) goto L4b
            goto L8a
        L4b:
            r6 = 0
            if (r5 != r0) goto L7f
            int r4 = androidx.recyclerview.widget.a.N(r4)
            if (r4 != 0) goto L55
            goto L8a
        L55:
            android.view.View r4 = r3.w(r6)
            int r4 = androidx.recyclerview.widget.a.N(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L6e
            int r5 = r3.H()
            if (r4 < r5) goto L67
            goto L6e
        L67:
            oy r4 = r3.q
            r4.o()
            r4 = 0
            throw r4
        L6e:
            boolean r4 = r3.N0()
            if (r4 == 0) goto L7a
            int r4 = r3.x()
            int r6 = r4 + (-1)
        L7a:
            android.view.View r4 = r3.w(r6)
            return r4
        L7f:
            int r4 = androidx.recyclerview.widget.a.N(r4)
            int r5 = r3.H()
            int r5 = r5 - r1
            if (r4 != r5) goto L8c
        L8a:
            r4 = 0
            return r4
        L8c:
            int r4 = r3.x()
            int r4 = r4 - r1
            android.view.View r4 = r3.w(r4)
            int r4 = androidx.recyclerview.widget.a.N(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Laa
            int r5 = r3.H()
            if (r4 < r5) goto La3
            goto Laa
        La3:
            oy r4 = r3.q
            r4.o()
            r4 = 0
            throw r4
        Laa:
            boolean r4 = r3.N0()
            if (r4 == 0) goto Lb1
            goto Lb7
        Lb1:
            int r4 = r3.x()
            int r6 = r4 + (-1)
        Lb7:
            android.view.View r4 = r3.w(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.a0(android.view.View, int, did, iid):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(a.N(w(0)));
            accessibilityEvent.setToIndex(a.N(w(x() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return M0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        H();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        return !M0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        H();
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(iid iidVar) {
        x();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(did didVar, iid iidVar) {
        if (iidVar.b() > 0) {
            if ((M0() ? this.n : this.o) > 0.0f) {
                N0();
                U(didVar.d(0));
                throw null;
            }
        }
        t0(didVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(iid iidVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(iid iidVar) {
        if (x() == 0) {
            return;
        }
        a.N(w(0));
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(iid iidVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(iid iidVar) {
        x();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(iid iidVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int q(iid iidVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd t() {
        return new xhd(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean w0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i, did didVar, iid iidVar) {
        if (!M0() || x() == 0 || i == 0) {
            return 0;
        }
        U(didVar.d(0));
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(int i) {
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new t52();
        this.r = new j81(1, this);
        this.p = new q75();
        x0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.Carousel);
            typedArrayObtainStyledAttributes.getInt(z5d.Carousel_carousel_alignment, 0);
            x0();
            O0(typedArrayObtainStyledAttributes.getInt(z5d.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

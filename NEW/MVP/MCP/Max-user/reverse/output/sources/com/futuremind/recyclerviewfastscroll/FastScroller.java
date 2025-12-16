package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a6d;
import defpackage.ar5;
import defpackage.c74;
import defpackage.evc;
import defpackage.ewc;
import defpackage.gp4;
import defpackage.l1d;
import defpackage.mxc;
import defpackage.qf5;
import defpackage.r34;
import defpackage.t35;
import defpackage.u3e;

/* loaded from: classes.dex */
public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int A0 = 0;
    public final qf5 a;
    public RecyclerView b;
    public View c;
    public View d;
    public TextView o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public u3e z0;

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new qf5(this);
        setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a6d.fastscroll__fastScroller, evc.fastscroll__style, 0);
        try {
            this.u0 = typedArrayObtainStyledAttributes.getColor(a6d.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.t0 = typedArrayObtainStyledAttributes.getColor(a6d.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.v0 = typedArrayObtainStyledAttributes.getResourceId(a6d.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.x0 = getVisibility();
            setViewProvider(new gp4());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return;
        }
        int iJ = recyclerView.getAdapter().j();
        this.b.x0((int) Math.min(Math.max(0.0f, (int) (f * iJ)), iJ - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            phd r0 = r0.getAdapter()
            if (r0 == 0) goto L68
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            phd r0 = r0.getAdapter()
            int r0 = r0.j()
            if (r0 == 0) goto L68
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L68
            boolean r0 = r3.c()
            if (r0 == 0) goto L41
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            phd r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getHeight()
            if (r2 > r0) goto L5f
            goto L68
        L41:
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r2 = r3.b
            phd r2 = r2.getAdapter()
            int r2 = r2.j()
            int r2 = r2 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getWidth()
            if (r2 > r0) goto L5f
            goto L68
        L5f:
            int r0 = r3.x0
            if (r0 == 0) goto L64
            goto L68
        L64:
            super.setVisibility(r1)
            return
        L68:
            r0 = 4
            super.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public final boolean c() {
        return this.w0 == 1;
    }

    public u3e getViewProvider() {
        return this.z0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float width;
        int width2;
        View view;
        Drawable background;
        TextView textView;
        Drawable background2;
        super.onLayout(z, i, i2, i3, i4);
        this.d.setOnTouchListener(new ar5(0, this));
        gp4 gp4Var = (gp4) this.z0;
        if (gp4Var.a.c()) {
            width = gp4Var.d.getHeight() / 2.0f;
            width2 = gp4Var.c.getHeight();
        } else {
            width = gp4Var.d.getWidth() / 2.0f;
            width2 = gp4Var.c.getWidth();
        }
        this.s0 = (int) (width - width2);
        int i5 = this.u0;
        if (i5 != -1 && (background2 = (textView = this.o).getBackground()) != null) {
            t35.g(background2.mutate(), i5);
            textView.setBackground(background2);
        }
        int i6 = this.t0;
        if (i6 != -1 && (background = (view = this.d).getBackground()) != null) {
            t35.g(background.mutate(), i6);
            view.setBackground(background);
        }
        int i7 = this.v0;
        if (i7 != -1) {
            this.o.setTextAppearance(i7);
        }
        if (isInEditMode()) {
            return;
        }
        this.a.c(this.b);
    }

    public void setBubbleColor(int i) {
        this.u0 = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.v0 = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.t0 = i;
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.w0 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.b = recyclerView;
        recyclerView.getAdapter();
        recyclerView.m(this.a);
        b();
        recyclerView.setOnHierarchyChangeListener(new c74(1, this));
    }

    public void setScrollerPosition(float f) {
        if (c()) {
            this.c.setY(Math.min(Math.max(0.0f, ((getHeight() - this.d.getHeight()) * f) + this.s0), getHeight() - this.c.getHeight()));
            this.d.setY(Math.min(Math.max(0.0f, f * (getHeight() - this.d.getHeight())), getHeight() - this.d.getHeight()));
            return;
        }
        this.c.setX(Math.min(Math.max(0.0f, ((getWidth() - this.d.getWidth()) * f) + this.s0), getWidth() - this.c.getWidth()));
        this.d.setX(Math.min(Math.max(0.0f, f * (getWidth() - this.d.getWidth())), getWidth() - this.d.getWidth()));
    }

    public void setViewProvider(u3e u3eVar) {
        removeAllViews();
        this.z0 = u3eVar;
        u3eVar.a = this;
        gp4 gp4Var = (gp4) u3eVar;
        View viewInflate = LayoutInflater.from(gp4Var.a.getContext()).inflate(l1d.fastscroll__default_bubble, (ViewGroup) this, false);
        gp4Var.c = viewInflate;
        this.c = viewInflate;
        gp4Var.d = new View(gp4Var.a.getContext());
        int dimensionPixelSize = gp4Var.a.c() ? 0 : gp4Var.a.getContext().getResources().getDimensionPixelSize(ewc.fastscroll__handle_inset);
        int dimensionPixelSize2 = gp4Var.a.c() ? gp4Var.a.getContext().getResources().getDimensionPixelSize(ewc.fastscroll__handle_inset) : 0;
        gp4Var.d.setBackground(new InsetDrawable(r34.b(gp4Var.a.getContext(), mxc.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        gp4Var.d.setLayoutParams(new ViewGroup.LayoutParams(gp4Var.a.getContext().getResources().getDimensionPixelSize(gp4Var.a.c() ? ewc.fastscroll__handle_clickable_width : ewc.fastscroll__handle_height), gp4Var.a.getContext().getResources().getDimensionPixelSize(gp4Var.a.c() ? ewc.fastscroll__handle_height : ewc.fastscroll__handle_clickable_width)));
        this.d = gp4Var.d;
        this.o = (TextView) gp4Var.c;
        addView(this.c);
        addView(this.d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.x0 = i;
        b();
    }
}

package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.P0;
import com.google.android.material.shape.q;
import com.google.android.material.shape.v;
import j.InterfaceC42164u;
import j.N;
import j.P;
import j.X;
import j.k0;
import lY0.C43707b;

/* compiled from: MaskableFrameLayout.java */
/* loaded from: classes6.dex */
public class g extends FrameLayout implements f, v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f356173e = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f356174b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public i f356175c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public q f356176d;

    /* compiled from: MaskableFrameLayout.java */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final Path f356177a;

        public b() {
            new RectF();
            this.f356177a = new Path();
        }
    }

    /* compiled from: MaskableFrameLayout.java */
    public static class c extends b {
        public c() {
            super();
        }
    }

    /* compiled from: MaskableFrameLayout.java */
    @X
    public static class e extends b {

        /* compiled from: MaskableFrameLayout.java */
        public class a extends ViewOutlineProvider {
            public a() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                Path path = e.this.f356177a;
                if (path.isEmpty()) {
                    return;
                }
                outline.setPath(path);
            }
        }

        @InterfaceC42164u
        private void a(View view) {
            view.setOutlineProvider(new a());
        }
    }

    public final void a() {
        if (getWidth() == 0) {
            return;
        }
        C43707b.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f356174b);
        getWidth();
        getHeight();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @N
    public RectF getMaskRectF() {
        return null;
    }

    public float getMaskXPercentage() {
        return this.f356174b;
    }

    @Override // com.google.android.material.shape.v
    @N
    public q getShapeAppearanceModel() {
        return this.f356176d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        a();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @k0
    @RestrictTo
    public void setForceCompatClipping(boolean z12) {
        throw null;
    }

    @Override // com.google.android.material.carousel.f
    public void setMaskXPercentage(float f12) {
        float fA2 = M0.a.a(f12, 0.0f, 1.0f);
        if (this.f356174b != fA2) {
            this.f356174b = fA2;
            a();
        }
    }

    public void setOnMaskChangedListener(@P i iVar) {
        this.f356175c = iVar;
    }

    @Override // com.google.android.material.shape.v
    public void setShapeAppearanceModel(@N q qVar) {
        this.f356176d = qVar.g(new P0(19));
        throw null;
    }

    /* compiled from: MaskableFrameLayout.java */
    @X
    public static class d extends b {
        @InterfaceC42164u
        private void a(View view) {
            view.setOutlineProvider(new a());
        }

        /* compiled from: MaskableFrameLayout.java */
        public class a extends ViewOutlineProvider {
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
            }
        }
    }
}

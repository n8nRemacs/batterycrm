package com.google.android.material.bottomsheet;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j.N;
import j.P;
import java.util.WeakHashMap;

/* compiled from: BottomSheetDragHandleView.java */
/* loaded from: classes6.dex */
public class i extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f356059f = 0;

    /* renamed from: b, reason: collision with root package name */
    @P
    public BottomSheetBehavior<?> f356060b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356061c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f356062d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f356063e;

    private void setBottomSheetBehavior(@P BottomSheetBehavior<?> bottomSheetBehavior) throws Resources.NotFoundException {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f356060b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.G(null);
            this.f356060b.H(null);
        }
        this.f356060b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.H(this);
            int i12 = this.f356060b.f355975L;
            if (i12 == 4) {
                this.f356063e = true;
            } else if (i12 == 3) {
                this.f356063e = false;
            }
            C22823h0.z(this, f.a.f45004g, new com.avito.android.str_seller_orders.orders_seller.d(this, 25));
            this.f356060b.v(null);
        }
        k();
    }

    public final void k() {
        this.f356062d = this.f356061c && this.f356060b != null;
        int i12 = this.f356060b == null ? 2 : 1;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setImportantForAccessibility(i12);
        setClickable(this.f356062d);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z12) {
        this.f356061c = z12;
        k();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                CoordinatorLayout.c cVar = ((CoordinatorLayout.g) layoutParams).f44447a;
                if (cVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) cVar;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() throws Resources.NotFoundException {
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    /* compiled from: BottomSheetDragHandleView.java */
    public class a extends BottomSheetBehavior.c {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@N View view, int i12) {
            int i13 = i.f356059f;
            throw null;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@N View view, float f12) {
        }
    }
}

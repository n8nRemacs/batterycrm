package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.A;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C22823h0;
import androidx.core.view.F0;
import androidx.core.view.J0;
import androidx.core.view.L0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j.I;
import j.N;
import j.P;
import j.f0;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes6.dex */
public class h extends A {

    /* renamed from: g, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f356044g;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f356045h;

    /* renamed from: i, reason: collision with root package name */
    public CoordinatorLayout f356046i;

    /* renamed from: j, reason: collision with root package name */
    public FrameLayout f356047j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f356048k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f356049l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356050m;

    /* renamed from: n, reason: collision with root package name */
    public b f356051n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f356052o;

    /* renamed from: p, reason: collision with root package name */
    @N
    public final BottomSheetBehavior.c f356053p;

    /* compiled from: BottomSheetDialog.java */
    public static class b extends BottomSheetBehavior.c {

        /* renamed from: b, reason: collision with root package name */
        @P
        public final Boolean f356055b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final J0 f356056c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Window f356057d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f356058e;

        public b(View view, J0 j02, d dVar) {
            this.f356056c = j02;
            com.google.android.material.shape.k kVar = BottomSheetBehavior.B(view).f356003i;
            ColorStateList colorStateListJ = kVar != null ? kVar.f357034b.f357059c : C22823h0.j(view);
            if (colorStateListJ != null) {
                this.f356055b = Boolean.valueOf(com.google.android.material.color.k.e(colorStateListJ.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f356055b = Boolean.valueOf(com.google.android.material.color.k.e(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f356055b = null;
            }
        }

        public final void a(View view) {
            int top = view.getTop();
            J0 j02 = this.f356056c;
            if (top < j02.k()) {
                Window window = this.f356057d;
                if (window != null) {
                    Boolean bool = this.f356055b;
                    new L0(window, window.getDecorView()).e(bool == null ? this.f356058e : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), j02.k() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f356057d;
                if (window2 != null) {
                    new L0(window2, window2.getDecorView()).e(this.f356058e);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void b(@P Window window) {
            if (this.f356057d == window) {
                return;
            }
            this.f356057d = window;
            if (window != null) {
                this.f356058e = new L0(window, window.getDecorView()).c();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onLayout(@N View view) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@N View view, float f12) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@N View view, int i12) {
            a(view);
        }
    }

    public h(@N Context context, @f0 int i12) {
        if (i12 == 0) {
            TypedValue typedValue = new TypedValue();
            i12 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i12);
        this.f356048k = true;
        this.f356049l = true;
        this.f356053p = new a();
        q();
        this.f356052o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface, Fc1.InterfaceC13706q1
    public void cancel() {
        s();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z12 = this.f356052o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f356045h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z12);
            }
            CoordinatorLayout coordinatorLayout = this.f356046i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z12);
            }
            F0.a(window, !z12);
            b bVar = this.f356051n;
            if (bVar != null) {
                bVar.b(window);
            }
        }
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(BeduinInputModel.MIN_TEXT_VERSION);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        b bVar = this.f356051n;
        if (bVar != null) {
            bVar.b(null);
        }
    }

    @Override // androidx.view.r, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f356044g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f355975L != 5) {
            return;
        }
        bottomSheetBehavior.b(4);
    }

    public final void r() {
        if (this.f356045h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f356045h = frameLayout;
            this.f356046i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f356045h.findViewById(R.id.design_bottom_sheet);
            this.f356047j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.f356044g = bottomSheetBehaviorB;
            bottomSheetBehaviorB.v(this.f356053p);
            this.f356044g.M(this.f356048k);
        }
    }

    @N
    public final BottomSheetBehavior<FrameLayout> s() {
        if (this.f356044g == null) {
            r();
        }
        return this.f356044g;
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z12) {
        super.setCancelable(z12);
        if (this.f356048k != z12) {
            this.f356048k = z12;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f356044g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.M(z12);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z12) {
        super.setCanceledOnTouchOutside(z12);
        if (z12 && !this.f356048k) {
            this.f356048k = true;
        }
        this.f356049l = z12;
        this.f356050m = true;
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void setContentView(@I int i12) {
        super.setContentView(t(null, i12, null));
    }

    public final FrameLayout t(@P View view, int i12, @P ViewGroup.LayoutParams layoutParams) {
        r();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f356045h.findViewById(R.id.coordinator);
        if (i12 != 0 && view == null) {
            view = getLayoutInflater().inflate(i12, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f356052o) {
            C22823h0.K(this.f356047j, new d(this));
        }
        this.f356047j.removeAllViews();
        if (layoutParams == null) {
            this.f356047j.addView(view);
        } else {
            this.f356047j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new e(this));
        C22823h0.C(this.f356047j, new f(this));
        this.f356047j.setOnTouchListener(new g());
        return this.f356045h;
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(t(view, 0, null));
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(t(view, 0, layoutParams));
    }

    /* compiled from: BottomSheetDialog.java */
    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@N View view, int i12) {
            if (i12 == 5) {
                h.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@N View view, float f12) {
        }
    }
}

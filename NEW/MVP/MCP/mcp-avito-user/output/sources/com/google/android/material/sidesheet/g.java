package com.google.android.material.sidesheet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.A;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C22823h0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.sidesheet.c;
import j.D;
import j.I;
import j.N;
import j.P;

/* compiled from: SheetDialog.java */
/* loaded from: classes6.dex */
abstract class g<C extends c> extends A {

    /* renamed from: l, reason: collision with root package name */
    public static final int f357185l = R.id.coordinator;

    /* renamed from: m, reason: collision with root package name */
    public static final int f357186m = R.id.touch_outside;

    /* renamed from: g, reason: collision with root package name */
    @P
    public b<C> f357187g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public FrameLayout f357188h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public FrameLayout f357189i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f357190j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f357191k;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        t();
        super.cancel();
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(BeduinInputModel.MIN_TEXT_VERSION);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.view.r, android.app.Dialog
    public final void onStart() {
        super.onStart();
        b<C> bVar = this.f357187g;
        if (bVar == null || bVar.getState() != 5) {
            return;
        }
        this.f357187g.b(3);
    }

    public abstract void r(b<C> bVar);

    public final void s() {
        if (this.f357188h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), w(), null);
            this.f357188h = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(v());
            this.f357189i = frameLayout2;
            SideSheetBehavior sideSheetBehaviorU = u(frameLayout2);
            this.f357187g = sideSheetBehaviorU;
            r(sideSheetBehaviorU);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z12) {
        super.setCancelable(z12);
        if (this.f357190j != z12) {
            this.f357190j = z12;
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z12) {
        super.setCanceledOnTouchOutside(z12);
        if (z12 && !this.f357190j) {
            this.f357190j = true;
        }
        this.f357191k = z12;
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public void setContentView(@I int i12) {
        super.setContentView(x(null, i12, null));
    }

    @N
    public b<C> t() {
        if (this.f357187g == null) {
            s();
        }
        return this.f357187g;
    }

    @N
    public abstract SideSheetBehavior u(@N FrameLayout frameLayout);

    @D
    public abstract int v();

    @I
    public abstract int w();

    public final FrameLayout x(@P View view, int i12, @P ViewGroup.LayoutParams layoutParams) {
        s();
        if (this.f357188h == null) {
            s();
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f357188h.findViewById(f357185l);
        if (i12 != 0 && view == null) {
            view = getLayoutInflater().inflate(i12, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f357189i == null) {
            s();
        }
        FrameLayout frameLayout = this.f357189i;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f357186m).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g gVar = this.f357183b;
                if (gVar.f357190j && gVar.isShowing() && gVar.f357191k) {
                    gVar.cancel();
                }
            }
        });
        if (this.f357189i == null) {
            s();
        }
        C22823h0.C(this.f357189i, new f(this));
        return this.f357188h;
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public void setContentView(@P View view) {
        super.setContentView(x(view, 0, null));
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public void setContentView(@P View view, @P ViewGroup.LayoutParams layoutParams) {
        super.setContentView(x(view, 0, layoutParams));
    }
}

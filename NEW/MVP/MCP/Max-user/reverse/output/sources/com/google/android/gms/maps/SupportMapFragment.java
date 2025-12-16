package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import defpackage.bbi;
import defpackage.ds4;
import defpackage.idi;
import defpackage.kbi;
import defpackage.qbi;
import defpackage.tai;
import defpackage.y38;

/* loaded from: classes.dex */
public class SupportMapFragment extends a {
    public final idi i1 = new idi(this);

    @Override // androidx.fragment.app.a
    public final void I(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void K(Activity activity) {
        this.Q0 = true;
        idi idiVar = this.i1;
        idiVar.i = activity;
        idiVar.x();
    }

    @Override // androidx.fragment.app.a
    public void M(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.M(bundle);
            idi idiVar = this.i1;
            idiVar.getClass();
            idiVar.w(bundle, new bbi(idiVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.a
    public View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        idi idiVar = this.i1;
        idiVar.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        idiVar.w(bundle, new kbi(idiVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (((y38) idiVar.a) == null) {
            ds4.u(frameLayout);
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // androidx.fragment.app.a
    public final void P() {
        idi idiVar = this.i1;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.a();
        } else {
            idiVar.v(1);
        }
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a
    public void Q() {
        idi idiVar = this.i1;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.l();
        } else {
            idiVar.v(2);
        }
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void U(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.Q0 = true;
            idi idiVar = this.i1;
            idiVar.i = activity;
            idiVar.x();
            GoogleMapOptions googleMapOptionsB = GoogleMapOptions.b(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsB);
            idiVar.w(bundle, new tai(idiVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.a
    public final void X() {
        idi idiVar = this.i1;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.g();
        } else {
            idiVar.v(5);
        }
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void a0() {
        this.Q0 = true;
        idi idiVar = this.i1;
        idiVar.getClass();
        idiVar.w(null, new qbi(idiVar, 1));
    }

    @Override // androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        idi idiVar = this.i1;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.k(bundle);
            return;
        }
        Bundle bundle2 = (Bundle) idiVar.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // androidx.fragment.app.a
    public final void c0() {
        this.Q0 = true;
        idi idiVar = this.i1;
        idiVar.getClass();
        idiVar.w(null, new qbi(idiVar, 0));
    }

    @Override // androidx.fragment.app.a
    public final void d0() {
        idi idiVar = this.i1;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            y38Var.e();
        } else {
            idiVar.v(4);
        }
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onLowMemory() {
        y38 y38Var = (y38) this.i1.a;
        if (y38Var != null) {
            y38Var.onLowMemory();
        }
        this.Q0 = true;
    }
}

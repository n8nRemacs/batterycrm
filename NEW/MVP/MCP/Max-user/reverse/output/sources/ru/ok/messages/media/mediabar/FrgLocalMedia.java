package ru.ok.messages.media.mediabar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b;
import defpackage.acg;
import defpackage.bcg;
import defpackage.cei;
import defpackage.d6;
import defpackage.dce;
import defpackage.dz7;
import defpackage.gvd;
import defpackage.ho;
import defpackage.kpi;
import defpackage.l3i;
import defpackage.ln;
import defpackage.nd8;
import defpackage.ne8;
import defpackage.pd8;
import defpackage.pl6;
import defpackage.py0;
import defpackage.q0d;
import defpackage.qm3;
import defpackage.qs3;
import defpackage.s34;
import defpackage.t1b;
import defpackage.v7;
import defpackage.yd8;
import defpackage.yni;
import defpackage.zd8;
import java.lang.reflect.InvocationTargetException;
import ru.ok.messages.views.fragments.FrgSlideOut;

/* loaded from: classes2.dex */
public abstract class FrgLocalMedia extends FrgSlideOut implements ne8 {
    public boolean A1;
    public pd8 v1;
    public boolean w1;
    public zd8 x1;
    public ProgressBar y1;
    public View z1;

    public static Bundle C0(pd8 pd8Var, boolean z, nd8 nd8Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ru.ok.messages.extra.LOCAL_MEDIA", pd8Var);
        bundle.putBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT", z);
        bundle.putParcelable("ru.ok.messages.extra.OPTIONS", nd8Var);
        return bundle;
    }

    public void D0() {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void M(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        qs3 qs3Var;
        super.M(bundle);
        dz7 dz7VarT = t();
        if (!(dz7VarT instanceof bcg) || (qs3Var = ((ActLocalMedias) ((bcg) dz7VarT)).a1) == null) {
            qs3Var = null;
        }
        if (!this.O0) {
            this.O0 = true;
            if (F() && !G()) {
                this.E0.Y.invalidateOptionsMenu();
            }
        }
        if (qs3Var != null) {
            b bVarZ = ((py0) qs3Var.b).z();
            Toolbar toolbar = (Toolbar) qs3Var.c;
            if (toolbar != null && bVarZ != null) {
                ho hoVar = (ho) ((ln) bVarZ).C();
                if (hoVar.t0 instanceof Activity) {
                    hoVar.A();
                    kpi kpiVar = hoVar.y0;
                    if (kpiVar instanceof l3i) {
                        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                    }
                    hoVar.z0 = null;
                    if (kpiVar != null) {
                        kpiVar.j();
                    }
                    hoVar.y0 = null;
                    Object obj = hoVar.t0;
                    acg acgVar = new acg(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : hoVar.A0, hoVar.w0);
                    hoVar.y0 = acgVar;
                    hoVar.w0.b = acgVar.c;
                    toolbar.setBackInvokedCallbackEnabled(true);
                    hoVar.c();
                }
            }
        }
        Bundle bundle2 = this.X;
        this.v1 = (pd8) bundle2.getParcelable("ru.ok.messages.extra.LOCAL_MEDIA");
        this.w1 = bundle2.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT");
        this.x1 = ((yd8) ((t1b) ((qm3) this.l1.b)).getAccessor().c(627)).a(this, this.v1);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void P() {
        super.P();
        this.x1.a();
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void X() {
        super.X();
        zd8 zd8Var = this.x1;
        dce dceVar = zd8Var.b;
        dceVar.f.remove(zd8Var);
        dceVar.g.remove(zd8Var);
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.k4f
    public final boolean a() {
        return !this.w1;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void a0() {
        super.a0();
        zd8 zd8Var = this.x1;
        dce dceVar = zd8Var.b;
        dceVar.f.add(zd8Var);
        dceVar.g.add(zd8Var);
    }

    @Override // androidx.fragment.app.a
    public void e0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        this.y1 = (ProgressBar) view.findViewById(q0d.frg_local_media__progress_bar);
        this.z1 = view.findViewById(q0d.frg_local_media__progress_background);
        cei.l(this.y1, s34.a(v(), gvd.c));
        yni.e(this.y1, !this.A1);
        yni.e(this.z1, !this.A1);
    }

    @Override // defpackage.ne8
    public final void j(boolean z) {
        ProgressBar progressBar = this.y1;
        if (progressBar == null || this.z1 == null) {
            this.A1 = z;
            return;
        }
        boolean z2 = !z;
        yni.e(progressBar, z2);
        yni.e(this.z1, z2);
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.k4f
    public final void m(int i) {
        pl6 pl6Var = (pl6) u0();
        if (pl6Var != null) {
            ActLocalMedias actLocalMedias = (ActLocalMedias) pl6Var;
            if (!actLocalMedias.V0.t0) {
                dce dceVar = actLocalMedias.Q().f;
                dceVar.a.clear();
                dceVar.n();
                dceVar.b.clear();
                if (dceVar.h.g.getBoolean("app.send.media.as.collage", true)) {
                    dceVar.k = 3;
                } else {
                    dceVar.k = 1;
                }
            }
        }
        if (!this.w1) {
            super.m(i);
            return;
        }
        b bVarT = t();
        bVarT.getClass();
        v7.a(bVarT);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String t0() {
        return null;
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, ru.ok.messages.views.fragments.base.FrgBase
    public final void x0(d6 d6Var) {
        super.x0(d6Var);
        if (!(t() instanceof pl6)) {
            throw new IllegalStateException("Parent activity must implement FrgLocalMedia.Listener interface");
        }
    }
}

package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l3i extends kpi implements u6 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public xh4 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public k3i i;
    public k3i j;
    public h79 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public iz8 s;
    public boolean t;
    public boolean u;
    public final j3i v;
    public final j3i w;
    public final nud x;

    public l3i(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new j3i(this, 0);
        this.w = new j3i(this, 1);
        this.x = new nud(8, this);
        View decorView = activity.getWindow().getDecorView();
        t(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.kpi
    public final boolean d() {
        xbg xbgVar;
        xh4 xh4Var = this.e;
        if (xh4Var == null || (xbgVar = ((fcg) xh4Var).a.Z0) == null || xbgVar.b == null) {
            return false;
        }
        xbg xbgVar2 = ((fcg) xh4Var).a.Z0;
        zf9 zf9Var = xbgVar2 == null ? null : xbgVar2.b;
        if (zf9Var == null) {
            return true;
        }
        zf9Var.collapseActionView();
        return true;
    }

    @Override // defpackage.kpi
    public final void e(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() > 0) {
            throw xrf.n(arrayList, 0);
        }
    }

    @Override // defpackage.kpi
    public final int f() {
        return ((fcg) this.e).b;
    }

    @Override // defpackage.kpi
    public final Context g() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(fvc.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.kpi
    public final void i() {
        u(this.a.getResources().getBoolean(kvc.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.kpi
    public final boolean k(int i, KeyEvent keyEvent) {
        vf9 vf9Var;
        k3i k3iVar = this.i;
        if (k3iVar == null || (vf9Var = k3iVar.d) == null) {
            return false;
        }
        vf9Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return vf9Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.kpi
    public final void n(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        fcg fcgVar = (fcg) this.e;
        int i2 = fcgVar.b;
        this.h = true;
        fcgVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.kpi
    public final void o(boolean z2) {
        iz8 iz8Var;
        this.t = z2;
        if (z2 || (iz8Var = this.s) == null) {
            return;
        }
        iz8Var.a();
    }

    @Override // defpackage.kpi
    public final void p(CharSequence charSequence) {
        fcg fcgVar = (fcg) this.e;
        if (fcgVar.g) {
            return;
        }
        Toolbar toolbar = fcgVar.a;
        fcgVar.h = charSequence;
        if ((fcgVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (fcgVar.g) {
                hfh.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.kpi
    public final l7 q(h79 h79Var) {
        k3i k3iVar = this.i;
        if (k3iVar != null) {
            k3iVar.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        k3i k3iVar2 = new k3i(this, this.f.getContext(), h79Var);
        vf9 vf9Var = k3iVar2.d;
        vf9Var.w();
        try {
            if (!((fa6) k3iVar2.o.b).z(k3iVar2, vf9Var)) {
                return null;
            }
            this.i = k3iVar2;
            k3iVar2.i();
            this.f.c(k3iVar2);
            s(true);
            return k3iVar2;
        } finally {
            vf9Var.v();
        }
    }

    public final void s(boolean z2) {
        dhh dhhVarI;
        dhh dhhVarI2;
        if (z2) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                v(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            v(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((fcg) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((fcg) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            fcg fcgVar = (fcg) this.e;
            dhhVarI = hfh.a(fcgVar.a);
            dhhVarI.a(0.0f);
            dhhVarI.c(100L);
            dhhVarI.d(new ecg(fcgVar, 4));
            dhhVarI2 = this.f.i(0, 200L);
        } else {
            fcg fcgVar2 = (fcg) this.e;
            dhh dhhVarA = hfh.a(fcgVar2.a);
            dhhVarA.a(1.0f);
            dhhVarA.c(200L);
            dhhVarA.d(new ecg(fcgVar2, 0));
            dhhVarI = this.f.i(8, 100L);
            dhhVarI2 = dhhVarA;
        }
        iz8 iz8Var = new iz8();
        ArrayList arrayList = iz8Var.a;
        arrayList.add(dhhVarI);
        View view = (View) dhhVarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) dhhVarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(dhhVarI2);
        iz8Var.b();
    }

    public final void t(View view) {
        xh4 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(zxc.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(zxc.action_bar);
        if (callbackFindViewById instanceof xh4) {
            wrapper = (xh4) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(zxc.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(zxc.action_bar_container);
        this.d = actionBarContainer;
        xh4 xh4Var = this.e;
        if (xh4Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(l3i.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((fcg) xh4Var).a.getContext();
        this.a = context;
        if ((((fcg) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        u(context.getResources().getBoolean(kvc.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, o6d.ActionBar, fvc.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(o6d.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.t0) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = hfh.a;
            veh.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void u(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((fcg) this.e).getClass();
        } else {
            ((fcg) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((fcg) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void v(boolean z2) {
        boolean z3 = this.p;
        boolean z4 = this.q;
        nud nudVar = this.x;
        View view = this.g;
        if (!z4 && z3) {
            if (this.r) {
                this.r = false;
                iz8 iz8Var = this.s;
                if (iz8Var != null) {
                    iz8Var.a();
                }
                int i = this.n;
                j3i j3iVar = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    j3iVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                iz8 iz8Var2 = new iz8();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                dhh dhhVarA = hfh.a(this.d);
                dhhVarA.e(f);
                View view2 = (View) dhhVarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(nudVar != null ? new sg(nudVar, 7, view2) : null);
                }
                boolean z5 = iz8Var2.c;
                ArrayList arrayList = iz8Var2.a;
                if (!z5) {
                    arrayList.add(dhhVarA);
                }
                if (this.o && view != null) {
                    dhh dhhVarA2 = hfh.a(view);
                    dhhVarA2.e(f);
                    if (!iz8Var2.c) {
                        arrayList.add(dhhVarA2);
                    }
                }
                boolean z6 = iz8Var2.c;
                if (!z6) {
                    iz8Var2.d = y;
                }
                if (!z6) {
                    iz8Var2.b = 250L;
                }
                if (!z6) {
                    iz8Var2.o = j3iVar;
                }
                this.s = iz8Var2;
                iz8Var2.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        iz8 iz8Var3 = this.s;
        if (iz8Var3 != null) {
            iz8Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        j3i j3iVar2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.d.setTranslationY(f2);
            iz8 iz8Var4 = new iz8();
            dhh dhhVarA3 = hfh.a(this.d);
            dhhVarA3.e(0.0f);
            View view3 = (View) dhhVarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(nudVar != null ? new sg(nudVar, 7, view3) : null);
            }
            boolean z7 = iz8Var4.c;
            ArrayList arrayList2 = iz8Var4.a;
            if (!z7) {
                arrayList2.add(dhhVarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                dhh dhhVarA4 = hfh.a(view);
                dhhVarA4.e(0.0f);
                if (!iz8Var4.c) {
                    arrayList2.add(dhhVarA4);
                }
            }
            boolean z8 = iz8Var4.c;
            if (!z8) {
                iz8Var4.d = z;
            }
            if (!z8) {
                iz8Var4.b = 250L;
            }
            if (!z8) {
                iz8Var4.o = j3iVar2;
            }
            this.s = iz8Var4;
            iz8Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            j3iVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = hfh.a;
            teh.c(actionBarOverlayLayout);
        }
    }

    public l3i(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new j3i(this, 0);
        this.w = new j3i(this, 1);
        this.x = new nud(8, this);
        t(dialog.getWindow().getDecorView());
    }
}

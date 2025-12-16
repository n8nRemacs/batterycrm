package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class acg extends kpi {
    public final fcg a;
    public final Window.Callback b;
    public final ulc c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final r98 h = new r98(29, this);

    public acg(Toolbar toolbar, CharSequence charSequence, bo boVar) {
        nud nudVar = new nud(5, this);
        toolbar.getClass();
        fcg fcgVar = new fcg(toolbar, false);
        this.a = fcgVar;
        boVar.getClass();
        this.b = boVar;
        fcgVar.k = boVar;
        toolbar.setOnMenuItemClickListener(nudVar);
        if (!fcgVar.g) {
            fcgVar.h = charSequence;
            if ((fcgVar.b & 8) != 0) {
                Toolbar toolbar2 = fcgVar.a;
                toolbar2.setTitle(charSequence);
                if (fcgVar.g) {
                    hfh.o(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.c = new ulc(9, this);
    }

    @Override // defpackage.kpi
    public final boolean c() {
        h7 h7Var;
        ActionMenuView actionMenuView = this.a.a.a;
        return (actionMenuView == null || (h7Var = actionMenuView.o) == null || !h7Var.g()) ? false : true;
    }

    @Override // defpackage.kpi
    public final boolean d() {
        zf9 zf9Var;
        xbg xbgVar = this.a.a.Z0;
        if (xbgVar == null || (zf9Var = xbgVar.b) == null) {
            return false;
        }
        if (xbgVar == null) {
            zf9Var = null;
        }
        if (zf9Var == null) {
            return true;
        }
        zf9Var.collapseActionView();
        return true;
    }

    @Override // defpackage.kpi
    public final void e(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() > 0) {
            throw xrf.n(arrayList, 0);
        }
    }

    @Override // defpackage.kpi
    public final int f() {
        return this.a.b;
    }

    @Override // defpackage.kpi
    public final Context g() {
        return this.a.a.getContext();
    }

    @Override // defpackage.kpi
    public final boolean h() {
        fcg fcgVar = this.a;
        Toolbar toolbar = fcgVar.a;
        r98 r98Var = this.h;
        toolbar.removeCallbacks(r98Var);
        Toolbar toolbar2 = fcgVar.a;
        WeakHashMap weakHashMap = hfh.a;
        toolbar2.postOnAnimation(r98Var);
        return true;
    }

    @Override // defpackage.kpi
    public final void i() {
    }

    @Override // defpackage.kpi
    public final void j() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.kpi
    public final boolean k(int i, KeyEvent keyEvent) {
        Menu menuS = s();
        if (menuS == null) {
            return false;
        }
        menuS.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuS.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.kpi
    public final boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // defpackage.kpi
    public final boolean m() {
        return this.a.a.w();
    }

    @Override // defpackage.kpi
    public final void n(boolean z) {
    }

    @Override // defpackage.kpi
    public final void o(boolean z) {
    }

    @Override // defpackage.kpi
    public final void p(CharSequence charSequence) {
        fcg fcgVar = this.a;
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

    public final Menu s() {
        boolean z = this.e;
        fcg fcgVar = this.a;
        if (!z) {
            os0 os0Var = new os0(this);
            hfd hfdVar = new hfd(9, this);
            Toolbar toolbar = fcgVar.a;
            toolbar.a1 = os0Var;
            toolbar.b1 = hfdVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.s0 = os0Var;
                actionMenuView.t0 = hfdVar;
            }
            this.e = true;
        }
        return fcgVar.a.getMenu();
    }
}

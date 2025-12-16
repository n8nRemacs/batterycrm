package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class lrf {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ mrf E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public m7 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public lrf(mrf mrfVar, Menu menu) {
        this.E = mrfVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        mrf mrfVar = this.E;
        if (str != null) {
            if (mrfVar.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (mrfVar.d == null) {
                mrfVar.d = mrf.a(mrfVar.c);
            }
            Object obj = mrfVar.d;
            String str2 = this.y;
            krf krfVar = new krf();
            krfVar.b = obj;
            Class<?> cls = obj.getClass();
            try {
                krfVar.c = cls.getMethod(str2, krf.d);
                menuItem.setOnMenuItemClickListener(krfVar);
            } catch (Exception e) {
                StringBuilder sbN = az1.n("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof zf9) {
                zf9 zf9Var = (zf9) menuItem;
                zf9Var.H0 = (zf9Var.H0 & (-5)) | 4;
            } else if (menuItem instanceof dg9) {
                dg9 dg9Var = (dg9) menuItem;
                nrf nrfVar = dg9Var.d;
                try {
                    if (dg9Var.o == null) {
                        dg9Var.o = nrfVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    dg9Var.o.invoke(nrfVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, mrf.e, mrfVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        m7 m7Var = this.z;
        if (m7Var != null) {
            if (menuItem instanceof nrf) {
                ((nrf) menuItem).a(m7Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof nrf;
        if (z2) {
            ((nrf) menuItem).setContentDescription(charSequence);
        } else {
            xf9.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((nrf) menuItem).setTooltipText(charSequence2);
        } else {
            xf9.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((nrf) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            xf9.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((nrf) menuItem).setNumericShortcut(c2, i4);
        } else {
            xf9.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((nrf) menuItem).setIconTintMode(mode);
            } else {
                xf9.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((nrf) menuItem).setIconTintList(colorStateList);
            } else {
                xf9.i(menuItem, colorStateList);
            }
        }
    }
}

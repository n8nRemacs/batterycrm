package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zf9 implements nrf {
    public CharSequence A0;
    public CharSequence B0;
    public int I0;
    public View J0;
    public m7 K0;
    public MenuItem.OnActionExpandListener L0;
    public CharSequence X;
    public Intent Y;
    public char Z;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence o;
    public char t0;
    public Drawable v0;
    public final vf9 x0;
    public qnf y0;
    public MenuItem.OnMenuItemClickListener z0;
    public int s0 = 4096;
    public int u0 = 4096;
    public int w0 = 0;
    public ColorStateList C0 = null;
    public PorterDuff.Mode D0 = null;
    public boolean E0 = false;
    public boolean F0 = false;
    public boolean G0 = false;
    public int H0 = 16;
    public boolean M0 = false;

    public zf9(vf9 vf9Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.x0 = vf9Var;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.o = charSequence;
        this.I0 = i5;
    }

    public static void b(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // defpackage.nrf
    public final nrf a(m7 m7Var) {
        m7 m7Var2 = this.K0;
        if (m7Var2 != null) {
            m7Var2.b = null;
        }
        this.J0 = null;
        this.K0 = m7Var;
        this.x0.p(true);
        m7 m7Var3 = this.K0;
        if (m7Var3 != null) {
            m7Var3.h(new usd(25, this));
        }
        return this;
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.G0 && (this.E0 || this.F0)) {
            drawable = drawable.mutate();
            if (this.E0) {
                t35.h(drawable, this.C0);
            }
            if (this.F0) {
                t35.i(drawable, this.D0);
            }
            this.G0 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.I0 & 8) == 0) {
            return false;
        }
        if (this.J0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.L0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.x0.d(this);
        }
        return false;
    }

    public final boolean d() {
        m7 m7Var;
        if ((this.I0 & 8) == 0) {
            return false;
        }
        if (this.J0 == null && (m7Var = this.K0) != null) {
            this.J0 = m7Var.d(this);
        }
        return this.J0 != null;
    }

    @Override // defpackage.nrf
    public final m7 e() {
        return this.K0;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!d()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.L0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.x0.f(this);
        }
        return false;
    }

    public final void f(boolean z) {
        if (z) {
            this.H0 |= 32;
        } else {
            this.H0 &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.J0;
        if (view != null) {
            return view;
        }
        m7 m7Var = this.K0;
        if (m7Var == null) {
            return null;
        }
        View viewD = m7Var.d(this);
        this.J0 = viewD;
        return viewD;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.u0;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.t0;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.A0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.v0;
        if (drawable != null) {
            return c(drawable);
        }
        int i = this.w0;
        if (i == 0) {
            return null;
        }
        Drawable drawableA = eri.a(this.x0.a, i);
        this.w0 = 0;
        this.v0 = drawableA;
        return c(drawableA);
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.C0;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.D0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.Y;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.s0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.Z;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.y0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.X;
        return charSequence != null ? charSequence : this.o;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.B0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.y0 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.M0;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.H0 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.H0 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.H0 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        m7 m7Var = this.K0;
        return (m7Var == null || !m7Var.g()) ? (this.H0 & 8) == 0 : (this.H0 & 8) == 0 && this.K0.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.J0 = view;
        this.K0 = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        vf9 vf9Var = this.x0;
        vf9Var.u0 = true;
        vf9Var.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.t0 == c) {
            return this;
        }
        this.t0 = Character.toLowerCase(c);
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.H0;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.H0 = i2;
        if (i != i2) {
            this.x0.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.H0;
        if ((i & 4) == 0) {
            int i2 = (i & (-3)) | (z ? 2 : 0);
            this.H0 = i2;
            if (i != i2) {
                this.x0.p(false);
            }
            return this;
        }
        vf9 vf9Var = this.x0;
        ArrayList arrayList = vf9Var.X;
        int size = arrayList.size();
        vf9Var.w();
        for (int i3 = 0; i3 < size; i3++) {
            zf9 zf9Var = (zf9) arrayList.get(i3);
            if (zf9Var.b == this.b && (zf9Var.H0 & 4) != 0 && zf9Var.isCheckable()) {
                boolean z2 = zf9Var == this;
                int i4 = zf9Var.H0;
                int i5 = (z2 ? 2 : 0) | (i4 & (-3));
                zf9Var.H0 = i5;
                if (i4 != i5) {
                    zf9Var.x0.p(false);
                }
            }
        }
        vf9Var.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.H0 |= 16;
        } else {
            this.H0 &= -17;
        }
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.w0 = 0;
        this.v0 = drawable;
        this.G0 = true;
        this.x0.p(false);
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.E0 = true;
        this.G0 = true;
        this.x0.p(false);
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.D0 = mode;
        this.F0 = true;
        this.G0 = true;
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.Y = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.Z == c) {
            return this;
        }
        this.Z = c;
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.L0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.z0 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.Z = c;
        this.t0 = Character.toLowerCase(c2);
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.I0 = i;
        vf9 vf9Var = this.x0;
        vf9Var.u0 = true;
        vf9Var.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.o = charSequence;
        this.x0.p(false);
        qnf qnfVar = this.y0;
        if (qnfVar != null) {
            qnfVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.X = charSequence;
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.H0;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.H0 = i2;
        if (i != i2) {
            vf9 vf9Var = this.x0;
            vf9Var.Z = true;
            vf9Var.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.o;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final nrf setContentDescription(CharSequence charSequence) {
        this.A0 = charSequence;
        this.x0.p(false);
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final nrf setTooltipText(CharSequence charSequence) {
        this.B0 = charSequence;
        this.x0.p(false);
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.t0 == c && this.u0 == i) {
            return this;
        }
        this.t0 = Character.toLowerCase(c);
        this.u0 = KeyEvent.normalizeMetaState(i);
        this.x0.p(false);
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.Z == c && this.s0 == i) {
            return this;
        }
        this.Z = c;
        this.s0 = KeyEvent.normalizeMetaState(i);
        this.x0.p(false);
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.Z = c;
        this.s0 = KeyEvent.normalizeMetaState(i);
        this.t0 = Character.toLowerCase(c2);
        this.u0 = KeyEvent.normalizeMetaState(i2);
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.v0 = null;
        this.w0 = i;
        this.G0 = true;
        this.x0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.x0.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.x0.a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.J0 = viewInflate;
        this.K0 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.a) > 0) {
            viewInflate.setId(i2);
        }
        vf9 vf9Var = this.x0;
        vf9Var.u0 = true;
        vf9Var.p(true);
        return this;
    }
}

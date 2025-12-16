package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class b7 implements nrf {
    public char X;
    public int Y;
    public Drawable Z;
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int o;
    public Context s0;
    public CharSequence t0;
    public CharSequence u0;
    public ColorStateList v0;
    public PorterDuff.Mode w0;
    public boolean x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.nrf
    public final nrf a(m7 m7Var) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        Drawable drawable = this.Z;
        if (drawable != null) {
            if (this.x0 || this.y0) {
                this.Z = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.Z = drawableMutate;
                if (this.x0) {
                    t35.h(drawableMutate, this.v0);
                }
                if (this.y0) {
                    t35.i(this.Z, this.w0);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // defpackage.nrf
    public final m7 e() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.Y;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.X;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.t0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.Z;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.v0;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.w0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.u0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.z0 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.z0 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.z0 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.z0 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.X = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.z0 = (z ? 1 : 0) | (this.z0 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.z0 = (z ? 2 : 0) | (this.z0 & (-3));
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final nrf setContentDescription(CharSequence charSequence) {
        this.t0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.z0 = (z ? 16 : 0) | (this.z0 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.Z = drawable;
        b();
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.x0 = true;
        b();
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.w0 = mode;
        this.y0 = true;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.X = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final nrf setTooltipText(CharSequence charSequence) {
        this.u0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.z0 = (this.z0 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.X = Character.toLowerCase(c);
        this.Y = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.t0 = charSequence;
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.d = c;
        this.o = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.a = this.s0.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.u0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.Z = r34.b(this.s0, i);
        b();
        return this;
    }

    @Override // defpackage.nrf, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d = c;
        this.o = KeyEvent.normalizeMetaState(i);
        this.X = Character.toLowerCase(c2);
        this.Y = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}

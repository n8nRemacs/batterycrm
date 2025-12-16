package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class cg9 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ dg9 b;

    public cg9(dg9 dg9Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = dg9Var;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.O(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.O(menuItem));
    }
}

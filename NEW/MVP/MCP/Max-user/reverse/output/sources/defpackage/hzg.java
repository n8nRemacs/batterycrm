package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class hzg extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public hzg(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        izg izgVar = new izg();
        izgVar.a = (VectorDrawable) this.a.newDrawable();
        return izgVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        izg izgVar = new izg();
        izgVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return izgVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        izg izgVar = new izg();
        izgVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return izgVar;
    }
}

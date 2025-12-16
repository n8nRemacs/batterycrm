package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ks implements w35 {
    public final /* synthetic */ int a;
    public final /* synthetic */ up5 b;

    public ks(up5 up5Var, int i) {
        this.b = up5Var;
        this.a = i;
    }

    @Override // defpackage.w35
    public final Drawable e(Drawable drawable) {
        return this.b.e(drawable, this.a);
    }

    @Override // defpackage.w35
    public final Drawable j() {
        return this.b.c(this.a);
    }
}

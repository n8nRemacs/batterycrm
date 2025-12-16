package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class k7g extends d2f {
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        f7g f7gVar = (f7g) t98Var;
        h7g h7gVar = (h7g) this.a;
        h7gVar.setThemeName(f7gVar.b);
        Drawable drawable = f7gVar.d;
        if (drawable != null) {
            h7gVar.setBackgroundPattern(drawable);
        }
        h7gVar.setSelected(f7gVar.a);
    }
}

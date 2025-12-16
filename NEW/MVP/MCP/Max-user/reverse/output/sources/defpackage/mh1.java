package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* loaded from: classes.dex */
public final class mh1 extends d2f {
    public static final /* synthetic */ int F0 = 0;
    public final h08 E0;

    public mh1(Context context, h08 h08Var) {
        v0b v0bVar = new v0b(context, false);
        super(v0bVar);
        this.E0 = h08Var;
        v0bVar.setCustomTheme(a93.s0.z(context).c);
    }

    public final void F(zi1 zi1Var, boolean z, boolean z2) {
        View view = this.a;
        if (z) {
            ((v0b) view).i(Integer.valueOf(i0b.o0), iza.d, gza.o, new m3(this, 17, zi1Var));
        } else {
            ((v0b) view).i(null, (4 & 2) != 0 ? iza.b : iza.d, gza.c, new g31(18));
        }
        ((v0b) view).setIconInfo(z2 ? Integer.valueOf(i0b.H) : null);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        hh1 hh1Var = (hh1) t98Var;
        boolean z = hh1Var.Y;
        View view = this.a;
        v0b v0bVar = (v0b) view;
        v0bVar.setId(Long.hashCode(hh1Var.t0));
        String str = hh1Var.b;
        v0bVar.setTitle(str);
        zi1 zi1Var = hh1Var.a;
        v0bVar.g(zi1Var.a, str, hh1Var.c);
        v0bVar.setSubtitle(v0bVar.getContext().getString(hh1Var.s0.intValue()));
        v1a v1aVar = a93.s0;
        int i = v1aVar.B(v0bVar).c.c().a.a.d;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(v1aVar.B(v0bVar).c.b().l);
        v0bVar.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, null));
        F(zi1Var, hh1Var.o, z);
        ((v0b) view).setIconInfo(z ? Integer.valueOf(i0b.H) : null);
        if (hh1Var.d) {
            view.setOnClickListener(null);
        } else {
            f8j.d(view, 300L, new ub(this, 7, zi1Var));
        }
        v0bVar.setCustomTheme(v1aVar.B(v0bVar).c);
    }
}

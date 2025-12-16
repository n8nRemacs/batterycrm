package defpackage;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class ih1 extends d2f {
    public final ft1 E0;
    public final it1 F0;

    public ih1(FrameLayout frameLayout, ft1 ft1Var) {
        super(frameLayout);
        this.E0 = ft1Var;
        this.F0 = (it1) frameLayout.findViewById(eyc.call_opponent);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        vd1 vd1Var = (vd1) t98Var;
        CharSequence charSequence = vd1Var.c;
        String str = vd1Var.d;
        it1 it1Var = this.F0;
        it1Var.H(str, charSequence);
        it1Var.D(vd1Var.Z);
        it1Var.F(vd1Var.X);
        it1Var.setAvatar(vd1Var.o);
        it1Var.setRaiseHand(vd1Var.u0);
        it1Var.setOpponentVideo(vd1Var.y0);
        it1Var.setButtonAction(vd1Var.z0);
        it1Var.h1 = vd1Var.a;
        it1Var.b1 = this.E0;
    }
}

package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class wga extends bi9 {
    public jr6 U0;
    public kce V0;

    @Override // defpackage.bi9
    public final void L(MessageModel messageModel) throws NumberFormatException {
        m00 m00Var = messageModel.t0.b;
        jr6 jr6Var = m00Var instanceof jr6 ? (jr6) m00Var : null;
        if (jr6Var == null) {
            return;
        }
        this.U0 = jr6Var;
        vga vgaVar = (vga) this.I0;
        vgaVar.a(jr6Var);
        vgaVar.setExternalMapButtonClickListener(this.V0 != null ? new ye6(20, new ia(this, 24, jr6Var)) : null);
        vgaVar.setExternalMapButtonText(vgaVar.getResources().getString(l7b.X0));
    }

    @Override // defpackage.bi9
    public final void M(yt0 yt0Var) throws NumberFormatException {
        jr6 jr6Var = this.U0;
        ViewGroup viewGroup = this.I0;
        if (jr6Var != null) {
            ((vga) viewGroup).a(jr6Var);
        }
        vga vgaVar = (vga) viewGroup;
        if4 if4Var = vgaVar.E0;
        bu0 bu0Var = yt0Var.d;
        int i = bu0Var.m;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
        bza bzaVar = vgaVar.C0;
        bzaVar.getClass();
        bzaVar.setTextColor(bu0Var.i);
        GradientDrawable gradientDrawable = (GradientDrawable) bzaVar.b;
        gradientDrawable.setColor(yt0Var.a.m);
        gradientDrawable.setStroke(kti.d(1 * vw4.d().getDisplayMetrics().density), yt0Var.c.b);
        bzaVar.getBackground().invalidateSelf();
    }
}

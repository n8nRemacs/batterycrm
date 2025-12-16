package defpackage;

import android.content.Context;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes.dex */
public final class e41 extends ConstraintLayout {
    public final vs1 F0;
    public d41 G0;
    public final bwf H0;

    public e41(Context context) {
        super(context, null);
        this.H0 = new bwf(new o40(context, 6));
        setLayoutParams(new kt3(-1, -1));
        setBackgroundColor(a93.s0.B(this).c.b().l);
        setFocusable(true);
        setClickable(true);
        vs1 vs1Var = new vs1(context, 0);
        vs1Var.setId(eyc.call_user_full_avatar);
        vs1Var.setMode(rs1.b);
        this.F0 = vs1Var;
        new ViewStub(context).setId(eyc.call_recall);
        new ViewStub(context).setId(eyc.call_cancel);
        addView(vs1Var, -1, 0);
        ut3 ut3VarG = l5j.g(this);
        int id = vs1Var.getId();
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.a(this);
    }

    private final EnhancedAnimatedVectorDrawable getChatIcon() {
        return (EnhancedAnimatedVectorDrawable) this.H0.getValue();
    }

    public final void setClickListener(d41 d41Var) {
        this.G0 = d41Var;
    }

    public final void setName(CharSequence charSequence) {
        this.F0.setName(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.F0.setStatus(charSequence);
    }

    public final void v(boolean z) {
        EnhancedAnimatedVectorDrawable chatIcon = getChatIcon();
        int i = d3d.call_write_message;
        n5g n5gVar = new n5g(i);
        c41 c41Var = new c41(this, 1);
        vs1 vs1Var = this.F0;
        vs1Var.getClass();
        vs1Var.X(z, i, n5gVar, c41Var, new k(27, chatIcon));
    }
}

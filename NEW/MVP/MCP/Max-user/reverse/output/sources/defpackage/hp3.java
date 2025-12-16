package defpackage;

import android.widget.TextView;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class hp3 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;
    public int Z;
    public TextView d;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp3(ConfirmPhoneScreen confirmPhoneScreen, q44 q44Var) {
        super(q44Var);
        this.Y = confirmPhoneScreen;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        yy7[] yy7VarArr = ConfirmPhoneScreen.B0;
        return this.Y.z0(null, 0, false, this);
    }
}

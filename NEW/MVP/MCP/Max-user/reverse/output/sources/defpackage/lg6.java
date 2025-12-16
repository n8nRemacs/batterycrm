package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class lg6 extends dtf implements sm6 {
    public final /* synthetic */ muc X;
    public final /* synthetic */ ForwardPickerScreen Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg6(muc mucVar, ForwardPickerScreen forwardPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.X = mucVar;
        this.Y = forwardPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lg6 lg6Var = (lg6) l((vg6) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lg6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lg6 lg6Var = new lg6(this.X, this.Y, continuation);
        lg6Var.o = obj;
        return lg6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vg6 vg6Var = (vg6) this.o;
        qqg qqgVar = qqg.a;
        int i = 8;
        muc mucVar = this.X;
        if (vg6Var == null) {
            mucVar.setVisibility(8);
            return qqgVar;
        }
        yy7[] yy7VarArr = ForwardPickerScreen.I0;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        int i2 = 0;
        if (!((Collection) forwardPickerScreen.I0().Y.a.getValue()).isEmpty() && forwardPickerScreen.O0()) {
            i = 0;
        }
        mucVar.setVisibility(i);
        CharSequence charSequenceB = vg6Var.a.b(mucVar.getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        mucVar.setTitle(charSequenceB);
        mucVar.setAttachDescription(vg6Var.c);
        if (forwardPickerScreen.N0()) {
            mucVar.setStartIconDrawable(null);
            mucVar.setStartIconClickListener(null);
            return qqgVar;
        }
        if (!vg6Var.d) {
            return qqgVar;
        }
        if (mucVar.getVisibility() == 0) {
            ((cg6) forwardPickerScreen.I0().c).f();
        }
        mucVar.setStartIconDrawable(((cg6) forwardPickerScreen.I0().c).g());
        mucVar.setStartIconClickListener(new kg6(forwardPickerScreen, i2, mucVar));
        return qqgVar;
    }
}

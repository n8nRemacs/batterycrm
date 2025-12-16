package defpackage;

import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class jg6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ jg6(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        qqg qqgVar = qqg.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ForwardPickerScreen.I0;
                ((cg6) forwardPickerScreen.I0().c).r.E(0);
                return qqgVar;
            case 1:
                yy7[] yy7VarArr2 = ForwardPickerScreen.I0;
                return a93.s0.z(forwardPickerScreen.getContext()).c;
            case 2:
                return forwardPickerScreen.F0;
            case 3:
                yy7[] yy7VarArr3 = ForwardPickerScreen.I0;
                ik9 ik9Var = new ik9(forwardPickerScreen.getContext());
                ik9Var.setId(f1b.a);
                ik9Var.setInputHint(h1b.a);
                ik9Var.setRightOuterIconActionState(zj9.a);
                ik9Var.setRightOuterIconTouchListener(rmb.a(ik9Var.getContext(), new qn2(forwardPickerScreen, 18, ik9Var)));
                ik9Var.setLeftInnerIconTouchListener(rmb.a(ik9Var.getContext(), new jg6(forwardPickerScreen, i2)));
                return ik9Var;
            default:
                forwardPickerScreen.F0.k();
                return qqgVar;
        }
    }
}

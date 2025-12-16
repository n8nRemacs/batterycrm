package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class uj9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik9 b;

    public /* synthetic */ uj9(ik9 ik9Var, int i) {
        this.a = i;
        this.b = ik9Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ik9 ik9Var = this.b;
        switch (i) {
            case 0:
                return ik9.c(ik9Var);
            case 1:
                return r34.b(ik9Var.getContext(), yud.S0).mutate();
            case 2:
                return r34.b(ik9Var.getContext(), yud.d0).mutate();
            case 3:
                return r34.b(ik9Var.getContext(), yud.b0).mutate();
            case 4:
                return r34.b(ik9Var.getContext(), yud.O0).mutate();
            case 5:
                return ik9.b(ik9Var);
            case 6:
                return r34.b(ik9Var.getContext(), yud.m0).mutate();
            default:
                yy7[] yy7VarArr = MessageWriteWidget.L0;
                return Boolean.valueOf(ik9Var.d.getTag(v0d.text_change_is_programmatic_tag) != null);
        }
    }
}

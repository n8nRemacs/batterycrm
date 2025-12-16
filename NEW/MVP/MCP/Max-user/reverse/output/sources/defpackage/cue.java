package defpackage;

import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class cue implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ cue(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        qqg qqgVar = qqg.a;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ShareDataPickerScreen.I0;
                ((tte) shareDataPickerScreen.I0().c).m.E(0);
                return qqgVar;
            case 1:
                yy7[] yy7VarArr2 = ShareDataPickerScreen.I0;
                ik9 ik9Var = new ik9(shareDataPickerScreen.getContext());
                ik9Var.setId(wbb.d);
                ik9Var.setInputHint(xbb.e);
                ik9Var.setRightOuterIconActionState(zj9.a);
                ik9Var.setRightOuterIconTouchListener(rmb.a(ik9Var.getContext(), new l3b(shareDataPickerScreen, 28, ik9Var)));
                ik9Var.setLeftInnerIconTouchListener(rmb.a(ik9Var.getContext(), new cue(shareDataPickerScreen, i2)));
                return ik9Var;
            case 2:
                shareDataPickerScreen.E0.k();
                return qqgVar;
            default:
                return shareDataPickerScreen.E0;
        }
    }
}

package defpackage;

import android.view.View;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class hq5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FakeInAppReviewBottomSheet b;

    public /* synthetic */ hq5(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, int i) {
        this.a = i;
        this.b = fakeInAppReviewBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.b;
        switch (i) {
            case 0:
                fakeInAppReviewBottomSheet.K0 = false;
                uh7 uh7Var = (uh7) qh7.a.getAccessor().f();
                if (uh7Var != null) {
                    uh7Var.b(4);
                }
                fakeInAppReviewBottomSheet.E0(true);
                break;
            default:
                yy7[] yy7VarArr = FakeInAppReviewBottomSheet.L0;
                fakeInAppReviewBottomSheet.E0(true);
                break;
        }
    }
}

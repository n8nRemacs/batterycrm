package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class nq3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ nq3(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qq3 qq3Var;
        int i = this.a;
        int i2 = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) obj;
                yy7[] yy7VarArr = ConfirmationBottomSheet.L0;
                hs hsVar = confirmationBottomSheet.I0;
                yy7[] yy7VarArr2 = ConfirmationBottomSheet.L0;
                yy7 yy7Var = yy7VarArr2[5];
                if (!((Boolean) hsVar.a(confirmationBottomSheet)).booleanValue()) {
                    yy7 yy7Var2 = yy7VarArr2[5];
                    hsVar.b(confirmationBottomSheet, Boolean.TRUE);
                    Object targetController = confirmationBottomSheet.getTargetController();
                    qq3Var = targetController instanceof qq3 ? (qq3) targetController : null;
                    if (qq3Var != null) {
                        hs hsVar2 = confirmationBottomSheet.G0;
                        yy7 yy7Var3 = yy7VarArr2[4];
                        qq3Var.g(i2, (Bundle) hsVar2.a(confirmationBottomSheet));
                    }
                }
                confirmationBottomSheet.E0(true);
                break;
            case 1:
                ConfirmationBottomSheet confirmationBottomSheet2 = (ConfirmationBottomSheet) obj;
                yy7[] yy7VarArr3 = ConfirmationBottomSheet.L0;
                hs hsVar3 = confirmationBottomSheet2.I0;
                yy7[] yy7VarArr4 = ConfirmationBottomSheet.L0;
                yy7 yy7Var4 = yy7VarArr4[5];
                if (!((Boolean) hsVar3.a(confirmationBottomSheet2)).booleanValue()) {
                    yy7 yy7Var5 = yy7VarArr4[5];
                    hsVar3.b(confirmationBottomSheet2, Boolean.TRUE);
                    Object targetController2 = confirmationBottomSheet2.getTargetController();
                    qq3Var = targetController2 instanceof qq3 ? (qq3) targetController2 : null;
                    if (qq3Var != null) {
                        hs hsVar4 = confirmationBottomSheet2.G0;
                        yy7 yy7Var6 = yy7VarArr4[4];
                        qq3Var.g(i2, (Bundle) hsVar4.a(confirmationBottomSheet2));
                    }
                }
                confirmationBottomSheet2.E0(true);
                break;
            default:
                i8d i8dVar = (i8d) obj;
                i8dVar.F0 = i2;
                for (int i3 = 0; i3 < 5; i3++) {
                    ImageView imageView = (ImageView) i8dVar.getChildAt(i3);
                    if (i3 <= i2) {
                        imageView.setImageResource(k5b.b);
                    } else {
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(i8dVar.getContext(), k5b.c);
                        z18.f(enhancedVectorDrawable, "stroke", a93.s0.y(i8dVar).i().b.b);
                        imageView.setImageDrawable(enhancedVectorDrawable);
                    }
                }
                i8dVar.setContentDescription(i8dVar.getResources().getQuantityString(m5b.a, 5, Integer.valueOf(i8dVar.getSelected()), 5));
                h8d h8dVar = i8dVar.G0;
                if (h8dVar != null) {
                    int selected = i8dVar.getSelected();
                    nl nlVar = (nl) h8dVar;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) nlVar.b;
                    FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) nlVar.c;
                    FrameLayout frameLayout = (FrameLayout) nlVar.d;
                    yy7[] yy7VarArr5 = FakeInAppReviewBottomSheet.L0;
                    appCompatTextView.setPressed(false);
                    appCompatTextView.setBackground((RippleDrawable) fakeInAppReviewBottomSheet.I0.getValue());
                    appCompatTextView.setTextColor(-1);
                    f8j.d(appCompatTextView, 300L, new iq5(fakeInAppReviewBottomSheet, selected, frameLayout, 0));
                    break;
                }
                break;
        }
    }
}

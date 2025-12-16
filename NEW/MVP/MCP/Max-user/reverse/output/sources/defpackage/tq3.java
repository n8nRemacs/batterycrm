package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class tq3 extends LinearLayout implements u6g {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final LinkedHashMap d;
    public final /* synthetic */ ConfirmationBottomSheet o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0293  */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, tq3] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.view.View, one.me.sdk.uikit.common.button.OneMeButton] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tq3(one.me.sdk.bottomsheet.ConfirmationBottomSheet r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.util.ArrayList r22, java.lang.Integer r23, android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq3.<init>(one.me.sdk.bottomsheet.ConfirmationBottomSheet, java.lang.CharSequence, java.lang.CharSequence, java.util.ArrayList, java.lang.Integer, android.content.Context):void");
    }

    public final Map<View, pq3> getButtonViews() {
        return this.d;
    }

    public final TextView getDescriptionView() {
        return this.c;
    }

    public final ImageView getIconView() {
        return this.a;
    }

    public final TextView getTitleView() {
        return this.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i;
        ConfirmationBottomSheet confirmationBottomSheet = this.o;
        yeb yebVarC0 = confirmationBottomSheet.C0();
        if (yebVarC0 != null) {
            yebVar = yebVarC0;
        }
        ImageView imageView = this.a;
        if (imageView != null) {
            hs hsVar = confirmationBottomSheet.C0;
            yy7 yy7Var = ConfirmationBottomSheet.L0[0];
            ConfirmationBottomSheet.O0(imageView, (rq3) hsVar.a(confirmationBottomSheet));
        }
        this.b.setTextColor(yebVar.getText().e);
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(yebVar.getText().g);
        }
        for (Map.Entry entry : this.d.entrySet()) {
            View view = (View) entry.getKey();
            pq3 pq3Var = (pq3) entry.getValue();
            if (view instanceof OneMeButton) {
                ((OneMeButton) view).onThemeChanged(yebVar);
            } else if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                int i2 = pq3Var.X;
                if ((i2 == 1 || i2 == 3) && pq3Var.d) {
                    i = -1;
                } else {
                    int iV = az1.v(pq3Var.c);
                    if (iV == 0) {
                        i = yebVar.getText().b;
                    } else if (iV == 1) {
                        i = yebVar.getText().h;
                    } else if (iV == 2) {
                        i = yebVar.getText().e;
                    } else {
                        if (iV != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = yebVar.getText().j;
                    }
                }
                textView2.setTextColor(i);
            } else {
                continue;
            }
        }
    }
}

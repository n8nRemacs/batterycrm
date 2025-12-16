package defpackage;

import android.text.SpannableString;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class dn7 extends dtf implements um6 {
    public /* synthetic */ TextView X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ InputPhoneScreen Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn7(InputPhoneScreen inputPhoneScreen, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = inputPhoneScreen;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextView textView = (TextView) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                dn7 dn7Var = new dn7(this.Z, continuation, 0);
                dn7Var.X = textView;
                dn7Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                dn7Var.n(qqgVar);
                return qqgVar;
            default:
                dn7 dn7Var2 = new dn7(this.Z, continuation, 1);
                dn7Var2.X = textView;
                dn7Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                dn7Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                TextView textView = this.X;
                yeb yebVar = this.Y;
                InputPhoneScreen inputPhoneScreen = this.Z;
                yy7[] yy7VarArr = InputPhoneScreen.C0;
                boolean z = inputPhoneScreen.D0().A0;
                u3g text = yebVar.getText();
                textView.setTextColor(z ? text.b : text.i);
                break;
            default:
                g8j.b(obj);
                TextView textView2 = this.X;
                yeb yebVar2 = this.Y;
                textView2.setTextColor(yebVar2.getText().g);
                InputPhoneScreen inputPhoneScreen2 = this.Z;
                yy7[] yy7VarArr2 = InputPhoneScreen.C0;
                TextView textView3 = (TextView) inputPhoneScreen2.v0.D(inputPhoneScreen2, InputPhoneScreen.C0[5]);
                String strE = z7.e(inputPhoneScreen2.getContext(), t3d.oneme_login_welcome_terms);
                String strE2 = z7.e(inputPhoneScreen2.getContext(), t3d.oneme_login_welcome_privacy_policy_clickable_part);
                String strE3 = z7.e(inputPhoneScreen2.getContext(), t3d.oneme_login_welcome_user_agreement_clickable_part);
                SpannableString spannableString = new SpannableString(strE);
                InputPhoneScreen.E0(strE, strE2, spannableString, new in7(0, inputPhoneScreen2), yebVar2);
                InputPhoneScreen.E0(strE, strE3, spannableString, new in7(1, inputPhoneScreen2), yebVar2);
                textView3.setText(spannableString);
                break;
        }
        return qqg.a;
    }
}

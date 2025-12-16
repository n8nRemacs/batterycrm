package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class es7 extends dtf implements um6 {
    public /* synthetic */ yeb X;
    public final /* synthetic */ TextView Y;
    public /* synthetic */ ViewGroup Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es7(TextView textView, Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = textView;
        this.s0 = obj;
        this.t0 = obj2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) throws InterruptedException {
        switch (this.o) {
            case 0:
                TextView textView = this.Y;
                es7 es7Var = new es7(textView, (InviteFriendsToMaxBottomSheet) this.s0, (RLottieImageView) this.t0, (Continuation) obj3, 0);
                es7Var.Z = (fs7) obj;
                es7Var.X = (yeb) obj2;
                qqg qqgVar = qqg.a;
                es7Var.n(qqgVar);
                return qqgVar;
            default:
                TextView textView2 = this.Y;
                es7 es7Var2 = new es7(textView2, (TextView) this.s0, (Drawable) this.t0, (Continuation) obj3, 1);
                es7Var2.Z = (LinearLayout) obj;
                es7Var2.X = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                es7Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws InterruptedException {
        switch (this.o) {
            case 0:
                RLottieImageView rLottieImageView = (RLottieImageView) this.t0;
                g8j.b(obj);
                fs7 fs7Var = (fs7) this.Z;
                this.Y.setTextColor(this.X.getText().e);
                v1a v1aVar = a93.s0;
                v1aVar.x(fs7Var.getContext()).k();
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) this.s0;
                hs hsVar = inviteFriendsToMaxBottomSheet.K0;
                yy7 yy7Var = InviteFriendsToMaxBottomSheet.L0[1];
                if (!fni.a((String) hsVar.a(inviteFriendsToMaxBottomSheet), v1aVar.x(fs7Var.getContext()).k().getName())) {
                    ((ds7) inviteFriendsToMaxBottomSheet.I0.getValue()).t(inviteFriendsToMaxBottomSheet.P0(), false, inviteFriendsToMaxBottomSheet.H0);
                    inviteFriendsToMaxBottomSheet.O0(rLottieImageView, true);
                    rLottieImageView.playAnimation();
                }
                break;
            default:
                g8j.b(obj);
                LinearLayout linearLayout = (LinearLayout) this.Z;
                yeb yebVar = this.X;
                linearLayout.setBackgroundColor(yebVar.b().h);
                this.Y.setTextColor(yebVar.getText().e);
                ((TextView) this.s0).setTextColor(yebVar.getText().g);
                ((Drawable) this.t0).setTint(yebVar.getIcon().h);
                break;
        }
        return qqg.a;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.coroutines.Continuation;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.location.map.pick.PickLocationScreen;

/* loaded from: classes2.dex */
public final class jq5 extends dtf implements um6 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ View s0;
    public final /* synthetic */ View t0;
    public final /* synthetic */ Object u0;
    public final /* synthetic */ ViewGroup v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq5(Object obj, View view, View view2, Object obj2, ViewGroup viewGroup, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = obj;
        this.s0 = view;
        this.t0 = view2;
        this.u0 = obj2;
        this.v0 = viewGroup;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConstraintLayout constraintLayout = (ConstraintLayout) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                jq5 jq5Var = new jq5((FakeInAppReviewBottomSheet) this.Z, (AppCompatTextView) this.s0, (AppCompatTextView) this.t0, (AppCompatTextView) this.u0, (i8d) this.v0, continuation, 0);
                jq5Var.X = constraintLayout;
                jq5Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                jq5Var.n(qqgVar);
                return qqgVar;
            default:
                jq5 jq5Var2 = new jq5((yfb) this.Z, (q6b) this.s0, (SimpleDraweeView) this.t0, (PickLocationScreen) this.u0, (FrameLayout) this.v0, continuation, 1);
                jq5Var2.X = constraintLayout;
                jq5Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                jq5Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        ViewGroup viewGroup = this.v0;
        Object obj2 = this.u0;
        View view = this.t0;
        View view2 = this.s0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                g8j.b(obj);
                ConstraintLayout constraintLayout = this.X;
                yeb yebVar = this.Y;
                v1a v1aVar = a93.s0;
                boolean zL = v1aVar.x(constraintLayout.getContext()).l();
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj3;
                fakeInAppReviewBottomSheet.F0.getPaint().setColor(yebVar.i().b.b);
                fakeInAppReviewBottomSheet.H0.getPaint().setColor(zL ? -14860999 : -1969940);
                ((AppCompatTextView) view2).setTextColor(yebVar.getText().e);
                ((AppCompatTextView) view).setTextColor(yebVar.getText().i);
                ((AppCompatTextView) obj2).setTextColor(((i8d) viewGroup).getSelected() != 0 ? -1 : v1aVar.y(constraintLayout).getText().i);
                constraintLayout.invalidate();
                break;
            default:
                g8j.b(obj);
                ConstraintLayout constraintLayout2 = this.X;
                yeb yebVar2 = this.Y;
                v1a v1aVar2 = a93.s0;
                ((yfb) obj3).setBackgroundColor(v1aVar2.y(constraintLayout2).b().c);
                ((q6b) view2).c(v1aVar2.y(constraintLayout2));
                Context context = constraintLayout2.getContext();
                PickLocationScreen pickLocationScreen = (PickLocationScreen) obj2;
                yy7[] yy7VarArr = PickLocationScreen.v0;
                uo8.b((SimpleDraweeView) view, context, ((l5c) ((age) pickLocationScreen.u0.getValue())).n());
                Drawable background = ((FrameLayout) viewGroup).getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    pickLocationScreen.B0(gradientDrawable);
                }
                iw6 iw6Var = pickLocationScreen.s0;
                if (iw6Var != null) {
                    pickLocationScreen.C0(v1aVar2.y(constraintLayout2), iw6Var);
                }
                v1aVar2.x(constraintLayout2.getContext()).getClass();
                a93.g(constraintLayout2, yebVar2);
                break;
        }
        return qqgVar;
    }
}

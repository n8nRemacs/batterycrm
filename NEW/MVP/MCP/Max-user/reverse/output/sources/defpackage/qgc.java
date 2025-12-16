package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class qgc extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditScreen X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgc(ProfileEditScreen profileEditScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.X = profileEditScreen;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qgc qgcVar = (qgc) l((xec) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qgcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qgc qgcVar = new qgc(this.X, this.Y, continuation);
        qgcVar.o = obj;
        return qgcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xec xecVar = (xec) this.o;
        ProfileEditScreen profileEditScreen = this.X;
        sn0 sn0Var = profileEditScreen.w0;
        bbd bbdVar = profileEditScreen.t0;
        yy7[] yy7VarArr = ProfileEditScreen.x0;
        uxa uxaVar = (uxa) bbdVar.D(profileEditScreen, yy7VarArr[4]);
        String str = xecVar.a;
        boolean z = xecVar.e;
        Long l = new Long(xecVar.b);
        CharSequence charSequence = xecVar.d;
        if (charSequence == null) {
            charSequence = "";
        }
        uxa.n(uxaVar, str, l, charSequence);
        ((uxa) bbdVar.D(profileEditScreen, yy7VarArr[4])).setAddBadgeVisibility(xecVar.f);
        int iV = az1.v(xecVar.g);
        if (iV == 0) {
            if (!sn0Var.e()) {
                ((ViewGroup) this.Y).addView((View) sn0Var.getValue());
            }
            OneMeButton oneMeButton = (OneMeButton) sn0Var.getValue();
            oneMeButton.setVisibility(z ? 0 : 8);
            int iD = z ? (kti.d(12 * vw4.d().getDisplayMetrics().density) * 2) + oneMeButton.getMeasuredHeight() : 0;
            RecyclerView recyclerView = (RecyclerView) profileEditScreen.Y.D(profileEditScreen, yy7VarArr[1]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), iD);
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                profileEditScreen.y0().setRightActions(new ifb(new lgc(profileEditScreen, 4)));
            } else {
                profileEditScreen.y0().setRightActions(jfb.a);
            }
        }
        return qqg.a;
    }
}

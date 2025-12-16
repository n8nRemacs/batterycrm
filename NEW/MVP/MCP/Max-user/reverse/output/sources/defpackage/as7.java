package defpackage;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* loaded from: classes2.dex */
public final class as7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByQrBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as7(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.X = inviteByQrBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        as7 as7Var = (as7) l((xqc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        as7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        as7 as7Var = new as7(this.X, continuation);
        as7Var.o = obj;
        return as7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xqc xqcVar = (xqc) this.o;
        String name = InviteByQrBottomSheet.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "Show qr code in bottom sheet", null);
            }
        }
        InviteByQrBottomSheet inviteByQrBottomSheet = this.X;
        bbd bbdVar = inviteByQrBottomSheet.E0;
        yy7[] yy7VarArr = InviteByQrBottomSheet.O0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) bbdVar.D(inviteByQrBottomSheet, yy7VarArr[1]);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xqcVar.b.getWidth(), xqcVar.b.getHeight());
        layoutParams.gravity = 80;
        appCompatImageView.setLayoutParams(layoutParams);
        InviteByQrBottomSheet inviteByQrBottomSheet2 = this.X;
        ((AppCompatImageView) inviteByQrBottomSheet2.E0.D(inviteByQrBottomSheet2, yy7VarArr[1])).setImageBitmap(xqcVar.b);
        return qqg.a;
    }
}

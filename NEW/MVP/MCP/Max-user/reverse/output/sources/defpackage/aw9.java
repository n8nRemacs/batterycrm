package defpackage;

import android.os.Build;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class aw9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        aw9 aw9Var = (aw9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        aw9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aw9 aw9Var = new aw9(continuation, this.X);
        aw9Var.o = obj;
        return aw9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vd5 vd5Var = (vd5) this.o;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.X;
        messagesListWidget.C0().removeAllViews();
        tr0 tr0Var = null;
        if (vd5Var instanceof sd5) {
            sd5 sd5Var = (sd5) vd5Var;
            iv9 iv9Var = new iv9(messagesListWidget);
            tr0 tr0Var2 = new tr0(messagesListWidget.getContext());
            tr0Var2.setLinkListener(iv9Var);
            tr0Var2.setState(sd5Var);
            tr0Var2.setLayoutParams(new FrameLayout.LayoutParams(kti.d(272 * vw4.d().getDisplayMetrics().density), -2, 17));
            tr0Var2.setBackground(new ww6(tr0Var2.getContext()));
            tqi.c(new ld0((Object) sd5Var, (Continuation) null, 27, false), tr0Var2);
            tr0Var = tr0Var2;
        } else if (vd5Var instanceof td5) {
            yv4 yv4Var = new yv4(messagesListWidget.getContext());
            iv8 iv8Var = new iv8(12, messagesListWidget);
            yv4Var.b.setText(l7b.N);
            yv4Var.c.setText(l7b.M);
            fff fffVar = ((td5) vd5Var).a;
            if (fffVar != null) {
                yv4Var.d.a(fffVar, kti.d(144 * vw4.d().getDisplayMetrics().density));
            }
            yv4Var.a = iv8Var;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(262 * vw4.d().getDisplayMetrics().density), -2, 17);
            int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
            layoutParams.setMargins(iD, iD, iD, iD);
            yv4Var.setLayoutParams(layoutParams);
            boolean z = x4j.b(yv4Var.getContext()).b;
            tr0Var = yv4Var;
            if (z) {
                tr0Var = yv4Var;
                if (Build.VERSION.SDK_INT >= 30) {
                    messagesListWidget.Z0 = new yd5(yv4Var, messagesListWidget.requireView());
                    tr0Var = yv4Var;
                }
            }
        } else if (vd5Var instanceof ud5) {
            cyd cydVar = new cyd(messagesListWidget.getContext());
            cydVar.setState((ud5) vd5Var);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
            int iD2 = kti.d(32 * vw4.d().getDisplayMetrics().density);
            layoutParams2.setMargins(iD2, iD2, iD2, iD2);
            cydVar.setLayoutParams(layoutParams2);
            tr0Var = cydVar;
            if (x4j.b(messagesListWidget.getContext()).b) {
                tr0Var = cydVar;
                if (Build.VERSION.SDK_INT >= 30) {
                    messagesListWidget.Z0 = new yd5(cydVar, messagesListWidget.requireView());
                    tr0Var = cydVar;
                }
            }
        } else if (vd5Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (tr0Var != null) {
            mgb.a(tr0Var, new o6(tr0Var));
            messagesListWidget.C0().addView(tr0Var);
        }
        return qqg.a;
    }
}

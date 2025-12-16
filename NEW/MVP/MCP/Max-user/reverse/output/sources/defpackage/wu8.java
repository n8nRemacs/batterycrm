package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class wu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        wu8 wu8Var = (wu8) l((lp6) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wu8 wu8Var = new wu8(continuation, this.X);
        wu8Var.o = obj;
        return wu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Resources.NotFoundException {
        g8j.b(obj);
        lp6 lp6Var = (lp6) this.o;
        if (!(lp6Var instanceof fp6)) {
            boolean z = lp6Var instanceof gp6;
            MediaBarWidget mediaBarWidget = this.X;
            if (z) {
                yy7[] yy7VarArr = MediaBarWidget.c1;
                mu8 mu8VarN0 = mediaBarWidget.N0();
                mu8VarN0.y0.m(null, ((gp6) lp6Var).a);
            } else if (lp6Var instanceof hp6) {
                hp6 hp6Var = (hp6) lp6Var;
                pd8 pd8VarB = nqi.b(hp6Var.c);
                int i = hp6Var.a;
                String str = hp6Var.b;
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                mediaBarWidget.O0(pd8VarB, i, str);
            } else if (lp6Var instanceof jp6) {
                yy7[] yy7VarArr3 = MediaBarWidget.c1;
                p12 p12VarE0 = mediaBarWidget.E0();
                int i2 = ((jp6) lp6Var).a;
                p12VarE0.o = i2;
                p12VarE0.s0 = i2;
                ViewGroup.LayoutParams layoutParams = p12VarE0.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = i2;
                layoutParams.height = i2;
                p12VarE0.setLayoutParams(layoutParams);
            } else if (lp6Var instanceof kp6) {
                mediaBarWidget.D0 = ((kp6) lp6Var).a;
                MediaBarWidget.A0(mediaBarWidget);
            } else {
                if (!(lp6Var instanceof ip6)) {
                    throw new NoWhenBranchMatchedException();
                }
                MediaBarWidget.z0(mediaBarWidget, ((ip6) lp6Var).a);
            }
        }
        return qqg.a;
    }
}

package defpackage;

import java.io.IOException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class sg6 extends dtf implements sm6 {
    public final /* synthetic */ ForwardPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg6(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.X = forwardPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        sg6 sg6Var = (sg6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sg6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sg6 sg6Var = new sg6(continuation, this.X);
        sg6Var.o = obj;
        return sg6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        uh7 uh7Var;
        g8j.b(obj);
        hg6 hg6Var = (hg6) this.o;
        boolean z = hg6Var instanceof dg6;
        ForwardPickerScreen forwardPickerScreen = this.X;
        if (z) {
            dg6 dg6Var = (dg6) hg6Var;
            Long l = dg6Var.a;
            if (l != null) {
                long jLongValue = l.longValue();
                bsi.a(forwardPickerScreen);
                wf6 wf6Var = wf6.c;
                Long l2 = dg6Var.b;
                Set set = dg6Var.c;
                Long l3 = dg6Var.d;
                Boolean boolValueOf = Boolean.valueOf(dg6Var.e);
                ii4 ii4VarP0 = wf6Var.p0();
                hi4 hi4Var = new hi4();
                hi4Var.a = ":chats";
                hi4Var.c(Long.valueOf(jLongValue), "id");
                hi4Var.c("local", "type");
                hi4Var.c(Boolean.TRUE, "from_forward");
                if (l2 != null) {
                    hi4Var.c(Long.valueOf(l2.longValue()), "forward_cht_id");
                }
                if (set != null) {
                    hi4Var.c(ue3.N(set, ",", null, null, null, 62), "forward_msg_ids");
                }
                if (l3 != null) {
                    hi4Var.c(Long.valueOf(l3.longValue()), "forward_attach_id");
                }
                hi4Var.c(boolValueOf, "is_forward_attach");
                ii4VarP0.c(hi4Var.a(), null);
            } else {
                wf6.c.p0().d();
            }
            sf6 sf6Var = dg6Var.f;
            if (sf6Var != null && (uh7Var = (uh7) pf6.a.getAccessor().f()) != null) {
                uh7Var.f(sf6Var.a, sf6Var.b);
            }
        } else if (hg6Var instanceof gg6) {
            forwardPickerScreen.y0 = new yo3(15, forwardPickerScreen);
        } else if (hg6Var instanceof fg6) {
            yy7[] yy7VarArr = ForwardPickerScreen.I0;
            forwardPickerScreen.P0(true);
        } else {
            if (!(hg6Var instanceof eg6)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr2 = ForwardPickerScreen.I0;
            forwardPickerScreen.P0(false);
            jxb jxbVarI0 = forwardPickerScreen.I0();
            jxbVarI0.c.c();
            jxbVarI0.X.m(null, rd5.a);
        }
        return qqg.a;
    }
}

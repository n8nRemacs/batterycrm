package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class gv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gv2 gv2Var = (gv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gv2 gv2Var = new gv2(continuation, this.X);
        gv2Var.o = obj;
        return gv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        au8 au8Var = (au8) this.o;
        String name = ChatScreen.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "got mediaBarViewModel.upEvents " + au8Var + " " + this.X.lifecycleOwner.p().d + "," + this.X.getViewLifecycleOwner().p().d, null);
            }
        }
        if (fni.a(au8Var, vt8.a)) {
            MessageWriteWidget messageWriteWidgetW0 = this.X.W0();
            if (messageWriteWidgetW0 != null) {
                messageWriteWidgetW0.C0().setText(messageWriteWidgetW0.X.f.j);
            }
        } else if (fni.a(au8Var, ut8.a)) {
            MessageWriteWidget messageWriteWidgetW02 = this.X.W0();
            if (messageWriteWidgetW02 != null) {
                messageWriteWidgetW02.C0().setText(messageWriteWidgetW02.X.f.j);
            }
            this.X.T0().setVisibility(8);
            ChatScreen chatScreen = this.X;
            y09 y09Var = chatScreen.V0;
            if (y09Var != null && !y09Var.l) {
                chatScreen.K0();
            }
        } else if (fni.a(au8Var, wt8.a)) {
            xfh.r(this.X.X0().Z, vr9.a);
        } else if (au8Var instanceof zt8) {
            zx2 zx2VarG1 = this.X.g1();
            zt8 zt8Var = (zt8) au8Var;
            CharSequence charSequence = zt8Var.a;
            ArrayList arrayList = zt8Var.b;
            boolean z = zt8Var.c;
            Long lZ = this.X.V0().z();
            on9 on9VarY = this.X.V0().y();
            zx2VarG1.H(charSequence, arrayList, z, lZ, on9VarY != null ? on9VarY.a() : null);
        } else if (au8Var instanceof xt8) {
            zx2 zx2VarG12 = this.X.g1();
            Uri uri = ((xt8) au8Var).a;
            Long lZ2 = this.X.V0().z();
            on9 on9VarY2 = this.X.V0().y();
            zx2VarG12.F(uri, lZ2, on9VarY2 != null ? on9VarY2.a() : null);
        } else if (au8Var instanceof yt8) {
            zx2 zx2VarG13 = this.X.g1();
            yt8 yt8Var = (yt8) au8Var;
            cf8 cf8Var = yt8Var.a;
            float f = yt8Var.b;
            long j = yt8Var.c;
            Long lZ3 = this.X.V0().z();
            on9 on9VarY3 = this.X.V0().y();
            zx2VarG13.G(cf8Var, f, j, lZ3, on9VarY3 != null ? on9VarY3.a() : null);
        } else {
            if (!(au8Var instanceof tt8)) {
                throw new NoWhenBranchMatchedException();
            }
            tt8 tt8Var = (tt8) au8Var;
            this.X.g1().x(tt8Var.a, this.X.V0().x(), tt8Var.b, tt8Var.c);
            no9.F(this.X.V0(), null, null, null, 14);
        }
        return qqg.a;
    }
}

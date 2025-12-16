package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class qu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qu2 qu2Var = (qu2) l((yh5) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qu2 qu2Var = new qu2(continuation, this.X);
        qu2Var.o = obj;
        return qu2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        y09 y09Var;
        g8j.b(obj);
        yh5 yh5Var = (yh5) this.o;
        ChatScreen chatScreen = this.X;
        bbd bbdVar = chatScreen.U0;
        in9 in9Var = (in9) yh5Var.a;
        yy7[] yy7VarArr = ChatScreen.l1;
        int iV = az1.v(in9Var.a);
        if (iV != 0) {
            tr9 tr9Var = tr9.a;
            if (iV == 1) {
                pb2 pb2Var = (pb2) chatScreen.g1().a1.a.getValue();
                if (pb2Var != null) {
                    long j = pb2Var.a;
                    yy7[] yy7VarArr2 = ChatScreen.l1;
                    if (!((ytd) bbdVar.D(chatScreen, yy7VarArr2[15])).n()) {
                        ytd ytdVar = (ytd) bbdVar.D(chatScreen, yy7VarArr2[15]);
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(chatScreen.M0, j, false, 4, null);
                        mediaKeyboardWidget.d = chatScreen.a1;
                        ytdVar.S(l8j.a(mediaKeyboardWidget, null, null));
                    }
                    int i = xz7.a;
                    if (xz7.b(xz7.c)) {
                        xfh.r(chatScreen.X0().Z, tr9Var);
                    }
                    if (chatScreen.h1()) {
                        hfh.p(chatScreen.P0(), null);
                        hfh.p((f82) chatScreen.N0.D(chatScreen, yy7VarArr2[8]), null);
                        veh.u(chatScreen.P0(), null);
                    }
                    chatScreen.d1().a();
                    y09 y09Var2 = chatScreen.V0;
                    if (y09Var2 != null) {
                        y09Var2.f();
                    }
                }
            } else if (iV == 2) {
                y09 y09Var3 = chatScreen.V0;
                if (y09Var3 != null && y09Var3.l) {
                    xfh.r(chatScreen.X0().Z, tr9Var);
                }
                MessageWriteWidget messageWriteWidgetW0 = chatScreen.W0();
                if (messageWriteWidgetW0 != null) {
                    messageWriteWidgetW0.C0().e(true);
                }
                vpi.b(new g56(new d53(new ph0(xz7.f, 25), 9), new xu2(null, chatScreen), 1), chatScreen.getViewLifecycleScope());
            } else if (iV == 3 && (y09Var = chatScreen.V0) != null && y09Var.l) {
                xfh.r(chatScreen.X0().Z, tr9Var);
            }
        } else {
            y09 y09Var4 = chatScreen.V0;
            if (y09Var4 != null) {
                yy7[] yy7VarArr3 = y09.m;
                y09Var4.e(true);
            }
        }
        return qqg.a;
    }
}

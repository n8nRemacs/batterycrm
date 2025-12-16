package defpackage;

import java.io.IOException;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final class kr2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMembersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.X = chatMembersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        kr2 kr2Var = (kr2) l((sd9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kr2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kr2 kr2Var = new kr2(continuation, this.X);
        kr2Var.o = obj;
        return kr2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        sd9 sd9Var = (sd9) this.o;
        if (sd9Var instanceof od9) {
            kkc.c.Q0(((od9) sd9Var).a);
        } else {
            boolean z = sd9Var instanceof md9;
            ChatMembersScreen chatMembersScreen = this.X;
            if (z) {
                md9 md9Var = (md9) sd9Var;
                int i = md9Var.a;
                long j = md9Var.b;
                yy7[] yy7VarArr = ChatMembersScreen.t0;
                if (i == v8b.w0) {
                    td9 td9VarA0 = chatMembersScreen.A0();
                    td9VarA0.Y.m(null, Collections.singleton(Long.valueOf(j)));
                } else if (i == v8b.v0 || i == v8b.u0) {
                    vr2 vr2VarZ0 = chatMembersScreen.z0();
                    xfh.o(vr2VarZ0, ((q2b) ((lzf) vr2VarZ0.X.getValue())).b(), new rr2(vr2VarZ0, j, null), 2);
                }
            } else if (sd9Var instanceof pd9) {
                int i2 = ((pd9) sd9Var).a;
                if (i2 == v8b.z0) {
                    kkc kkcVar = kkc.c;
                    yy7[] yy7VarArr2 = ChatMembersScreen.t0;
                    kkcVar.L0(chatMembersScreen.y0(), true);
                } else if (i2 == v8b.y0) {
                    kkc kkcVar2 = kkc.c;
                    yy7[] yy7VarArr3 = ChatMembersScreen.t0;
                    kkcVar2.L0(chatMembersScreen.y0(), false);
                } else if (i2 == v8b.I0) {
                    kkc kkcVar3 = kkc.c;
                    yy7[] yy7VarArr4 = ChatMembersScreen.t0;
                    kkcVar3.O0(chatMembersScreen.y0());
                }
            } else if (sd9Var instanceof qd9) {
                kkc.c.Q0(((qd9) sd9Var).a);
            } else if (sd9Var instanceof rd9) {
                ccb ccbVar = new ccb(chatMembersScreen);
                ccbVar.h(z7.e(chatMembersScreen.getContext(), mvd.H1));
                ccbVar.i();
            } else if (!(sd9Var instanceof nd9)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qqg.a;
    }
}

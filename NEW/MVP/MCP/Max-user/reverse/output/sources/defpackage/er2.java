package defpackage;

import java.io.IOException;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* loaded from: classes2.dex */
public final class er2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMembersCompactWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er2(ChatMembersCompactWidget chatMembersCompactWidget, Continuation continuation) {
        super(2, continuation);
        this.X = chatMembersCompactWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        er2 er2Var = (er2) l((sd9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        er2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        er2 er2Var = new er2(this.X, continuation);
        er2Var.o = obj;
        return er2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        sd9 sd9Var = (sd9) this.o;
        if (sd9Var instanceof od9) {
            kkc.c.Q0(((od9) sd9Var).a);
        } else {
            boolean z = sd9Var instanceof md9;
            ChatMembersCompactWidget chatMembersCompactWidget = this.X;
            if (z) {
                md9 md9Var = (md9) sd9Var;
                int i = md9Var.a;
                long j = md9Var.b;
                yy7[] yy7VarArr = ChatMembersCompactWidget.Y;
                if (i == v8b.w0) {
                    td9 td9VarA0 = chatMembersCompactWidget.A0();
                    td9VarA0.Y.m(null, Collections.singleton(Long.valueOf(j)));
                } else if (i == v8b.v0) {
                    vr2 vr2VarZ0 = chatMembersCompactWidget.z0();
                    xfh.o(vr2VarZ0, ((q2b) ((lzf) vr2VarZ0.X.getValue())).b(), new rr2(vr2VarZ0, j, null), 2);
                }
            } else if (sd9Var instanceof pd9) {
                int i2 = ((pd9) sd9Var).a;
                if (i2 == v8b.z0) {
                    kkc kkcVar = kkc.c;
                    yy7[] yy7VarArr2 = ChatMembersCompactWidget.Y;
                    kkcVar.L0(chatMembersCompactWidget.y0(), true);
                } else if (i2 == v8b.y0) {
                    kkc kkcVar2 = kkc.c;
                    yy7[] yy7VarArr3 = ChatMembersCompactWidget.Y;
                    kkcVar2.L0(chatMembersCompactWidget.y0(), false);
                } else if (i2 == v8b.I0) {
                    kkc kkcVar3 = kkc.c;
                    yy7[] yy7VarArr4 = ChatMembersCompactWidget.Y;
                    kkcVar3.O0(chatMembersCompactWidget.y0());
                } else if (i2 == v8b.d1) {
                    kkc kkcVar4 = kkc.c;
                    yy7[] yy7VarArr5 = ChatMembersCompactWidget.Y;
                    kkcVar4.P0(chatMembersCompactWidget.y0(), "MEMBER");
                }
            } else if (sd9Var instanceof qd9) {
                kkc.c.Q0(((qd9) sd9Var).a);
            } else if (sd9Var instanceof rd9) {
                ccb ccbVar = new ccb(chatMembersCompactWidget);
                ccbVar.h(z7.e(chatMembersCompactWidget.getContext(), mvd.H1));
                ccbVar.i();
            } else if (!(sd9Var instanceof nd9)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qqg.a;
    }
}

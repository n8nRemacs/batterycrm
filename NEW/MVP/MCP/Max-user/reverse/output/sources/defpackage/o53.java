package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final class o53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ View Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o53(ChatsListWidget chatsListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.X = chatsListWidget;
        this.Y = j;
        this.Z = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o53) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o53(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        long j = this.Y;
        ChatsListWidget chatsListWidget = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = ChatsListWidget.L0;
            zy3 zy3Var = (zy3) chatsListWidget.Y.getValue();
            this.o = 1;
            obj = svi.i(((q2b) zy3Var.c).a(), new qy3(zy3Var, j, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        List list = (List) (((List) obj).isEmpty() ? null : obj);
        if (list != null) {
            Long l = new Long(j);
            yy7[] yy7VarArr2 = ChatsListWidget.L0;
            hs hsVar = chatsListWidget.d;
            yy7 yy7Var = ChatsListWidget.L0[1];
            hsVar.b(chatsListWidget, l);
            y34 y34VarB = h6j.a(2).o(list).B(this.Z);
            ChatsListWidget.y0(chatsListWidget, y34VarB);
            y34VarB.build().u(chatsListWidget);
        }
        return qqg.a;
    }
}

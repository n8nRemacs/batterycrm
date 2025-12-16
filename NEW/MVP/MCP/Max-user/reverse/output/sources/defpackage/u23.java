package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final class u23 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListSearchScreen X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ View Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u23(ChatsListSearchScreen chatsListSearchScreen, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.X = chatsListSearchScreen;
        this.Y = j;
        this.Z = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u23) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u23(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        long j = this.Y;
        ChatsListSearchScreen chatsListSearchScreen = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = ChatsListSearchScreen.I0;
            b43 b43VarZ0 = chatsListSearchScreen.z0();
            this.o = 1;
            obj = svi.i(((q2b) b43VarZ0.Y).a(), new b33(b43VarZ0, j, null), this);
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
        Long l = new Long(j);
        yy7[] yy7VarArr2 = ChatsListSearchScreen.I0;
        hs hsVar = chatsListSearchScreen.d;
        yy7 yy7Var = ChatsListSearchScreen.I0[0];
        hsVar.b(chatsListSearchScreen, l);
        float f = 6;
        h6j.a(2).o((List) obj).B(this.Z).h(new Rect(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0), vw4.d().getDisplayMetrics().density * 12.0f).build().u(chatsListSearchScreen);
        return qqg.a;
    }
}

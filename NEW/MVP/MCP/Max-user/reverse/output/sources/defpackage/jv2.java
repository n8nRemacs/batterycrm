package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class jv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jv2 jv2Var = (jv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jv2 jv2Var = new jv2(continuation, this.X);
        jv2Var.o = obj;
        return jv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zn9 zn9Var = (zn9) this.o;
        yy7[] yy7VarArr = ChatScreen.l1;
        boolean z = zn9Var instanceof vn9;
        ChatScreen chatScreen = this.X;
        if (z) {
            chatScreen.g1().w();
            zx2 zx2VarG1 = chatScreen.g1();
            vf6 vf6Var = ((vn9) zn9Var).a;
            pb2 pb2Var = (pb2) zx2VarG1.a1.a.getValue();
            if (pb2Var != null) {
                xfh.o(zx2VarG1, ((q2b) zx2VarG1.y()).b(), new sw2(pb2Var.a, zx2VarG1, vf6Var, null), 2);
            }
        } else if (zn9Var instanceof wn9) {
            zx2 zx2VarG12 = chatScreen.g1();
            Uri uri = ((wn9) zn9Var).a;
            Long lZ = chatScreen.V0().z();
            zx2VarG12.I(svi.d(zx2VarG12.a, ((q2b) zx2VarG12.y()).b(), i84.b, new fx2(zx2VarG12, uri, lZ, null)));
        } else if (zn9Var instanceof xn9) {
            ((xn9) zn9Var).getClass();
            chatScreen.j1(true);
        } else if (fni.a(zn9Var, yn9.a)) {
            chatScreen.k1();
        } else {
            if (!(zn9Var instanceof un9)) {
                throw new NoWhenBranchMatchedException();
            }
            zx2 zx2VarG13 = chatScreen.g1();
            CharSequence charSequence = ((un9) zn9Var).a;
            Long lX = chatScreen.V0().x();
            yy7[] yy7VarArr2 = zx2.h1;
            zx2VarG13.x(charSequence, lX, null, false);
            no9.F(chatScreen.V0(), null, null, null, 14);
        }
        return qqg.a;
    }
}

package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class ez2 extends dtf implements sm6 {
    public final /* synthetic */ ChatTitleIconScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.X = chatTitleIconScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ez2 ez2Var = (ez2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ez2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ez2 ez2Var = new ez2(continuation, this.X);
        ez2Var.o = obj;
        return ez2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof ty2;
        ChatTitleIconScreen chatTitleIconScreen = this.X;
        if (z) {
            api.c(chatTitleIconScreen);
            ty2 ty2Var = (ty2) cdaVar;
            c39.c.L0(ty2Var.b, ty2Var.c);
        } else if (cdaVar instanceof xy2) {
            api.c(chatTitleIconScreen);
            try {
                chatTitleIconScreen.startActivityForResult(((xy2) cdaVar).b, 777);
                gda.g((gda) chatTitleIconScreen.Z.getValue(), f1e.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                yy7[] yy7VarArr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.C0().x();
                wqi.e(ChatTitleIconScreen.class.getName(), "failed open camera", null);
            }
        } else {
            int i = 0;
            if (cdaVar instanceof wy2) {
                yy7[] yy7VarArr2 = ChatTitleIconScreen.z0;
                chatTitleIconScreen.A0().setProgressEnabled(false);
                uaf.c.N0(new fz2(chatTitleIconScreen, cdaVar, i));
            } else {
                int i2 = 1;
                if (cdaVar instanceof vy2) {
                    yy7[] yy7VarArr3 = ChatTitleIconScreen.z0;
                    chatTitleIconScreen.A0().setProgressEnabled(false);
                    uaf.c.N0(new fz2(chatTitleIconScreen, cdaVar, i2));
                } else if (cdaVar instanceof uy2) {
                    yy7[] yy7VarArr4 = ChatTitleIconScreen.z0;
                    chatTitleIconScreen.A0().setProgressEnabled(false);
                    uaf.c.N0(new fz2(chatTitleIconScreen, cdaVar, 2));
                } else if (fni.a(cdaVar, yy2.b)) {
                    yy7[] yy7VarArr5 = ChatTitleIconScreen.z0;
                    qsb qsbVar = (qsb) chatTitleIconScreen.Y.getValue();
                    s2i s2iVar = new s2i(chatTitleIconScreen, 1);
                    qsbVar.getClass();
                    qsb.f(qsbVar, s2iVar, qsb.m, 158, false, i4d.permissions_camera_request_photo, pab.a, 0, null, new ffb(6, s2iVar), 64);
                }
            }
        }
        return qqg.a;
    }
}

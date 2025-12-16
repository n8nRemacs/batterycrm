package defpackage;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class um7 extends dtf implements sm6 {
    public final /* synthetic */ InputNameScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um7(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.X = inputNameScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        um7 um7Var = (um7) l((pm7) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        um7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        um7 um7Var = new um7(continuation, this.X);
        um7Var.o = obj;
        return um7Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pm7 pm7Var = (pm7) this.o;
        if (pm7Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        InputNameScreen inputNameScreen = this.X;
        api.c(inputNameScreen);
        yy7[] yy7VarArr = InputNameScreen.A0;
        jp7 jp7Var = (jp7) inputNameScreen.Z.getValue();
        njd njdVar = pm7Var.b;
        Object objA = yvi.a(inputNameScreen.getArgs(), "screen:input_name:avatars", o8c.class);
        if (objA == null) {
            throw new IllegalArgumentException(ho7.i("No value passed for key screen:input_name:avatars of type ", o8c.class.getSimpleName(), " in bundle").toString());
        }
        jp7Var.getClass();
        jp7Var.b(l8j.a(new NeuroAvatarsScreen(njdVar, (o8c) ((Parcelable) objA)), null, null), "InputNameScreen");
        return qqg.a;
    }
}

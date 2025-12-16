package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class wwa extends dtf implements sm6 {
    public final /* synthetic */ v3b X;
    public final /* synthetic */ OneMeApplication Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwa(v3b v3bVar, OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.X = v3bVar;
        this.Y = oneMeApplication;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wwa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wwa(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqg.a;
        }
        g8j.b(obj);
        ts9 ts9Var = new ts9(1, OneMeApplication.s0, rwa.class, "isChromaAndDynamicFontApplicableFor", "isChromaAndDynamicFontApplicableFor(Landroid/app/Activity;)Z", 0, 5);
        this.o = 1;
        this.X.a(this.Y, ts9Var, this);
        return g84.a;
    }
}

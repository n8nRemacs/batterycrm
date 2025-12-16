package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c6b extends dtf implements sm6 {
    public final /* synthetic */ dh4 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6b(dh4 dh4Var, Continuation continuation) {
        super(2, continuation);
        this.X = dh4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((c6b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c6b(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            throw new KotlinNothingValueException();
        }
        g8j.b(obj);
        this.o = 1;
        dh4.a(this.X, this);
        return g84.a;
    }
}

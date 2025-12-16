package defpackage;

import java.lang.Thread;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o4b extends dtf implements sm6 {
    public final /* synthetic */ Throwable X;
    public final /* synthetic */ x4b Y;
    public final /* synthetic */ Thread.UncaughtExceptionHandler Z;
    public int o;
    public final /* synthetic */ Thread s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4b(Throwable th, x4b x4bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Continuation continuation) {
        super(2, continuation);
        this.X = th;
        this.Y = x4bVar;
        this.Z = uncaughtExceptionHandler;
        this.s0 = thread;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o4b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o4b(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Throwable th = this.X;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                l6b.f(l6bVar, lg8.Z, "APP_CRASH", "!!! APP_CRASH !!!", null, th, 8);
            }
            x4b x4bVar = this.Y;
            this.o = 1;
            if (x4bVar.d(this) == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.Z;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(this.s0, th);
        }
        return qqg.a;
    }
}

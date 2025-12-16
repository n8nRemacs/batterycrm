package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lr0 extends dtf implements sm6 {
    public long X;
    public int Y;
    public final /* synthetic */ rr0 Z;
    public rr0 o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(rr0 rr0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = rr0Var;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lr0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lr0(this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        rr0 rr0Var;
        long j;
        int i = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                rr0Var = this.Z;
                long j2 = this.s0;
                try {
                    kr0 kr0Var = new kr0(rr0Var, j2, 0);
                    this.o = rr0Var;
                    this.X = j2;
                    this.Y = 1;
                    Object objI = vmi.i(bd5.a, kr0Var, this);
                    g84 g84Var = g84.a;
                    return objI == g84Var ? g84Var : objI;
                } catch (Throwable th) {
                    th = th;
                    j = j2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.X;
                rr0Var = this.o;
                try {
                    g8j.b(obj);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            wqi.p(rr0Var.c, "deleteBotCommandsForChat: exception when delete botCommands for, chatId = " + j, th);
            return qqg.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class op2 extends dtf implements um6 {
    public int X;
    public /* synthetic */ z26 Y;
    public /* synthetic */ Throwable Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z26 z26Var = (z26) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                op2 op2Var = new op2(3, continuation, 0);
                op2Var.Y = z26Var;
                op2Var.Z = th;
                return op2Var.n(qqg.a);
            case 1:
                op2 op2Var2 = new op2(3, continuation, 1);
                op2Var2.Y = z26Var;
                op2Var2.Z = th;
                return op2Var2.n(qqg.a);
            case 2:
                op2 op2Var3 = new op2(3, continuation, 2);
                op2Var3.Y = z26Var;
                op2Var3.Z = th;
                return op2Var3.n(qqg.a);
            case 3:
                op2 op2Var4 = new op2(3, continuation, 3);
                op2Var4.Y = z26Var;
                op2Var4.Z = th;
                return op2Var4.n(qqg.a);
            case 4:
                op2 op2Var5 = new op2(3, continuation, 4);
                op2Var5.Y = z26Var;
                op2Var5.Z = th;
                return op2Var5.n(qqg.a);
            default:
                op2 op2Var6 = new op2(3, continuation, 5);
                op2Var6.Y = z26Var;
                op2Var6.Z = th;
                return op2Var6.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        w4i w4iVar = w4i.d;
        hd5 hd5Var = hd5.a;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        switch (i) {
            case 0:
                int i2 = this.X;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var = this.Y;
                Throwable th = this.Z;
                if (th instanceof CancellationException) {
                    throw th;
                }
                wqi.e(z26Var.getClass().getName(), "fail to download", th);
                this.Y = null;
                this.X = 1;
                return z26Var.a(w4iVar, this) == g84Var ? g84Var : qqgVar;
            case 1:
                int i3 = this.X;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var2 = this.Y;
                Throwable th2 = this.Z;
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                wqi.e(z26Var2.getClass().getName(), "fail to download", th2);
                this.Y = null;
                this.X = 1;
                return z26Var2.a(w4iVar, this) == g84Var ? g84Var : qqgVar;
            case 2:
                int i4 = this.X;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var3 = this.Y;
                Throwable th3 = this.Z;
                if (!(th3 instanceof TimeoutCancellationException)) {
                    throw th3;
                }
                kpd kpdVar = new kpd(new ipd(th3));
                this.Y = null;
                this.X = 1;
                return z26Var3.a(kpdVar, this) == g84Var ? g84Var : qqgVar;
            case 3:
                int i5 = this.X;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var4 = this.Y;
                wqi.e(p5e.g, "search local chats exception", this.Z);
                y6e y6eVar = new y6e(hd5Var, qqgVar);
                this.Y = null;
                this.X = 1;
                return z26Var4.a(y6eVar, this) == g84Var ? g84Var : qqgVar;
            case 4:
                int i6 = this.X;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var5 = this.Y;
                Throwable th4 = this.Z;
                if (!(th4 instanceof TimeoutException)) {
                    wqi.e("h6e", "search server messages exception", th4);
                }
                y6e y6eVar2 = new y6e(hd5Var, null);
                this.Y = null;
                this.X = 1;
                return z26Var5.a(y6eVar2, this) == g84Var ? g84Var : qqgVar;
            default:
                int i7 = this.X;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                    return qqgVar;
                }
                g8j.b(obj);
                z26 z26Var6 = this.Y;
                Throwable th5 = this.Z;
                if (!(th5 instanceof TimeoutException)) {
                    wqi.e("s6e", "public search exception", th5);
                }
                y6e y6eVar3 = new y6e(hd5Var, new Long(0L));
                this.Y = null;
                this.X = 1;
                return z26Var6.a(y6eVar3, this) == g84Var ? g84Var : qqgVar;
        }
    }
}

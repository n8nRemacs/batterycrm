package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.Continuation;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes2.dex */
public final class q7a extends dtf implements sm6 {
    public final /* synthetic */ b8a X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7a(b8a b8aVar, Continuation continuation) {
        super(2, continuation);
        this.X = b8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q7a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q7a(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        h79 h79Var;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            long j = b8a.S0;
            this.o = 1;
            Object objD = s8j.d(j, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        int i2 = b8a.U0;
        b8a b8aVar = this.X;
        Context context = b8aVar.a;
        px8 px8Var = b8aVar.w0;
        if (px8Var == null || !px8Var.c.isConnected()) {
            wqi.c("b8a", "connect", new Object[0]);
            b8aVar.i(true);
            tje tjeVar = new tje(context, new ComponentName(context, (Class<?>) OneMeMediaSessionService.class));
            Bundle bundle = Bundle.EMPTY;
            Looper looperZ = zxg.z();
            ukd ukdVar = new ukd(25, b8aVar);
            yx8 yx8Var = new yx8(looperZ);
            if (tjeVar.a.d()) {
                h79Var = new h79(6, new ue4(context));
            } else {
                h79Var = null;
            }
            zxg.a0(new Handler(looperZ), new mx8(yx8Var, new px8(context, tjeVar, bundle, ukdVar, looperZ, yx8Var, h79Var), 0));
            yx8Var.d(new k79(b8aVar, 10, yx8Var), z7.d(context));
        } else {
            wqi.c("b8a", "connect request rejected, already connected", new Object[0]);
            b8a.g(b8aVar);
            b8aVar.t();
        }
        return qqg.a;
    }
}

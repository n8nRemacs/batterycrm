package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class nxf extends dtf implements sm6 {
    public final /* synthetic */ vxf X;
    public final /* synthetic */ SystemServicesManager$PushTokenGeneratedListener Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxf(vxf vxfVar, SystemServicesManager$PushTokenGeneratedListener systemServicesManager$PushTokenGeneratedListener, Continuation continuation) {
        super(2, continuation);
        this.X = vxfVar;
        this.Y = systemServicesManager$PushTokenGeneratedListener;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nxf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nxf(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objF = this.X.f(this.Y, this);
            g84 g84Var = g84.a;
            if (objF == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}

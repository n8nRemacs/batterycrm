package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c78 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ s78 Y;
    public final /* synthetic */ Uri Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c78(s78 s78Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = s78Var;
        this.Z = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c78) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c78 c78Var = new c78(this.Y, this.Z, continuation);
        c78Var.X = obj;
        return c78Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws NumberFormatException {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sac sacVar = (sac) this.X;
            this.o = 1;
            Object objA = s78.a(this.Y, sacVar, this.Z, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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

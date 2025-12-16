package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvh(uvh uvhVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kvh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kvh(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        uvh uvhVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = uvh.o1;
            w63 w63Var = (w63) uvhVar.v0.getValue();
            long j = uvhVar.b;
            this.o = 1;
            obj = w63Var.p(j, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(uvhVar.Z0, new guh(Uri.parse(this.Y).buildUpon().appendQueryParameter("webappChatId", String.valueOf(((pb2) obj).a)).build()));
        return qqg.a;
    }
}

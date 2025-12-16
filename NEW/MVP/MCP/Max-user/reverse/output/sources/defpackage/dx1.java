package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class dx1 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(String str, Continuation continuation) {
        super(2, continuation);
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dx1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dx1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        df7 df7VarE = zk6.e();
        this.o = 1;
        Object objA = ebj.a(df7VarE, sf7.d(Uri.parse(this.X)).a(), BuildConfig.MAX_TIME_TO_UPLOAD, null, true, (28 & 16) == 0, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class ntf extends dtf implements wm6 {
    public /* synthetic */ Throwable X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntf(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.o = i;
        this.Y = obj;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.o;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                ntf ntfVar = new ntf((ytf) this.Y, continuation, 0);
                ntfVar.X = th;
                return ntfVar.n(qqg.a);
            default:
                ntf ntfVar2 = new ntf((duf) this.Y, continuation, 1);
                ntfVar2.X = th;
                return ntfVar2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                if (this.X instanceof HttpUrlExpiredException) {
                    String str = ((ytf) this.Y).b;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.X;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "Got error about expired URL, retry upload", null);
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                g8j.b(obj);
                Throwable th = this.X;
                return Boolean.valueOf((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b));
        }
    }
}

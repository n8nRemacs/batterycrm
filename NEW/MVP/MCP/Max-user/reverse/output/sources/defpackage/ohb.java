package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ohb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ phb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohb(phb phbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = phbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ohb) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ohb ohbVar = new ohb(this.Y, continuation);
        ohbVar.X = obj;
        return ohbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lg8 lg8Var = lg8.d;
        g84 g84Var = g84.a;
        ?? r2 = this.o;
        ?? r5 = 1;
        try {
            try {
                if (r2 == 0) {
                    g8j.b(obj);
                    sac sacVar = (sac) this.X;
                    phb phbVar = this.Y;
                    String str = phbVar.d;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null && l6bVar.b(lg8Var)) {
                        String path = phbVar.f.getPath();
                        long j = phbVar.g;
                        os3 os3VarA = phbVar.c.a();
                        StringBuilder sbQ = xrf.q("Uploading file=", j, path, " with size=");
                        sbQ.append(" on network=");
                        sbQ.append(os3VarA);
                        l6bVar.c(lg8Var, str, sbQ.toString(), null);
                    }
                    this.Y.h = System.currentTimeMillis();
                    lwf lwfVar = zvg.a;
                    phb phbVar2 = this.Y;
                    ExecutorService executorService = phbVar2.a;
                    Uri uri = phbVar2.e;
                    File file = phbVar2.f;
                    String str2 = phbVar2.b;
                    Future<?> futureSubmit = executorService.submit(new u02(file, new h79(this.Y, 29, sacVar), uri, (str2 == null || str2.length() == 0) ? String.valueOf(phbVar2.f.getName().hashCode()) : Uri.encode(str2), 21));
                    this.X = futureSubmit;
                    this.o = 1;
                    r2 = futureSubmit;
                    if (e6j.a(sacVar, new zfb(23), this) == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (r2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Future future = (Future) this.X;
                    g8j.b(obj);
                    r2 = future;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                phb phbVar3 = this.Y;
                r5 = jCurrentTimeMillis - phbVar3.h;
                String str3 = phbVar3.d;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    int i = s65.d;
                    l6bVar2.c(lg8Var, str3, "FileUploadOperation worked for ".concat(s65.n(v9j.i(r5, y65.MILLISECONDS))), null);
                }
                return qqg.a;
            } catch (CancellationException e) {
                r2.cancel(r5);
                throw e;
            }
        } finally {
        }
    }
}

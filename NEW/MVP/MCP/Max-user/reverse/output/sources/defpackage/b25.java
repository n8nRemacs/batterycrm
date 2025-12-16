package defpackage;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class b25 extends dtf implements sm6 {
    public final /* synthetic */ DownloadFileFromWebAppWorker X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b25(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(2, continuation);
        this.X = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b25) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b25(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws NoSuchAlgorithmException {
        int i = this.o;
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            ur3 ur3Var = (ur3) downloadFileFromWebAppWorker.s0.getValue();
            this.o = 1;
            l42 l42Var = new l42(1, hni.f(this));
            l42Var.o();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (ur3Var.f() && atomicBoolean.compareAndSet(false, true)) {
                l42Var.resumeWith(qqg.a);
            } else {
                wr3 wr3Var = new wr3(ur3Var, l42Var, atomicBoolean);
                wqi.c(ur3Var.getClass().getName(), "Network connection lost, waiting network.", new Object[0]);
                ur3Var.c(wr3Var);
                l42Var.e(new hu1(ur3Var, 3, wr3Var));
            }
            if (l42Var.n() != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        ctf ctfVar = (ctf) downloadFileFromWebAppWorker.o.getValue();
        String str = downloadFileFromWebAppWorker.b().c;
        File file = downloadFileFromWebAppWorker.x0;
        if (file == null) {
            file = null;
        }
        e25 e25Var = downloadFileFromWebAppWorker.y0;
        this.o = 2;
        Object objB = ctfVar.a.b(str, file, e25Var, null, true, "", this);
        return objB == g84Var ? g84Var : objB;
    }
}

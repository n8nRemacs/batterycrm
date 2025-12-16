package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class i05 extends dtf implements sm6 {
    public final /* synthetic */ DownloadAttachesWorker X;
    public final /* synthetic */ w10 Y;
    public final /* synthetic */ w10 Z;
    public int o;
    public final /* synthetic */ si9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i05(DownloadAttachesWorker downloadAttachesWorker, w10 w10Var, w10 w10Var2, si9 si9Var, Continuation continuation) {
        super(2, continuation);
        this.X = downloadAttachesWorker;
        this.Y = w10Var;
        this.Z = w10Var2;
        this.s0 = si9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((i05) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new i05(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.X.C0++;
            DownloadAttachesWorker downloadAttachesWorker = this.X;
            this.o = 1;
            if (downloadAttachesWorker.updateForeground(this) != g84Var) {
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
        DownloadAttachesWorker downloadAttachesWorker2 = this.X;
        w10 w10Var = this.Y;
        w10 w10Var2 = this.Z;
        si9 si9Var = this.s0;
        this.o = 2;
        v10 v10Var = w10Var.d;
        Object objA = v10Var == null ? la8.a() : (v10Var.a != 0 || w10Var2 == null) ? downloadAttachesWorker2.e(w10Var, si9Var, this) : downloadAttachesWorker2.g(w10Var2, si9Var, this);
        return objA == g84Var ? g84Var : objA;
    }
}

package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class dvh extends dtf implements sm6 {
    public final /* synthetic */ oph X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ uvh o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvh(uvh uvhVar, oph ophVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = uvhVar;
        this.X = ophVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dvh dvhVar = (dvh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dvhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dvh(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        uvh uvhVar = this.o;
        dv5 dv5Var = (dv5) uvhVar.x0.getValue();
        long j = uvhVar.b;
        oph ophVar = this.X;
        String str = ophVar.d;
        String str2 = ophVar.c;
        long j2 = this.Y;
        v2g v2gVar = new v2g(j2, j, str2, str);
        g5i g5iVar = (g5i) dv5Var.a.getValue();
        wqi.c("workers:DownloadFileFromWebAppWorker", "start %s", v2gVar);
        String str3 = "workers:DownloadFileFromWebAppWorker/" + v2gVar;
        ngb ngbVar = (ngb) ((ngb) ((ngb) new ngb(DownloadFileFromWebAppWorker.class).setExpedited(ujb.a)).setBackoffCriteria(eg0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("workers:DownloadFileFromWebAppWorker");
        imb[] imbVarArr = {new imb("taskName", str3), new imb("requestId", Long.valueOf(j2)), new imb("botId", Long.valueOf(j)), new imb("fileName", str), new imb("fileUrl", str2)};
        r5j r5jVar = new r5j(14);
        for (int i = 0; i < 5; i++) {
            imb imbVar = imbVarArr[i];
            r5jVar.C(imbVar.b, (String) imbVar.a);
        }
        q48 q48VarB = g5iVar.b(str3, uk5.b, (ogb) ((ngb) ngbVar.setInputData(r5jVar.g())).build());
        q48VarB.c();
        lc4.b(q48VarB.b.d());
        pv0 pv0Var = ophVar.a;
        if (!pv0Var.w()) {
            pv0Var.g(nph.DOWNLOADING);
        }
        uvhVar.j1.put(new Long(this.Y), ophVar);
        return qqg.a;
    }
}

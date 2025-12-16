package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class c25 extends dtf implements sm6 {
    public final /* synthetic */ DownloadFileFromWebAppWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c25(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(2, continuation);
        this.o = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c25) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c25(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.o;
        return ((iz5) ((qx5) downloadFileFromWebAppWorker.c.getValue())).h(downloadFileFromWebAppWorker.b().d);
    }
}

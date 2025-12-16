package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class b05 extends dtf implements sm6 {
    public final /* synthetic */ DownloadAttachesWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b05(DownloadAttachesWorker downloadAttachesWorker, Continuation continuation) {
        super(2, continuation);
        this.o = downloadAttachesWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b05) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b05(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        DownloadAttachesWorker downloadAttachesWorker = this.o;
        return ((qi9) downloadAttachesWorker.Y.getValue()).m(downloadAttachesWorker.b);
    }
}

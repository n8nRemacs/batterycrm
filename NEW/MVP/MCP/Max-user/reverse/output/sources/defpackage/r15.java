package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class r15 extends q44 {
    public tid X;
    public tid Y;
    public DownloadFileAttachWorker Z;
    public DownloadFileAttachWorker d;
    public sid o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ DownloadFileAttachWorker t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r15(DownloadFileAttachWorker downloadFileAttachWorker, q44 q44Var) {
        super(q44Var);
        this.t0 = downloadFileAttachWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.createForegroundInfo(this);
    }
}

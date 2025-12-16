package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* loaded from: classes2.dex */
public final class s15 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ DownloadFileAttachWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s15(DownloadFileAttachWorker downloadFileAttachWorker, q44 q44Var) {
        super(q44Var);
        this.o = downloadFileAttachWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.doForegroundWork(this);
    }
}

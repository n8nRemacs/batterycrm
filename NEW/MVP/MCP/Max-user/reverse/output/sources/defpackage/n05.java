package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class n05 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DownloadAttachesWorker Y;
    public int Z;
    public DownloadAttachesWorker d;
    public f10 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n05(DownloadAttachesWorker downloadAttachesWorker, q44 q44Var) {
        super(q44Var);
        this.Y = downloadAttachesWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.g(null, null, this);
    }
}

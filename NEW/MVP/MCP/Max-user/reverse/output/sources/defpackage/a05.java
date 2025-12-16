package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class a05 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ DownloadAttachesWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a05(DownloadAttachesWorker downloadAttachesWorker, q44 q44Var) {
        super(q44Var);
        this.o = downloadAttachesWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.doForegroundWork(this);
    }
}

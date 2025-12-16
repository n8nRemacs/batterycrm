package defpackage;

import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class d05 extends q44 {
    public Object X;
    public f10 Y;
    public /* synthetic */ Object Z;
    public Object d;
    public w10 o;
    public final /* synthetic */ DownloadAttachesWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d05(DownloadAttachesWorker downloadAttachesWorker, q44 q44Var) {
        super(q44Var);
        this.s0 = downloadAttachesWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.c(null, null, this);
    }
}

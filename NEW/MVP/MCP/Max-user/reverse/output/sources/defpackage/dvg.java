package defpackage;

import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class dvg extends q44 {
    public long X;
    public long Y;
    public /* synthetic */ Object Z;
    public UploadFileAttachWorker d;
    public UploadFileAttachWorker o;
    public final /* synthetic */ UploadFileAttachWorker s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvg(UploadFileAttachWorker uploadFileAttachWorker, q44 q44Var) {
        super(q44Var);
        this.s0 = uploadFileAttachWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.l(this);
    }
}

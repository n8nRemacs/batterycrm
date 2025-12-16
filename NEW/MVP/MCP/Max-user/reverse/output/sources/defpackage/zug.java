package defpackage;

import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class zug extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ UploadFileAttachWorker Y;
    public int Z;
    public UploadFileAttachWorker d;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zug(UploadFileAttachWorker uploadFileAttachWorker, q44 q44Var) {
        super(q44Var);
        this.Y = uploadFileAttachWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.k(this);
    }
}

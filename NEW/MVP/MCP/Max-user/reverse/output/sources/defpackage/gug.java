package defpackage;

import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class gug extends q44 {
    public UploadDraftMediaWorker X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ UploadDraftMediaWorker Z;
    public UploadDraftMediaWorker d;
    public UploadDraftMediaWorker o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gug(UploadDraftMediaWorker uploadDraftMediaWorker, q44 q44Var) {
        super(q44Var);
        this.Z = uploadDraftMediaWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.doForegroundWork(this);
    }
}

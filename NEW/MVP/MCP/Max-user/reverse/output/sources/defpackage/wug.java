package defpackage;

import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class wug extends q44 {
    public final /* synthetic */ UploadFileAttachWorker X;
    public int Y;
    public UploadFileAttachWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wug(UploadFileAttachWorker uploadFileAttachWorker, q44 q44Var) {
        super(q44Var);
        this.X = uploadFileAttachWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.doForegroundWork(this);
    }
}

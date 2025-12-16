package defpackage;

import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class hug extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ UploadDraftMediaWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hug(UploadDraftMediaWorker uploadDraftMediaWorker, q44 q44Var) {
        super(q44Var);
        this.o = uploadDraftMediaWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        Object objJ = this.o.j(this);
        return objJ == g84.a ? objJ : new kpd(objJ);
    }
}

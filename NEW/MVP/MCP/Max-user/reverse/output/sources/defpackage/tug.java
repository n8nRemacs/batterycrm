package defpackage;

import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* loaded from: classes2.dex */
public final class tug extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ UploadExternalGifWorker Y;
    public int Z;
    public UploadExternalGifWorker d;
    public la8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tug(UploadExternalGifWorker uploadExternalGifWorker, q44 q44Var) {
        super(q44Var);
        this.Y = uploadExternalGifWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.h(this);
    }
}

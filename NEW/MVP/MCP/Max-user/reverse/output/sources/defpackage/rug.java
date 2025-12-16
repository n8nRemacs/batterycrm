package defpackage;

import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* loaded from: classes2.dex */
public final class rug extends q44 {
    public final /* synthetic */ UploadExternalGifWorker X;
    public int Y;
    public UploadExternalGifWorker d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rug(UploadExternalGifWorker uploadExternalGifWorker, q44 q44Var) {
        super(q44Var);
        this.X = uploadExternalGifWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.e(null, this);
    }
}

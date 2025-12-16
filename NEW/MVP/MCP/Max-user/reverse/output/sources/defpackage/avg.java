package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class avg extends dtf implements sm6 {
    public final /* synthetic */ UploadFileAttachWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avg(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.o = uploadFileAttachWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((avg) l((xm9) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new avg(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(!(this.o.C0 instanceof ia8));
    }
}

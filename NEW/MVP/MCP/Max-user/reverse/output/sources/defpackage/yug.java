package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class yug extends dtf implements sm6 {
    public final /* synthetic */ UploadFileAttachWorker X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yug(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = uploadFileAttachWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yug) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yug(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        UploadFileAttachWorker uploadFileAttachWorker = this.X;
        try {
            if (i == 0) {
                g8j.b(obj);
                wqi.c("UploadFileAttachWorker", "save %s", uploadFileAttachWorker.b());
                ik3 ik3Var = new ik3(((bn9) uploadFileAttachWorker.b.getValue()).b(), 2, new sl6(28, uploadFileAttachWorker.b()));
                this.o = 1;
                Object objA = n8j.a(ik3Var, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            wqi.c("UploadFileAttachWorker", "save finish %s", uploadFileAttachWorker.b());
        } catch (Throwable th) {
            wqi.e("UploadFileAttachWorker", "save failed!", th);
        }
        return qqg.a;
    }
}

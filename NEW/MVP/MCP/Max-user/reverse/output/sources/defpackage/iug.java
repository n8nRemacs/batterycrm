package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class iug extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ UploadDraftMediaWorker Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iug(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadDraftMediaWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iug) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iug iugVar = new iug(this.Y, continuation);
        iugVar.X = obj;
        return iugVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        int i = this.o;
        UploadDraftMediaWorker uploadDraftMediaWorker = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                ik3 ik3Var = new ik3(((n35) uploadDraftMediaWorker.b.getValue()).a(), 2, new r5j(16, uploadDraftMediaWorker.c()));
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
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            wqi.c("UploadDraftMediaWorker", "storeDraftUpload: finish store upload = " + uploadDraftMediaWorker.c(), new Object[0]);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if ((thA instanceof CancellationException) || (thA instanceof SecurityException) || (thA instanceof IllegalStateException) || (thA instanceof IOException)) {
                wqi.e("UploadDraftMediaWorker", "storeDraftUpload: failed", thA);
            } else {
                wqi.e("UploadDraftMediaWorker", "storeDraftUpload: failed (unexpected)", thA);
            }
        }
        return new kpd(ipdVar);
    }
}

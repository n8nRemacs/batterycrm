package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lnc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lnc lncVar = (lnc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lncVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lnc lncVar = new lnc(this.X, continuation);
        lncVar.o = obj;
        return lncVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        pnc pncVar = this.X;
        try {
            AtomicReference atomicReference = pncVar.U0;
            k18 k18Var = pncVar.y0;
            Uri uriFromFile = Uri.fromFile(((iz5) k18Var.getValue()).p((String) atomicReference.updateAndGet(new lk2(10))));
            if (!uriFromFile.toString().startsWith("content://")) {
                uriFromFile = ((iz5) k18Var.getValue()).f((Context) pncVar.V0.getValue(), ioi.c(uriFromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriFromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            ipdVar = intent;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(f84Var.getClass().getName(), "capturePhoto: failed to capture photo", thA);
            pncVar.E();
        }
        if (!(ipdVar instanceof ipd)) {
            xfh.r(pncVar.E0, new dmc((Intent) ipdVar));
        }
        return qqg.a;
    }
}

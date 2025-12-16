package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cle extends dtf implements sm6 {
    public final /* synthetic */ ele X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cle(ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.X = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cle cleVar = (cle) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cleVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cle cleVar = new cle(this.X, continuation);
        cleVar.o = obj;
        return cleVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        ele eleVar = this.X;
        k18 k18Var = eleVar.s0;
        AtomicReference atomicReference = eleVar.H0;
        try {
            atomicReference.set(String.valueOf(System.currentTimeMillis()));
            Uri uriFromFile = Uri.fromFile(((iz5) k18Var.getValue()).p((String) atomicReference.get()));
            if (!uriFromFile.toString().startsWith("content://")) {
                uriFromFile = ((iz5) k18Var.getValue()).f(eleVar.d, ioi.c(uriFromFile));
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
            eleVar.A();
        }
        if (!(ipdVar instanceof ipd)) {
            xfh.r(eleVar.B0, new wpe((Intent) ipdVar));
        }
        return qqg.a;
    }
}

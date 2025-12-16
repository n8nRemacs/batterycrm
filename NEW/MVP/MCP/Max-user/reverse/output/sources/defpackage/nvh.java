package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvh(uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nvh nvhVar = (nvh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nvhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nvh nvhVar = new nvh(this.X, continuation);
        nvhVar.o = obj;
        return nvhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        uvh uvhVar = this.X;
        try {
            uvhVar.T0 = System.currentTimeMillis() + ".jpg";
            Uri uriFromFile = Uri.fromFile(((iz5) uvhVar.B0.getValue()).p(uvhVar.T0));
            if (!uriFromFile.toString().startsWith("content://")) {
                uriFromFile = ((iz5) uvhVar.B0.getValue()).f((Context) uvhVar.C0.getValue(), ioi.c(uriFromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriFromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            ipdVar = intent;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        uvh uvhVar2 = this.X;
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(uvhVar2.F0, "capturePhoto: failed to capture photo", thA);
            uvhVar2.T0 = null;
            xfh.r(uvhVar2.Z0, cuh.a);
        }
        uvh uvhVar3 = this.X;
        if (!(ipdVar instanceof ipd)) {
            xfh.r(uvhVar3.Z0, new euh((Intent) ipdVar));
        }
        return qqg.a;
    }
}

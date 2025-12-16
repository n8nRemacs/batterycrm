package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uea extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vea Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uea(vea veaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = veaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uea) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uea ueaVar = new uea(this.Y, continuation);
        ueaVar.X = obj;
        return ueaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ipd ipdVar;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            vea veaVar = this.Y;
            try {
                veaVar.l = String.valueOf(System.currentTimeMillis());
                Uri uriFromFile = Uri.fromFile(veaVar.a().p(veaVar.l));
                if (!uriFromFile.toString().startsWith("content://")) {
                    uriFromFile = veaVar.a().f((Context) veaVar.c.getValue(), ioi.c(uriFromFile));
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", uriFromFile);
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                ipdVar = intent;
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            vea veaVar2 = this.Y;
            Throwable thA = kpd.a(ipdVar);
            if (thA != null) {
                wqi.e(veaVar2.f, "capturePhoto: failed to capture photo", thA);
                veaVar2.b();
            }
            vea veaVar3 = this.Y;
            if (!(ipdVar instanceof ipd)) {
                jve jveVar = veaVar3.h;
                tc0 tc0Var = new tc0((Intent) ipdVar);
                this.X = ipdVar;
                this.o = 1;
                if (jveVar.a(tc0Var, this) == g84Var) {
                    return g84Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}

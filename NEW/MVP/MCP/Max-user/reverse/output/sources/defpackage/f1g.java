package defpackage;

import java.util.concurrent.TimeUnit;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;

/* loaded from: classes2.dex */
public final /* synthetic */ class f1g implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1g b;

    public /* synthetic */ f1g(d1g d1gVar, int i) {
        this.a = i;
        this.b = d1gVar;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        int i = 1;
        switch (this.a) {
            case 0:
                return ((vqa) obj).h(new f1g(this.b, i), Integer.MAX_VALUE);
            default:
                d1g d1gVar = this.b;
                Throwable th = (Throwable) obj;
                if (!(th instanceof HttpErrorException)) {
                    return vqa.e(th);
                }
                if (th instanceof HttpUrlExpiredException) {
                    wqi.e("g1g", "retryWhenTamHttpError: skipped retry on TamHttpUrlExpiredException", null);
                    return vqa.e(th);
                }
                HttpErrorException httpErrorException = (HttpErrorException) th;
                if (uog.f(httpErrorException.a)) {
                    wqi.e("g1g", "retryWhenTamHttpError: critical upload error=" + httpErrorException, null);
                    return vqa.e(th);
                }
                if (d1g.a(((oje) d1gVar.a.getValue()).k)) {
                    wqi.e("g1g", "retryWhenTamHttpError: http error", httpErrorException);
                    return vqa.r(1, TimeUnit.SECONDS, u0e.a());
                }
                wqi.c("g1g", "retryWhenTamHttpError: no connection, await for connection available", new Object[0]);
                return new sra(d1gVar.b(), new vef(18), pdf.e, pdf.d);
        }
    }
}

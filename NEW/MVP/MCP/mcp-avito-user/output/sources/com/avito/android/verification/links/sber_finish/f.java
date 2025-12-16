package com.avito.android.verification.links.sber_finish;

import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.links.sber_finish.k;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VerificationSberFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f324458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerificationSberFinishLink f324459c;

    public f(c cVar, VerificationSberFinishLink verificationSberFinishLink) {
        this.f324458b = cVar;
        this.f324459c = verificationSberFinishLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        c cVar = this.f324458b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(th2));
        f.c.f125255c.getClass();
        a.i.C4057a.d(cVar.f324451k, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        String string = this.f324459c.toString();
        Map<String, String> mapE = cVar.f324447g.f324471c.e();
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        cVar.f324446f.c(new a(string, mapE, message));
        cVar.j(new k.a(th2.toString()));
    }
}

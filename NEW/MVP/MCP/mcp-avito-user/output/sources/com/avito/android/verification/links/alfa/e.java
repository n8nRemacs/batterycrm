package com.avito.android.verification.links.alfa;

import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.links.alfa.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: VerificationAlfaLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f324166b;

    public e(b bVar) {
        this.f324166b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Map mapC;
        Throwable th2 = (Throwable) obj;
        b bVar = this.f324166b;
        String strValueOf = String.valueOf(bVar.c());
        VerificationAlfaLink verificationAlfaLinkC = bVar.c();
        if (verificationAlfaLinkC == null || (mapC = verificationAlfaLinkC.f324145b) == null) {
            mapC = P0.c();
        }
        bVar.f324149f.c(new a(strValueOf, mapC, th2.toString()));
        PrintableText f323382b = bVar.f324156m.getF323382b();
        f.c.f125255c.getClass();
        a.i.C4057a.d(bVar.f324155l, f323382b, null, null, f.c.a.b(), 0, null, null, null, 2030);
        bVar.j(new j.a(th2.toString()));
    }
}

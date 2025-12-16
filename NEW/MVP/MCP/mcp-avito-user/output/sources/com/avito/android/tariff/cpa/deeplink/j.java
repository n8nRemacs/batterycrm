package com.avito.android.tariff.cpa.deeplink;

import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.tariff.deeplink.TariffCpaPublicationSaveLink;
import kotlin.Metadata;

/* compiled from: TariffCpaPublicationSaveHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f294582b;

    public j(k kVar) {
        this.f294582b = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        k kVar = this.f294582b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(th2));
        f.c.a aVar = f.c.f125255c;
        ApiError apiErrorN = z.n(th2);
        Throwable cause = th2.getCause();
        aVar.getClass();
        a.i.C4057a.d(kVar.f294585h, printableTextF, null, null, f.c.a.a(apiErrorN, cause), 0, ToastBarPosition.f181046d, null, null, 1966);
        kVar.j(new TariffCpaPublicationSaveLink.b.a(z.n(th2)));
    }
}

package com.avito.android.verification.links.tinkoff_documents;

import Y41.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationTinkoffDocumentsAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f324531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VerificationTinkoffDocumentsLink f324532m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, VerificationTinkoffDocumentsLink verificationTinkoffDocumentsLink) {
        super(1);
        this.f324531l = bVar;
        this.f324532m = verificationTinkoffDocumentsLink;
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        b bVar = this.f324531l;
        PrintableText f323384d = bVar.f324539l.getF323384d();
        f.c.f125255c.getClass();
        a.i.C4057a.d(bVar.f324540m, f323384d, null, null, f.c.a.b(), 0, null, null, null, 2030);
        VerificationTinkoffDocumentsLink verificationTinkoffDocumentsLink = this.f324532m;
        bVar.f324541n.c(new com.avito.android.verification.links.tinkoff_finish.a(verificationTinkoffDocumentsLink.toString(), verificationTinkoffDocumentsLink.f324527b, "Не удалось запустить тинькофф"));
        return G0.f406611a;
    }
}

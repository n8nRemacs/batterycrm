package com.avito.android.verification.links.tinkoff_finish;

import com.avito.android.account.G;
import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: VerificationTinkoffFinishLinkInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_finish/i;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f324587a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A1 f324588b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.storage.a f324589c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final G f324590d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.tinkoff_documents.f f324591e;

    @Inject
    public i(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k A1 a12, @Y61.k com.avito.android.verification.storage.a aVar, @Y61.k G g12, @Y61.k com.avito.android.verification.links.tinkoff_documents.f fVar) {
        this.f324587a = interfaceC35745a5;
        this.f324588b = a12;
        this.f324589c = aVar;
        this.f324590d = g12;
        this.f324591e = fVar;
    }

    public final void a() {
        Map<String, String> mapC = P0.c();
        com.avito.android.verification.storage.a aVar = this.f324589c;
        aVar.d(mapC);
        aVar.a(null);
        this.f324591e.f324554a = null;
    }
}

package com.avito.android.tariff_cpt.configure.creation.deeplink;

import Y41.l;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.tariff_cpt.configure.creation.deeplink.TariffCptCreationLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptCreationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/DeepLinkResponse;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/DeepLinkResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<DeepLinkResponse, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f297569l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(1);
        this.f297569l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLinkResponse deepLinkResponse) {
        e eVar = this.f297569l;
        eVar.f297576k.s1();
        eVar.i(TariffCptCreationLink.c.b.f297566b, eVar.f297573h, deepLinkResponse.getDeepLink());
        return G0.f406611a;
    }
}

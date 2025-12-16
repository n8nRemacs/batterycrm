package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsConsultationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28098d extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28101g f74735l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28098d(C28101g c28101g) {
        super(1);
        this.f74735l = c28101g;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        if (deepLink2 != null) {
            InterfaceC28130g0 interfaceC28130g0 = this.f74735l.f74772b;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.P(deepLink2);
        }
        return G0.f406611a;
    }
}

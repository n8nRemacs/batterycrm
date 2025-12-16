package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import Ax.InterfaceC13095a;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: CarouselVacancyViewedItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/AdvertAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.l<AdvertAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f269170l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f269171m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.rich_snippets.job.m f269172n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, AdvertItem advertItem, com.avito.android.serp.adapter.rich_snippets.job.m mVar) {
        super(1);
        this.f269170l = hVar;
        this.f269171m = advertItem;
        this.f269172n = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertAction advertAction) {
        AdvertAction advertAction2 = advertAction;
        h hVar = this.f269170l;
        boolean z12 = advertAction2 instanceof AdvertAction.Messenger;
        AdvertItem advertItem = this.f269171m;
        if (z12) {
            hVar.k(advertAction2, advertItem);
        } else if (advertAction2 instanceof AdvertAction.Phone) {
            if (advertItem.f268419Z0 == PhoneLoadingState.f430441b) {
                DeepLink deepLinkA = hVar.f269190h.a(advertItem, false, advertItem.f268455p0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : ScreenIdField.f90254f);
                if (deepLinkA != null) {
                    boolean z13 = deepLinkA instanceof PhoneRequestLink;
                    InterfaceC13095a interfaceC13095a = hVar.f269191i;
                    if (z13) {
                        deepLinkA = PhoneRequestLink.a((PhoneRequestLink) deepLinkA, interfaceC13095a.d());
                    }
                    DeepLink deepLink = deepLinkA;
                    if (hVar.f269187e.N6()) {
                        hVar.f269185c.get().Sa(advertItem.f268425c, deepLink, ContactSource.f89919d);
                    } else {
                        hVar.f269187e.O6(advertItem, this.f269172n, deepLink, ContactSource.f89919d, interfaceC13095a.d(), new g(hVar, advertItem));
                    }
                }
            }
        } else if (advertAction2 instanceof AdvertAction.SecondaryAction) {
            hVar.k(advertAction2, advertItem);
        } else {
            hVar.k(advertAction2, advertItem);
        }
        return G0.f406611a;
    }
}

package com.avito.android.serp.adapter.carousel_vacancy_viewed;

import Ax.InterfaceC13095a;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: CarouselVacancyViewedXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/AdvertAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.l<AdvertAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f269208l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f269209m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.rich_snippets.job.m f269210n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, AdvertXlItem advertXlItem, com.avito.android.serp.adapter.rich_snippets.job.m mVar) {
        super(1);
        this.f269208l = qVar;
        this.f269209m = advertXlItem;
        this.f269210n = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertAction advertAction) {
        AdvertAction advertAction2 = advertAction;
        q qVar = this.f269208l;
        boolean z12 = advertAction2 instanceof AdvertAction.Messenger;
        AdvertXlItem advertXlItem = this.f269209m;
        if (z12) {
            qVar.k(advertAction2, advertXlItem);
        } else if (advertAction2 instanceof AdvertAction.Phone) {
            if (advertXlItem.f268802o0 == PhoneLoadingState.f430441b) {
                DeepLink deepLinkA = qVar.f269228h.a(advertXlItem, false, advertXlItem.f268774a0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : ScreenIdField.f90254f);
                if (deepLinkA != null) {
                    boolean z13 = deepLinkA instanceof PhoneRequestLink;
                    InterfaceC13095a interfaceC13095a = qVar.f269229i;
                    if (z13) {
                        deepLinkA = PhoneRequestLink.a((PhoneRequestLink) deepLinkA, interfaceC13095a.d());
                    }
                    DeepLink deepLink = deepLinkA;
                    h31.e<InterfaceC28616b> eVar = qVar.f269225e;
                    if (eVar.get().N6()) {
                        qVar.f269223c.get().Sa(advertXlItem.f268777c, deepLink, ContactSource.f89919d);
                    } else {
                        eVar.get().O6(advertXlItem, this.f269210n, deepLink, ContactSource.f89919d, interfaceC13095a.d(), new p(qVar, advertXlItem));
                    }
                }
            }
        } else if (advertAction2 instanceof AdvertAction.SecondaryAction) {
            qVar.k(advertAction2, advertXlItem);
        } else {
            qVar.k(advertAction2, advertXlItem);
        }
        return G0.f406611a;
    }
}

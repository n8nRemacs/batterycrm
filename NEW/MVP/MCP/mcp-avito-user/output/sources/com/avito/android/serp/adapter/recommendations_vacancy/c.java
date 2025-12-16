package com.avito.android.serp.adapter.recommendations_vacancy;

import Ax.InterfaceC13095a;
import Y41.l;
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

/* compiled from: RdsAdvertVacancyItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/AdvertAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements l<AdvertAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f270581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f270583n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, AdvertItem advertItem, j jVar) {
        super(1);
        this.f270581l = hVar;
        this.f270582m = advertItem;
        this.f270583n = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertAction advertAction) {
        AdvertAction advertAction2 = advertAction;
        h hVar = this.f270581l;
        boolean z12 = advertAction2 instanceof AdvertAction.Messenger;
        AdvertItem advertItem = this.f270582m;
        h31.e<rn0.e> eVar = hVar.f270596c;
        if (z12) {
            DeepLink deepLink = advertAction2.getDeepLink();
            if (deepLink != null) {
                eVar.get().W(advertItem.f268425c, deepLink, ContactSource.f89919d, ScreenIdField.f90253e, advertItem.f268420a0);
            }
        } else if ((advertAction2 instanceof AdvertAction.Phone) && advertItem.f268419Z0 == PhoneLoadingState.f430441b) {
            DeepLink deepLinkA = hVar.f270600g.a(advertItem, false, advertItem.f268455p0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : ScreenIdField.f90253e);
            if (deepLinkA != null) {
                boolean z13 = deepLinkA instanceof PhoneRequestLink;
                InterfaceC13095a interfaceC13095a = hVar.f270601h;
                if (z13) {
                    deepLinkA = PhoneRequestLink.a((PhoneRequestLink) deepLinkA, interfaceC13095a.d());
                }
                DeepLink deepLink2 = deepLinkA;
                if (hVar.f270597d.N6()) {
                    eVar.get().W(advertItem.f268425c, deepLink2, ContactSource.f89919d, null, null);
                } else {
                    hVar.f270597d.O6(advertItem, this.f270583n, deepLink2, ContactSource.f89919d, interfaceC13095a.d(), new g(hVar, advertItem));
                }
            }
        }
        return G0.f406611a;
    }
}

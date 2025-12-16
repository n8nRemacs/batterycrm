package com.avito.android.serp.adapter.rich_snippets.job;

import Ax.InterfaceC13095a;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertXlRichJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/AdvertAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class s extends N implements Y41.l<AdvertAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f270845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f270846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f270847n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, AdvertXlItem advertXlItem, m mVar) {
        super(1);
        this.f270845l = xVar;
        this.f270846m = advertXlItem;
        this.f270847n = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertAction advertAction) {
        AdvertAction advertAction2 = advertAction;
        x xVar = this.f270845l;
        boolean z12 = advertAction2 instanceof AdvertAction.Messenger;
        AdvertXlItem advertXlItem = this.f270846m;
        if (z12) {
            DeepLink deepLink = ((AdvertAction.Messenger) advertAction2).getDeepLink();
            if (deepLink != null) {
                xVar.f270859b.get().W(advertXlItem.f268777c, deepLink, ContactSource.f89919d, ScreenIdField.f90251c, advertXlItem.f268776b0);
            }
        } else if ((advertAction2 instanceof AdvertAction.Phone) && advertXlItem.f268802o0 == PhoneLoadingState.f430441b) {
            DeepLink deepLinkA = xVar.f270865h.a(advertXlItem, false, advertXlItem.f268774a0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : ScreenIdField.f90251c);
            if (deepLinkA != null) {
                boolean z13 = deepLinkA instanceof PhoneRequestLink;
                InterfaceC13095a interfaceC13095a = xVar.f270866i;
                if (z13) {
                    deepLinkA = PhoneRequestLink.a((PhoneRequestLink) deepLinkA, interfaceC13095a.d());
                }
                DeepLink deepLink2 = deepLinkA;
                if (xVar.f270862e.N6()) {
                    xVar.f270860c.get().Sa(advertXlItem.f268777c, deepLink2, ContactSource.f89919d);
                } else {
                    xVar.f270862e.O6(advertXlItem, this.f270847n, deepLink2, ContactSource.f89919d, interfaceC13095a.d(), new w(xVar, advertXlItem));
                }
            }
        }
        return G0.f406611a;
    }
}

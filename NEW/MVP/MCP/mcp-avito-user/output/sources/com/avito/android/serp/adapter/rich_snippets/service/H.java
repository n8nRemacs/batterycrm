package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class H extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f271263m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271264n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f271265o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AdvertXlItem advertXlItem, O o12, AdvertXlItem advertXlItem2, v vVar) {
        super(0);
        this.f271262l = advertXlItem;
        this.f271263m = o12;
        this.f271264n = advertXlItem2;
        this.f271265o = vVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertXlItem advertXlItem = this.f271262l;
        if (advertXlItem.f268802o0 == PhoneLoadingState.f430441b) {
            O o12 = this.f271263m;
            DeepLink deepLinkA = o12.f271288g.a(advertXlItem, false, advertXlItem.f268774a0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = o12.f271285d;
                boolean zN6 = eVar.get().N6();
                AdvertXlItem advertXlItem2 = this.f271264n;
                if (zN6) {
                    o12.f271284c.get().Sa(advertXlItem2.f268777c, deepLinkA, ContactSource.f89921f);
                } else {
                    eVar.get().O6(this.f271262l, this.f271265o, deepLinkA, ContactSource.f89921f, null, new G(advertXlItem2, o12));
                }
            }
        }
        return G0.f406611a;
    }
}

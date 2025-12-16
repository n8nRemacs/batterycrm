package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268852l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f268853m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f268854n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f268855o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2, u uVar, x xVar) {
        super(0);
        this.f268852l = advertXlItem;
        this.f268853m = uVar;
        this.f268854n = advertXlItem2;
        this.f268855o = xVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertXlItem advertXlItem = this.f268852l;
        if (advertXlItem.f268802o0 == PhoneLoadingState.f430441b) {
            u uVar = this.f268853m;
            DeepLink deepLinkA = uVar.f268875j.a(advertXlItem, false, advertXlItem.f268774a0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                boolean zN6 = uVar.f268871f.N6();
                AdvertXlItem advertXlItem2 = this.f268854n;
                if (zN6) {
                    uVar.f268867b.get().Id(advertXlItem2, deepLinkA);
                } else {
                    uVar.f268871f.O6(this.f268852l, this.f268855o, deepLinkA, ContactSource.f89921f, null, new o(advertXlItem2, uVar));
                }
            }
        }
        return G0.f406611a;
    }
}

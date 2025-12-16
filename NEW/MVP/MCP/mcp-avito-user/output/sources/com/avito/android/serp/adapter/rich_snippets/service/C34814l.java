package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34814l extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f271332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271333n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f271334o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34814l(AdvertItem advertItem, AdvertItem advertItem2, s sVar, v vVar) {
        super(0);
        this.f271331l = advertItem;
        this.f271332m = sVar;
        this.f271333n = advertItem2;
        this.f271334o = vVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertItem advertItem = this.f271331l;
        if (advertItem.f268419Z0 == PhoneLoadingState.f430441b) {
            s sVar = this.f271332m;
            DeepLink deepLinkA = sVar.f271377h.a(advertItem, false, advertItem.f268455p0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = sVar.f271373d;
                boolean zN6 = eVar.get().N6();
                AdvertItem advertItem2 = this.f271333n;
                if (zN6) {
                    sVar.f271372c.get().Sa(advertItem2.f268425c, deepLinkA, ContactSource.f89919d);
                } else {
                    eVar.get().O6(this.f271331l, this.f271334o, deepLinkA, ContactSource.f89919d, null, new C34813k(advertItem2, sVar));
                }
            }
        }
        return G0.f406611a;
    }
}

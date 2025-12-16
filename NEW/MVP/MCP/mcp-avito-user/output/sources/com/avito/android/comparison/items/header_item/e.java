package com.avito.android.comparison.items.header_item;

import Rq.InterfaceC15071a;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComparisonHeaderPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f123963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f123964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, i iVar) {
        super(0);
        this.f123963l = bVar;
        this.f123964m = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f123963l;
        m mVar = bVar.f123957i;
        boolean z12 = mVar instanceof p;
        i iVar = this.f123964m;
        if (z12) {
            DeepLink deepLink = bVar.f123956h;
            AdvertDetailsLink advertDetailsLink = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : null;
            iVar.f123973c.invoke(new InterfaceC15071a.j(((p) mVar).f123999b, advertDetailsLink != null ? advertDetailsLink.f132948c : null));
        } else if (mVar instanceof o) {
            iVar.f123974d.invoke(new InterfaceC15071a.h(bVar.f123952d, ((o) mVar).f123997b));
        } else if (mVar instanceof a) {
            iVar.f123975e.invoke(new InterfaceC15071a.f(bVar, ((a) mVar).f123949b));
        }
        return G0.f406611a;
    }
}

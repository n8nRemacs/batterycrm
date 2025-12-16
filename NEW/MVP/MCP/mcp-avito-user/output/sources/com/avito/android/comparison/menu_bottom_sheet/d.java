package com.avito.android.comparison.menu_bottom_sheet;

import Rq.InterfaceC15071a;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComparisonBottomSheetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f124100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f124101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, e eVar) {
        super(0);
        this.f124100l = aVar;
        this.f124101m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f124100l;
        if (aVar != null) {
            DeepLink deepLink = aVar.f124096c;
            AdvertDetailsLink advertDetailsLink = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : null;
            String str = advertDetailsLink != null ? advertDetailsLink.f132948c : null;
            e eVar = this.f124101m;
            eVar.f124102a.invoke(new InterfaceC15071a.j(aVar.f124097d, str));
            eVar.f124103b.invoke(InterfaceC15071a.b.f14661a);
        }
        return G0.f406611a;
    }
}

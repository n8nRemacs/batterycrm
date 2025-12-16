package com.avito.android.developments_agency_search.deeplink;

import com.avito.android.developments_agency_search.deeplink.TariffCardRegionSelectorLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oi0.C44783b;

/* compiled from: TariffCardRegionSelectorLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loi0/b;", "location", "Lkotlin/G0;", "invoke", "(Loi0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E extends N implements Y41.l<C44783b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G f136376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g12) {
        super(1);
        this.f136376l = g12;
    }

    @Override // Y41.l
    public final G0 invoke(C44783b c44783b) {
        C44783b c44783b2 = c44783b;
        this.f136376l.j(new TariffCardRegionSelectorLink.b.a(String.valueOf(c44783b2.getId()), c44783b2.getName()));
        return G0.f406611a;
    }
}

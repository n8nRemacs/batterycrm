package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCptConfigureLevelsCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f297991l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f297992m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f297993n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, DeepLink deepLink, c cVar) {
        super(0);
        this.f297991l = iVar;
        this.f297992m = deepLink;
        this.f297993n = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f297991l.f297996b.invoke(this.f297992m, Long.valueOf(this.f297993n.getF82706b()));
        return G0.f406611a;
    }
}

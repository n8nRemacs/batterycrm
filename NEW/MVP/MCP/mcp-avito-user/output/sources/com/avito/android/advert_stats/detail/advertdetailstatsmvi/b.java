package com.avito.android.advert_stats.detail.advertdetailstatsmvi;

import ab.InterfaceC19855a;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.AdvertDetailStatsMVIFragment;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailStatsMVIFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailStatsMVIFragment f86053l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Action f86054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment, Action action) {
        super(0);
        this.f86053l = advertDetailStatsMVIFragment;
        this.f86054m = action;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertDetailStatsMVIFragment.a aVar = AdvertDetailStatsMVIFragment.f86027D0;
        this.f86053l.D5().accept(new InterfaceC19855a.C1497a(this.f86054m.getDeepLink()));
        return G0.f406611a;
    }
}

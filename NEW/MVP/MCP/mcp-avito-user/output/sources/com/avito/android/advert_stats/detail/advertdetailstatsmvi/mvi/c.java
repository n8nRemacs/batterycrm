package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import Y61.l;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction;
import com.avito.android.advert_stats.p;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertDetailStatsMVIBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIInternalAction;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.arch.mvi.b<AdvertDetailStatsMVIInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f86093a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f86094b;

    @Inject
    public c(@Y61.k String str, @Y61.k p pVar) {
        this.f86093a = str;
        this.f86094b = pVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AdvertDetailStatsMVIInternalAction> a() {
        return this.f86094b.a(this.f86093a);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

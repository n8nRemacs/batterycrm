package com.avito.android.advert_stats;

import com.avito.android.advert_stats.item.C28322a;
import kotlin.Metadata;

/* compiled from: AdvertStatsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advert_stats/item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f86879b;

    public s(r rVar) {
        this.f86879b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C28322a c28322a = (C28322a) obj;
        r rVar = this.f86879b;
        if (!rVar.f86864c0) {
            r.ke(rVar, rVar.f86863b0);
        }
        rVar.ne(rVar.f86847L.a(rVar.f86863b0, c28322a));
        rVar.f86864c0 = false;
    }
}

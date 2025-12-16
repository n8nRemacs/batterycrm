package com.avito.android.search.filter.adapter.recommendation_cards;

import Y61.k;
import com.avito.android.search.filter.converter.common.RecommendationCardsItem;
import io.reactivex.rxjava3.internal.operators.observable.C;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.rx3.y;

/* compiled from: RecommendationCardsItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/recommendation_cards/e;", "Lcom/avito/android/search/filter/adapter/recommendation_cards/c;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f262554b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f262555c;

    @Inject
    public e() {
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f262554b = f2.a(0, 1, bufferOverflow);
        this.f262555c = f2.a(0, 1, bufferOverflow);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        RecommendationCardsItem recommendationCardsItem = (RecommendationCardsItem) aVar;
        gVar.b(recommendationCardsItem.f262932c);
        gVar.T00(new d(this), recommendationCardsItem.f262933d);
        this.f262555c.K5(G0.f406611a);
    }

    @Override // com.avito.android.search.filter.adapter.recommendation_cards.c
    @k
    public final C h2() {
        return y.b(this.f262554b);
    }

    @Override // com.avito.android.search.filter.adapter.recommendation_cards.c
    @k
    public final C w2() {
        return y.b(this.f262555c);
    }
}

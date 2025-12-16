package com.avito.android.search.filter.adapter.action_with_placeholders;

import Y61.k;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search.filter.converter.common.ActionWithPlaceholdersItem;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActionWithPlaceholdersItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/action_with_placeholders/f;", "Lcom/avito/android/search/filter/adapter/action_with_placeholders/d;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f261954b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((h) eVar).fP((ActionWithPlaceholdersItem) aVar, new e(1, this.f261954b, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
    }

    @Override // com.avito.android.search.filter.adapter.action_with_placeholders.d
    @k
    public final C41981q0 q6() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f261954b;
        return l.l(cVar, cVar);
    }
}

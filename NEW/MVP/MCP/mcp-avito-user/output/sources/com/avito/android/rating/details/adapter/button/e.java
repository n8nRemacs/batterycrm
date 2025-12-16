package com.avito.android.rating.details.adapter.button;

import Y41.l;
import Y61.k;
import com.avito.android.adapter.RatingDetailsItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/button/e;", "Lcom/avito/android/rating/details/adapter/button/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RatingDetailsItem, G0> f246503b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super RatingDetailsItem, G0> lVar) {
        this.f246503b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ButtonItem buttonItem = (ButtonItem) aVar;
        gVar.E(buttonItem.f246496e);
        gVar.setTitle(buttonItem.f246494c);
        gVar.a(new d(this, buttonItem));
    }
}

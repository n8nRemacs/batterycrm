package com.avito.android.advert.item.rating_publish;

import com.avito.android.advert.item.Z0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsRatingPublishPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f78307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsRatingPublishItem f78308m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem) {
        super(0);
        this.f78307l = eVar;
        this.f78308m = advertDetailsRatingPublishItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Z0 z02 = this.f78307l.f78309b;
        if (z02 != null) {
            z02.g(null, this.f78308m.f78299c.getDeepLink(), null);
        }
        return G0.f406611a;
    }
}

package com.avito.android.advert.item.delivery_suggests;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsDeliverySuggestsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f75133l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeliverySuggests.AddressCentricity f75134m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Y41.l<? super DeepLink, G0> lVar, DeliverySuggests.AddressCentricity addressCentricity) {
        super(0);
        this.f75133l = (N) lVar;
        this.f75134m = addressCentricity;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        this.f75133l.invoke(this.f75134m.getOnTapDeepLink());
        return G0.f406611a;
    }
}

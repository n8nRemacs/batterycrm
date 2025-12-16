package com.avito.android.imv_goods_advert;

import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ImvGoodsAdvertItemsListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_advert/o;", "Lcom/avito/android/imv_goods_advert/n;", "<init>", "()V", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Integer, Long>> f170573b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f170574c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f170575d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f170576e;

    @Inject
    public o() {
        com.jakewharton.rxrelay3.c<Q<Integer, Long>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f170573b = cVar;
        this.f170574c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f170575d = cVar2;
        this.f170576e = new C41981q0(cVar2);
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void C(int i12, @Y61.l Long l12, @Y61.l Boolean bool, @Y61.l Boolean bool2) {
        this.f170573b.accept(new Q<>(Integer.valueOf(i12), l12));
    }

    @Override // com.avito.android.advert_details_items.show_description_button.i
    public final void H0() {
        this.f170575d.accept(G0.f406611a);
    }

    @Override // com.avito.android.imv_goods_advert.n
    @Y61.k
    /* renamed from: L2, reason: from getter */
    public final C41981q0 getF170576e() {
        return this.f170576e;
    }

    @Override // com.avito.android.imv_goods_advert.n
    @Y61.k
    /* renamed from: d1, reason: from getter */
    public final C41981q0 getF170574c() {
        return this.f170574c;
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void a0() {
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void g0() {
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void h2() {
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void r1() {
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void D1(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void w0(@Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType) {
    }

    @Override // R70.b
    public final void O(int i12, long j12) {
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void O0(@Y61.l DeepLink deepLink, @Y61.k String str) {
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void z(int i12, long j12) {
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void E(@Y61.k AdvertParameters.Button button, @Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType, @Y61.l String str) {
    }
}

package com.avito.android.serp.adapter.advert_free_form_item;

import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertFreeFormItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorAdvertItem f268720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f268721m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ConstructorAdvertItem constructorAdvertItem, l lVar, int i12) {
        super(0);
        this.f268720l = constructorAdvertItem;
        this.f268721m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ConstructorAdvertItem constructorAdvertItem = this.f268720l;
        SerpConstructorAdvertItem serpConstructorAdvertItem = constructorAdvertItem instanceof SerpConstructorAdvertItem ? (SerpConstructorAdvertItem) constructorAdvertItem : null;
        if (serpConstructorAdvertItem != null) {
            l lVar = this.f268721m;
            AdvertItem advertItemA = lVar.f268730c.a(serpConstructorAdvertItem);
            if (advertItemA != null) {
                lVar.f268729b.get().k5(advertItemA, null);
            }
        }
        return G0.f406611a;
    }
}

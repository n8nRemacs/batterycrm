package com.avito.android.advert.item.leadauto;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77288l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoNewCarsLeadFormItem f77289m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, AutoNewCarsLeadFormItem autoNewCarsLeadFormItem) {
        super(0);
        this.f77288l = dVar;
        this.f77289m = autoNewCarsLeadFormItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = d.f77271f;
        d dVar = this.f77288l;
        AutoNewCarsLeadFormItem autoNewCarsLeadFormItem = this.f77289m;
        dVar.f77273c.c(new com.avito.android.advert.item.leadauto.analytics.c(Long.valueOf(autoNewCarsLeadFormItem.f77259f), autoNewCarsLeadFormItem.f77260g, autoNewCarsLeadFormItem.f77261h));
        return G0.f406611a;
    }
}

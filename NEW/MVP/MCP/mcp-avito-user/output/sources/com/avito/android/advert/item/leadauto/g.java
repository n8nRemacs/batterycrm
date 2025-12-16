package com.avito.android.advert.item.leadauto;

import android.view.ContextThemeWrapper;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoNewCarsLeadFormItem f77286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f77287n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, AutoNewCarsLeadFormItem autoNewCarsLeadFormItem, n nVar) {
        super(0);
        this.f77285l = dVar;
        this.f77286m = autoNewCarsLeadFormItem;
        this.f77287n = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = d.f77271f;
        d dVar = this.f77285l;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(dVar.f77274d.getF170531a().getContext(), R.style.Theme_DesignSystem_Re23);
        AutoNewCarsLeadFormItem autoNewCarsLeadFormItem = this.f77286m;
        Long lValueOf = Long.valueOf(autoNewCarsLeadFormItem.f77259f);
        n nVar = this.f77287n;
        String strOI = nVar.OI();
        dVar.f77273c.c(new com.avito.android.advert.item.leadauto.analytics.d(lValueOf, autoNewCarsLeadFormItem.f77260g, autoNewCarsLeadFormItem.f77261h, (strOI == null || strOI.length() == 0 || !nVar.o30()) ? false : true));
        dVar.f77272b.le(nVar.OI(), autoNewCarsLeadFormItem.f77259f, new i(dVar, autoNewCarsLeadFormItem, contextThemeWrapper), new j(dVar, contextThemeWrapper));
        return G0.f406611a;
    }
}

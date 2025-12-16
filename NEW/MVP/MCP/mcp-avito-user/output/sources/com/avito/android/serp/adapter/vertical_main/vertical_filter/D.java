package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAnalyticParams;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerticalFilterPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f273369l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(v vVar) {
        super(0);
        this.f273369l = vVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        v vVar = this.f273369l;
        InterfaceC28373a interfaceC28373a = vVar.f273602b;
        SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = vVar.f273584J;
        interfaceC28373a.c(new Nr0.k(searchFormWidgetAnalyticParams != null ? searchFormWidgetAnalyticParams.getCategoryId() : null));
        return G0.f406611a;
    }
}

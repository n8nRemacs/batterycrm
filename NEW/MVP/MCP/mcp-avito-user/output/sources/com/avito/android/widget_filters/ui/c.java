package com.avito.android.widget_filters.ui;

import NP0.s;
import OP0.a;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WidgetFiltersFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WidgetFiltersFragment f330306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f330307m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WidgetFiltersFragment widgetFiltersFragment, s sVar) {
        super(0);
        this.f330306l = widgetFiltersFragment;
        this.f330307m = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        WidgetFiltersFragment.a aVar = WidgetFiltersFragment.f330270x0;
        KP0.d dVarR5 = this.f330306l.r5();
        s sVar = this.f330307m;
        dVarR5.accept(new a.w(sVar.f11514a, sVar.f11518e));
        return G0.f406611a;
    }
}

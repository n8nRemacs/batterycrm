package com.avito.android.inline_filters.dialog.numeric_range_select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f171925l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f171926m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f171927n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter, Y41.a<G0> aVar) {
        super(0);
        this.f171925l = (N) pVar;
        this.f171926m = filter;
        this.f171927n = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        this.f171925l.invoke(this.f171926m, new InlineFilterValue.InlineFilterNumericRangeSelectValue("", ""));
        ((q) this.f171927n).invoke();
        return G0.f406611a;
    }
}

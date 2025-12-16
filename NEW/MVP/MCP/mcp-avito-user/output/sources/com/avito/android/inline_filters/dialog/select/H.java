package com.avito.android.inline_filters.dialog.select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class H extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Filter, InlineFilterValue, G0> f172018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f172019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f172020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E f172021o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter, Y41.a<G0> aVar, E e12) {
        super(0);
        this.f172018l = pVar;
        this.f172019m = filter;
        this.f172020n = aVar;
        this.f172021o = e12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f172018l.invoke(this.f172019m, new InlineFilterValue.InlineFilterSelectValue(null));
        this.f172020n.invoke();
        this.f172021o.c();
        return G0.f406611a;
    }
}

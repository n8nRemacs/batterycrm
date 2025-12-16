package com.avito.android.inline_filters.dialog.select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: QuarterSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Filter, InlineFilterValue, G0> f172178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f172179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f172180n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Y41.p pVar, r rVar, Filter filter) {
        super(0);
        this.f172178l = pVar;
        this.f172179m = filter;
        this.f172180n = rVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        r rVar = this.f172180n;
        this.f172178l.invoke(this.f172179m, r.e(rVar, null));
        rVar.c();
        return G0.f406611a;
    }
}

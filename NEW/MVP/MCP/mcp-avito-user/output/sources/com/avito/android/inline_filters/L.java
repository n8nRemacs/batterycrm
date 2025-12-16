package com.avito.android.inline_filters;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class L extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f171005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchParams f171006m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f171007n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(z zVar, SearchParams searchParams, Filter.Onboarding onboarding) {
        super(0);
        this.f171005l = zVar;
        this.f171006m = searchParams;
        this.f171007n = onboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        z zVar = this.f171005l;
        CN.f fVar = zVar.f172415i;
        SearchParams searchParams = this.f171006m;
        fVar.a(searchParams);
        z.c(zVar, this.f171007n.getOnTapAction(), searchParams);
        return G0.f406611a;
    }
}

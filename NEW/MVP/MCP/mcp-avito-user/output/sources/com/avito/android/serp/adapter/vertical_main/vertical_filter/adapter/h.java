package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f273488l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f273489m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, i iVar) {
        super(0);
        this.f273488l = eVar;
        this.f273489m = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Filter filter = this.f273488l.f273466c;
        if (filter != null) {
            this.f273489m.f273490b.j(filter);
        }
        return G0.f406611a;
    }
}

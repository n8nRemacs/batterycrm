package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.checkbox;

import Y41.l;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterCheckboxItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e f273448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f273449m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e eVar, e eVar2) {
        super(1);
        this.f273448l = eVar;
        this.f273449m = eVar2;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        bool.getClass();
        Filter filter = this.f273448l.f273466c;
        if (filter != null) {
            this.f273449m.f273450b.j(filter);
        }
        return G0.f406611a;
    }
}

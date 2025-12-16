package com.avito.android.extended_profile_widgets.adapter.search.search_button;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.z;

/* compiled from: SearchButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f154773l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchButtonItem f154774m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, SearchButtonItem searchButtonItem) {
        super(0);
        this.f154773l = eVar;
        this.f154774m = searchButtonItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f154773l.f154775b.invoke(new z.c(this.f154774m));
        return G0.f406611a;
    }
}

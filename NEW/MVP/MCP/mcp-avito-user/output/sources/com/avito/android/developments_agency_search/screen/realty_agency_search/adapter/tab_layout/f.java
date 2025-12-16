package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout;

import Lw.InterfaceC14443a;
import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabLayoutItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "tabPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f138464l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f138464l = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        this.f138464l.f138465b.invoke(new InterfaceC14443a.u((Tab) Tab.f138453f.get(num.intValue())));
        return G0.f406611a;
    }
}

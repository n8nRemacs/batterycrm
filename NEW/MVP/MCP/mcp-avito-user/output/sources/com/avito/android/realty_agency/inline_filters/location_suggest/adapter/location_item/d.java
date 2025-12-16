package com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item;

import ji0.InterfaceC42386a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f251649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f251650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f251651n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, a aVar, e eVar) {
        super(0);
        this.f251649l = gVar;
        this.f251650m = aVar;
        this.f251651n = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f251650m;
        this.f251649l.setChecked(aVar.f251644g);
        e eVar = this.f251651n;
        eVar.f251652b.invoke(new InterfaceC42386a.C11575a(aVar.f251640c));
        return G0.f406611a;
    }
}

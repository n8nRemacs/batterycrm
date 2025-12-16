package com.avito.android.search.filter.adapter.group_clearance;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupClearanceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.search.filter.adapter.select.l f262323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262324m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.k f262325n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.search.filter.adapter.select.l lVar, g gVar, ParameterElement.k kVar) {
        super(0);
        this.f262323l = lVar;
        this.f262324m = gVar;
        this.f262325n = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f262323l.m("");
        this.f262324m.f262331d.accept(this.f262325n);
        return G0.f406611a;
    }
}

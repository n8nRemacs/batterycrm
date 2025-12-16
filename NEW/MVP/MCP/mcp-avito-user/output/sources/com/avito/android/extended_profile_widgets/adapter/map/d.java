package com.avito.android.extended_profile_widgets.adapter.map;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.v;

/* compiled from: MapItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f154553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MapItem f154554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, MapItem mapItem) {
        super(0);
        this.f154553l = eVar;
        this.f154554m = mapItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f154553l.f154555b.invoke(new v(this.f154554m.f154545e));
        return G0.f406611a;
    }
}

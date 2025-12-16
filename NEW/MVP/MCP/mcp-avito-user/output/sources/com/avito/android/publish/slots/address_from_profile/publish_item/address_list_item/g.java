package com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item;

import com.avito.android.publish.analytics.events.AddressChoiceType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectAddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f242865l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.slots.address_from_profile.publish_item.k f242866m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, com.avito.android.publish.slots.address_from_profile.publish_item.k kVar) {
        super(0);
        this.f242865l = hVar;
        this.f242866m = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f242865l;
        hVar.f242867b.v0(AddressChoiceType.f232214f);
        hVar.f242868c.K5(this.f242866m);
        return G0.f406611a;
    }
}

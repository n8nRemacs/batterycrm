package com.avito.android.profile.pro.impl.screen.item.delivery_restriction;

import D90.a;
import Y41.l;
import com.avito.android.profile.pro.impl.screen.item.delivery_restriction.ProfileProDeliveryRestrictionBannerItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProDeliveryRestrictionBannerItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l<D90.a, G0> f223197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProfileProDeliveryRestrictionBannerItem.DeliveryRestrictionAction f223198m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super D90.a, G0> lVar, ProfileProDeliveryRestrictionBannerItem.DeliveryRestrictionAction deliveryRestrictionAction) {
        super(0);
        this.f223197l = lVar;
        this.f223198m = deliveryRestrictionAction;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f223197l.invoke(new a.h(this.f223198m.f223192c));
        return G0.f406611a;
    }
}

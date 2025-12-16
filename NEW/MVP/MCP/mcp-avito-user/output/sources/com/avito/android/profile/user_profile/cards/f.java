package com.avito.android.profile.user_profile.cards;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.passport.DeliveryRestrictionCard;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileInfoDeliveryRestrictionSubView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f224960l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeliveryRestrictionCard.DeliveryRestrictionAction f224961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Y41.l<? super DeepLink, G0> lVar, DeliveryRestrictionCard.DeliveryRestrictionAction deliveryRestrictionAction) {
        super(0);
        this.f224960l = lVar;
        this.f224961m = deliveryRestrictionAction;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f224960l.invoke(this.f224961m.f225117c);
        return G0.f406611a;
    }
}

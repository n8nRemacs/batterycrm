package com.avito.android.profile.user_profile.cards.address;

import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.address.r;
import com.avito.android.remote.model.user_profile.items.SuggestedAddress;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmptyAddressCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CardItem.EmptyAddressCardItem f224744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f224745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CardItem.EmptyAddressCardItem emptyAddressCardItem, o oVar) {
        super(0);
        this.f224744l = emptyAddressCardItem;
        this.f224745m = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CardItem.EmptyAddressCardItem emptyAddressCardItem = this.f224744l;
        SuggestedAddress suggestedAddress = emptyAddressCardItem.f224399j;
        if (suggestedAddress != null) {
            this.f224745m.f224748d.K5(new r.a(emptyAddressCardItem.f224393d, suggestedAddress.getSuggestedAddressId()));
        }
        return G0.f406611a;
    }
}

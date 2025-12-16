package com.avito.android.profile.user_profile.cards.diff;

import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.ServiceBookingItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ProfileCardsDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;", "invoke", "(Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class a extends N implements Y41.l<ServiceBookingItem.Action, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TV0.a f224933l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TV0.a aVar) {
        super(1);
        this.f224933l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(ServiceBookingItem.Action action) {
        return Boolean.valueOf(!L.f(action, ((CardItem.ServiceBookingCardItem) this.f224933l).f224564h));
    }
}

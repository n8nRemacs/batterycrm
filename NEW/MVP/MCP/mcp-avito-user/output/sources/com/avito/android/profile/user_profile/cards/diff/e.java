package com.avito.android.profile.user_profile.cards.diff;

import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ProfileCardsDiffCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<Boolean, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TV0.a f224937l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TV0.a aVar) {
        super(1);
        this.f224937l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Boolean bool) {
        return Boolean.valueOf(!L.f(bool, Boolean.valueOf(((CardItem.ServiceBookingCardItem) this.f224937l).f224560d)));
    }
}

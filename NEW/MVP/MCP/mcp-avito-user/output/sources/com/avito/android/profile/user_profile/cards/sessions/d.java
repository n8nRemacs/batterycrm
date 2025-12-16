package com.avito.android.profile.user_profile.cards.sessions;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileSessionsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CardItem.SessionsCardItem f225512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f225513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardItem.SessionsCardItem sessionsCardItem, e eVar) {
        super(0);
        this.f225512l = sessionsCardItem;
        this.f225513m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CardItem.SessionsCardItem sessionsCardItem = this.f225512l;
        if (sessionsCardItem.f224575f != null) {
            this.f225513m.f225514b.invoke(new InterfaceC15503a.k(sessionsCardItem));
        }
        return G0.f406611a;
    }
}

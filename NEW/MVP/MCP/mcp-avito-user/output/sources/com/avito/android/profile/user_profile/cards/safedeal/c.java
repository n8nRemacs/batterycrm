package com.avito.android.profile.user_profile.cards.safedeal;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeDealSettingsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f225372l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.SafeDealSettingsCardItem f225373m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, CardItem.SafeDealSettingsCardItem safeDealSettingsCardItem) {
        super(0);
        this.f225372l = dVar;
        this.f225373m = safeDealSettingsCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f225372l.f225374b.invoke(new InterfaceC15503a.k(this.f225373m));
        return G0.f406611a;
    }
}

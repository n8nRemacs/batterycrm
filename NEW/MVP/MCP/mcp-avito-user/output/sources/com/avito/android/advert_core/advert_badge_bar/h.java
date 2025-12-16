package com.avito.android.advert_core.advert_badge_bar;

import h8.C40780a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertBadgeBarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertBadgeBarItem f82727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f82728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AdvertBadgeBarItem advertBadgeBarItem, f fVar) {
        super(0);
        this.f82727l = advertBadgeBarItem;
        this.f82728m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertBadgeBarItem advertBadgeBarItem = this.f82727l;
        advertBadgeBarItem.f82713i = true;
        f fVar = this.f82728m;
        fVar.f82722b.c(new C40780a(advertBadgeBarItem.f82708d));
        return G0.f406611a;
    }
}

package com.avito.android.favorites;

import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasNotSyncedItems", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class U0 extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156333l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(C30684r0 c30684r0) {
        super(1);
        this.f156333l = c30684r0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        C30684r0 c30684r0 = this.f156333l;
        OrderState orderStateA = OrderState.a(c30684r0.f157460c0, "distance__asc", false, 29);
        c30684r0.f157460c0 = orderStateA;
        x1 x1Var = c30684r0.f157454Y;
        if (x1Var != null) {
            OrderEntity orderEntityC = orderStateA.c();
            x1Var.m(orderEntityC != null ? orderEntityC.f156312c : null, c30684r0.f157460c0.f156317f);
        }
        if (bool2.booleanValue()) {
            c30684r0.f157466f0 = true;
            FavoritesFragment favoritesFragment = c30684r0.f157455Z;
            if (favoritesFragment != null) {
                favoritesFragment.F5();
            }
        } else {
            C30684r0.L(c30684r0, true, 6);
        }
        return kotlin.G0.f406611a;
    }
}

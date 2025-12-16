package com.avito.android.profile.user_profile.cards.silent_update;

import Ua0.InterfaceC15503a;
import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SilentUpdatePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f225529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CloseInternalBannerRotationDeepLink f225530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, CloseInternalBannerRotationDeepLink closeInternalBannerRotationDeepLink) {
        super(0);
        this.f225529l = iVar;
        this.f225530m = closeInternalBannerRotationDeepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f225529l;
        iVar.f225532c.invoke(InterfaceC15503a.b.f16449a);
        iVar.f225532c.invoke(new InterfaceC15503a.C1130a(this.f225530m, false, 2, null));
        return G0.f406611a;
    }
}

package com.avito.android.advert.item.wallet_info;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletInfoPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeepLink f80727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f80728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeepLink deepLink, f fVar) {
        super(0);
        this.f80727l = deepLink;
        this.f80728m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f80728m;
        DeepLink deepLink = this.f80727l;
        if (deepLink != null) {
            b.a.a(fVar.f80730c, deepLink, null, null, 6);
        }
        fVar.f80731d.c(new c());
        return G0.f406611a;
    }
}

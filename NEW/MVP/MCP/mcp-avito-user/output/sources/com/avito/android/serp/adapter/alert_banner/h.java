package com.avito.android.serp.adapter.alert_banner;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.alert_banner.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47691c;

/* compiled from: AlertBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AlertBannerItem f268913l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f268914m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AlertBannerItem alertBannerItem, j jVar) {
        super(0);
        this.f268913l = alertBannerItem;
        this.f268914m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        Action action = this.f268913l.f268901f;
        if (action != null && (deepLink = action.getDeepLink()) != null) {
            InterfaceC47691c.a.a(this.f268914m.f268918c.get(), deepLink, null, 14);
        }
        return G0.f406611a;
    }
}

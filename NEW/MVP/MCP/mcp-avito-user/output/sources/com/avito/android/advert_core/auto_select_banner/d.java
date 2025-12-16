package com.avito.android.advert_core.auto_select_banner;

import Y41.l;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import hc.C40911a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectBannerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f82904l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectBannerItem f82905m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AutoSelectBannerItem autoSelectBannerItem) {
        super(1);
        this.f82904l = eVar;
        this.f82905m = autoSelectBannerItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        e eVar = this.f82904l;
        C40911a.C11264a c11264a = C40911a.f397284g;
        AutoSelectBannerItem autoSelectBannerItem = this.f82905m;
        String str = autoSelectBannerItem.f82894f;
        c11264a.getClass();
        eVar.f82908d.c(new C40911a(FromPage.f90014d, str, eVar.f82907c, autoSelectBannerItem.f82893e));
        b.a.a(eVar.f82906b, deepLink, null, null, 6);
        return G0.f406611a;
    }
}

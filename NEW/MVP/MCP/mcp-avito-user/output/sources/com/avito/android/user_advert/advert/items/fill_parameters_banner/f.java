package com.avito.android.user_advert.advert.items.fill_parameters_banner;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FillParametersBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FillParametersBannerItem f309401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f309402m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FillParametersBannerItem fillParametersBannerItem, g gVar) {
        super(0);
        this.f309401l = fillParametersBannerItem;
        this.f309402m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        DeepLink deepLink = this.f309401l.f309391f;
        if (deepLink != null && (myAdvertDetailsActivity = this.f309402m.f309403b) != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.t7(deepLink);
        }
        return G0.f406611a;
    }
}

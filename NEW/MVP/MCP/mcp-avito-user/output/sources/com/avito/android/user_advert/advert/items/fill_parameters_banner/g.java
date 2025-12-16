package com.avito.android.user_advert.advert.items.fill_parameters_banner;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FillParametersBannerPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/fill_parameters_banner/g;", "Lcom/avito/android/user_advert/advert/items/fill_parameters_banner/e;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309403b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        FillParametersBannerItem fillParametersBannerItem = (FillParametersBannerItem) aVar;
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309403b;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.x9();
        }
        cVar.setTitle(fillParametersBannerItem.f309388c);
        cVar.h(fillParametersBannerItem.f309389d);
        cVar.P(fillParametersBannerItem.f309390e, new f(fillParametersBannerItem, this));
    }

    @Override // com.avito.android.user_advert.advert.items.fill_parameters_banner.e
    public final void c0() {
        this.f309403b = null;
    }

    @Override // com.avito.android.user_advert.advert.items.fill_parameters_banner.e
    public final void u1(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309403b = myAdvertDetailsActivity;
    }
}

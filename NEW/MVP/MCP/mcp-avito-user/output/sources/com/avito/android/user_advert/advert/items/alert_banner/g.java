package com.avito.android.user_advert.advert.items.alert_banner;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AlertBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/alert_banner/g;", "Lcom/avito/android/user_advert/advert/items/alert_banner/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309194b;

    @Inject
    public g() {
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.d
    public final void H2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309194b = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.x3(aVar2.f309181d);
        iVar.b(aVar2.f309180c);
        iVar.X4(aVar2.f309182e);
        iVar.Y0(aVar2.f309184g, new e(this, aVar2));
        iVar.S(new f(this, aVar2));
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309194b;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.y1(aVar2);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.d
    public final void c0() {
        this.f309194b = null;
    }
}

package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MachineryRentalBannerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f309588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f309589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, e eVar) {
        super(0);
        this.f309588l = jVar;
        this.f309589m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309588l.f309596g;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.R3(this.f309589m);
        }
        return G0.f406611a;
    }
}

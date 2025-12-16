package com.avito.android.advert_core.service_education;

import a9.InterfaceC19700a;
import com.avito.android.account.E;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertServiceEducationPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/service_education/l;", "Lcom/avito/android/advert_core/service_education/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19700a f84322b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f84323c;

    @Inject
    public l(@Y61.k InterfaceC19700a interfaceC19700a, @Y61.k E e12) {
        this.f84322b = interfaceC19700a;
        this.f84323c = e12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        ServiceEducationItem serviceEducationItem = (ServiceEducationItem) aVar;
        if (!serviceEducationItem.f84299k) {
            this.f84322b.a(serviceEducationItem.f84292d, this.f84323c.a(), serviceEducationItem.f84297i);
            serviceEducationItem.f84299k = true;
        }
        nVar.D(serviceEducationItem.f84293e);
        boolean z12 = serviceEducationItem.f84295g;
        List<ServiceEducationValue> list = serviceEducationItem.f84294f;
        if (z12 || list.size() < 3) {
            nVar.B(list);
        } else {
            nVar.B(list.subList(0, 3));
        }
        if (list.size() <= 3) {
            nVar.i30();
            nVar.ga(null);
        } else {
            nVar.bd();
            nVar.i9(serviceEducationItem.f84295g);
            nVar.ga(new k(serviceEducationItem, nVar, this));
        }
    }
}

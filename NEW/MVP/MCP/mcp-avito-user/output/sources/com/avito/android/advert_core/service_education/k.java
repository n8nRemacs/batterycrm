package com.avito.android.advert_core.service_education;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertServiceEducationPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceEducationItem f84319l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f84320m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f84321n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ServiceEducationItem serviceEducationItem, n nVar, l lVar) {
        super(0);
        this.f84319l = serviceEducationItem;
        this.f84320m = nVar;
        this.f84321n = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ServiceEducationItem serviceEducationItem = this.f84319l;
        boolean z12 = serviceEducationItem.f84295g;
        serviceEducationItem.f84295g = !z12;
        List<ServiceEducationValue> list = serviceEducationItem.f84294f;
        n nVar = this.f84320m;
        if (z12) {
            nVar.K30(list.subList(0, 3));
            if (!serviceEducationItem.f84300l) {
                l lVar = this.f84321n;
                lVar.f84322b.b(serviceEducationItem.f84292d, lVar.f84323c.a(), serviceEducationItem.f84297i);
                serviceEducationItem.f84300l = true;
            }
        } else {
            nVar.TH(list);
            serviceEducationItem.f84296h = false;
        }
        return G0.f406611a;
    }
}

package com.avito.android.campaigns_sale.counter;

import Y61.k;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import vm.InterfaceC49346a;
import vm.InterfaceC49347b;

/* compiled from: CampaignsSaleCounterInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/counter/a;", "Lvm/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC49346a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49347b f113864a;

    @Inject
    public a(@k InterfaceC49347b interfaceC49347b) {
        this.f113864a = interfaceC49347b;
    }

    @Override // vm.InterfaceC49346a
    @k
    public final z<Integer> a() {
        return this.f113864a.a();
    }

    @Override // vm.InterfaceC49346a
    public final void b() {
        this.f113864a.b();
    }
}

package com.avito.android.campaigns_sale;

import com.avito.android.campaigns_sale.mvi.L;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import gj.InterfaceC40691b;
import im.InterfaceC41424a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;

/* compiled from: CampaignsSaleViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/campaigns_sale/E;", "Lcom/avito/android/arch/mvi/android/j;", "Lim/a;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState;", "Lim/b;", "Lgj/e;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class E extends com.avito.android.arch.mvi.android.j<InterfaceC41424a, CampaignsSaleState, im.b> implements gj.e {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f113847N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f113848O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public E(@Y61.k com.avito.android.campaigns_sale.beduin.custom_actions.c cVar, @Y61.k com.avito.android.campaigns_sale.beduin.custom_actions.a aVar, @Y61.k Wi.b bVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k L l12) {
        super(l12, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f113847N = interfaceC40691b;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f113848O = cVar2;
        cVar2.b(cVar.f113860b.t0(new C(this)));
        cVar2.b(aVar.f113857b.t0(new B(this)));
        cVar2.b(bVar.f18020b.t0(new D(this)));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f113848O.dispose();
    }
}

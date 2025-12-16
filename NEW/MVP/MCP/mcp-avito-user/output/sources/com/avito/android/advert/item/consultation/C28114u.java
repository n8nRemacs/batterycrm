package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28114u extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28118y f74829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConsultationAfterIceBreakersItem f74830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28114u(ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, C28118y c28118y) {
        super(0);
        this.f74829l = c28118y;
        this.f74830m = consultationAfterIceBreakersItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC28130g0 interfaceC28130g0 = this.f74829l.f74854f;
        if (interfaceC28130g0 != null) {
            SuperFormInfo info = this.f74830m.f74646e.getInfo();
            interfaceC28130g0.F0(info != null ? info.getReviews() : null);
        }
        return G0.f406611a;
    }
}

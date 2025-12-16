package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28116w extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28118y f74846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConsultationAfterIceBreakersItem f74847m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28116w(ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, C28118y c28118y) {
        super(0);
        this.f74846l = c28118y;
        this.f74847m = consultationAfterIceBreakersItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SuperFormInfo info;
        InterfaceC28130g0 interfaceC28130g0 = this.f74846l.f74854f;
        if (interfaceC28130g0 != null) {
            ConsultationAfterIceBreaker consultationAfterIceBreaker = this.f74847m.f74646e;
            interfaceC28130g0.F0((consultationAfterIceBreaker == null || (info = consultationAfterIceBreaker.getInfo()) == null) ? null : info.getReviews());
        }
        return G0.f406611a;
    }
}

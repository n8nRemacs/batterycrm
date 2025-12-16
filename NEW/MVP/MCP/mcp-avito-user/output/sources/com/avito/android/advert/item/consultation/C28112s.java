package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28112s extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConsultationAfterIceBreakersItem f74794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28118y f74795m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28112s(ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, C28118y c28118y) {
        super(0);
        this.f74794l = consultationAfterIceBreakersItem;
        this.f74795m = c28118y;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink entryPointShowEvent;
        InterfaceC28130g0 interfaceC28130g0;
        SuperFormV4 infoV4 = this.f74794l.f74646e.getInfoV4();
        if (infoV4 != null && (entryPointShowEvent = infoV4.getEntryPointShowEvent()) != null && (interfaceC28130g0 = this.f74795m.f74854f) != null) {
            interfaceC28130g0.t(entryPointShowEvent);
        }
        return G0.f406611a;
    }
}

package com.avito.android.advert.item.consultation;

import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ConsultationAfterIceBreakersItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.consultation.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28113t extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConsultationAfterIceBreakersItem f74827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28118y f74828m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28113t(ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, C28118y c28118y) {
        super(0);
        this.f74827l = consultationAfterIceBreakersItem;
        this.f74828m = c28118y;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AttributedText landing;
        List<Attribute> attributes;
        C28118y c28118y;
        InterfaceC28130g0 interfaceC28130g0;
        SuperFormV4 infoV4 = this.f74827l.f74646e.getInfoV4();
        if (infoV4 != null && (landing = infoV4.getLanding()) != null && (attributes = landing.getAttributes()) != null && (interfaceC28130g0 = (c28118y = this.f74828m).f74854f) != null) {
            interfaceC28130g0.P(c28118y.f74851c.b(((LinkAttribute) C42745f0.E(attributes)).getUrl()));
        }
        return G0.f406611a;
    }
}

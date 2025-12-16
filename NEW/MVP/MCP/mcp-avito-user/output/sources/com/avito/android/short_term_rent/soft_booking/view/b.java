package com.avito.android.short_term_rent.soft_booking.view;

import Y41.p;
import android.view.View;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.RefundRules;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypeDetails;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypes;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import pw0.C47159c;
import qw0.C47455a;
import rw0.AbstractC47927b;
import rw0.AbstractC47928c;
import rw0.C47926a;
import rw0.C47930e;
import rw0.o;
import rw0.s;

/* compiled from: StrSoftBookingViewHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {
    void A(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void B(@Y61.l pw0.k kVar);

    void C(@Y61.k p<? super String, ? super StrSoftBookingContactFieldType, G0> pVar);

    void D(@Y61.k p<? super String, ? super String, G0> pVar);

    void E(@Y61.k Y41.a<G0> aVar);

    void F(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list);

    void G(@Y61.l String str, @Y61.k List<? extends List<RetroBadgeItem>> list);

    void H(@Y61.l RefundRules refundRules);

    void I(@Y61.k Y41.l<? super String, G0> lVar);

    void J(@Y61.l PaymentTypeDetails paymentTypeDetails);

    void K(@Y61.k AbstractC47928c abstractC47928c);

    void L(@Y61.k Y41.a<G0> aVar);

    void M(@Y61.k AbstractC47927b abstractC47927b);

    void N(@Y61.l AttributedText attributedText);

    void O(@Y61.k Y41.a<G0> aVar);

    void P(@Y61.k rw0.i iVar);

    void a(@Y61.k String str);

    void b(@Y61.k Y41.a<G0> aVar);

    void c(@Y61.k o oVar);

    void d(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void e(@Y61.l PaymentTypes paymentTypes);

    void f(@Y61.k Y41.a<G0> aVar);

    void g(@Y61.k Y41.a<G0> aVar);

    void h(@Y61.l C47455a c47455a);

    void i(@Y61.k Y41.a<G0> aVar);

    void j(@Y61.k Y41.a<G0> aVar);

    void k(@Y61.k p<? super View, ? super String, G0> pVar);

    void l(@Y61.k Y41.a<G0> aVar);

    void m(@Y61.k AttributedText attributedText);

    void n(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void o(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void p(@Y61.k Y41.l<? super rw0.j, G0> lVar);

    void q(@Y61.l s sVar);

    void r(@Y61.k rw0.h hVar);

    void s(@Y61.k Y41.a<G0> aVar);

    void t(@Y61.k Y41.l<? super String, G0> lVar);

    void u();

    void v(@Y61.k C47930e c47930e, @Y61.k C47159c c47159c);

    void w(@Y61.k Y41.a<G0> aVar);

    void x(@Y61.k Y41.a<G0> aVar);

    void y(@Y61.k C47926a c47926a);

    void z(@Y61.k rw0.l lVar);
}

package com.avito.android.service_booking_common.blueprints.contact;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_booking.SbContactBlock;
import com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbContactItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/contact/h;", "Lcom/avito/android/service_booking_common/blueprints/contact/d;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f276302b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f276303c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ServiceBookingItemDetailsActivity f276304d;

    @Inject
    public h() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f276302b = cVar;
        this.f276303c = cVar;
    }

    @Override // com.avito.android.service_booking_common.blueprints.contact.d
    public final void D7(@k ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity) {
        this.f276304d = serviceBookingItemDetailsActivity;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (c) aVar);
    }

    @Override // com.avito.android.service_booking_common.blueprints.contact.d
    public final void e() {
        this.f276304d = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.service_booking_common.e) {
                obj = obj2;
            }
        }
        com.avito.android.service_booking_common.e eVar2 = (com.avito.android.service_booking_common.e) (obj instanceof com.avito.android.service_booking_common.e ? obj : null);
        if (eVar2 == null) {
            k(jVar, cVar);
            return;
        }
        TextView textView = jVar.f276310e;
        String str = eVar2.f276560a;
        boolean z12 = false;
        I5.a(textView, str, false);
        String str2 = eVar2.f276561b;
        jVar.B80(str2, str);
        if (str2 == null && str != null && str.length() != 0) {
            z12 = true;
        }
        D6.G(jVar.f276311f, z12);
        g gVar = new g(cVar, this);
        Boolean bool = eVar2.f276562c;
        A a12 = new A(4, gVar);
        View view = jVar.f276307b;
        view.setOnClickListener(a12);
        view.setClickable(bool.booleanValue());
    }

    public final void k(@k j jVar, @k c cVar) {
        I5.a(jVar.f276313h, cVar.f276291f, false);
        String str = cVar.f276293h;
        String str2 = cVar.f276295j;
        jVar.B80(str, str2);
        I5.a(jVar.f276310e, str2, false);
        D6.G(jVar.f276311f, (str != null || str2 == null || str2.length() == 0) ? false : true);
        I5.a(jVar.f276308c, cVar.f276288c, false);
        SbContactBlock.Icon icon = cVar.f276289d;
        Button button = jVar.f276309d;
        if (icon != null) {
            D6.G(button, true);
            button.setImageDrawable(C35835l0.h(R.attr.ic_chat20, button.getContext()));
        } else {
            D6.w(button);
        }
        button.setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(28, new e(cVar, this)));
        A a12 = new A(4, new f(cVar, this));
        View view = jVar.f276307b;
        view.setOnClickListener(a12);
        view.setClickable(cVar.f276294i);
    }

    @Override // com.avito.android.service_booking_common.blueprints.contact.d
    @k
    /* renamed from: o7, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF276303c() {
        return this.f276303c;
    }
}

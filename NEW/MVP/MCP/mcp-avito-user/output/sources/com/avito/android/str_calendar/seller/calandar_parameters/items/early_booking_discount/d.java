package com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.str_calendar.seller.calandar_parameters.C35092c;
import com.avito.android.str_calendar.seller.calandar_parameters.items.input.j;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyBookingDiscountItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/early_booking_discount/d;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/early_booking_discount/f;", "Lcom/avito/android/category_parameters/ParameterElement$j;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.f<f, ParameterElement.C29382j> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287174b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.str_calendar.seller.calandar_parameters.items.input.g f287175c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287174b = lVar;
        this.f287175c = new com.avito.android.str_calendar.seller.calandar_parameters.items.input.g(lVar, false);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (ParameterElement.C29382j) aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        C35092c c35092c;
        ?? Previous;
        f fVar = (f) eVar;
        ParameterElement.C29382j c29382j = (ParameterElement.C29382j) aVar;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                Previous = 0;
                break;
            }
            Previous = listIterator.previous();
            if ((Previous instanceof C35092c) && L.f(((C35092c) Previous).f286746a, c29382j.f117181b)) {
                break;
            }
        }
        if (Previous != 0) {
            c35092c = Previous instanceof C35092c ? Previous : null;
        }
        if (c35092c == null) {
            k(fVar, c29382j);
            return;
        }
        j jVarOc = fVar.oc();
        List listV = C42745f0.V(c35092c.f286747b);
        ParameterElement.p pVar = c29382j.f117446g;
        com.avito.android.str_calendar.seller.calandar_parameters.items.input.g gVar = this.f287175c;
        gVar.O(jVarOc, pVar, listV);
        gVar.O(fVar.r7(), c29382j.f117447h, C42745f0.V(c35092c.f286748c));
        fVar.Zf(c35092c.f286749d);
        fVar.W7(new c(this));
    }

    public final void k(@k f fVar, @k ParameterElement.C29382j c29382j) {
        j jVarOc = fVar.oc();
        com.avito.android.str_calendar.seller.calandar_parameters.items.input.g gVar = this.f287175c;
        gVar.k(jVarOc, c29382j.f117446g);
        gVar.k(fVar.r7(), c29382j.f117447h);
        String str = c29382j.f117444e;
        fVar.FH(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.seller_calendar_early_booking_discount_title, new Serializable[0]));
        fVar.Zf(c29382j.f117445f);
        fVar.W7(new c(this));
    }
}

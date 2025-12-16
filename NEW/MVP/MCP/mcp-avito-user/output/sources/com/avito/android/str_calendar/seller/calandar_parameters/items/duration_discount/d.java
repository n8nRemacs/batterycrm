package com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.str_calendar.seller.calandar_parameters.C35091b;
import com.avito.android.str_calendar.seller.calandar_parameters.items.input.j;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DurationDiscountSelectItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/duration_discount/d;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/duration_discount/f;", "Lcom/avito/android/category_parameters/ParameterElement$i;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.f<f, ParameterElement.C29381i> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287162b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.str_calendar.seller.calandar_parameters.items.input.g f287163c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287162b = lVar;
        this.f287163c = new com.avito.android.str_calendar.seller.calandar_parameters.items.input.g(lVar, false);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ParameterElement.C29381i c29381i = (ParameterElement.C29381i) aVar;
        j jVarOc = fVar.oc();
        com.avito.android.str_calendar.seller.calandar_parameters.items.input.g gVar = this.f287163c;
        gVar.k(jVarOc, c29381i.f117440e);
        gVar.k(fVar.r7(), c29381i.f117441f);
        fVar.L5(new c(this, c29381i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        C35091b c35091b;
        ?? Previous;
        f fVar = (f) eVar;
        ParameterElement.C29381i c29381i = (ParameterElement.C29381i) aVar;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                Previous = 0;
                break;
            }
            Previous = listIterator.previous();
            if ((Previous instanceof C35091b) && L.f(((C35091b) Previous).f286732a, c29381i.f117181b)) {
                break;
            }
        }
        if (Previous != 0) {
            c35091b = Previous instanceof C35091b ? Previous : null;
        }
        com.avito.android.str_calendar.seller.calandar_parameters.items.input.g gVar = this.f287163c;
        if (c35091b == null) {
            gVar.k(fVar.oc(), c29381i.f117440e);
            gVar.k(fVar.r7(), c29381i.f117441f);
            fVar.L5(new c(this, c29381i));
        } else {
            gVar.O(fVar.oc(), c29381i.f117440e, C42745f0.V(c35091b.f286733b));
            gVar.O(fVar.r7(), c29381i.f117441f, C42745f0.V(c35091b.f286734c));
            fVar.L5(new c(this, c29381i));
        }
    }
}

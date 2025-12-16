package com.avito.android.str_calendar.seller.calandar_parameters;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrCalendarParametersDiffCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/w;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w extends C23424o.f<TV0.a> {
    @Inject
    public w() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof ParameterElement.C) && (aVar4 instanceof ParameterElement.C)) {
            ParameterElement.C c12 = (ParameterElement.C) aVar3;
            ParameterElement.C c13 = (ParameterElement.C) aVar4;
            if (L.f(c12.f117212h, c13.f117212h) && L.f(c12.f117208d, c13.f117208d) && L.f(c12.f117214j, c13.f117214j)) {
                return true;
            }
        } else if ((aVar3 instanceof ParameterElement.p) && (aVar4 instanceof ParameterElement.p)) {
            ParameterElement.p pVar = (ParameterElement.p) aVar3;
            ParameterElement.p pVar2 = (ParameterElement.p) aVar4;
            if (L.f(pVar.f117481f, pVar2.f117481f) && L.f(pVar.f117482g, pVar2.f117482g) && L.f(pVar.f117480e, pVar2.f117480e)) {
                return true;
            }
        } else {
            if ((aVar3 instanceof ParameterElement.n.b) && (aVar4 instanceof ParameterElement.n.b)) {
                return L.f(((ParameterElement.n.b) aVar3).f117470d, ((ParameterElement.n.b) aVar4).f117470d);
            }
            if ((aVar3 instanceof JO.m) && (aVar4 instanceof JO.m)) {
                if (aVar3.equals(aVar4) && L.f(((JO.m) aVar3).f8962c, ((JO.m) aVar4).f8962c)) {
                    return true;
                }
            } else {
                if ((aVar3 instanceof ParameterElement.C29375c) && (aVar4 instanceof ParameterElement.C29375c)) {
                    return aVar3.equals(aVar4);
                }
                if ((aVar3 instanceof ParameterElement.C29381i) && (aVar4 instanceof ParameterElement.C29381i)) {
                    return aVar3.equals(aVar4);
                }
                if ((aVar3 instanceof ParameterElement.C29382j) && (aVar4 instanceof ParameterElement.C29382j)) {
                    return aVar3.equals(aVar4);
                }
                if ((aVar3 instanceof com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a) && (aVar4 instanceof com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a)) {
                    return aVar3.equals(aVar4);
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF273715b() == aVar4.getF273715b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    @Y61.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object c(@Y61.k TV0.a aVar, @Y61.k TV0.a aVar2) {
        Object c35093d;
        C35093d c35093d2;
        C35093d c35093d3;
        C35093d c35093d4 = null;
        C35093d c35093d5 = null;
        if ((aVar instanceof ParameterElement.C) && (aVar2 instanceof ParameterElement.C)) {
            ParameterElement.C c12 = (ParameterElement.C) aVar2;
            String str = c12.f117214j;
            c35093d = new C35100k(str);
            ParameterElement.C c13 = (ParameterElement.C) aVar;
            if (L.f(c13.f117214j, str) && L.f(c13.f117212h, c12.f117212h)) {
                return null;
            }
        } else if ((aVar instanceof ParameterElement.p) && (aVar2 instanceof ParameterElement.p)) {
            ParameterElement.p pVar = (ParameterElement.p) aVar2;
            String str2 = pVar.f117481f;
            c35093d = new C35093d();
            ParameterElement.p pVar2 = (ParameterElement.p) aVar;
            if (L.f(pVar2.f117481f, str2) && L.f(pVar2.f117482g, pVar.f117482g)) {
                return null;
            }
        } else if ((aVar instanceof JO.m) && (aVar2 instanceof JO.m)) {
            boolean z12 = ((JO.m) aVar2).f8964e;
            c35093d = new l();
            if (((JO.m) aVar).f8964e == z12) {
                return null;
            }
        } else if ((aVar instanceof ParameterElement.C29375c) && (aVar2 instanceof ParameterElement.C29375c)) {
            c35093d = G0.f406611a;
            if (!L.f(((ParameterElement.C29375c) aVar).f117181b, ((ParameterElement.C29375c) aVar2).f117181b)) {
                return null;
            }
        } else if ((aVar instanceof ParameterElement.C29381i) && (aVar2 instanceof ParameterElement.C29381i)) {
            ParameterElement.C29381i c29381i = (ParameterElement.C29381i) aVar2;
            ParameterElement.C29381i c29381i2 = (ParameterElement.C29381i) aVar;
            Object objC = c(c29381i2.f117440e, c29381i.f117440e);
            if (objC != null) {
                if (!(objC instanceof C35093d)) {
                    objC = null;
                }
                c35093d3 = (C35093d) objC;
            } else {
                c35093d3 = null;
            }
            Object objC2 = c(c29381i2.f117441f, c29381i.f117441f);
            if (objC2 != null) {
                c35093d4 = (C35093d) (objC2 instanceof C35093d ? objC2 : null);
            }
            c35093d = new C35091b(c29381i.f117181b, c35093d3, c35093d4);
        } else if ((aVar instanceof ParameterElement.C29382j) && (aVar2 instanceof ParameterElement.C29382j)) {
            ParameterElement.C29382j c29382j = (ParameterElement.C29382j) aVar2;
            ParameterElement.C29382j c29382j2 = (ParameterElement.C29382j) aVar;
            Object objC3 = c(c29382j2.f117446g, c29382j.f117446g);
            if (objC3 != null) {
                if (!(objC3 instanceof C35093d)) {
                    objC3 = null;
                }
                c35093d2 = (C35093d) objC3;
            } else {
                c35093d2 = null;
            }
            Object objC4 = c(c29382j2.f117447h, c29382j.f117447h);
            if (objC4 != null) {
                c35093d5 = (C35093d) (objC4 instanceof C35093d ? objC4 : null);
            }
            c35093d = new C35092c(c29382j.f117181b, c35093d2, c35093d5, c29382j.f117445f);
        } else {
            if ((aVar instanceof com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a) && (aVar2 instanceof com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a)) {
                AttributedText attributedText = ((com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a) aVar).f287128c;
                AttributedText attributedText2 = ((com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.a) aVar2).f287128c;
                return new C35090a(L.f(attributedText, attributedText2) ? null : attributedText2);
            }
            if (!(aVar instanceof ParameterElement.x) || !(aVar2 instanceof ParameterElement.x)) {
                return null;
            }
            ParameterElement.p pVar3 = ((ParameterElement.x) aVar2).f117593f;
            pVar3.getClass();
            c35093d = new C35093d();
            if (L.f(((ParameterElement.x) aVar).f117593f.f117481f, pVar3.f117481f)) {
                return null;
            }
        }
        return c35093d;
    }
}

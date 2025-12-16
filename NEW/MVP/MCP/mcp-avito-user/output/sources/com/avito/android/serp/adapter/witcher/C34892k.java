package com.avito.android.serp.adapter.witcher;

import com.avito.android.serp.adapter.witcher.Appearance;
import com.avito.android.util.O2;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WitcherItemAppearanceDecorator.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/k;", "Lcom/avito/android/serp/adapter/witcher/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34892k implements InterfaceC34891j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f273867a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f273868b;

    @Inject
    public C34892k(@Y61.k M m12) {
        this.f273867a = m12;
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34891j
    public final void F0(boolean z12) {
        this.f273868b = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34891j
    public final void G0(@Y61.k D d12, @Y61.k WitcherItem witcherItem, @Y61.k WitcherSelectionType witcherSelectionType) {
        WidgetIndents widgetIndents;
        Appearance.Margins margins;
        Appearance.Paddings paddings;
        WidgetIndents widgetIndents2;
        Appearance.Margins margins2;
        Appearance.Paddings paddings2;
        WidgetIndents widgetIndents3;
        int f273793k;
        Appearance.Margins margins3;
        Appearance.Paddings paddings3;
        int f273787e;
        int f273786d;
        WidgetIndents widgetIndents4;
        Appearance.Margins margins4;
        Appearance.Paddings paddings4;
        WidgetIndents widgetIndents5;
        Appearance.Margins margins5;
        Appearance.Paddings paddings5;
        Appearance.Margins margins6;
        Appearance.Paddings paddings6;
        Appearance.Paddings paddings7;
        Appearance.Margins margins7;
        Object next;
        Appearance.Paddings paddings8;
        Appearance.Margins margins8;
        Object next2;
        Appearance.Paddings paddings9;
        Appearance.Margins margins9;
        Object next3;
        Object next4;
        Object next5;
        List<WidgetIndents> list = witcherItem.f273820k;
        WidgetIndents widgetIndents6 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next5 = null;
                    break;
                } else {
                    next5 = it.next();
                    if (((WidgetIndents) next5).f273800b == WidgetType.f273803b) {
                        break;
                    }
                }
            }
            widgetIndents = (WidgetIndents) next5;
        } else {
            widgetIndents = null;
        }
        if (widgetIndents == null || (margins = widgetIndents.f273801c) == null) {
            margins = new Appearance.Margins(0, 0, 0, 0, 15, null);
        }
        if (widgetIndents == null || (paddings = widgetIndents.f273802d) == null) {
            paddings = new Appearance.Paddings(0, 0, 0, 0, 15, null);
        }
        d12.ET(margins);
        d12.ET(paddings);
        boolean z12 = witcherItem.f273818i != null;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it2.next();
                    if (((WidgetIndents) next4).f273800b == WidgetType.f273804c) {
                        break;
                    }
                }
            }
            widgetIndents2 = (WidgetIndents) next4;
        } else {
            widgetIndents2 = null;
        }
        M m12 = this.f273867a;
        int f273785c = m12.getF273785c();
        boolean z13 = witcherItem.f273813d;
        int i12 = (z13 || this.f273868b) ? 0 : -1;
        int f273792j = z12 ? 0 : m12.getF273792j();
        if (widgetIndents2 == null || (margins2 = widgetIndents2.f273801c) == null) {
            margins2 = new Appearance.Margins(f273785c, 0, 0, 0, 14, null);
        }
        if (widgetIndents2 == null || (paddings2 = widgetIndents2.f273802d) == null) {
            paddings2 = new Appearance.Paddings(0, f273792j, i12, i12, 1, null);
        }
        d12.Qj(margins2);
        d12.Qj(paddings2);
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it3.next();
                    if (((WidgetIndents) next3).f273800b == WidgetType.f273805d) {
                        break;
                    }
                }
            }
            widgetIndents3 = (WidgetIndents) next3;
        } else {
            widgetIndents3 = null;
        }
        if (m12.getF273791i()) {
            if (widgetIndents3 != null && (margins9 = widgetIndents3.f273801c) != null) {
                d12.CZ(margins9);
            }
            if (widgetIndents3 != null && (paddings9 = widgetIndents3.f273802d) != null) {
                d12.CZ(paddings9);
            }
        } else {
            Integer num = witcherSelectionType.f273840c;
            Integer numValueOf = num != null ? Integer.valueOf(m12.e(num.intValue())) : null;
            if (z13 || this.f273868b) {
                f273793k = m12.getF273793k();
            } else {
                if (numValueOf != null) {
                    f273787e = numValueOf.intValue();
                    f273786d = m12.getF273786d();
                } else {
                    f273787e = m12.getF273787e();
                    f273786d = m12.getF273786d();
                }
                f273793k = f273786d + f273787e;
            }
            int i13 = f273793k;
            int f273793k2 = (z13 || this.f273868b) ? m12.getF273793k() : m12.getF273786d() + m12.getF273788f();
            int f273794l = !z13 ? m12.getF273794l() : -1;
            if (widgetIndents3 == null || (margins3 = widgetIndents3.f273801c) == null) {
                margins3 = new Appearance.Margins(f273794l, 0, i13, f273793k2, 2, null);
            }
            if (widgetIndents3 == null || (paddings3 = widgetIndents3.f273802d) == null) {
                paddings3 = new Appearance.Paddings(0, 0, 0, 0, 15, null);
            }
            d12.CZ(margins3);
            d12.CZ(paddings3);
        }
        if (list != null) {
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it4.next();
                    if (((WidgetIndents) next2).f273800b == WidgetType.f273806e) {
                        break;
                    }
                }
            }
            widgetIndents4 = (WidgetIndents) next2;
        } else {
            widgetIndents4 = null;
        }
        if (m12.getF273791i()) {
            if (widgetIndents4 != null && (margins8 = widgetIndents4.f273801c) != null) {
                d12.k30(margins8);
            }
            if (widgetIndents4 != null && (paddings8 = widgetIndents4.f273802d) != null) {
                d12.k30(paddings8);
            }
        } else {
            int f273793k3 = (z13 || this.f273868b) ? m12.getF273793k() : m12.getF273786d() + m12.getF273787e();
            int f273793k4 = (z13 || this.f273868b) ? m12.getF273793k() : m12.getF273786d() + m12.getF273788f();
            if (widgetIndents4 == null || (margins4 = widgetIndents4.f273801c) == null) {
                margins4 = new Appearance.Margins(0, 0, f273793k3, f273793k4, 3, null);
            }
            if (widgetIndents4 == null || (paddings4 = widgetIndents4.f273802d) == null) {
                paddings4 = new Appearance.Paddings(0, 0, 0, 0, 15, null);
            }
            d12.k30(margins4);
            d12.k30(paddings4);
        }
        if (list != null) {
            Iterator<T> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it5.next();
                    if (((WidgetIndents) next).f273800b == WidgetType.f273807f) {
                        break;
                    }
                }
            }
            widgetIndents5 = (WidgetIndents) next;
        } else {
            widgetIndents5 = null;
        }
        int f273795m = (z13 || this.f273868b) ? m12.getF273795m() : -1;
        int f273796n = m12.getF273796n();
        if (widgetIndents5 == null || (margins5 = widgetIndents5.f273801c) == null) {
            margins5 = new Appearance.Margins(f273796n, 0, 0, 0, 14, null);
        }
        if (widgetIndents5 == null || (paddings5 = widgetIndents5.f273802d) == null) {
            paddings5 = new Appearance.Paddings(0, 0, f273795m, f273795m, 3, null);
        }
        d12.Fe(margins5);
        d12.Fe(paddings5);
        if (list != null) {
            Iterator<T> it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next6 = it6.next();
                if (((WidgetIndents) next6).f273800b == WidgetType.f273808g) {
                    widgetIndents6 = next6;
                    break;
                }
            }
            widgetIndents6 = widgetIndents6;
        }
        if (m12.getF273791i()) {
            if (widgetIndents6 != null && (margins7 = widgetIndents6.f273801c) != null) {
                d12.GB(margins7);
            }
            if (widgetIndents6 != null && (paddings7 = widgetIndents6.f273802d) != null) {
                d12.GB(paddings7);
            }
        } else {
            int f273786d2 = m12.getF273786d() + m12.getF273789g();
            int f273786d3 = m12.getF273786d() + m12.getF273789g();
            int f273790h = m12.getF273790h();
            if (widgetIndents6 == null || (margins6 = widgetIndents6.f273801c) == null) {
                margins6 = new Appearance.Margins(0, f273790h, f273786d2, f273786d3, 1, null);
            }
            if (widgetIndents6 == null || (paddings6 = widgetIndents6.f273802d) == null) {
                paddings6 = new Appearance.Paddings(0, 0, 0, 0, 15, null);
            }
            d12.GB(margins6);
            d12.GB(paddings6);
        }
        if (O2.a(list)) {
            d12.s("indents_from_backend_tag");
        }
    }
}

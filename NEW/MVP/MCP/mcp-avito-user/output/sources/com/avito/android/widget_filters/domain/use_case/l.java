package com.avito.android.widget_filters.domain.use_case;

import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.mvi.entity.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersUpdateGuestsWidgetStateUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/use_case/l;", "Lcom/avito/android/widget_filters/domain/use_case/k;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.utils.b f329920a;

    @Inject
    public l(@Y61.k com.avito.android.widget_filters.utils.b bVar) {
        this.f329920a = bVar;
    }

    @Override // com.avito.android.widget_filters.domain.use_case.k
    @Y61.l
    public final d.c a(@Y61.k com.avito.android.widget_filters.mvi.entity.c cVar, @Y61.k WidgetFiltersInternalAction widgetFiltersInternalAction) {
        d.c cVar2 = cVar.f330104k;
        NP0.j jVarA = null;
        NP0.j jVarA2 = null;
        if (cVar2 == null) {
            return null;
        }
        boolean z12 = widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.ChangeAdultsValue;
        NP0.j jVar = cVar2.f330135i;
        if (z12) {
            return b(d.c.b(cVar2, null, false, jVar != null ? NP0.j.a(jVar, null, ((WidgetFiltersInternalAction.UpdateGuests.ChangeAdultsValue) widgetFiltersInternalAction).f330034b, null, null, 0, false, 8323071) : null, null, 191));
        }
        if (widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.AddChild) {
            if (jVar != null) {
                List<NP0.f> list = jVar.f11484r;
                NP0.f fVar = ((WidgetFiltersInternalAction.UpdateGuests.AddChild) widgetFiltersInternalAction).f330033b;
                jVarA = NP0.j.a(jVar, null, 0, C42745f0.i0(fVar, list), fVar.f11441a, 0, false, 7733247);
            }
            return b(d.c.b(cVar2, null, false, jVarA, null, 191));
        }
        if (!(widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.RemoveChild)) {
            if (!(widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateGuests.ChangeAnimalsSelected)) {
                return cVar2;
            }
            NP0.b bVar = cVar2.f330136j;
            return b(d.c.b(cVar2, null, false, null, bVar != null ? new NP0.b(bVar.f11420a, bVar.f11421b, bVar.f11422c, bVar.f11423d, bVar.f11424e, bVar.f11425f, ((WidgetFiltersInternalAction.UpdateGuests.ChangeAnimalsSelected) widgetFiltersInternalAction).f330035b) : null, 127));
        }
        if (jVar != null) {
            List<NP0.f> list2 = jVar.f11484r;
            NP0.f fVar2 = ((WidgetFiltersInternalAction.UpdateGuests.RemoveChild) widgetFiltersInternalAction).f330036b;
            ArrayList arrayListC0 = C42745f0.c0(list2, fVar2);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListC0, 10));
            Iterator it = arrayListC0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                NP0.f fVar3 = (NP0.f) next;
                arrayList.add(new NP0.f(this.f329920a.l(i13), fVar3.f11443c, fVar3.f11441a));
                i12 = i13;
            }
            jVarA2 = NP0.j.a(jVar, null, 0, arrayList, fVar2.f11441a, 0, false, 7733247);
        }
        return b(d.c.b(cVar2, null, false, jVarA2, null, 191));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.widget_filters.mvi.entity.d.c b(com.avito.android.widget_filters.mvi.entity.d.c r14) {
        /*
            r13 = this;
            NP0.j r0 = r14.f330135i
            r8 = 0
            r9 = 1
            com.avito.android.widget_filters.utils.b r10 = r13.f329920a
            r11 = 0
            if (r0 == 0) goto L48
            java.util.List<NP0.f> r1 = r0.f11484r
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r3 = r2.size()
            int r4 = r0.f11483q
            int r3 = r3 + r4
            int r4 = r0.f11480n
            if (r4 <= r3) goto L23
            int r2 = r2.size()
            int r3 = r0.f11482p
            if (r3 <= r2) goto L23
            r6 = r9
            goto L24
        L23:
            r6 = r8
        L24:
            int r2 = r1.size()
            int r2 = r2 + r9
            com.avito.android.printable_text.PrintableText r2 = r10.m(r2)
            int r1 = r1.size()
            int r4 = r4 - r1
            int r1 = r0.f11481o
            if (r4 <= r1) goto L38
            r5 = r1
            goto L39
        L38:
            r5 = r4
        L39:
            r3 = 0
            r4 = 0
            r7 = 0
            r12 = 2095103(0x1ff7ff, float:2.935865E-39)
            r1 = r2
            r2 = r7
            r7 = r12
            NP0.j r0 = NP0.j.a(r0, r1, r2, r3, r4, r5, r6, r7)
            r4 = r0
            goto L49
        L48:
            r4 = r11
        L49:
            com.avito.android.widget_filters.ui.items.guests.a r0 = r14.f330131e
            if (r0 == 0) goto L8b
            if (r4 == 0) goto L56
            int r1 = r4.f11483q
            com.avito.android.printable_text.PrintableText r1 = r10.d(r1)
            goto L57
        L56:
            r1 = r11
        L57:
            if (r4 == 0) goto L66
            java.util.List<NP0.f> r2 = r4.f11484r
            if (r2 == 0) goto L66
            int r2 = r2.size()
            com.avito.android.printable_text.PrintableText r2 = r10.s(r2)
            goto L67
        L66:
            r2 = r11
        L67:
            NP0.b r3 = r14.f330136j
            if (r3 == 0) goto L71
            boolean r3 = r3.f11426g
            com.avito.android.printable_text.PrintableText r11 = r10.e(r3)
        L71:
            com.avito.android.widget_filters.ui.items.guests.b r3 = new com.avito.android.widget_filters.ui.items.guests.b
            r3.<init>(r1, r2, r11)
            if (r4 == 0) goto L84
            java.util.List<NP0.f> r1 = r4.f11484r
            int r1 = r1.size()
            int r2 = r4.f11483q
            int r1 = r1 + r2
            if (r1 != 0) goto L84
            r8 = r9
        L84:
            com.avito.android.widget_filters.ui.items.guests.a r11 = new com.avito.android.widget_filters.ui.items.guests.a
            java.lang.String r0 = r0.f330400b
            r11.<init>(r3, r0, r8)
        L8b:
            r2 = r11
            r3 = 0
            r5 = 0
            r6 = 187(0xbb, float:2.62E-43)
            r1 = r14
            com.avito.android.widget_filters.mvi.entity.d$c r14 = com.avito.android.widget_filters.mvi.entity.d.c.b(r1, r2, r3, r4, r5, r6)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.domain.use_case.l.b(com.avito.android.widget_filters.mvi.entity.d$c):com.avito.android.widget_filters.mvi.entity.d$c");
    }
}

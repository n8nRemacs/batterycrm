package com.avito.android.short_term_rent.utils;

import com.avito.android.remote.model.StrBookingCalculation;
import com.avito.android.remote.model.StrBookingCalculationIcon;
import com.avito.android.remote.model.StrBookingCollapsedCalculation;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CollapsedCostInfo;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingCalculationsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/utils/e;", "Lcom/avito/android/short_term_rent/utils/d;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    @Override // com.avito.android.short_term_rent.utils.d
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pw0.g a(@Y61.k com.avito.android.remote.model.StrBookingCalculateDetailsResponse r18, @Y61.l pw0.g r19) {
        /*
            r17 = this;
            r0 = r19
            com.avito.android.remote.model.StrBookingCalculationOptions r1 = r18.getCalculationOptions()
            r2 = 0
            if (r1 == 0) goto L63
            java.util.List r1 = r1.getPayments()
            if (r1 == 0) goto L63
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C42745f0.q(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r1.next()
            com.avito.android.remote.model.Payment r4 = (com.avito.android.remote.model.Payment) r4
            java.util.List r5 = r4.getCalculations()
            r6 = r17
            java.util.ArrayList r13 = r6.b(r5)
            rw0.j r5 = new rw0.j
            java.lang.String r8 = r4.getId()
            int r9 = r4.getAmount()
            com.avito.android.remote.model.text.AttributedText r10 = r4.getTitle()
            boolean r11 = r4.isEnabled()
            boolean r12 = r4.isSelected()
            java.lang.String r14 = r4.getClickMessage()
            java.lang.Boolean r15 = r4.getShouldDisablePromoCodeInfo()
            java.lang.String r16 = r4.getPromoCodeDisabledText()
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r5)
            goto L20
        L60:
            r6 = r17
            goto L6b
        L63:
            r6 = r17
            if (r0 == 0) goto L6a
            java.util.List<rw0.j> r3 = r0.f428875a
            goto L6b
        L6a:
            r3 = r2
        L6b:
            if (r3 == 0) goto L9c
            r1 = r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L74:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L94
            java.lang.Object r4 = r1.next()
            r5 = r4
            rw0.j r5 = (rw0.j) r5
            java.lang.String r5 = r5.f437216b
            if (r0 == 0) goto L8c
            rw0.j r7 = r0.f428876b
            if (r7 == 0) goto L8c
            java.lang.String r7 = r7.f437216b
            goto L8d
        L8c:
            r7 = r2
        L8d:
            boolean r5 = kotlin.jvm.internal.L.f(r5, r7)
            if (r5 == 0) goto L74
            goto L95
        L94:
            r4 = r2
        L95:
            rw0.j r4 = (rw0.j) r4
            if (r4 != 0) goto L9a
            goto L9c
        L9a:
            r2 = r4
            goto Lb9
        L9c:
            if (r3 == 0) goto Lb9
            r0 = r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r0.next()
            r4 = r1
            rw0.j r4 = (rw0.j) r4
            boolean r4 = r4.f437220f
            if (r4 == 0) goto La5
            r2 = r1
        Lb7:
            rw0.j r2 = (rw0.j) r2
        Lb9:
            pw0.g r0 = new pw0.g
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.utils.e.a(com.avito.android.remote.model.StrBookingCalculateDetailsResponse, pw0.g):pw0.g");
    }

    @Override // com.avito.android.short_term_rent.utils.d
    @Y61.k
    public final ArrayList b(@Y61.k List list) {
        CostInfo costInfo;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StrBookingCalculation strBookingCalculation = (StrBookingCalculation) it.next();
            AttributedText title = strBookingCalculation.getTitle();
            AttributedText description = strBookingCalculation.getDescription();
            if (title == null || description == null) {
                costInfo = null;
            } else {
                String id2 = strBookingCalculation.getId();
                String hint = strBookingCalculation.getHint();
                StrBookingCalculationIcon icon = strBookingCalculation.getIcon();
                boolean zIsCollapsable = strBookingCalculation.isCollapsable();
                boolean zIsCollapsed = strBookingCalculation.isCollapsed();
                List<StrBookingCollapsedCalculation> collapsedCalculations = strBookingCalculation.getCollapsedCalculations();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collapsedCalculations) {
                    if (((StrBookingCollapsedCalculation) obj).getTitle() != null) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    StrBookingCollapsedCalculation strBookingCollapsedCalculation = (StrBookingCollapsedCalculation) it2.next();
                    arrayList3.add(new CollapsedCostInfo(strBookingCollapsedCalculation.getTitle(), strBookingCollapsedCalculation.getDescription(), strBookingCollapsedCalculation.getHint(), strBookingCollapsedCalculation.getIcon()));
                }
                costInfo = new CostInfo(id2, title, description, zIsCollapsable, zIsCollapsed, arrayList3, icon, hint);
            }
            if (costInfo != null) {
                arrayList.add(costInfo);
            }
        }
        return arrayList;
    }
}

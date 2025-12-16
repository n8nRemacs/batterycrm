package com.avito.android.comfortable_deal.end_deal.mvi.validator;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealFormValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/validator/b;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/validator/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.comfortable_deal.end_deal.mvi.validator.a
    public final boolean a(@k Map<String, ? extends EndDealField> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends EndDealField> entry : map.entrySet()) {
            if (entry.getValue().getF122253f()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List<com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput$Chip>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // com.avito.android.comfortable_deal.end_deal.mvi.validator.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap b(@Y61.k java.util.Map r11) {
        /*
            r10 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r11.size()
            int r1 = kotlin.collections.P0.f(r1)
            r0.<init>(r1)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L17:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            com.avito.android.comfortable_deal.end_deal.model.EndDealField r1 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField) r1
            boolean r3 = r1 instanceof com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L75
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput r1 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput) r1
            boolean r3 = r1.f122252e
            r6 = 1
            if (r3 == 0) goto L3f
            java.time.LocalDate r3 = r1.f122249b
            if (r3 != 0) goto L3f
            r5 = r6
        L3f:
            java.util.List<com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput$Chip> r3 = r1.f122251d
            if (r5 == 0) goto L45
            r7 = r3
            goto L46
        L45:
            r7 = r4
        L46:
            if (r7 == 0) goto L6e
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r3 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.C42745f0.q(r7, r8)
            r3.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L59:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r7.next()
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput$Chip r8 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput.Chip) r8
            r9 = 7
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput$Chip r8 = com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput.Chip.a(r8, r4, r4, r6, r9)
            r3.add(r8)
            goto L59
        L6e:
            r6 = 11
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput r1 = com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipDateInput.a(r1, r4, r3, r5, r6)
            goto Lcf
        L75:
            boolean r3 = r1 instanceof com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput
            if (r3 == 0) goto Lcf
            r3 = r1
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$RoubleInput r3 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput) r3
            boolean r6 = r3.f122276g
            r7 = 55
            if (r6 == 0) goto L99
            r6 = r1
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$RoubleInput r6 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput) r6
            boolean r6 = r6.X()
            if (r6 != 0) goto L99
            r1 = 2131952908(0x7f13050c, float:1.9542272E38)
            java.io.Serializable[] r5 = new java.io.Serializable[r5]
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.c(r1, r5)
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$RoubleInput r1 = com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput.a(r3, r4, r1, r7)
            goto Lcf
        L99:
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$RoubleInput r1 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput) r1
            boolean r1 = r1.X()
            if (r1 == 0) goto Lcb
            java.lang.Integer r1 = r3.f122275f
            if (r1 == 0) goto Laa
            int r1 = r1.intValue()
            goto Lab
        Laa:
            r1 = r5
        Lab:
            java.lang.String r6 = r3.f122271b
            if (r6 == 0) goto Lba
            java.lang.Integer r6 = kotlin.text.C43066x.y0(r6)
            if (r6 == 0) goto Lba
            int r6 = r6.intValue()
            goto Lbb
        Lba:
            r6 = -1
        Lbb:
            if (r1 <= r6) goto Lcb
            r1 = 2131952903(0x7f130507, float:1.9542262E38)
            java.io.Serializable[] r5 = new java.io.Serializable[r5]
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.c(r1, r5)
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$RoubleInput r1 = com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput.a(r3, r4, r1, r7)
            goto Lcf
        Lcb:
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$RoubleInput r1 = com.avito.android.comfortable_deal.end_deal.model.EndDealField.RoubleInput.a(r3, r4, r4, r7)
        Lcf:
            r0.put(r2, r1)
            goto L17
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.mvi.validator.b.b(java.util.Map):java.util.LinkedHashMap");
    }
}

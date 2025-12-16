package com.avito.android.short_term_rent.bookingform.mvi;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormStateContentBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/F;", "Lcom/avito/android/short_term_rent/bookingform/mvi/E;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F implements E {
    @Inject
    public F() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    @Override // com.avito.android.short_term_rent.bookingform.mvi.E
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.Map r24, @Y61.k java.util.Map r25, @Y61.k java.util.List r26) {
        /*
            r23 = this;
            r0 = r26
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = kotlin.collections.C42745f0.q(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r0.next()
            cw0.f r3 = (cw0.C39429f) r3
            java.util.List<com.avito.conveyor_item.a> r4 = r3.f393089b
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            int r5 = kotlin.collections.C42745f0.q(r4, r2)
            r8.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r4.next()
            com.avito.conveyor_item.a r5 = (com.avito.conveyor_item.a) r5
            boolean r6 = r5 instanceof com.avito.android.short_term_rent.bookingform.items.input.FormInputItem
            if (r6 == 0) goto L9b
            java.util.Set r6 = r24.keySet()
            r7 = r5
            com.avito.android.short_term_rent.bookingform.items.input.FormInputItem r7 = (com.avito.android.short_term_rent.bookingform.items.input.FormInputItem) r7
            java.lang.String r9 = r7.f281540c
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L9b
            java.lang.String r6 = r7.f281540c
            r11 = r24
            java.lang.Object r9 = r11.get(r6)
            aw0.e r9 = (aw0.e) r9
            if (r9 != 0) goto L5e
        L5b:
            r12 = r25
            goto L9e
        L5e:
            r12 = r25
            java.lang.Object r5 = r12.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L6d
            com.avito.android.short_term_rent.bookingform.items.input.FormInputState$Normal r5 = com.avito.android.short_term_rent.bookingform.items.input.FormInputState.Normal.f281549b
            r22 = r5
            goto L78
        L6d:
            com.avito.android.short_term_rent.bookingform.items.input.FormInputState$Error r6 = new com.avito.android.short_term_rent.bookingform.items.input.FormInputState$Error
            com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.f(r5)
            r6.<init>(r5)
            r22 = r6
        L78:
            com.avito.android.short_term_rent.bookingform.items.input.FormInputItem r5 = new com.avito.android.short_term_rent.bookingform.items.input.FormInputItem
            java.lang.Integer r6 = r7.f281545h
            boolean r10 = r7.f281546i
            java.lang.String r14 = r7.f281539b
            java.lang.String r15 = r7.f281540c
            java.lang.String r9 = r9.f56797a
            java.lang.String r13 = r7.f281542e
            com.avito.android.lib.design.input.FormatterType r2 = r7.f281543f
            java.lang.Integer r7 = r7.f281544g
            r17 = r13
            r13 = r5
            r16 = r9
            r18 = r2
            r19 = r7
            r20 = r6
            r21 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L9e
        L9b:
            r11 = r24
            goto L5b
        L9e:
            r8.add(r5)
            r2 = 10
            goto L30
        La4:
            r11 = r24
            r12 = r25
            cw0.f r2 = new cw0.f
            cw0.e r9 = r3.f393090c
            cw0.d r10 = r3.f393091d
            long r6 = r3.f393088a
            r5 = r2
            r5.<init>(r6, r8, r9, r10)
            r1.add(r2)
            r2 = 10
            goto L13
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.F.a(java.util.Map, java.util.Map, java.util.List):java.util.ArrayList");
    }
}

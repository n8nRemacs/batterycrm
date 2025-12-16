package com.avito.android.imv_cars_details.domain;

import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsPollInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/domain/e;", "Lcom/avito/android/imv_cars_details/domain/d;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f169962a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f169963b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f169964c;

    @Inject
    public e(@k g gVar, @k InterfaceC28373a interfaceC28373a, @k E e12) {
        this.f169962a = gVar;
        this.f169963b = interfaceC28373a;
        this.f169964c = e12;
    }

    @Override // com.avito.android.imv_cars_details.domain.d
    public final boolean a() {
        return this.f169962a.getF169968a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.avito.android.imv_cars_details.domain.d
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> b(@Y61.k java.util.List<? extends com.avito.conveyor_item.a> r20, @Y61.k com.avito.android.remote.model.PricePoll r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            com.avito.android.imv_cars_details.domain.g r1 = r0.f169962a
            r1.b()
            java.lang.Integer r1 = r21.getClickStreamEventId()
            r2 = 0
            if (r1 == 0) goto L28
            int r4 = r1.intValue()
            java.lang.Integer r1 = r21.getClickStreamVersion()
            if (r1 == 0) goto L28
            int r5 = r1.intValue()
            com.avito.android.account.E r1 = r0.f169964c
            java.lang.String r6 = r1.a()
            java.lang.String r7 = r21.getItemId()
            if (r7 != 0) goto L2a
        L28:
            r1 = r2
            goto L4a
        L2a:
            java.lang.Integer r1 = r21.getPollId()
            if (r1 == 0) goto L28
            int r8 = r1.intValue()
            java.lang.String r10 = r21.getPollLabel()
            if (r10 != 0) goto L3b
            goto L28
        L3b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            java.util.List r9 = java.util.Collections.singletonList(r1)
            com.avito.android.analytics.event.N0 r1 = new com.avito.android.analytics.event.N0
            r11 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L4a:
            if (r1 == 0) goto L51
            com.avito.android.analytics.a r3 = r0.f169963b
            r3.c(r1)
        L51:
            r1 = r20
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L5c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem
            if (r5 == 0) goto L5c
            goto L6c
        L6b:
            r4 = r2
        L6c:
            boolean r3 = r4 instanceof com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem
            if (r3 != 0) goto L71
            goto L72
        L71:
            r2 = r4
        L72:
            com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem r2 = (com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem) r2
            if (r2 != 0) goto L79
            r2 = r20
            goto Lc1
        L79:
            java.util.Iterator r3 = r20.iterator()
            r4 = 0
        L7e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L92
            java.lang.Object r5 = r3.next()
            com.avito.conveyor_item.a r5 = (com.avito.conveyor_item.a) r5
            boolean r5 = r5 instanceof com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem
            if (r5 == 0) goto L8f
            goto L93
        L8f:
            int r4 = r4 + 1
            goto L7e
        L92:
            r4 = -1
        L93:
            r17 = 1023(0x3ff, float:1.434E-42)
            r18 = 0
            com.avito.android.remote.model.PricePoll r5 = r2.f170140c
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            com.avito.android.remote.model.PricePoll r2 = com.avito.android.remote.model.PricePoll.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r3 = r2.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem r5 = new com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.ImvCarsDetailsPollItem
            r5.<init>(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r2.remove(r4)
            r2.add(r4, r5)
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.imv_cars_details.domain.e.b(java.util.List, com.avito.android.remote.model.PricePoll, int):java.util.List");
    }
}

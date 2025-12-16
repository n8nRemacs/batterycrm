package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlot;
import kotlin.Metadata;
import xe0.InterfaceC49930a;

/* compiled from: SectionSeparatorSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/w;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w extends com.avito.android.category_parameters.k<SectionSeparatorSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SectionSeparatorSlot f245195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49930a f245196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f245197d;

    public w(@Y61.k SectionSeparatorSlot sectionSeparatorSlot, @Y61.k InterfaceC49930a interfaceC49930a, @Y61.k Q1 q12) {
        this.f245195b = sectionSeparatorSlot;
        this.f245196c = interfaceC49930a;
        this.f245197d = q12;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f245195b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            r24 = this;
            r0 = r24
            com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlot r1 = r0.f245195b
            com.avito.android.remote.model.category_parameters.slot.SlotWidget r2 = r1.getWidget()
            com.avito.android.remote.model.category_parameters.slot.SlotConfig r2 = r2.getConfig()
            com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig r2 = (com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig) r2
            com.avito.android.remote.model.text.AttributedText r3 = r2.getAttributedSubtitle()
            if (r3 != 0) goto L28
            com.avito.android.remote.model.text.AttributedText r3 = new com.avito.android.remote.model.text.AttributedText
            java.lang.String r4 = r2.getSubtitle()
            if (r4 != 0) goto L1e
            java.lang.String r4 = ""
        L1e:
            r5 = r4
            kotlin.collections.z0 r6 = kotlin.collections.C42784z0.f406748b
            r9 = 0
            r7 = 0
            r8 = 4
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
        L28:
            r13 = r3
            java.lang.String r3 = r2.getBadgeOnceShowId()
            java.lang.String r4 = r2.getBadgeText()
            xe0.a r5 = r0.f245196c
            java.lang.String r14 = r5.a(r3, r4)
            com.avito.android.blueprints.publish.header.HeaderItem r3 = new com.avito.android.blueprints.publish.header.HeaderItem
            java.lang.String r11 = r1.getId()
            java.lang.String r12 = r2.getTitle()
            boolean r1 = r2.getShowTopSeparator()
            if (r1 == 0) goto L67
            com.avito.android.Q1 r1 = r0.f245197d
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r4 = com.avito.android.Q1.f67448x0
            r5 = 78
            r4 = r4[r5]
            com.avito.android.A0$a r1 = r1.f67497l0
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L67
            r1 = 1
        L65:
            r15 = r1
            goto L69
        L67:
            r1 = 0
            goto L65
        L69:
            java.lang.Integer r16 = r2.getTopMargin()
            com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig$Tooltip r18 = r2.getTooltip()
            com.avito.android.remote.model.search.Theme r19 = r2.getTheme()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = r2.isRealtyPhotos()
            boolean r21 = kotlin.jvm.internal.L.f(r2, r1)
            r23 = 0
            r17 = 0
            r22 = 64
            r10 = r3
            r20 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.util.List r1 = java.util.Collections.singletonList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.w.j():java.util.List");
    }
}

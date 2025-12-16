package com.avito.android.comfortable_deal.end_deal;

import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class H extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EndDealField.ChipDateInput f122060l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f122061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(EndDealField.ChipDateInput chipDateInput, Y41.l<? super String, G0> lVar) {
        super(3);
        this.f122060l = chipDateInput;
        this.f122061m = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r20, androidx.compose.runtime.A r21, java.lang.Integer r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.compose.foundation.layout.J r1 = (androidx.compose.foundation.layout.J) r1
            r7 = r21
            androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
            r1 = r22
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r1 = r1 & 81
            r2 = 16
            if (r1 != r2) goto L24
            boolean r1 = r7.c()
            if (r1 != 0) goto L1f
            goto L24
        L1f:
            r7.f()
            goto Ld7
        L24:
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput r1 = r0.f122060l
            java.util.List<com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipDateInput$Chip> r2 = r1.f122251d
            com.akita.compose.component.chips.ChipsDisplayType r3 = com.akita.compose.component.chips.ChipsDisplayType.f60861b
            boolean r1 = r1.f122253f
            if (r1 == 0) goto L87
            r1 = 720204744(0x2aed73c8, float:4.2179996E-13)
            r7.C(r1)
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            r1.getClass()
            com.akita.compose.theme.re23.style.T r1 = com.akita.compose.theme.re23.b.d(r7)
            com.akita.compose.component.chips.y r1 = r1.getF66004M()
            com.akita.compose.theme.re23.style.M r3 = com.akita.compose.theme.re23.b.c(r7)
            com.akita.compose.component.button.t r9 = r3.r2()
            r3 = -4607182418800017408(0xc010000000000000, double:-4.0)
            float r10 = (float) r3
            androidx.compose.ui.unit.h$a r3 = androidx.compose.ui.unit.h.f42849c
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            float r11 = (float) r3
            com.akita.compose.foundation.c r3 = new com.akita.compose.foundation.c
            com.akita.compose.theme.re23.semantic.b r4 = com.akita.compose.theme.re23.b.f63987e
            r4.getClass()
            W2.q r4 = com.akita.compose.theme.re23.semantic.b.f65954b
            X2.c r4 = r4.getBorder()
            r4.getClass()
            com.akita.compose.foundation.p r13 = X2.c.f18144e
            r17 = 14
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r12 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            float r12 = (float) r4
            com.akita.compose.component.chips.y$a r4 = new com.akita.compose.component.chips.y$a
            r14 = 0
            r8 = r4
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3 = 0
            r5 = 27
            r6 = 0
            com.akita.compose.component.chips.y r1 = com.akita.compose.component.chips.y.b(r1, r3, r4, r6, r5)
            r7.h()
        L85:
            r3 = r1
            goto L9e
        L87:
            r1 = 720933647(0x2af8930f, float:4.4155692E-13)
            r7.C(r1)
            com.akita.compose.theme.re23.b r1 = com.akita.compose.theme.re23.b.f63983a
            r1.getClass()
            com.akita.compose.theme.re23.style.T r1 = com.akita.compose.theme.re23.b.d(r7)
            com.akita.compose.component.chips.y r1 = r1.getF66004M()
            r7.h()
            goto L85
        L9e:
            r1 = -1085171716(0xffffffffbf5197fc, float:-0.81872535)
            r7.C(r1)
            Y41.l<java.lang.String, kotlin.G0> r1 = r0.f122061m
            boolean r4 = r7.B(r1)
            java.lang.Object r5 = r7.t()
            if (r4 != 0) goto Lb9
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r4) goto Lc1
        Lb9:
            com.avito.android.comfortable_deal.end_deal.G r5 = new com.avito.android.comfortable_deal.end_deal.G
            r5.<init>(r1)
            r7.H(r5)
        Lc1:
            r4 = r5
            Y41.p r4 = (Y41.p) r4
            r7.h()
            com.avito.android.comfortable_deal.end_deal.a r1 = com.avito.android.comfortable_deal.end_deal.C29471a.f122143a
            r1.getClass()
            androidx.compose.runtime.internal.n r6 = com.avito.android.comfortable_deal.end_deal.C29471a.f122149g
            r8 = 1573320(0x1801c8, float:2.204691E-39)
            r9 = 48
            r5 = 0
            com.akita.compose.component.chips.d.a(r2, r3, r4, r5, r6, r7, r8, r9)
        Ld7:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.H.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

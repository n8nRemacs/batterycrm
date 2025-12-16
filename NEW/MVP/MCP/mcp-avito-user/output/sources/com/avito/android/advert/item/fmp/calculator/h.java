package com.avito.android.advert.item.fmp.calculator;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.fmp.FmpPaymentTitle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpCalculatorPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/calculator/h;", "Lcom/avito/android/advert/item/fmp/calculator/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f75496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f75497c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f75498d;

    @Inject
    public h(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f75496b = aVar;
        this.f75497c = xVar;
        this.f75498d = interfaceC28373a;
    }

    public static int O(Integer num, AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem) {
        Integer num2 = advertDetailsFmpCalculatorItem.f75456e;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = advertDetailsFmpCalculatorItem.f75457f;
        int iIntValue2 = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
        return (num != null && num.intValue() >= iIntValue) ? num.intValue() > iIntValue2 ? iIntValue2 : num.intValue() : iIntValue;
    }

    public static final void k(h hVar, k kVar, AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, Integer num, Integer num2) {
        Integer num3 = advertDetailsFmpCalculatorItem.f75466o;
        FmpPaymentTitle fmpPaymentTitle = advertDetailsFmpCalculatorItem.f75460i;
        kVar.Fu(num3, advertDetailsFmpCalculatorItem.f75465n, num, num2, fmpPaymentTitle != null ? fmpPaymentTitle.getLeftPart() : null, advertDetailsFmpCalculatorItem.f75453b, advertDetailsFmpCalculatorItem.f75454c, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r13, TV0.a r14, int r15) {
        /*
            r12 = this;
            com.avito.android.advert.item.fmp.calculator.k r13 = (com.avito.android.advert.item.fmp.calculator.k) r13
            com.avito.android.advert.item.fmp.calculator.AdvertDetailsFmpCalculatorItem r14 = (com.avito.android.advert.item.fmp.calculator.AdvertDetailsFmpCalculatorItem) r14
            kotlin.jvm.internal.l0$h r15 = new kotlin.jvm.internal.l0$h
            r15.<init>()
            java.util.List<com.avito.android.remote.fmp.FmpLoanPeriod> r9 = r14.f75459h
            r0 = 0
            if (r9 == 0) goto L39
            r1 = r9
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.avito.android.remote.fmp.FmpLoanPeriod r3 = (com.avito.android.remote.fmp.FmpLoanPeriod) r3
            java.lang.Boolean r3 = r3.getIsSelected()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 == 0) goto L15
            goto L30
        L2f:
            r2 = r0
        L30:
            com.avito.android.remote.fmp.FmpLoanPeriod r2 = (com.avito.android.remote.fmp.FmpLoanPeriod) r2
            if (r2 == 0) goto L39
            java.lang.Integer r1 = r2.getValue()
            goto L3a
        L39:
            r1 = r0
        L3a:
            r15.f406842b = r1
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            java.lang.String r11 = r14.f75455d
            if (r11 == 0) goto L4f
            int r1 = java.lang.Integer.parseInt(r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = r1
            goto L50
        L4f:
            r3 = r0
        L50:
            r10.f406842b = r3
            T r1 = r15.f406842b
            r4 = r1
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.avito.android.remote.fmp.FmpPaymentTitle r1 = r14.f75460i
            if (r1 == 0) goto L61
            com.avito.android.remote.model.text.AttributedText r2 = r1.getLeftPart()
            r5 = r2
            goto L62
        L61:
            r5 = r0
        L62:
            if (r1 == 0) goto L68
            com.avito.android.remote.model.text.AttributedText r0 = r1.getRightPart()
        L68:
            r8 = r0
            com.avito.android.remote.model.text.AttributedText r6 = r14.f75453b
            com.avito.android.remote.model.text.AttributedText r7 = r14.f75454c
            java.lang.Integer r1 = r14.f75466o
            java.lang.Double r2 = r14.f75465n
            r0 = r13
            r0.Fu(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.sk(r11)
            com.avito.android.lib.design.input.FormatterType$a r0 = com.avito.android.lib.design.input.FormatterType.f179288e
            r0.getClass()
            com.avito.android.lib.design.input.FormatterType r0 = com.avito.android.lib.design.input.FormatterType.f179291h
            r13.Cs(r0)
            com.avito.android.advert.item.fmp.calculator.d r6 = new com.avito.android.advert.item.fmp.calculator.d
            r0 = r6
            r1 = r14
            r2 = r12
            r3 = r13
            r4 = r10
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.Ac(r6)
            com.avito.android.advert.item.fmp.calculator.e r6 = new com.avito.android.advert.item.fmp.calculator.e
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r13.Qb(r6)
            java.lang.String r0 = r14.f75458g
            r13.te(r0)
            r13.a5(r9)
            com.avito.android.advert.item.fmp.calculator.f r6 = new com.avito.android.advert.item.fmp.calculator.f
            r0 = r6
            r1 = r14
            r2 = r12
            r3 = r13
            r4 = r10
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.E1(r6)
            com.avito.android.remote.fmp.FmpCalculatorButton r0 = r14.f75461j
            r13.nJ(r0)
            com.avito.android.advert.item.fmp.calculator.g r6 = new com.avito.android.advert.item.fmp.calculator.g
            r0 = r6
            r1 = r14
            r2 = r12
            r3 = r13
            r4 = r10
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r13.Y(r6)
            com.avito.android.remote.model.text.AttributedText r14 = r14.f75464m
            r13.x4(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.fmp.calculator.h.O5(TV0.e, TV0.a, int):void");
    }
}

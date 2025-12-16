package com.avito.android.trx_promo_impl.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "LZF0/c;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements t<TrxPromoInternalAction, ZF0.c> {
    @Inject
    public m() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    @Override // com.avito.android.arch.mvi.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ZF0.c b(com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction r5) {
        /*
            r4 = this;
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction r5 = (com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction) r5
            boolean r0 = r5 instanceof com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.ContentV7
            r1 = 0
            if (r0 == 0) goto L19
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$ContentV7 r5 = (com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.ContentV7) r5
            YF0.o$b r5 = r5.f304333b
            com.avito.android.deep_linking.links.DeepLink r5 = r5.getTermsUri()
            if (r5 == 0) goto L81
            ZF0.c$c r0 = new ZF0.c$c
            r0.<init>(r1, r1, r1, r5)
            r1 = r0
            goto L81
        L19:
            boolean r0 = r5 instanceof com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.Close
            if (r0 == 0) goto L20
            ZF0.c$a r1 = ZF0.c.a.f20033a
            goto L81
        L20:
            boolean r0 = r5 instanceof com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.FinishFlow
            if (r0 == 0) goto L27
            ZF0.c$b r1 = ZF0.c.b.f20034a
            goto L81
        L27:
            boolean r0 = r5 instanceof com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.HandleDeeplink
            if (r0 == 0) goto L74
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$HandleDeeplink r5 = (com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.HandleDeeplink) r5
            java.time.LocalDate r0 = r5.f304339d
            if (r0 == 0) goto L4b
            com.avito.android.trx_promo_impl.b r2 = com.avito.android.trx_promo_impl.b.f303905a
            r2.getClass()
            java.time.LocalDate r2 = com.avito.android.trx_promo_impl.b.f303906b
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L3f
            goto L40
        L3f:
            r0 = r1
        L40:
            if (r0 == 0) goto L4b
            java.util.Locale r2 = cG0.d.f57802a
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ISO_DATE
            java.lang.String r0 = r0.format(r2)
            goto L4c
        L4b:
            r0 = r1
        L4c:
            java.time.LocalDate r2 = r5.f304340e
            if (r2 == 0) goto L69
            com.avito.android.trx_promo_impl.b r3 = com.avito.android.trx_promo_impl.b.f303905a
            r3.getClass()
            java.time.LocalDate r3 = com.avito.android.trx_promo_impl.b.f303906b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L5e
            goto L5f
        L5e:
            r2 = r1
        L5f:
            if (r2 == 0) goto L69
            java.util.Locale r1 = cG0.d.f57802a
            java.time.format.DateTimeFormatter r1 = java.time.format.DateTimeFormatter.ISO_DATE
            java.lang.String r1 = r2.format(r1)
        L69:
            ZF0.c$c r2 = new ZF0.c$c
            com.avito.android.deep_linking.links.DeepLink r3 = r5.f304337b
            java.lang.Integer r5 = r5.f304338c
            r2.<init>(r5, r0, r1, r3)
            r1 = r2
            goto L81
        L74:
            boolean r0 = r5 instanceof com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.OpenDatePicker
            if (r0 == 0) goto L81
            ZF0.c$d r1 = new ZF0.c$d
            com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction$OpenDatePicker r5 = (com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction.OpenDatePicker) r5
            RF0.f r5 = r5.f304344b
            r1.<init>(r5)
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_impl.mvi.m.b(java.lang.Object):java.lang.Object");
    }
}

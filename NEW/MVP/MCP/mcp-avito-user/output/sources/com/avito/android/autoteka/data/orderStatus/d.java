package com.avito.android.autoteka.data.orderStatus;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaOrderStatusInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/orderStatus/d;", "Lcom/avito/android/autoteka/data/orderStatus/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50257a f96191a;

    @Inject
    public d(@k InterfaceC50257a interfaceC50257a) {
        this.f96191a = interfaceC50257a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.autoteka.data.orderStatus.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.avito.android.autoteka.data.orderStatus.b
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.android.autoteka.data.orderStatus.b r2 = (com.avito.android.autoteka.data.orderStatus.b) r2
            int r3 = r2.f96186s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f96186s = r3
            goto L1c
        L17:
            com.avito.android.autoteka.data.orderStatus.b r2 = new com.avito.android.autoteka.data.orderStatus.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f96184q
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f96186s
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 != r6) goto L2e
            kotlin.C42729a0.b(r1)
            goto L49
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.C42729a0.b(r1)
            com.avito.android.autoteka.data.orderStatus.c r1 = new com.avito.android.autoteka.data.orderStatus.c
            r4 = r18
            r1.<init>(r0, r4, r5)
            r2.f96186s = r6
            java.lang.Object r1 = com.avito.android.autoteka.helpers.h.a(r1, r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto Lba
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse r1 = (com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse) r1
            vf.e r2 = new vf.e
            r2.<init>()
            Aj0.a r2 = r1.getDirectPurchase()
            if (r2 == 0) goto L99
            java.lang.String r3 = r2.getTitle()
            com.avito.android.remote.model.text.AttributedText r4 = r2.getDescription()
            Aj0.b r6 = r2.getPrimaryAction()
            if (r6 == 0) goto L7e
            com.avito.android.remote.autoteka.model.AutotekaAction r7 = new com.avito.android.remote.autoteka.model.AutotekaAction
            java.lang.String r8 = r6.getText()
            com.avito.android.deep_linking.links.DeepLink r6 = r6.getDeepLink()
            r7.<init>(r8, r6)
            goto L7f
        L7e:
            r7 = r5
        L7f:
            Aj0.b r2 = r2.getSecondaryAction()
            if (r2 == 0) goto L92
            com.avito.android.remote.autoteka.model.AutotekaAction r5 = new com.avito.android.remote.autoteka.model.AutotekaAction
            java.lang.String r6 = r2.getText()
            com.avito.android.deep_linking.links.DeepLink r2 = r2.getDeepLink()
            r5.<init>(r6, r2)
        L92:
            com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem$DirectPurchase r2 = new com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem$DirectPurchase
            r2.<init>(r4, r7, r5, r3)
            r14 = r2
            goto L9a
        L99:
            r14 = r5
        L9a:
            com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem r2 = new com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem
            java.lang.String r10 = r1.getTitle()
            com.avito.android.remote.model.text.AttributedText r11 = r1.getDescription()
            com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse$Status r12 = r1.getStatus()
            java.lang.String r13 = r1.getUsagePublicId()
            r9 = 0
            r15 = 1
            r16 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            com.avito.android.remote.model.TypedResult$Success r1 = new com.avito.android.remote.model.TypedResult$Success
            r1.<init>(r2)
            goto Lbe
        Lba:
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Lbf
        Lbe:
            return r1
        Lbf:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.orderStatus.d.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

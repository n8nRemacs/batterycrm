package com.avito.android.advert.item.select.number_input;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wi0.InterfaceC49632c;

/* compiled from: SelectRecallMeInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/number_input/i;", "Lcom/avito/android/advert/item/select/number_input/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC49632c> f79529a;

    @Inject
    public i(@k h31.e<InterfaceC49632c> eVar) {
        this.f79529a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.advert.item.select.number_input.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.avito.android.advert.item.select.number_input.h
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.advert.item.select.number_input.h r0 = (com.avito.android.advert.item.select.number_input.h) r0
            int r1 = r0.f79528s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79528s = r1
            goto L18
        L13:
            com.avito.android.advert.item.select.number_input.h r0 = new com.avito.android.advert.item.select.number_input.h
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f79526q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f79528s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r12)
            goto L46
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            kotlin.C42729a0.b(r12)
            h31.e<wi0.c> r12 = r10.f79529a
            java.lang.Object r12 = r12.get()
            wi0.c r12 = (wi0.InterfaceC49632c) r12
            r0.f79528s = r4
            java.lang.Object r12 = r12.a(r11, r3, r0)
            if (r12 != r1) goto L46
            return r1
        L46:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r11 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r11 == 0) goto Le5
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r11 = r12.getResult()
            com.avito.android.remote.ContactInfo r11 = (com.avito.android.remote.ContactInfo) r11
            java.util.List r12 = r11.d()
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto Le5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L65
            goto Le5
        L65:
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.avito.android.remote.Phone r4 = (com.avito.android.remote.Phone) r4
            boolean r4 = r4.getIsConfirmed()
            if (r4 == 0) goto L6c
            r3 = r2
        L80:
            com.avito.android.remote.Phone r3 = (com.avito.android.remote.Phone) r3
            if (r3 != 0) goto L8b
            java.lang.Object r12 = kotlin.collections.C42745f0.E(r12)
            r3 = r12
            com.avito.android.remote.Phone r3 = (com.avito.android.remote.Phone) r3
        L8b:
            java.lang.String r5 = r11.getName()
            java.lang.String r6 = r3.getPhone()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r0.iterator()
        L9c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.avito.android.remote.Phone r2 = (com.avito.android.remote.Phone) r2
            boolean r2 = r2.getIsConfirmed()
            if (r2 == 0) goto L9c
            r12.add(r1)
            goto L9c
        Lb3:
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C42745f0.q(r12, r0)
            r7.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        Lc2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r12.next()
            com.avito.android.remote.Phone r0 = (com.avito.android.remote.Phone) r0
            java.lang.String r0 = r0.getPhone()
            r7.add(r0)
            goto Lc2
        Ld6:
            com.avito.android.remote.FormParams r8 = r11.getFormParams()
            com.avito.android.remote.model.text.AttributedText r9 = r11.getUserAgreement()
            yi0.a r3 = new yi0.a
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
        Le5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.select.number_input.i.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

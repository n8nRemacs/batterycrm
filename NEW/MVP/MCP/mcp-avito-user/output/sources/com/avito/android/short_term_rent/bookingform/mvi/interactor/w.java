package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ValidateInputsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/w;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.bookingform.domain.validation.c f281959a;

    @Inject
    public w(@Y61.k com.avito.android.short_term_rent.bookingform.domain.validation.c cVar) {
        this.f281959a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008e -> B:29:0x0091). Please report as a decompilation issue!!! */
    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.u
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.util.Map r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.avito.android.short_term_rent.bookingform.mvi.interactor.v
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.short_term_rent.bookingform.mvi.interactor.v r0 = (com.avito.android.short_term_rent.bookingform.mvi.interactor.v) r0
            int r1 = r0.f281958w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f281958w = r1
            goto L18
        L13:
            com.avito.android.short_term_rent.bookingform.mvi.interactor.v r0 = new com.avito.android.short_term_rent.bookingform.mvi.interactor.v
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f281956u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f281958w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r11 = r0.f281955t
            java.util.Iterator r2 = r0.f281954s
            java.util.Map r4 = r0.f281953r
            java.util.Map r4 = (java.util.Map) r4
            com.avito.android.short_term_rent.bookingform.mvi.interactor.w r5 = r0.f281952q
            kotlin.C42729a0.b(r12)
            goto L91
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.C42729a0.b(r12)
            if (r11 != 0) goto L43
            com.avito.android.short_term_rent.bookingform.mvi.interactor.u$a$b r11 = com.avito.android.short_term_rent.bookingform.mvi.interactor.u.a.b.f281951a
            return r11
        L43:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L4c
            com.avito.android.short_term_rent.bookingform.mvi.interactor.u$a$b r11 = com.avito.android.short_term_rent.bookingform.mvi.interactor.u.a.b.f281951a
            return r11
        L4c:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r5 = r10
            r2 = r11
            r4 = r12
        L5c:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto La5
            java.lang.Object r11 = r2.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r11.getValue()
            aw0.e r11 = (aw0.e) r11
            com.avito.android.short_term_rent.bookingform.domain.validation.c r6 = r5.f281959a
            java.lang.String r7 = r11.f56797a
            r0.f281952q = r5
            r8 = r4
            java.util.Map r8 = (java.util.Map) r8
            r0.f281953r = r8
            r0.f281954s = r2
            r0.f281955t = r12
            r0.f281958w = r3
            java.util.List<com.avito.android.short_term_rent.bookingform.domain.validation.a> r11 = r11.f56798b
            java.lang.Object r11 = r6.a(r7, r11, r0)
            if (r11 != r1) goto L8e
            return r1
        L8e:
            r9 = r12
            r12 = r11
            r11 = r9
        L91:
            com.avito.android.short_term_rent.bookingform.domain.validation.b r12 = (com.avito.android.short_term_rent.bookingform.domain.validation.b) r12
            boolean r6 = r12 instanceof com.avito.android.short_term_rent.bookingform.domain.validation.b.a
            if (r6 == 0) goto L9f
            com.avito.android.short_term_rent.bookingform.domain.validation.b$a r12 = (com.avito.android.short_term_rent.bookingform.domain.validation.b.a) r12
            java.lang.String r12 = r12.f281437a
            r4.put(r11, r12)
            goto L5c
        L9f:
            com.avito.android.short_term_rent.bookingform.domain.validation.b$b r11 = com.avito.android.short_term_rent.bookingform.domain.validation.b.C8385b.f281438a
            kotlin.jvm.internal.L.f(r12, r11)
            goto L5c
        La5:
            boolean r11 = r4.isEmpty()
            if (r11 == 0) goto Lae
            com.avito.android.short_term_rent.bookingform.mvi.interactor.u$a$b r11 = com.avito.android.short_term_rent.bookingform.mvi.interactor.u.a.b.f281951a
            return r11
        Lae:
            com.avito.android.short_term_rent.bookingform.mvi.interactor.u$a$a r11 = new com.avito.android.short_term_rent.bookingform.mvi.interactor.u$a$a
            r11.<init>(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.interactor.w.a(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

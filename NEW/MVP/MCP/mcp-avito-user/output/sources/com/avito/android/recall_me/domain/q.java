package com.avito.android.recall_me.domain;

import com.avito.android.account.E;
import com.avito.android.remote.ConfirmPhoneResponse;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import wi0.InterfaceC49632c;

/* compiled from: RecallMeV2Interactor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/q;", "Lcom/avito/android/recall_me/domain/n;", "_avito_recall-me_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49632c f251866a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f251867b;

    @Inject
    public q(@Y61.k InterfaceC49632c interfaceC49632c, @Y61.k E e12) {
        this.f251866a = interfaceC49632c;
        this.f251867b = e12;
    }

    @Override // com.avito.android.recall_me.domain.n
    @Y61.k
    public final String a() {
        String strA = this.f251867b.a();
        return strA == null ? "" : strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.recall_me.domain.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.avito.android.recall_me.domain.o
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.recall_me.domain.o r0 = (com.avito.android.recall_me.domain.o) r0
            int r1 = r0.f251862s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f251862s = r1
            goto L18
        L13:
            com.avito.android.recall_me.domain.o r0 = new com.avito.android.recall_me.domain.o
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f251860q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f251862s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r12)
            goto L40
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            kotlin.C42729a0.b(r12)
            r0.f251862s = r4
            wi0.c r12 = r10.f251866a
            java.lang.Object r12 = r12.a(r11, r3, r0)
            if (r12 != r1) goto L40
            return r1
        L40:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r11 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r11 == 0) goto Ld2
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r11 = r12.getResult()
            com.avito.android.remote.ContactInfo r11 = (com.avito.android.remote.ContactInfo) r11
            java.util.List r12 = r11.d()
            if (r12 == 0) goto Ld2
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r0 = r12.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.avito.android.remote.Phone r2 = (com.avito.android.remote.Phone) r2
            boolean r4 = r2.getIsConfirmed()
            if (r4 == 0) goto L5a
            boolean r2 = r2.getIsDefault()
            if (r2 == 0) goto L5a
            goto L75
        L74:
            r1 = r3
        L75:
            com.avito.android.remote.Phone r1 = (com.avito.android.remote.Phone) r1
            if (r1 == 0) goto Ld2
            java.lang.String r5 = r11.getName()
            java.lang.String r6 = r1.getPhone()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L8a:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r12.next()
            r2 = r1
            com.avito.android.remote.Phone r2 = (com.avito.android.remote.Phone) r2
            boolean r2 = r2.getIsConfirmed()
            if (r2 == 0) goto L8a
            r0.add(r1)
            goto L8a
        La1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C42745f0.q(r0, r12)
            r7.<init>(r12)
            java.util.Iterator r12 = r0.iterator()
        Lb0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r12.next()
            com.avito.android.remote.Phone r0 = (com.avito.android.remote.Phone) r0
            java.lang.String r0 = r0.getPhone()
            r7.add(r0)
            goto Lb0
        Lc4:
            com.avito.android.remote.FormParams r8 = r11.getFormParams()
            com.avito.android.remote.model.text.AttributedText r9 = r11.getUserAgreement()
            yi0.a r3 = new yi0.a
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
        Ld2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me.domain.q.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.recall_me.domain.n
    @Y61.l
    public final Object c(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<ConfirmPhoneResponse>> continuation) {
        return this.f251866a.c(str, str2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.recall_me.domain.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r7, @Y61.l java.lang.String r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me.domain.q.d(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.recall_me.domain.n
    @Y61.l
    public final Object e(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl) {
        return this.f251866a.d(str, continuationImpl);
    }

    @Override // com.avito.android.recall_me.domain.n
    @Y61.l
    public final Object f(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k ContinuationImpl continuationImpl) {
        return this.f251866a.b(str, str2, str3, str4, str5, continuationImpl);
    }
}

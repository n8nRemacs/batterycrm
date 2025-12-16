package com.avito.android.llm.data;

import Y61.k;
import hW.InterfaceC40887a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LlmDescriptionRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/llm/data/c;", "Lcom/avito/android/llm/data/a;", "_avito_llm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40887a f181674a;

    public c(@k InterfaceC40887a interfaceC40887a) {
        this.f181674a = interfaceC40887a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.llm.data.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, @Y61.k java.util.LinkedHashMap r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.llm.data.b
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.llm.data.b r0 = (com.avito.android.llm.data.b) r0
            int r1 = r0.f181673s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181673s = r1
            goto L18
        L13:
            com.avito.android.llm.data.b r0 = new com.avito.android.llm.data.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f181671q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f181673s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r8)
            iW.b r8 = new iW.b
            r8.<init>(r5, r7)
            r0.f181673s = r3
            hW.a r5 = r4.f181674a
            java.lang.Object r8 = r5.a(r8, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L5c
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r5 = r8.getResult()
            iW.a r5 = (iW.C41351a) r5
            java.lang.String r5 = r5.getGeneratedDescription()
            com.avito.android.remote.model.TypedResult$Success r8 = new com.avito.android.remote.model.TypedResult$Success
            r8.<init>(r5)
            goto L60
        L5c:
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L61
        L60:
            return r8
        L61:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.llm.data.c.a(long, java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

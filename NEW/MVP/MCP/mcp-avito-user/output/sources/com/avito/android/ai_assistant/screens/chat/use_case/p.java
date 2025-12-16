package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SendMessageUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/use_case/p;", "Lcom/avito/android/ai_assistant/screens/chat/use_case/m;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f89553a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14555a f89554b;

    @Inject
    public p(@Y61.k R0 r02, @Y61.k InterfaceC14555a interfaceC14555a) {
        this.f89553a = r02;
        this.f89554b = interfaceC14555a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.ai_assistant.screens.chat.use_case.m
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.l java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.ai_assistant.screens.chat.use_case.o
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.ai_assistant.screens.chat.use_case.o r0 = (com.avito.android.ai_assistant.screens.chat.use_case.o) r0
            int r1 = r0.f89552u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89552u = r1
            goto L18
        L13:
            com.avito.android.ai_assistant.screens.chat.use_case.o r0 = new com.avito.android.ai_assistant.screens.chat.use_case.o
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f89550s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f89552u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f89549r
            com.avito.android.ai_assistant.screens.chat.use_case.p r6 = r0.f89548q
            kotlin.C42729a0.b(r8)
            goto L5d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r8)
            if (r7 != 0) goto L42
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
        L42:
            Rb.e r8 = new Rb.e
            Rb.f r2 = new Rb.f
            r2.<init>(r6)
            r8.<init>(r5, r2)
            r0.f89548q = r4
            r0.f89549r = r7
            r0.f89552u = r3
            Nb.a r5 = r4.f89554b
            java.lang.Object r8 = r5.a(r7, r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r6 = r4
            r5 = r7
        L5d:
            kotlinx.coroutines.flow.w r7 = new kotlinx.coroutines.flow.w
            r7.<init>(r8)
            com.avito.android.util.R0 r6 = r6.f89553a
            kotlinx.coroutines.scheduling.b r6 = r6.a()
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.C43175k.I(r6, r7)
            com.avito.android.ai_assistant.screens.chat.use_case.n r7 = new com.avito.android.ai_assistant.screens.chat.use_case.n
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.use_case.p.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

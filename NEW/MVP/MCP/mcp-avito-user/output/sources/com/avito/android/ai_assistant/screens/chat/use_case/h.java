package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DiscoverUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/use_case/h;", "Lcom/avito/android/ai_assistant/screens/chat/use_case/e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f89535a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14555a f89536b;

    @Inject
    public h(@Y61.k R0 r02, @Y61.k InterfaceC14555a interfaceC14555a) {
        this.f89535a = r02;
        this.f89536b = interfaceC14555a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.ai_assistant.screens.chat.use_case.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.l java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.ai_assistant.screens.chat.use_case.g
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.ai_assistant.screens.chat.use_case.g r0 = (com.avito.android.ai_assistant.screens.chat.use_case.g) r0
            int r1 = r0.f89534u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89534u = r1
            goto L18
        L13:
            com.avito.android.ai_assistant.screens.chat.use_case.g r0 = new com.avito.android.ai_assistant.screens.chat.use_case.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f89532s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f89534u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f89531r
            com.avito.android.ai_assistant.screens.chat.use_case.h r6 = r0.f89530q
            kotlin.C42729a0.b(r7)
            goto L5b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r7)
            if (r6 != 0) goto L42
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
        L42:
            boolean r7 = kotlin.text.C43066x.K(r5)
            if (r7 != 0) goto L49
            goto L4a
        L49:
            r5 = 0
        L4a:
            r0.f89530q = r4
            r0.f89531r = r6
            r0.f89534u = r3
            Nb.a r7 = r4.f89536b
            java.lang.Object r7 = r7.d(r6, r5, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r5 = r6
            r6 = r4
        L5b:
            kotlinx.coroutines.flow.w r0 = new kotlinx.coroutines.flow.w
            r0.<init>(r7)
            com.avito.android.util.R0 r6 = r6.f89535a
            kotlinx.coroutines.scheduling.b r6 = r6.a()
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.C43175k.I(r6, r0)
            com.avito.android.ai_assistant.screens.chat.use_case.f r7 = new com.avito.android.ai_assistant.screens.chat.use_case.f
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.use_case.h.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

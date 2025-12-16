package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChatHistoryUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/use_case/c;", "Lcom/avito/android/ai_assistant/screens/chat/use_case/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f89519a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14555a f89520b;

    @Inject
    public c(@Y61.k R0 r02, @Y61.k InterfaceC14555a interfaceC14555a) {
        this.f89519a = r02;
        this.f89520b = interfaceC14555a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.ai_assistant.screens.chat.use_case.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r7, @Y61.l Tb.j r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.ai_assistant.screens.chat.use_case.b
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.ai_assistant.screens.chat.use_case.b r0 = (com.avito.android.ai_assistant.screens.chat.use_case.b) r0
            int r1 = r0.f89518t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89518t = r1
            goto L18
        L13:
            com.avito.android.ai_assistant.screens.chat.use_case.b r0 = new com.avito.android.ai_assistant.screens.chat.use_case.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f89516r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f89518t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.ai_assistant.screens.chat.use_case.c r7 = r0.f89515q
            kotlin.C42729a0.b(r9)
            goto L69
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.C42729a0.b(r9)
            boolean r9 = r8 instanceof Tb.j.b
            r2 = 0
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3e
        L3d:
            r9 = r2
        L3e:
            if (r9 == 0) goto L47
            long r4 = r9.f15752a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            goto L48
        L47:
            r9 = r2
        L48:
            boolean r4 = r8 instanceof Tb.j.a
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r8 = r2
        L4e:
            if (r8 == 0) goto L56
            long r4 = r8.f15752a
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
        L56:
            Qb.e r8 = new Qb.e
            r8.<init>(r7, r2, r9)
            r0.f89515q = r6
            r0.f89518t = r3
            Nb.a r7 = r6.f89520b
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            r7 = r6
        L69:
            kotlinx.coroutines.flow.w r8 = new kotlinx.coroutines.flow.w
            r8.<init>(r9)
            com.avito.android.util.R0 r7 = r7.f89519a
            kotlinx.coroutines.scheduling.b r7 = r7.a()
            kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.C43175k.I(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.use_case.c.a(java.lang.String, Tb.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

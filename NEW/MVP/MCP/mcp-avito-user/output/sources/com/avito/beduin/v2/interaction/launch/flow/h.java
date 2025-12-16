package com.avito.beduin.v2.interaction.launch.flow;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.launch.flow.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LaunchInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/h;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/launch/flow/c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.beduin.v2.handler.flow.i<c> implements FV0.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f337465c;

    public h(@Y61.k a aVar) {
        super(c.a.f337451b);
        this.f337465c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(com.avito.beduin.v2.interaction.launch.flow.h r5, kotlinx.coroutines.flow.InterfaceC43172j r6, com.avito.beduin.v2.interaction.launch.flow.c r7, com.avito.beduin.v2.engine.C36272i r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof com.avito.beduin.v2.interaction.launch.flow.e
            if (r0 == 0) goto L16
            r0 = r9
            com.avito.beduin.v2.interaction.launch.flow.e r0 = (com.avito.beduin.v2.interaction.launch.flow.e) r0
            int r1 = r0.f337461u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f337461u = r1
            goto L1b
        L16:
            com.avito.beduin.v2.interaction.launch.flow.e r0 = new com.avito.beduin.v2.interaction.launch.flow.e
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f337459s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f337461u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r9)
            goto L93
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.avito.beduin.v2.interaction.launch.flow.c r7 = r0.f337458r
            kotlinx.coroutines.flow.j r6 = r0.f337457q
            kotlin.C42729a0.b(r9)
            goto L7b
        L3f:
            kotlin.C42729a0.b(r9)
            r0.f337457q = r6
            r0.f337458r = r7
            r0.f337461u = r4
            kotlinx.coroutines.r r9 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r9.<init>(r4, r2)
            r9.p()
            java.lang.String r2 = r7.f337447a
            com.avito.beduin.v2.interaction.launch.flow.g r4 = new com.avito.beduin.v2.interaction.launch.flow.g
            r4.<init>(r8, r9)
            com.avito.beduin.v2.interaction.launch.flow.i r8 = r7.f337448b
            com.avito.beduin.v2.interaction.launch.flow.a r5 = r5.f337465c
            com.avito.android.lib.beduin_v2.feature.launchclient.a r5 = r5.d(r2, r8, r4)
            com.avito.beduin.v2.interaction.launch.flow.f r8 = new com.avito.beduin.v2.interaction.launch.flow.f
            r8.<init>(r5)
            r9.r(r8)
            java.lang.Object r9 = r9.o()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r5) goto L78
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L78:
            if (r9 != r1) goto L7b
            goto L95
        L7b:
            com.avito.beduin.v2.engine.field.d r9 = (com.avito.beduin.v2.engine.field.d) r9
            Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> r5 = r7.f337449c
            com.avito.beduin.v2.interaction.launch.flow.b r5 = (com.avito.beduin.v2.interaction.launch.flow.b) r5
            java.lang.Object r5 = r5.invoke(r9)
            r7 = 0
            r0.f337457q = r7
            r0.f337458r = r7
            r0.f337461u = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L93
            goto L95
        L93:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.launch.flow.h.q(com.avito.beduin.v2.interaction.launch.flow.h, kotlinx.coroutines.flow.j, com.avito.beduin.v2.interaction.launch.flow.c, com.avito.beduin.v2.engine.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // FV0.h
    public final void P() {
        this.f337465c.P();
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f337465c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return C43175k.G(new d((c) bVar, this, interfaceC36238a, null));
    }
}

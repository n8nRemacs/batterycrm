package com.avito.beduin.v2.interaction.sequence.flow;

import Y61.k;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.handler.flow.i;
import com.avito.beduin.v2.interaction.sequence.flow.SequenceInteraction;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SequenceInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/sequence/flow/e;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/sequence/flow/SequenceInteraction;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends i<SequenceInteraction> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final e f337856c = new e();

    public e() {
        super(SequenceInteraction.a.f337843b);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return C43175k.G(new d((SequenceInteraction) bVar, interfaceC36238a, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r6, @Y61.k java.util.List r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.avito.beduin.v2.interaction.sequence.flow.c
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.beduin.v2.interaction.sequence.flow.c r0 = (com.avito.beduin.v2.interaction.sequence.flow.c) r0
            int r1 = r0.f337850u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f337850u = r1
            goto L18
        L13:
            com.avito.beduin.v2.interaction.sequence.flow.c r0 = new com.avito.beduin.v2.interaction.sequence.flow.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f337848s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f337850u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r6 = r0.f337847r
            kotlinx.coroutines.flow.j r7 = r0.f337846q
            kotlin.C42729a0.b(r8)
            goto L41
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L41:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L62
            java.lang.Object r8 = r6.next()
            Y41.a r8 = (Y41.a) r8
            java.lang.Object r8 = r8.invoke()
            dU0.f r8 = (dU0.f) r8
            if (r8 == 0) goto L41
            r0.f337846q = r7
            r0.f337847r = r6
            r0.f337850u = r3
            java.lang.Object r8 = r7.emit(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L62:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.sequence.flow.e.q(kotlinx.coroutines.flow.j, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

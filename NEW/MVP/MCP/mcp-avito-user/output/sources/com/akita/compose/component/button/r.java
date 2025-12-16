package com.akita.compose.component.button;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.J1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/button/r;", "", "button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final a f60827a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C20268c<androidx.compose.ui.unit.h, C20318t> f60828b;

    public r(@Y61.l a aVar) {
        C20268c<androidx.compose.ui.unit.h, C20318t> c20268c;
        this.f60827a = aVar;
        if (aVar != null) {
            androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(0);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            c20268c = new C20268c<>(hVarA, J1.f26077c, null, null, 12, null);
        } else {
            c20268c = null;
        }
        this.f60828b = c20268c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:29:0x008d). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.akita.compose.component.button.q
            if (r0 == 0) goto L13
            r0 = r14
            com.akita.compose.component.button.q r0 = (com.akita.compose.component.button.q) r0
            int r1 = r0.f60826v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60826v = r1
            goto L18
        L13:
            com.akita.compose.component.button.q r0 = new com.akita.compose.component.button.q
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f60824t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f60826v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Iterator r2 = r0.f60823s
            com.akita.compose.component.button.a r4 = r0.f60822r
            com.akita.compose.component.button.r r5 = r0.f60821q
            kotlin.C42729a0.b(r14)
            goto L8d
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            kotlin.C42729a0.b(r14)
            com.akita.compose.component.button.a r14 = r13.f60827a
            if (r14 != 0) goto L41
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        L41:
            java.util.List r2 = r14.a()
            if (r2 == 0) goto L92
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r11 = r13
        L4e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r2.next()
            com.akita.compose.component.button.t$a r4 = (com.akita.compose.component.button.t.a) r4
            androidx.compose.animation.core.c<androidx.compose.ui.unit.h, androidx.compose.animation.core.t> r5 = r11.f60828b
            if (r5 == 0) goto L4e
            float r6 = r4.f60857c
            androidx.compose.ui.unit.h r6 = androidx.compose.ui.unit.h.a(r6)
            androidx.compose.animation.core.N r7 = r14.getF60852x()
            androidx.compose.animation.core.G1 r8 = new androidx.compose.animation.core.G1
            int r9 = r4.f60856b
            int r4 = r4.f60855a
            r8.<init>(r9, r4, r7)
            r0.f60821q = r11
            r0.f60822r = r14
            r0.f60823s = r2
            r0.f60826v = r3
            r9 = 0
            r10 = 12
            r7 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r0
            java.lang.Object r4 = androidx.compose.animation.core.C20268c.c(r4, r5, r6, r7, r8, r9, r10)
            if (r4 != r1) goto L89
            return r1
        L89:
            r5 = r11
            r12 = r4
            r4 = r14
            r14 = r12
        L8d:
            androidx.compose.animation.core.n r14 = (androidx.compose.animation.core.C20301n) r14
            r14 = r4
            r11 = r5
            goto L4e
        L92:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.button.r.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

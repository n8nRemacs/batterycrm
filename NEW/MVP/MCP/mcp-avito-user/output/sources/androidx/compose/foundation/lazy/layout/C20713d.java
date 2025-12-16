package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.InterfaceC22390v0;
import androidx.compose.ui.node.AbstractC22443w0;
import kotlin.Metadata;

/* compiled from: AwaitFirstLayoutModifier.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/ui/layout/v0;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20713d implements InterfaceC22390v0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f29400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.r f29401c;

    @Override // androidx.compose.ui.layout.InterfaceC22390v0
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        if (this.f29400b) {
            return;
        }
        this.f29400b = true;
        kotlinx.coroutines.r rVar = this.f29401c;
        if (rVar != null) {
            int i12 = kotlin.Z.f406624c;
            rVar.resumeWith(kotlin.G0.f406611a);
        }
        this.f29401c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.lazy.layout.C20711c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.lazy.layout.c r0 = (androidx.compose.foundation.lazy.layout.C20711c) r0
            int r1 = r0.f29398t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29398t = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.c r0 = new androidx.compose.foundation.lazy.layout.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f29396r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29398t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlinx.coroutines.r r0 = r0.f29395q
            kotlin.C42729a0.b(r6)
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.C42729a0.b(r6)
            boolean r6 = r5.f29400b
            if (r6 != 0) goto L68
            kotlinx.coroutines.r r6 = r5.f29401c
            r0.f29395q = r6
            r0.f29398t = r3
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3, r4)
            r2.p()
            r5.f29401c = r2
            java.lang.Object r2 = r2.o()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L5b
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L5b:
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r0 = r6
        L5f:
            if (r0 == 0) goto L68
            int r6 = kotlin.Z.f406624c
            kotlin.G0 r6 = kotlin.G0.f406611a
            r0.resumeWith(r6)
        L68:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C20713d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

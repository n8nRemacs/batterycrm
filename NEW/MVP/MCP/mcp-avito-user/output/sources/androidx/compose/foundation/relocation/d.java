package androidx.compose.foundation.relocation;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BringIntoViewRequester.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/relocation/d;", "Landroidx/compose/foundation/relocation/a;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<h> f30076a = new androidx.compose.runtime.collection.e<>(new h[16], 0);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l l0.j r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.relocation.b
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.relocation.b r0 = (androidx.compose.foundation.relocation.b) r0
            int r1 = r0.f30074w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30074w = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.b r0 = new androidx.compose.foundation.relocation.b
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f30072u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f30074w
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.f30071t
            int r2 = r0.f30070s
            java.lang.Object[] r4 = r0.f30069r
            l0.j r5 = r0.f30068q
            kotlin.C42729a0.b(r11)
            r11 = r5
            goto L66
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.C42729a0.b(r11)
            androidx.compose.runtime.collection.e<androidx.compose.foundation.relocation.h> r11 = r9.f30076a
            T[] r2 = r11.f38260b
            int r11 = r11.f38262d
            r4 = 0
            r7 = r11
            r11 = r10
            r10 = r7
            r8 = r4
            r4 = r2
            r2 = r8
        L4a:
            if (r2 >= r10) goto L68
            r5 = r4[r2]
            androidx.compose.foundation.relocation.h r5 = (androidx.compose.foundation.relocation.h) r5
            androidx.compose.foundation.relocation.c r6 = new androidx.compose.foundation.relocation.c
            r6.<init>(r11)
            r0.f30068q = r11
            r0.f30069r = r4
            r0.f30070s = r2
            r0.f30071t = r10
            r0.f30074w = r3
            java.lang.Object r5 = androidx.compose.ui.relocation.c.a(r5, r6, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            int r2 = r2 + r3
            goto L4a
        L68:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.d.a(l0.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

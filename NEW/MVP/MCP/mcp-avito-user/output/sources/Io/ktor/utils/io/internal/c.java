package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.C;

/* compiled from: AwaitingSlot.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/internal/c;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f401022a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "suspension");

    @Y61.k
    private volatile /* synthetic */ Object suspension = null;

    public final void a() {
        C c12 = (C) f401022a.getAndSet(this, null);
        if (c12 != null) {
            c12.q3();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k Y41.a r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.internal.a
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.internal.a r0 = (io.ktor.utils.io.internal.a) r0
            int r1 = r0.f401017t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401017t = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.a r0 = new io.ktor.utils.io.internal.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f401015r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401017t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.internal.c r5 = r0.f401014q
            kotlin.C42729a0.b(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            r0.f401014q = r4
            r0.f401017t = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4d
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L4d:
            r5.a()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.c.b(Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Y41.a r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.internal.b
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.internal.b r0 = (io.ktor.utils.io.internal.b) r0
            int r1 = r0.f401021t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401021t = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.b r0 = new io.ktor.utils.io.internal.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f401019r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401021t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            int r7 = r0.f401018q
            kotlin.C42729a0.b(r8)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.P0 r8 = kotlinx.coroutines.Q0.a()
        L3b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = io.ktor.utils.io.internal.c.f401022a
            r5 = 0
            boolean r5 = r2.compareAndSet(r6, r5, r8)
            if (r5 == 0) goto L5d
            java.lang.Object r7 = r7.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            r0.f401018q = r4
            r0.f401021t = r4
            java.lang.Object r7 = r8.A(r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r7 = r4
            goto L64
        L5d:
            java.lang.Object r2 = r2.get(r6)
            if (r2 == 0) goto L3b
        L63:
            r7 = r3
        L64:
            if (r7 == 0) goto L67
            r3 = r4
        L67:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.c.c(Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

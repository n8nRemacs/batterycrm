package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WithTimeoutOrThrow.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "ru.rustore.sdk.core.util.WithTimeoutOrThrowKt", f = "WithTimeoutOrThrow.kt", i = {0}, l = {13}, m = "withTimeoutOrThrow", n = {"exceptionFactory"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class s<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f436814q;

    /* renamed from: r, reason: collision with root package name */
    public int f436815r;

    public s() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.f436814q = r6
            int r0 = r5.f436815r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r5.f436815r = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f436815r
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 != r3) goto L1a
            kotlin.C42729a0.b(r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L30
        L1a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L22:
            kotlin.C42729a0.b(r6)
            r5.f436815r = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            r3 = 0
            java.lang.Object r6 = kotlinx.coroutines.D1.b(r3, r2, r5)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            if (r6 != r0) goto L30
            goto L31
        L30:
            r0 = r6
        L31:
            return r0
        L32:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.rustore.sdk.core.util.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

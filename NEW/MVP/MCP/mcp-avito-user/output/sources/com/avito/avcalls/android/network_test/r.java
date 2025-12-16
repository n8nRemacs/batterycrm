package com.avito.avcalls.android.network_test;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r extends AbstractCoroutineContextElement implements N {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_avcalls.impl_module.network_test.f f331831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f331832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(N.b bVar, com.avito.android.iac_avcalls.impl_module.network_test.f fVar, String str) {
        super(bVar);
        this.f331831b = fVar;
        this.f331832c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // kotlinx.coroutines.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleException(@Y61.k kotlin.coroutines.CoroutineContext r7, @Y61.k java.lang.Throwable r8) {
        /*
            r6 = this;
            com.avito.android.iac_avcalls.impl_module.network_test.f r7 = r6.f331831b
            java.lang.String r0 = r6.f331832c
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r1 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            java.lang.String r2 = "onError: testId="
            java.lang.String r3 = r2.concat(r0)
            java.lang.String r4 = "AvCallsNetworkTestV1"
            r1.b(r4, r3, r8)
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.f164336a
            r5 = 1
            boolean r3 = r3.getAndSet(r5)
            r5 = 0
            if (r3 == 0) goto L25
            java.lang.String r7 = ". Skip this invocation cause it was already resumed early"
            java.lang.String r7 = AK.c.k(r2, r0, r7)
            r1.b(r4, r7, r5)
            goto L56
        L25:
            java.lang.String r1 = r8.getLocalizedMessage()
            if (r1 == 0) goto L35
            boolean r2 = kotlin.text.C43066x.K(r1)
            if (r2 != 0) goto L32
            goto L33
        L32:
            r1 = r5
        L33:
            if (r1 != 0) goto L4a
        L35:
            java.lang.String r8 = r8.getMessage()
            if (r8 == 0) goto L45
            boolean r1 = kotlin.text.C43066x.K(r8)
            if (r1 != 0) goto L42
            goto L43
        L42:
            r8 = r5
        L43:
            r1 = r8
            goto L46
        L45:
            r1 = r5
        L46:
            if (r1 != 0) goto L4a
            java.lang.String r1 = "Exception with null message"
        L4a:
            KJ.b r8 = new KJ.b
            r8.<init>(r0, r5, r1)
            int r0 = kotlin.Z.f406624c
            kotlinx.coroutines.r r7 = r7.f164337b
            r7.resumeWith(r8)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.avcalls.android.network_test.r.handleException(kotlin.coroutines.CoroutineContext, java.lang.Throwable):void");
    }
}

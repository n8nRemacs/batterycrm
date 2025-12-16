package io.ktor.client.plugins.logging;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.text.C43066x;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;

/* compiled from: HttpClientCallLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/logging/d;", "", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f399509f = AtomicIntegerFieldUpdater.newUpdater(d.class, "requestLogged");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f399510g = AtomicIntegerFieldUpdater.newUpdater(d.class, "responseLogged");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f399511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final StringBuilder f399512b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final StringBuilder f399513c = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final P0 f399514d = Q0.a();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final P0 f399515e = Q0.a();

    @Y61.k
    private volatile /* synthetic */ int requestLogged = 0;

    @Y61.k
    private volatile /* synthetic */ int responseLogged = 0;

    public d(@Y61.k f fVar) {
        this.f399511a = fVar;
    }

    public final void a() {
        P0 p02 = this.f399514d;
        if (f399509f.compareAndSet(this, 0, 1)) {
            try {
                String string = C43066x.A0(this.f399512b).toString();
                if (string.length() > 0) {
                    this.f399511a.log(string);
                }
            } finally {
                p02.q3();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.client.plugins.logging.C41454a
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.plugins.logging.a r0 = (io.ktor.client.plugins.logging.C41454a) r0
            int r1 = r0.f399498t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399498t = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.a r0 = new io.ktor.client.plugins.logging.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f399496r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399498t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.client.plugins.logging.d r0 = r0.f399495q
            kotlin.C42729a0.b(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = io.ktor.client.plugins.logging.d.f399510g
            r2 = 0
            boolean r5 = r5.compareAndSet(r4, r2, r3)
            if (r5 != 0) goto L42
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L42:
            kotlinx.coroutines.P0 r5 = r4.f399514d
            r0.f399495q = r4
            r0.f399498t = r3
            java.lang.Object r5 = r5.A(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
        L50:
            java.lang.StringBuilder r5 = r0.f399513c
            java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
            java.lang.String r5 = r5.toString()
            int r1 = r5.length()
            if (r1 <= 0) goto L65
            io.ktor.client.plugins.logging.f r0 = r0.f399511a
            r0.log(r5)
        L65:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.d.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.logging.C41455b
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.logging.b r0 = (io.ktor.client.plugins.logging.C41455b) r0
            int r1 = r0.f399503u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399503u = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.b r0 = new io.ktor.client.plugins.logging.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f399501s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399503u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f399500r
            io.ktor.client.plugins.logging.d r0 = r0.f399499q
            kotlin.C42729a0.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.P0 r6 = r4.f399515e
            r0.f399499q = r4
            r0.f399500r = r5
            r0.f399503u = r3
            java.lang.Object r6 = r6.A(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.StringBuilder r6 = r0.f399513c
            r6.append(r5)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.d.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.logging.C41456c
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.logging.c r0 = (io.ktor.client.plugins.logging.C41456c) r0
            int r1 = r0.f399508u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399508u = r1
            goto L18
        L13:
            io.ktor.client.plugins.logging.c r0 = new io.ktor.client.plugins.logging.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f399506s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399508u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f399505r
            io.ktor.client.plugins.logging.d r0 = r0.f399504q
            kotlin.C42729a0.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.P0 r6 = r4.f399514d
            r0.f399504q = r4
            r0.f399505r = r5
            r0.f399508u = r3
            java.lang.Object r6 = r6.A(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            io.ktor.client.plugins.logging.f r6 = r0.f399511a
            java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
            java.lang.String r5 = r5.toString()
            r6.log(r5)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.logging.d.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

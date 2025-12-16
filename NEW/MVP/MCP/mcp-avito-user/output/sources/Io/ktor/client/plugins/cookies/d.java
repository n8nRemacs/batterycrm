package io.ktor.client.plugins.cookies;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: AcceptAllCookiesStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cookies/d;", "Lio/ktor/client/plugins/cookies/f;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f399349b = new ArrayList();

    @Y61.k
    private volatile /* synthetic */ long oldestCookie = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f399350c = new kotlinx.coroutines.sync.d();

    /* compiled from: AcceptAllCookiesStorage.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {66}, m = "get", n = {"this", "requestUrl", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public d f399351q;

        /* renamed from: r, reason: collision with root package name */
        public T0 f399352r;

        /* renamed from: s, reason: collision with root package name */
        public kotlinx.coroutines.sync.d f399353s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f399354t;

        /* renamed from: v, reason: collision with root package name */
        public int f399356v;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f399354t = obj;
            this.f399356v |= BeduinInputModel.MIN_TEXT_VERSION;
            return d.this.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k io.ktor.http.T0 r8, @Y61.k io.ktor.http.C41530l r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cookies.a
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cookies.a r0 = (io.ktor.client.plugins.cookies.a) r0
            int r1 = r0.f399345w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399345w = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.a r0 = new io.ktor.client.plugins.cookies.a
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f399343u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399345w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.d r8 = r0.f399342t
            io.ktor.http.l r9 = r0.f399341s
            io.ktor.http.T0 r1 = r0.f399340r
            io.ktor.client.plugins.cookies.d r0 = r0.f399339q
            kotlin.C42729a0.b(r10)
            r10 = r8
            r8 = r1
            goto L52
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.C42729a0.b(r10)
            kotlinx.coroutines.sync.d r10 = r7.f399350c
            r0.f399339q = r7
            r0.f399340r = r8
            r0.f399341s = r9
            r0.f399342t = r10
            r0.f399345w = r3
            java.lang.Object r0 = r10.b(r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r0 = r7
        L52:
            r1 = 0
            java.lang.String r2 = r9.f400042a     // Catch: java.lang.Throwable -> La8
            boolean r2 = kotlin.text.C43066x.K(r2)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto Laa
            java.util.ArrayList r2 = r0.f399349b     // Catch: java.lang.Throwable -> La8
            io.ktor.client.plugins.cookies.b r4 = new io.ktor.client.plugins.cookies.b     // Catch: java.lang.Throwable -> La8
            r4.<init>(r9, r8)     // Catch: java.lang.Throwable -> La8
            kotlin.collections.C42745f0.l0(r4, r2)     // Catch: java.lang.Throwable -> La8
            java.util.ArrayList r2 = r0.f399349b     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = r9.f400048g     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L76
            java.lang.String r5 = "/"
            r6 = 0
            boolean r4 = kotlin.text.C43066x.h0(r4, r5, r6)     // Catch: java.lang.Throwable -> La8
            if (r4 != r3) goto L76
            r3 = r9
            goto L84
        L76:
            kotlin.C r3 = r8.f399911j     // Catch: java.lang.Throwable -> La8
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> La8
            r4 = 959(0x3bf, float:1.344E-42)
            io.ktor.http.l r3 = io.ktor.http.C41530l.a(r9, r1, r3, r4)     // Catch: java.lang.Throwable -> La8
        L84:
            java.lang.String r4 = r3.f400047f     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L8e
            boolean r4 = kotlin.text.C43066x.K(r4)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L96
        L8e:
            java.lang.String r8 = r8.f399903b     // Catch: java.lang.Throwable -> La8
            r4 = 991(0x3df, float:1.389E-42)
            io.ktor.http.l r3 = io.ktor.http.C41530l.a(r3, r8, r1, r4)     // Catch: java.lang.Throwable -> La8
        L96:
            r2.add(r3)     // Catch: java.lang.Throwable -> La8
            Q31.b r8 = r9.f400046e     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto Laa
            long r8 = r8.f13457j     // Catch: java.lang.Throwable -> La8
            long r2 = r0.oldestCookie     // Catch: java.lang.Throwable -> La8
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto Laa
            r0.oldestCookie = r8     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r8 = move-exception
            goto Lb2
        Laa:
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> La8
            r10.d(r1)
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lb2:
            r10.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.d.a(io.ktor.http.T0, io.ktor.http.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.http.T0 r8, @Y61.k kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.C41530l>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.client.plugins.cookies.d.a
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.plugins.cookies.d$a r0 = (io.ktor.client.plugins.cookies.d.a) r0
            int r1 = r0.f399356v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399356v = r1
            goto L1a
        L13:
            io.ktor.client.plugins.cookies.d$a r0 = new io.ktor.client.plugins.cookies.d$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f399354t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399356v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.d r8 = r0.f399353s
            io.ktor.http.T0 r1 = r0.f399352r
            io.ktor.client.plugins.cookies.d r0 = r0.f399351q
            kotlin.C42729a0.b(r9)
            goto L50
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.C42729a0.b(r9)
            kotlinx.coroutines.sync.d r9 = r7.f399350c
            r0.f399351q = r7
            r0.f399352r = r8
            r0.f399353s = r9
            r0.f399356v = r3
            java.lang.Object r0 = r9.b(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r7
            r1 = r8
            r8 = r9
        L50:
            r9 = 0
            java.util.TimeZone r2 = io.ktor.util.date.a.f400455a     // Catch: java.lang.Throwable -> Lad
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lad
            long r4 = r0.oldestCookie     // Catch: java.lang.Throwable -> Lad
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L8b
            java.util.ArrayList r4 = r0.f399349b     // Catch: java.lang.Throwable -> Lad
            io.ktor.client.plugins.cookies.c r5 = new io.ktor.client.plugins.cookies.c     // Catch: java.lang.Throwable -> Lad
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lad
            kotlin.collections.C42745f0.l0(r5, r4)     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r2 = r0.f399349b     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lad
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L72:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r5 == 0) goto L89
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> Lad
            io.ktor.http.l r5 = (io.ktor.http.C41530l) r5     // Catch: java.lang.Throwable -> Lad
            Q31.b r5 = r5.f400046e     // Catch: java.lang.Throwable -> Lad
            if (r5 == 0) goto L72
            long r5 = r5.f13457j     // Catch: java.lang.Throwable -> Lad
            long r3 = java.lang.Math.min(r3, r5)     // Catch: java.lang.Throwable -> Lad
            goto L72
        L89:
            r0.oldestCookie = r3     // Catch: java.lang.Throwable -> Lad
        L8b:
            java.util.ArrayList r0 = r0.f399349b     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lad
            r2.<init>()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
        L96:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lad
            r4 = r3
            io.ktor.http.l r4 = (io.ktor.http.C41530l) r4     // Catch: java.lang.Throwable -> Lad
            boolean r4 = io.ktor.client.plugins.cookies.g.a(r4, r1)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L96
            r2.add(r3)     // Catch: java.lang.Throwable -> Lad
            goto L96
        Lad:
            r0 = move-exception
            goto Lb3
        Laf:
            r8.d(r9)
            return r2
        Lb3:
            r8.d(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.d.b(io.ktor.http.T0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

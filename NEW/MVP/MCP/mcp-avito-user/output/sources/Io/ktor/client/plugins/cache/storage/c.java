package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: FileCacheStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/storage/c;", "Lio/ktor/client/plugins/cache/storage/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c implements io.ktor.client.plugins.cache.storage.a {

    /* compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0}, l = {43}, m = "find", n = {"this", ContextActionHandler.Link.URL, "varyKeys"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f399196q;

        /* renamed from: s, reason: collision with root package name */
        public int f399198s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f399196q = obj;
            this.f399198s |= BeduinInputModel.MIN_TEXT_VERSION;
            c.this.b(null, null, this);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k io.ktor.http.T0 r4, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof io.ktor.client.plugins.cache.storage.d
            if (r4 == 0) goto L13
            r4 = r5
            io.ktor.client.plugins.cache.storage.d r4 = (io.ktor.client.plugins.cache.storage.d) r4
            int r0 = r4.f399201s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f399201s = r0
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.d r4 = new io.ktor.client.plugins.cache.storage.d
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f399199q
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r4.f399201s
            r0 = 0
            if (r4 == 0) goto L31
            r1 = 1
            if (r4 != r1) goto L29
            kotlin.C42729a0.b(r5)
            throw r0
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.c.a(io.ktor.http.T0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.http.T0 r3, @Y61.k java.util.Map<java.lang.String, java.lang.String> r4, @Y61.k kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.b> r5) {
        /*
            r2 = this;
            boolean r3 = r5 instanceof io.ktor.client.plugins.cache.storage.c.a
            if (r3 == 0) goto L13
            r3 = r5
            io.ktor.client.plugins.cache.storage.c$a r3 = (io.ktor.client.plugins.cache.storage.c.a) r3
            int r4 = r3.f399198s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f399198s = r4
            goto L1a
        L13:
            io.ktor.client.plugins.cache.storage.c$a r3 = new io.ktor.client.plugins.cache.storage.c$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r3.<init>(r5)
        L1a:
            java.lang.Object r4 = r3.f399196q
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r3.f399198s
            r5 = 0
            if (r3 == 0) goto L33
            r0 = 1
            if (r3 != r0) goto L2b
            kotlin.C42729a0.b(r4)
            throw r5
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            kotlin.C42729a0.b(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.c.b(io.ktor.http.T0, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k io.ktor.http.T0 r4, @Y61.k io.ktor.client.plugins.cache.storage.b r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r3 = this;
            boolean r5 = r6 instanceof io.ktor.client.plugins.cache.storage.e
            if (r5 == 0) goto L13
            r5 = r6
            io.ktor.client.plugins.cache.storage.e r5 = (io.ktor.client.plugins.cache.storage.e) r5
            int r0 = r5.f399206u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f399206u = r0
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.e r5 = new io.ktor.client.plugins.cache.storage.e
            r5.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r5.f399204s
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.f399206u
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L50
            r4 = 2
            if (r0 == r1) goto L3f
            if (r0 != r4) goto L37
            io.ktor.http.T0 r4 = r5.f399203r
            io.ktor.client.plugins.cache.storage.c r5 = r5.f399202q
            java.util.Map r5 = (java.util.Map) r5
            kotlin.C42729a0.b(r6)
            r5.put(r4, r6)
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            io.ktor.http.T0 r0 = r5.f399203r
            io.ktor.client.plugins.cache.storage.c r1 = r5.f399202q
            kotlin.C42729a0.b(r6)
            r1.getClass()
            r5.f399202q = r2
            r5.f399203r = r0
            r5.f399206u = r4
            throw r2
        L50:
            kotlin.C42729a0.b(r6)
            r5.f399202q = r3
            r5.f399203r = r4
            r5.f399206u = r1
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.c.c(io.ktor.http.T0, io.ktor.client.plugins.cache.storage.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

package io.ktor.client.plugins.cache.storage;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.T0;
import io.ktor.util.D;
import java.io.File;
import java.security.MessageDigest;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;

/* compiled from: FileCacheStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/storage/h;", "Lio/ktor/client/plugins/cache/storage/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class h implements io.ktor.client.plugins.cache.storage.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final File f399209b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M f399210c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.ktor.util.collections.b<String, kotlinx.coroutines.sync.a> f399211d;

    /* compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {81}, m = "find", n = {"varyKeys"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Map f399212q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f399213r;

        /* renamed from: t, reason: collision with root package name */
        public int f399215t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f399213r = obj;
            this.f399215t |= BeduinInputModel.MIN_TEXT_VERSION;
            return h.this.b(null, null, this);
        }
    }

    public h(File file, M m12, int i12, C42822w c42822w) {
        m12 = (i12 & 2) != 0 ? C43262l0.f411947c : m12;
        this.f399209b = file;
        this.f399210c = m12;
        this.f399211d = new io.ktor.util.collections.b<>(0, 1, null);
        file.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0201 -> B:54:0x01ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02c0 -> B:15:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.client.plugins.cache.storage.h r11, io.ktor.utils.io.C41619a r12, io.ktor.client.plugins.cache.storage.b r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.d(io.ktor.client.plugins.cache.storage.h, io.ktor.utils.io.a, io.ktor.client.plugins.cache.storage.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String e(T0 t02) {
        return D.c(MessageDigest.getInstance("MD5").digest(t02.f399910i.getBytes(C43047d.f410589b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k io.ktor.http.T0 r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.i
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.i r0 = (io.ktor.client.plugins.cache.storage.i) r0
            int r1 = r0.f399218s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399218s = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.i r0 = new io.ktor.client.plugins.cache.storage.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f399216q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399218s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            java.lang.String r5 = e(r5)
            r0.f399218s = r3
            java.lang.Object r6 = r4.g(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r5 = kotlin.collections.C42745f0.P0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.a(io.ktor.http.T0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k io.ktor.http.T0 r6, @Y61.k java.util.Map<java.lang.String, java.lang.String> r7, @Y61.k kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.b> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.h.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.h$a r0 = (io.ktor.client.plugins.cache.storage.h.a) r0
            int r1 = r0.f399215t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399215t = r1
            goto L1a
        L13:
            io.ktor.client.plugins.cache.storage.h$a r0 = new io.ktor.client.plugins.cache.storage.h$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f399213r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f399215t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.util.Map r6 = r0.f399212q
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            kotlin.C42729a0.b(r8)
            goto L4d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.C42729a0.b(r8)
            java.lang.String r6 = e(r6)
            r8 = r7
            java.util.Map r8 = (java.util.Map) r8
            r0.f399212q = r8
            r0.f399215t = r3
            java.lang.Object r8 = r5.g(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L55:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r6.next()
            r0 = r8
            io.ktor.client.plugins.cache.storage.b r0 = (io.ktor.client.plugins.cache.storage.b) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L69
            goto L97
        L69:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f399194h
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
            if (r2 != 0) goto L71
            goto L55
        L96:
            r8 = 0
        L97:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.b(io.ktor.http.T0, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    public final Object c(@Y61.k T0 t02, @Y61.k b bVar, @Y61.k ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(this.f399210c, new m(this, t02, bVar, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0264 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0348 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0394 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0451 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0452  */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0346 -> B:22:0x01b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0452 -> B:15:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(io.ktor.utils.io.W0 r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.f(io.ktor.utils.io.W0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #7 {all -> 0x015a, blocks: (B:49:0x011c, B:58:0x015c, B:47:0x0109), top: B:99:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c A[Catch: all -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x015a, blocks: (B:49:0x011c, B:58:0x015c, B:47:0x0109), top: B:99:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013d -> B:53:0x0148). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.h.g(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

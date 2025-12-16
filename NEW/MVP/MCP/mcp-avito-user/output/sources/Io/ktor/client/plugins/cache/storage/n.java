package io.ktor.client.plugins.cache.storage;

import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.C41620a0;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: FileCacheStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 1}, l = {202, 102}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f399253q;

    /* renamed from: r, reason: collision with root package name */
    public Object f399254r;

    /* renamed from: s, reason: collision with root package name */
    public String f399255s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f399256t;

    /* renamed from: u, reason: collision with root package name */
    public int f399257u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f399258v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f399259w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f399260x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f399261y;

    /* compiled from: FileCacheStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", f = "FileCacheStorage.kt", i = {}, l = {96, 98}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Iterator f399262q;

        /* renamed from: r, reason: collision with root package name */
        public int f399263r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C41619a f399264s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<io.ktor.client.plugins.cache.storage.b> f399265t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h f399266u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C41619a c41619a, List list, h hVar, Continuation continuation) {
            super(2, continuation);
            this.f399264s = c41619a;
            this.f399265t = list;
            this.f399266u = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f399264s, this.f399265t, this.f399266u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f399263r
                io.ktor.utils.io.a r2 = r6.f399264s
                java.util.List<io.ktor.client.plugins.cache.storage.b> r3 = r6.f399265t
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L24
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                java.util.Iterator r1 = r6.f399262q
                kotlin.C42729a0.b(r7)
                goto L39
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.C42729a0.b(r7)
                goto L34
            L24:
                kotlin.C42729a0.b(r7)
                int r7 = r3.size()
                r6.f399263r = r5
                java.lang.Object r7 = io.ktor.utils.io.C41619a.Z0(r2, r7, r6)
                if (r7 != r0) goto L34
                return r0
            L34:
                java.util.Iterator r7 = r3.iterator()
                r1 = r7
            L39:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L52
                java.lang.Object r7 = r1.next()
                io.ktor.client.plugins.cache.storage.b r7 = (io.ktor.client.plugins.cache.storage.b) r7
                r6.f399262q = r1
                r6.f399263r = r4
                io.ktor.client.plugins.cache.storage.h r3 = r6.f399266u
                java.lang.Object r7 = io.ktor.client.plugins.cache.storage.h.d(r3, r2, r7, r6)
                if (r7 != r0) goto L39
                return r0
            L52:
                r7 = 0
                r2.h(r7)
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FileCacheStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/sync/a;", "invoke", "()Lkotlinx/coroutines/sync/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<kotlinx.coroutines.sync.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f399267l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlinx.coroutines.sync.a invoke() {
            return new kotlinx.coroutines.sync.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f399259w = hVar;
        this.f399260x = str;
        this.f399261y = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f399259w, this.f399260x, this.f399261y, continuation);
        nVar.f399258v = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Object> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objBoxLong;
        kotlinx.coroutines.sync.a aVar;
        T t12;
        h hVar;
        String str;
        kotlinx.coroutines.sync.a aVar2;
        ArrayList arrayList;
        C41619a c41619aA;
        BufferedOutputStream bufferedOutputStream;
        Closeable closeable;
        kotlinx.coroutines.sync.a aVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r22 = this.f399257u;
        try {
            try {
            } catch (Exception e12) {
                io.ktor.client.plugins.cache.r.f399180a.e("Exception during saving a cache to a file: ".concat(C42833p.b(e12)));
                objBoxLong = G0.f406611a;
                aVar = r22;
            }
            try {
                if (r22 == 0) {
                    C42729a0.b(obj);
                    t12 = (T) this.f399258v;
                    hVar = this.f399259w;
                    io.ktor.util.collections.b<String, kotlinx.coroutines.sync.a> bVar = hVar.f399211d;
                    b bVar2 = b.f399267l;
                    String str2 = this.f399260x;
                    kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) bVar.a(bVar2, str2);
                    this.f399258v = t12;
                    this.f399253q = aVar4;
                    this.f399254r = hVar;
                    this.f399255s = str2;
                    ArrayList arrayList2 = this.f399261y;
                    this.f399256t = arrayList2;
                    this.f399257u = 1;
                    if (aVar4.b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                    aVar2 = aVar4;
                    arrayList = arrayList2;
                } else {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) this.f399253q;
                        kotlinx.coroutines.sync.a aVar5 = (kotlinx.coroutines.sync.a) this.f399258v;
                        try {
                            C42729a0.b(obj);
                            aVar3 = aVar5;
                            objBoxLong = Boxing.boxLong(((Number) obj).longValue());
                            closeable.close();
                            aVar = aVar3;
                            return objBoxLong;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                closeable.close();
                            } finally {
                                throw th;
                            }
                            throw th;
                        }
                    }
                    ArrayList arrayList3 = this.f399256t;
                    str = this.f399255s;
                    hVar = (h) this.f399254r;
                    kotlinx.coroutines.sync.a aVar6 = (kotlinx.coroutines.sync.a) this.f399253q;
                    t12 = (T) this.f399258v;
                    C42729a0.b(obj);
                    arrayList = arrayList3;
                    aVar2 = aVar6;
                }
                C43259k.d(t12, null, null, new a(c41619aA, arrayList, hVar, null), 3);
                this.f399258v = aVar2;
                this.f399253q = bufferedOutputStream;
                this.f399254r = null;
                this.f399255s = null;
                this.f399256t = null;
                this.f399257u = 2;
                obj = io.ktor.utils.io.jvm.javaio.r.a(c41619aA, bufferedOutputStream, Long.MAX_VALUE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = bufferedOutputStream;
                aVar3 = aVar2;
                objBoxLong = Boxing.boxLong(((Number) obj).longValue());
                closeable.close();
                aVar = aVar3;
                return objBoxLong;
            } catch (Throwable th3) {
                th = th3;
                closeable = bufferedOutputStream;
                closeable.close();
                throw th;
            }
            c41619aA = C41620a0.a();
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(hVar.f399209b, str)), 8192);
        } finally {
            r22.d(null);
        }
    }
}

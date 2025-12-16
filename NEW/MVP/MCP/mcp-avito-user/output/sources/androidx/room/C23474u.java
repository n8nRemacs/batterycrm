package androidx.room;

import androidx.room.Y;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "Lkotlinx/coroutines/flow/j;", "LX41/o;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.room.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23474u extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f54397q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f54398r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f54399s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String[] f54400t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f54401u;

    /* compiled from: CoroutinesRoom.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.u$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f54402q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54403r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f54404s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f54405t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String[] f54406u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Callable<Object> f54407v;

        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {128, 130}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.room.u$a$a, reason: collision with other inner class name */
        public static final class C1919a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public InterfaceC43125y f54408q;

            /* renamed from: r, reason: collision with root package name */
            public int f54409r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f54410s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ b f54411t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C43108m f54412u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Callable<Object> f54413v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ C43108m f54414w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1919a(RoomDatabase roomDatabase, b bVar, C43108m c43108m, Callable callable, C43108m c43108m2, Continuation continuation) {
                super(2, continuation);
                this.f54410s = roomDatabase;
                this.f54411t = bVar;
                this.f54412u = c43108m;
                this.f54413v = callable;
                this.f54414w = c43108m2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C1919a(this.f54410s, this.f54411t, this.f54412u, this.f54413v, this.f54414w, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1919a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0037, B:22:0x0045, B:24:0x004d, B:14:0x0027, B:17:0x0031), top: B:31:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:8:0x0019). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f54409r
                    androidx.room.u$a$b r2 = r8.f54411t
                    androidx.room.RoomDatabase r3 = r8.f54410s
                    r4 = 2
                    r5 = 1
                    androidx.room.Y r3 = r3.f54301e
                    if (r1 == 0) goto L2b
                    if (r1 == r5) goto L25
                    if (r1 != r4) goto L1d
                    kotlinx.coroutines.channels.y r1 = r8.f54408q
                    kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L1b
                L19:
                    r9 = r1
                    goto L37
                L1b:
                    r9 = move-exception
                    goto L69
                L1d:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L25:
                    kotlinx.coroutines.channels.y r1 = r8.f54408q
                    kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L1b
                    goto L45
                L2b:
                    kotlin.C42729a0.b(r9)
                    r3.a(r2)
                    kotlinx.coroutines.channels.m r9 = r8.f54412u     // Catch: java.lang.Throwable -> L1b
                    kotlinx.coroutines.channels.y r9 = r9.iterator()     // Catch: java.lang.Throwable -> L1b
                L37:
                    r8.f54408q = r9     // Catch: java.lang.Throwable -> L1b
                    r8.f54409r = r5     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r1 = r9.a(r8)     // Catch: java.lang.Throwable -> L1b
                    if (r1 != r0) goto L42
                    return r0
                L42:
                    r7 = r1
                    r1 = r9
                    r9 = r7
                L45:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                    boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                    if (r9 == 0) goto L63
                    r1.next()     // Catch: java.lang.Throwable -> L1b
                    java.util.concurrent.Callable<java.lang.Object> r9 = r8.f54413v     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L1b
                    kotlinx.coroutines.channels.m r6 = r8.f54414w     // Catch: java.lang.Throwable -> L1b
                    r8.f54408q = r1     // Catch: java.lang.Throwable -> L1b
                    r8.f54409r = r4     // Catch: java.lang.Throwable -> L1b
                    java.lang.Object r9 = r6.send(r9, r8)     // Catch: java.lang.Throwable -> L1b
                    if (r9 != r0) goto L19
                    return r0
                L63:
                    r3.c(r2)
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                L69:
                    r3.c(r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.C23474u.a.C1919a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/u$a$b", "Landroidx/room/Y$c;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.u$a$b */
        public static final class b extends Y.c {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C43108m f54415b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String[] strArr, C43108m c43108m) {
                super(strArr);
                this.f54415b = c43108m;
            }

            @Override // androidx.room.Y.c
            public final void a(@Y61.k Set<String> set) {
                this.f54415b.w(kotlin.G0.f406611a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RoomDatabase roomDatabase, InterfaceC43172j interfaceC43172j, String[] strArr, Callable callable, Continuation continuation) {
            super(2, continuation);
            this.f54404s = roomDatabase;
            this.f54405t = interfaceC43172j;
            this.f54406u = strArr;
            this.f54407v = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f54404s, this.f54405t, this.f54406u, this.f54407v, continuation);
            aVar.f54403r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f54402q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f54403r;
                C43108m c43108mA = kotlinx.coroutines.channels.A.a(-1, null, null, 6);
                b bVar = new b(this.f54406u, c43108mA);
                c43108mA.w(kotlin.G0.f406611a);
                R0 r02 = (R0) t12.getF401596i().get(R0.f54293d);
                RoomDatabase roomDatabase = this.f54404s;
                CoroutineContext coroutineContextA = r02 != null ? r02.f54294b : C23482z.a(roomDatabase);
                C43108m c43108mA2 = kotlinx.coroutines.channels.A.a(0, null, null, 7);
                C43259k.d(t12, coroutineContextA, null, new C1919a(roomDatabase, bVar, c43108mA, this.f54407v, c43108mA2, null), 2);
                this.f54402q = 1;
                if (C43175k.v(this.f54405t, c43108mA2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23474u(RoomDatabase roomDatabase, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f54399s = roomDatabase;
        this.f54400t = strArr;
        this.f54401u = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C23474u c23474u = new C23474u(this.f54399s, this.f54400t, this.f54401u, continuation);
        c23474u.f54398r = obj;
        return c23474u;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C23474u) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f54397q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f54399s, (InterfaceC43172j) this.f54398r, this.f54400t, this.f54401u, null);
            this.f54397q = 1;
            if (kotlinx.coroutines.U.c(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}

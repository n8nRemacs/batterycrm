package bb1;

import eb1.C40084a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$getOrUpdate$2", f = "IPCClientsDataSource.kt", i = {0, 0}, l = {72, 41}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
public final class s extends SuspendLambda implements Y41.p<T, Continuation<? super C40084a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f57266q;

    /* renamed from: r, reason: collision with root package name */
    public p f57267r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f57268s;

    /* renamed from: t, reason: collision with root package name */
    public int f57269t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f57270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f57271v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f57272w;

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$getOrUpdate$2$2$ipcClientsNotNull$1", f = "IPCClientsDataSource.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super C40084a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f57273q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f57274r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f57274r = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f57274r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super C40084a> continuation) {
            return new a(this.f57274r, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f57273q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f57273q = 1;
                obj = p.a(this.f57274r, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, boolean z12, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f57271v = pVar;
        this.f57272w = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        s sVar = new s(this.f57271v, this.f57272w, continuation);
        sVar.f57270u = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C40084a> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[PHI: r9
  0x0094: PHI (r9v18 java.lang.Object) = (r9v10 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x0091, B:6:0x0011] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f57269t
            java.lang.String r2 = "Something went wrong, deferred is null"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.C42729a0.b(r9)
            goto L94
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            boolean r1 = r8.f57268s
            bb1.p r4 = r8.f57267r
            kotlinx.coroutines.sync.d r6 = r8.f57266q
            java.lang.Object r7 = r8.f57270u
            kotlinx.coroutines.T r7 = (kotlinx.coroutines.T) r7
            kotlin.C42729a0.b(r9)
            goto L63
        L2c:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f57270u
            r7 = r9
            kotlinx.coroutines.T r7 = (kotlinx.coroutines.T) r7
            bb1.p r9 = r8.f57271v
            kotlinx.coroutines.a0<eb1.a> r9 = r9.f57258e
            if (r9 == 0) goto L4b
            boolean r9 = r8.f57272w
            if (r9 != 0) goto L4b
            bb1.p r9 = r8.f57271v
            kotlinx.coroutines.a0<eb1.a> r9 = r9.f57258e
            if (r9 == 0) goto L45
            goto L85
        L45:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L4b:
            bb1.p r9 = r8.f57271v
            kotlinx.coroutines.sync.d r6 = r9.f57259f
            boolean r1 = r8.f57272w
            r8.f57270u = r7
            r8.f57266q = r6
            r8.f57267r = r9
            r8.f57268s = r1
            r8.f57269t = r4
            java.lang.Object r4 = r6.b(r8)
            if (r4 != r0) goto L62
            return r0
        L62:
            r4 = r9
        L63:
            kotlinx.coroutines.a0<eb1.a> r9 = r4.f57258e     // Catch: java.lang.Throwable -> L74
            if (r9 == 0) goto L76
            if (r1 != 0) goto L76
            kotlinx.coroutines.a0<eb1.a> r9 = r4.f57258e     // Catch: java.lang.Throwable -> L74
            if (r9 == 0) goto L6e
            goto L82
        L6e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L74
            throw r9     // Catch: java.lang.Throwable -> L74
        L74:
            r9 = move-exception
            goto L95
        L76:
            bb1.s$a r9 = new bb1.s$a     // Catch: java.lang.Throwable -> L74
            r9.<init>(r4, r5)     // Catch: java.lang.Throwable -> L74
            r1 = 3
            kotlinx.coroutines.a0 r9 = kotlinx.coroutines.C43259k.b(r7, r5, r9, r1)     // Catch: java.lang.Throwable -> L74
            r4.f57258e = r9     // Catch: java.lang.Throwable -> L74
        L82:
            r6.d(r5)
        L85:
            r8.f57270u = r5
            r8.f57266q = r5
            r8.f57267r = r5
            r8.f57269t = r3
            java.lang.Object r9 = r9.F(r8)
            if (r9 != r0) goto L94
            return r0
        L94:
            return r9
        L95:
            r6.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

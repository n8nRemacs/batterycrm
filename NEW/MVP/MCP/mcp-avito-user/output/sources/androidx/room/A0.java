package androidx.room;

import com.avito.android.timestamp_storage.data.database.TimestampDatabase_Impl;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class A0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f54217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f54218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimestampDatabase_Impl f54219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> f54220e;

    /* compiled from: RoomDatabaseExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f54221q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54222r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ TimestampDatabase_Impl f54223s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f54224t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> f54225u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TimestampDatabase_Impl timestampDatabase_Impl, kotlinx.coroutines.r rVar, Y41.p pVar, Continuation continuation) {
            super(2, continuation);
            this.f54223s = timestampDatabase_Impl;
            this.f54224t = rVar;
            this.f54225u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f54223s, this.f54224t, this.f54225u, continuation);
            aVar.f54222r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Continuation continuation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f54221q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) ((kotlinx.coroutines.T) this.f54222r).getF398977e().get(ContinuationInterceptor.INSTANCE);
                R0 r02 = new R0(continuationInterceptor);
                CoroutineContext coroutineContextPlus = continuationInterceptor.plus(r02).plus(new kotlinx.coroutines.internal.h0(Integer.valueOf(System.identityHashCode(r02)), this.f54223s.f54306j));
                int i13 = kotlin.Z.f406624c;
                kotlinx.coroutines.r rVar = this.f54224t;
                this.f54222r = rVar;
                this.f54221q = 1;
                obj = C43259k.g(coroutineContextPlus, this.f54225u, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                continuation = rVar;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                continuation = (Continuation) this.f54222r;
                C42729a0.b(obj);
            }
            int i14 = kotlin.Z.f406624c;
            continuation.resumeWith(obj);
            return kotlin.G0.f406611a;
        }
    }

    public A0(CoroutineContext coroutineContext, kotlinx.coroutines.r rVar, TimestampDatabase_Impl timestampDatabase_Impl, Y41.p pVar) {
        this.f54217b = coroutineContext;
        this.f54218c = rVar;
        this.f54219d = timestampDatabase_Impl;
        this.f54220e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.r rVar = this.f54218c;
        try {
            C43259k.e(this.f54217b.minusKey(ContinuationInterceptor.INSTANCE), new a(this.f54219d, rVar, this.f54220e, null));
        } catch (Throwable th2) {
            rVar.f(th2);
        }
    }
}

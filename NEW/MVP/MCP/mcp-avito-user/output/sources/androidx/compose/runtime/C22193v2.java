package androidx.compose.runtime;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {93, 95}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
/* renamed from: androidx.compose.runtime.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22193v2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f38785q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f38786r;

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.v2$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f38787q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Recomposer f38788r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Recomposer recomposer, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38788r = recomposer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f38788r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f38787q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f38787q = 1;
                if (this.f38788r.J(this) == coroutine_suspended) {
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

    public C22193v2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f38785q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f38786r;
            C43259k.d(t12, null, null, new a(new Recomposer(t12.getF401596i()), null), 3);
            throw null;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.f38786r;
            C42729a0.b(obj);
            return obj2;
        }
        Recomposer recomposer = (Recomposer) this.f38786r;
        C42729a0.b(obj);
        kotlinx.coroutines.P0 p02 = recomposer.f38129v;
        p02.getClass();
        if (p02.p0(kotlin.G0.f406611a)) {
            synchronized (recomposer.f38109b) {
                recomposer.f38125r = true;
            }
        }
        this.f38786r = obj;
        this.f38785q = 2;
        return recomposer.D(this) == coroutine_suspended ? coroutine_suspended : obj;
    }
}

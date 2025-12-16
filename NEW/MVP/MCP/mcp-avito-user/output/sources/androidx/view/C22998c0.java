package androidx.view;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/c0;", "T", "Landroidx/lifecycle/b0;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22998c0<T> implements InterfaceC22996b0<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C23051n<T> f46729a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CoroutineContext f46730b;

    /* compiled from: CoroutineLiveData.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.c0$a */
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f46731q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C22998c0<T> f46732r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ T f46733s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22998c0<T> c22998c0, T t12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46732r = c22998c0;
            this.f46733s = t12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f46732r, this.f46733s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f46731q;
            C22998c0<T> c22998c0 = this.f46732r;
            if (i12 == 0) {
                C42729a0.b(obj);
                C23051n<T> c23051n = c22998c0.f46729a;
                this.f46731q = 1;
                if (c23051n.c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            c22998c0.f46729a.setValue(this.f46733s);
            return G0.f406611a;
        }
    }

    public C22998c0(@k C23051n<T> c23051n, @k CoroutineContext coroutineContext) {
        this.f46729a = c23051n;
        c cVar = C43262l0.f411945a;
        this.f46730b = coroutineContext.plus(K.f411877a.y());
    }

    @Override // androidx.view.InterfaceC22996b0
    @l
    @SuppressLint({"NullSafeMutableLiveData"})
    public final Object emit(T t12, @k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f46730b, new a(this, t12, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}

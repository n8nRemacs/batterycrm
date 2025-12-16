package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.foundation.G1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33961q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f33962r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f33963s;

    /* compiled from: PullRefreshState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f33964q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ t f33965r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f33966s;

        /* compiled from: PullRefreshState.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.material.pullrefresh.s$a$a, reason: collision with other inner class name */
        public static final class C1636a extends N implements Y41.p<Float, Float, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ t f33967l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1636a(t tVar) {
                super(2);
                this.f33967l = tVar;
            }

            @Override // Y41.p
            public final G0 invoke(Float f12, Float f13) {
                float fFloatValue = f12.floatValue();
                f13.floatValue();
                ((C22040c3) this.f33967l.f33972e).S6(fFloatValue);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, float f12, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f33965r = tVar;
            this.f33966s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return new a(this.f33965r, this.f33966s, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f33964q;
            if (i12 == 0) {
                C42729a0.b(obj);
                t tVar = this.f33965r;
                float f12 = ((C22040c3) tVar.f33972e).f();
                C1636a c1636a = new C1636a(tVar);
                this.f33964q = 1;
                if (C20273d1.c(f12, this.f33966s, null, c1636a, this, 12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, float f12, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f33962r = tVar;
        this.f33963s = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new s(this.f33962r, this.f33963s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33961q;
        if (i12 == 0) {
            C42729a0.b(obj);
            t tVar = this.f33962r;
            G1 g12 = tVar.f33976i;
            a aVar = new a(tVar, this.f33963s, null);
            this.f33961q = 1;
            if (g12.b(MutatePriority.f26797b, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

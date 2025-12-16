package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class V extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27499q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X f27500r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<s2, Continuation<? super kotlin.G0>, Object> f27501s;

    /* compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/s2;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/s2;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<s2, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f27502q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ X f27503r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<s2, Continuation<? super kotlin.G0>, Object> f27504s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(X x12, Y41.p<? super s2, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27503r = x12;
            this.f27504s = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27503r, this.f27504s, continuation);
            aVar.f27502q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(s2 s2Var, Continuation<? super kotlin.G0> continuation) {
            ((a) create(s2Var, continuation)).invokeSuspend(kotlin.G0.f406611a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f27503r.getClass();
            Boxing.boxBoolean(true);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x12, Y41.p pVar, Continuation continuation) {
        super(2, continuation);
        MutatePriority mutatePriority = MutatePriority.f26797b;
        this.f27500r = x12;
        this.f27501s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        MutatePriority mutatePriority = MutatePriority.f26797b;
        return new V(this.f27500r, this.f27501s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((V) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27499q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
        C42729a0.b(obj);
        X x12 = this.f27500r;
        x12.getClass();
        new a(x12, this.f27501s, null);
        this.f27499q = 1;
        throw null;
    }
}

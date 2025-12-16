package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/S;", "Landroidx/compose/foundation/gestures/Y0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f27453a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f27454b = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.G1 f27455c = new androidx.compose.foundation.G1();

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {612}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27456q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f27458s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f27459t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Y41.p<? super O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27458s = mutatePriority;
            this.f27459t = (SuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return S.this.new a(this.f27458s, this.f27459t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27456q;
            if (i12 == 0) {
                C42729a0.b(obj);
                S s5 = S.this;
                androidx.compose.foundation.G1 g12 = s5.f27455c;
                b bVar = s5.f27454b;
                this.f27456q = 1;
                if (g12.c(bVar, this.f27458s, this.f27459t, this) == coroutine_suspended) {
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

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/S$b", "Landroidx/compose/foundation/gestures/O0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements O0 {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.compose.foundation.gestures.O0
        public final void a(float f12) {
            S.this.f27453a.invoke(Float.valueOf(f12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S(@Y61.k Y41.l<? super Float, kotlin.G0> lVar) {
        this.f27453a = (kotlin.jvm.internal.N) lVar;
    }

    @Override // androidx.compose.foundation.gestures.Y0
    @Y61.l
    public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(mutatePriority, pVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}

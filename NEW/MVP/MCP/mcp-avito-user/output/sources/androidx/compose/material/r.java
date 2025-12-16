package androidx.compose.material;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/T;", "", "velocity", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;F)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class r extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ kotlinx.coroutines.T f34014q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f34015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21398x<Object> f34016s;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34017q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C21398x<Object> f34018r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f34019s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21398x<Object> c21398x, float f12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34018r = c21398x;
            this.f34019s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34018r, this.f34019s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34017q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f34017q = 1;
                if (this.f34018r.j(this.f34019s, this) == coroutine_suspended) {
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
    public r(C21398x<Object> c21398x, Continuation<? super r> continuation) {
        super(3, continuation);
        this.f34016s = c21398x;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, Float f12, Continuation<? super kotlin.G0> continuation) {
        float fFloatValue = f12.floatValue();
        r rVar = new r(this.f34016s, continuation);
        rVar.f34014q = t12;
        rVar.f34015r = fFloatValue;
        return rVar.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43259k.d(this.f34014q, null, null, new a(this.f34016s, this.f34015r, null), 3);
        return kotlin.G0.f406611a;
    }
}

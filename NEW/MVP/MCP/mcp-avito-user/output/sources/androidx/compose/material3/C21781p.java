package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/T;", "", "velocity", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;F)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21781p extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ kotlinx.coroutines.T f37002q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f37003r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21916v<Object> f37004s;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.p$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f37005q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C21916v<Object> f37006r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f37007s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21916v<Object> c21916v, float f12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37006r = c21916v;
            this.f37007s = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f37006r, this.f37007s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37005q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f37005q = 1;
                if (this.f37006r.j(this.f37007s, this) == coroutine_suspended) {
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
    public C21781p(C21916v<Object> c21916v, Continuation<? super C21781p> continuation) {
        super(3, continuation);
        this.f37004s = c21916v;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, Float f12, Continuation<? super kotlin.G0> continuation) {
        float fFloatValue = f12.floatValue();
        C21781p c21781p = new C21781p(this.f37004s, continuation);
        c21781p.f37002q = t12;
        c21781p.f37003r = fFloatValue;
        return c21781p.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43259k.d(this.f37002q, null, null, new a(this.f37004s, this.f37003r, null), 3);
        return kotlin.G0.f406611a;
    }
}

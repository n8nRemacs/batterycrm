package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class H7 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34832q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N7 f34833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K7 f34834s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(N7 n72, K7 k72, Continuation<? super H7> continuation) {
        super(2, continuation);
        this.f34833r = n72;
        this.f34834s = k72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new H7(this.f34833r, this.f34834s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((H7) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34832q;
        if (i12 == 0) {
            C42729a0.b(obj);
            K7 k72 = this.f34834s;
            this.f34832q = 1;
            N7 n72 = this.f34833r;
            n72.f35171a = k72.f34990a;
            n72.f35172b = k72.f34991b;
            n72.f35173c = k72.f34993d;
            n72.f35174d = k72.f34992c;
            Object objB = n72.b(this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = kotlin.G0.f406611a;
            }
            if (objB == coroutine_suspended) {
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

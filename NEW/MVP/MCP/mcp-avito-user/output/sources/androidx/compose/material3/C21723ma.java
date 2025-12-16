package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21723ma extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36832q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Me f36833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f36834s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21723ma(Me me2, float f12, Continuation<? super C21723ma> continuation) {
        super(2, continuation);
        this.f36833r = me2;
        this.f36834s = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21723ma(this.f36833r, this.f36834s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21723ma) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36832q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f36832q = 1;
            Object objJ = this.f36833r.f35135c.j(this.f36834s, this);
            if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objJ = kotlin.G0.f406611a;
            }
            if (objJ == coroutine_suspended) {
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

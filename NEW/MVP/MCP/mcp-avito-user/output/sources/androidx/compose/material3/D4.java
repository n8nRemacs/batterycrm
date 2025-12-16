package androidx.compose.material3;

import androidx.compose.foundation.lazy.w0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1568}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class D4 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34614q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.w0 f34615r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f34617t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C21784p2 f34618u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4(androidx.compose.foundation.lazy.w0 w0Var, int i12, kotlin.ranges.l lVar, C21784p2 c21784p2, Continuation<? super D4> continuation) {
        super(2, continuation);
        this.f34615r = w0Var;
        this.f34616s = i12;
        this.f34617t = lVar;
        this.f34618u = c21784p2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new D4(this.f34615r, this.f34616s, this.f34617t, this.f34618u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((D4) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34614q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = (((this.f34616s - this.f34617t.f406905b) * 12) + this.f34618u.f37011b) - 1;
            this.f34614q = 1;
            androidx.compose.foundation.lazy.w0 w0Var = this.f34615r;
            w0.c cVar = androidx.compose.foundation.lazy.w0.f29712w;
            if (w0Var.k(i13, 0, this) == coroutine_suspended) {
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

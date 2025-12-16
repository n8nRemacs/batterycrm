package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {1181}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22018zd extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37852q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Ad f37853r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f37854s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22018zd(Ad ad2, int i12, Continuation<? super C22018zd> continuation) {
        super(2, continuation);
        this.f37853r = ad2;
        this.f37854s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C22018zd(this.f37853r, this.f37854s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C22018zd) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37852q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.foundation.d2 d2Var = this.f37853r.f34508a;
            androidx.compose.animation.core.G1 g12 = C21891ti.f37350b;
            this.f37852q = 1;
            if (d2Var.f(this.f37854s, g12, this) == coroutine_suspended) {
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

package androidx.compose.foundation;

import androidx.compose.foundation.L0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.platform.InterfaceC22544x2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", i = {0, 0}, l = {908, 912}, m = "invokeSuspend", n = {"minTime", "timeout"}, s = {"J$0", "J$1"})
/* loaded from: classes.dex */
final class M0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f26776q;

    /* renamed from: r, reason: collision with root package name */
    public long f26777r;

    /* renamed from: s, reason: collision with root package name */
    public int f26778s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ L0 f26779t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f26780u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(L0 l02, long j12, Continuation<? super M0> continuation) {
        super(2, continuation);
        this.f26779t = l02;
        this.f26780u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new M0(this.f26779t, this.f26780u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((M0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jB2;
        long j12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f26778s;
        L0 l02 = this.f26779t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) C22417j.a(l02, androidx.compose.ui.platform.Q0.f41210s);
            interfaceC22544x2.getClass();
            jB2 = interfaceC22544x2.b();
            j12 = 40;
            this.f26776q = 40L;
            this.f26777r = jB2;
            this.f26778s = 1;
            if (C43131e0.b(40L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                l02.f26920w.invoke();
                return kotlin.G0.f406611a;
            }
            jB2 = this.f26777r;
            j12 = this.f26776q;
            C42729a0.b(obj);
        }
        L0.a aVarB = l02.f26759N.b(this.f26780u);
        if (aVarB != null) {
            aVarB.f26761b = true;
        }
        this.f26778s = 2;
        if (C43131e0.b(jB2 - j12, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        l02.f26920w.invoke();
        return kotlin.G0.f406611a;
    }
}

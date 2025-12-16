package kotlinx.coroutines.flow;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class E0 extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411130q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f411131r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f411132s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Object, Continuation<Object>, Object> f411133t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E0(Y41.p<Object, ? super Continuation<Object>, ? extends Object> pVar, Continuation<? super E0> continuation) {
        super(3, continuation);
        this.f411133t = pVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Object obj, Continuation<? super kotlin.G0> continuation) {
        E0 e02 = new E0(this.f411133t, continuation);
        e02.f411131r = interfaceC43172j;
        e02.f411132s = obj;
        return e02.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411130q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f411131r;
            Object obj2 = this.f411132s;
            this.f411131r = interfaceC43172j;
            this.f411130q = 1;
            obj = this.f411133t.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            interfaceC43172j = this.f411131r;
            C42729a0.b(obj);
        }
        this.f411131r = null;
        this.f411130q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}

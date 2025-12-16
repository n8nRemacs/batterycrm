package kotlinx.coroutines.flow;

import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Zip.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class F1 extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Object[], Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411137q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f411138r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object[] f411139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.q<Object, Object, Continuation<Object>, Object> f411140t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F1(Y41.q<Object, Object, ? super Continuation<Object>, ? extends Object> qVar, Continuation<? super F1> continuation) {
        super(3, continuation);
        this.f411140t = qVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Object[] objArr, Continuation<? super kotlin.G0> continuation) {
        F1 f12 = new F1(this.f411140t, continuation);
        f12.f411138r = interfaceC43172j;
        f12.f411139s = objArr;
        return f12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411137q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f411138r;
            Object[] objArr = this.f411139s;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f411138r = interfaceC43172j;
            this.f411137q = 1;
            obj = this.f411140t.invoke(obj2, obj3, this);
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
            interfaceC43172j = this.f411138r;
            C42729a0.b(obj);
        }
        this.f411138r = null;
        this.f411137q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}

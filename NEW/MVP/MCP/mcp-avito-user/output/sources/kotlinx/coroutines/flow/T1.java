package kotlinx.coroutines.flow;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Zip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {258, 258}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class T1 extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Object[], Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411272q;

    public T1() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Object[] objArr, Continuation<? super kotlin.G0> continuation) {
        kotlin.jvm.internal.L.l();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411272q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f411272q = 1;
            throw null;
        }
        if (i12 == 1) {
            C42729a0.b(obj);
            this.f411272q = 2;
            throw null;
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return kotlin.G0.f406611a;
    }
}

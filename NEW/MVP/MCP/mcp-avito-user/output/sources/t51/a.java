package T51;

import D31.g;
import Y41.q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* loaded from: classes8.dex */
public final class a extends SuspendLambda implements q {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f15375q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(3, continuation);
        this.f15375q = cVar;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new a(this.f15375q, (Continuation) obj3).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        c cVar = this.f15375q;
        C81.c cVar2 = cVar.f15379c;
        C43259k.d((T) ((g) cVar2.f1996a).f2881b.getValue(), null, null, new C81.b(cVar2, new b(cVar), null), 3);
        return G0.f406611a;
    }
}

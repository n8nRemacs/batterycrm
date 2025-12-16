package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class X0<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<Object> f411297b;

    public X0(l0.h<Object> hVar) {
        this.f411297b = hVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        this.f411297b.f406842b = t12;
        return kotlin.G0.f406611a;
    }
}

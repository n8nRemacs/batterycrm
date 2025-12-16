package kotlinx.coroutines.flow.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<InterfaceC43172j<Object>, Object, Continuation<? super G0>, Object> f411441a;

    /* compiled from: SafeCollector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.q<InterfaceC43172j<? super Object>, Object, Continuation<? super G0>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final a f411442b = new a();

        public a() {
            super(3, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Object> interfaceC43172j, Object obj, Continuation<? super G0> continuation) {
            return interfaceC43172j.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f411442b;
        v0.e(3, aVar);
        f411441a = aVar;
    }
}

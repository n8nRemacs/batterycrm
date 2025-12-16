package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Collect.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/A;", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class A implements InterfaceC43172j<Object> {

    /* compiled from: Collect.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411091q;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411091q = obj;
            throw null;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(Object obj, @Y61.k Continuation<? super kotlin.G0> continuation) {
        throw null;
    }
}

package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n0", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class M0 implements InterfaceC43172j<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h f411166b;

    public M0(l0.h hVar) {
        this.f411166b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(Object obj, @Y61.k Continuation<? super kotlin.G0> continuation) {
        this.f411166b.f406842b = obj;
        throw new AbortFlowException(this);
    }
}

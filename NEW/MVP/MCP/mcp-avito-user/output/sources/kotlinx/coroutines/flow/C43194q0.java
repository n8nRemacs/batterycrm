package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43194q0 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411693c;

    /* JADX WARN: Multi-variable type inference failed */
    public C43194q0(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
        this.f411692b = interfaceC43160i;
        this.f411693c = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objCollect = this.f411692b.collect(new C43196r0(new l0.a(), interfaceC43172j, this.f411693c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}

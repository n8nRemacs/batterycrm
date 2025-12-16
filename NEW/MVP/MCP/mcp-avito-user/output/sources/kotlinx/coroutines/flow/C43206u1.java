package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43206u1 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411787c;

    /* JADX WARN: Multi-variable type inference failed */
    public C43206u1(InterfaceC43160i interfaceC43160i, Y41.q qVar) {
        this.f411786b = interfaceC43160i;
        this.f411787c = (SuspendLambda) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlinx.coroutines.internal.a0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation) {
        l0.h hVar = new l0.h();
        hVar.f406842b = kotlinx.coroutines.flow.internal.z.f411583a;
        Object objCollect = this.f411786b.collect(new C43209v1(hVar, this.f411787c, interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}

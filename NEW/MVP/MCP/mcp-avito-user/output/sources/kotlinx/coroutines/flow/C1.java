package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/D", "Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C1 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f411120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.q f411121d;

    public C1(InterfaceC43160i interfaceC43160i, InterfaceC43160i interfaceC43160i2, Y41.q qVar) {
        this.f411119b = interfaceC43160i;
        this.f411120c = interfaceC43160i2;
        this.f411121d = qVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objA = kotlinx.coroutines.flow.internal.n.a(U1.f411276l, new F1(this.f411121d, null), continuation, interfaceC43172j, new InterfaceC43160i[]{this.f411119b, this.f411120c});
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }
}

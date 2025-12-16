package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/p0;", "Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43270p0 implements InterfaceC43269p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43268o0 f411954b;

    public C43270p0(@Y61.k InterfaceC43268o0 interfaceC43268o0) {
        this.f411954b = interfaceC43268o0;
    }

    @Override // kotlinx.coroutines.InterfaceC43269p
    public final void a(@Y61.l Throwable th2) {
        this.f411954b.dispose();
    }

    @Y61.k
    public final String toString() {
        return "DisposeOnCancel[" + this.f411954b + ']';
    }
}

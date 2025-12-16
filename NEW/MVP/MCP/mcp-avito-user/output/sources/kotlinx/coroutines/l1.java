package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/U0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class l1 extends U0 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r f411948f;

    public l1(@Y61.k r rVar) {
        this.f411948f = rVar;
    }

    @Override // kotlinx.coroutines.H0
    public final void a(@Y61.l Throwable th2) {
        int i12 = kotlin.Z.f406624c;
        this.f411948f.resumeWith(kotlin.G0.f406611a);
    }
}

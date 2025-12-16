package kotlinx.coroutines.rx3;

import kotlin.Metadata;
import kotlinx.coroutines.AbstractC43075a;

/* compiled from: RxCancellable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx3/p;", "Ll41/f;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43293p implements l41.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC43075a f412113a;

    public C43293p(@Y61.k AbstractC43075a abstractC43075a) {
        this.f412113a = abstractC43075a;
    }

    @Override // l41.f
    public final void cancel() {
        this.f412113a.c(null);
    }
}

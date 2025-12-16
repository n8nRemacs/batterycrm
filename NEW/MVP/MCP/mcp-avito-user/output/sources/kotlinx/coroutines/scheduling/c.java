package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.internal.C43255z;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/scheduling/c;", "Lkotlinx/coroutines/scheduling/h;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f412169d = new c();

    public c() {
        super(n.f412182e, n.f412178a, n.f412180c, n.f412181d);
    }

    @Override // kotlinx.coroutines.scheduling.h, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.M
    @B0
    @Y61.k
    public final M q(int i12) {
        C43255z.a(1);
        return 1 >= n.f412180c ? this : super.q(1);
    }

    @Override // kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        return "Dispatchers.Default";
    }
}

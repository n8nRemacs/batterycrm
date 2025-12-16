package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotThreadLocal.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/internal/N;", "T", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Q> f38439a = new AtomicReference<>(O.f38442a);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f38440b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public T f38441c;

    @Y61.l
    public final T a() {
        long jA2 = T.a();
        if (jA2 == S.f38446a) {
            return this.f38441c;
        }
        Q q12 = this.f38439a.get();
        int iA2 = q12.a(jA2);
        if (iA2 >= 0) {
            return (T) q12.f38445c[iA2];
        }
        return null;
    }

    public final void b(@Y61.l T t12) {
        long jA2 = T.a();
        if (jA2 == S.f38446a) {
            this.f38441c = t12;
            return;
        }
        synchronized (this.f38440b) {
            Q q12 = this.f38439a.get();
            int iA2 = q12.a(jA2);
            if (iA2 >= 0) {
                q12.f38445c[iA2] = t12;
            } else {
                this.f38439a.set(q12.b(jA2, t12));
                G0 g02 = G0.f406611a;
            }
        }
    }
}

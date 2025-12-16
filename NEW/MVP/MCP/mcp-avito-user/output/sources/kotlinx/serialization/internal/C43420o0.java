package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;

/* compiled from: Caching.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/o0;", "T", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43420o0<T> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public volatile SoftReference<T> f412900a = new SoftReference<>(null);

    public final synchronized T a(@Y61.k Y41.a<? extends T> aVar) {
        T t12 = this.f412900a.get();
        if (t12 != null) {
            return t12;
        }
        T tInvoke = aVar.invoke();
        this.f412900a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}

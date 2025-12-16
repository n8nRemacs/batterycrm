package UV0;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ListDataSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LUV0/c;", "T", "LUV0/b;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c<T> implements b<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<T> f16399b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends T> list) {
        this.f16399b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return L.f(this.f16399b, ((c) obj).f16399b);
        }
        return false;
    }

    @Override // UV0.a
    public final int getCount() {
        return this.f16399b.size();
    }

    @Override // UV0.a
    public final T getItem(int i12) {
        return this.f16399b.get(i12);
    }

    public final int hashCode() {
        return this.f16399b.hashCode();
    }

    @Override // UV0.a
    public final boolean isEmpty() {
        return this.f16399b.isEmpty();
    }

    @Override // java.lang.Iterable
    @k
    public final Iterator<T> iterator() {
        return this.f16399b.iterator();
    }
}

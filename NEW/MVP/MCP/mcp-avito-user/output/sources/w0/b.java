package W0;

import Y41.l;
import Y61.k;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.InterfaceC22875a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceFileCorruptionHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LW0/b;", "T", "Landroidx/datastore/core/a;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class b<T> implements InterfaceC22875a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final N f17540a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k l<? super CorruptionException, ? extends T> lVar) {
        this.f17540a = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.datastore.core.InterfaceC22875a
    @Y61.l
    public final Object a(@k CorruptionException corruptionException) {
        return this.f17540a.invoke(corruptionException);
    }
}

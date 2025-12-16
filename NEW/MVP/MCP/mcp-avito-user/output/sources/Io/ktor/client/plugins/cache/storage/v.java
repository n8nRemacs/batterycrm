package io.ktor.client.plugins.cache.storage;

import io.ktor.http.T0;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UnlimitedCacheStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/storage/v;", "Lio/ktor/client/plugins/cache/storage/a;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class v implements io.ktor.client.plugins.cache.storage.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.util.collections.b<T0, Set<b>> f399298b = new io.ktor.util.collections.b<>(0, 1, null);

    /* compiled from: UnlimitedCacheStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lio/ktor/client/plugins/cache/storage/b;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<Set<b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f399299l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Set<b> invoke() {
            return new io.ktor.util.collections.d();
        }
    }

    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    public final Object a(@Y61.k T0 t02, @Y61.k ContinuationImpl continuationImpl) {
        Set<b> set = this.f399298b.f400447b.get(t02);
        return set == null ? B0.f406639b : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    public final Object b(@Y61.k T0 t02, @Y61.k Map<String, String> map, @Y61.k Continuation<? super b> continuation) {
        for (Object obj : (Set) this.f399298b.a(a.f399299l, t02)) {
            b bVar = (b) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!L.f(bVar.f399194h.get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.a
    @Y61.l
    public final Object c(@Y61.k T0 t02, @Y61.k b bVar, @Y61.k ContinuationImpl continuationImpl) {
        Set set = (Set) this.f399298b.a(w.f399300l, t02);
        if (!set.add(bVar)) {
            set.remove(bVar);
            set.add(bVar);
        }
        return G0.f406611a;
    }
}

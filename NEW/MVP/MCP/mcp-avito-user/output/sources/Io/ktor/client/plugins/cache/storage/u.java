package io.ktor.client.plugins.cache.storage;

import io.ktor.http.T0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UnlimitedCacheStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/storage/u;", "Lio/ktor/client/plugins/cache/storage/q;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u extends q {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.util.collections.b<T0, Set<io.ktor.client.plugins.cache.m>> f399295c = new io.ktor.util.collections.b<>(0, 1, null);

    /* compiled from: UnlimitedCacheStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lio/ktor/client/plugins/cache/m;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<Set<io.ktor.client.plugins.cache.m>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f399296l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Set<io.ktor.client.plugins.cache.m> invoke() {
            return new io.ktor.util.collections.d();
        }
    }

    /* compiled from: UnlimitedCacheStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lio/ktor/client/plugins/cache/m;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<Set<io.ktor.client.plugins.cache.m>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f399297l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Set<io.ktor.client.plugins.cache.m> invoke() {
            return new io.ktor.util.collections.d();
        }
    }

    @Override // io.ktor.client.plugins.cache.storage.q
    @Y61.l
    public final io.ktor.client.plugins.cache.m a(@Y61.k T0 t02, @Y61.k Map<String, String> map) {
        Object next;
        Iterator it = ((Set) this.f399295c.a(a.f399296l, t02)).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            io.ktor.client.plugins.cache.m mVar = (io.ktor.client.plugins.cache.m) next;
            if (!map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!L.f(mVar.f399168b.get(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (io.ktor.client.plugins.cache.m) next;
    }

    @Override // io.ktor.client.plugins.cache.storage.q
    @Y61.k
    public final Set<io.ktor.client.plugins.cache.m> b(@Y61.k T0 t02) {
        Set<io.ktor.client.plugins.cache.m> set = this.f399295c.f400447b.get(t02);
        return set == null ? B0.f406639b : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.q
    public final void c(@Y61.k T0 t02, @Y61.k io.ktor.client.plugins.cache.m mVar) {
        Set set = (Set) this.f399295c.a(b.f399297l, t02);
        if (set.add(mVar)) {
            return;
        }
        set.remove(mVar);
        set.add(mVar);
    }
}

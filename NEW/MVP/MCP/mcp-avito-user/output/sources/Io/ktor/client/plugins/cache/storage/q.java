package io.ktor.client.plugins.cache.storage;

import io.ktor.http.T0;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: HttpCacheStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/cache/storage/q;", "", "<init>", "()V", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f399275a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.a<q> f399276b = a.f399277l;

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/storage/u;", "invoke", "()Lio/ktor/client/plugins/cache/storage/u;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<u> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f399277l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final u invoke() {
            return new u();
        }
    }

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/storage/q$b;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        int i12 = f.f399207c;
    }

    @Y61.l
    public abstract io.ktor.client.plugins.cache.m a(@Y61.k T0 t02, @Y61.k Map<String, String> map);

    @Y61.k
    public abstract Set<io.ktor.client.plugins.cache.m> b(@Y61.k T0 t02);

    public abstract void c(@Y61.k T0 t02, @Y61.k io.ktor.client.plugins.cache.m mVar);
}

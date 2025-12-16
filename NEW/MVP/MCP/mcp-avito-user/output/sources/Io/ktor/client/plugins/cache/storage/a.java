package io.ktor.client.plugins.cache.storage;

import io.ktor.http.T0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.N;

/* compiled from: HttpCacheStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/plugins/cache/storage/a;", "", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C11400a f399183a = C11400a.f399184a;

    /* compiled from: HttpCacheStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/storage/a$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.a$a, reason: collision with other inner class name */
    public static final class C11400a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C11400a f399184a = new C11400a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Y41.a<a> f399185b = C11401a.f399186l;

        /* compiled from: HttpCacheStorage.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/storage/v;", "invoke", "()Lio/ktor/client/plugins/cache/storage/v;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: io.ktor.client.plugins.cache.storage.a$a$a, reason: collision with other inner class name */
        public static final class C11401a extends N implements Y41.a<v> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11401a f399186l = new C11401a();

            public C11401a() {
                super(0);
            }

            @Override // Y41.a
            public final v invoke() {
                return new v();
            }
        }

        static {
            int i12 = g.f399208b;
        }
    }

    @Y61.l
    Object a(@Y61.k T0 t02, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object b(@Y61.k T0 t02, @Y61.k Map<String, String> map, @Y61.k Continuation<? super b> continuation);

    @Y61.l
    Object c(@Y61.k T0 t02, @Y61.k b bVar, @Y61.k ContinuationImpl continuationImpl);
}

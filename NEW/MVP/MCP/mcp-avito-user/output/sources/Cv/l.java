package cv;

import X41.n;
import androidx.view.P0;
import gv.InterfaceC40741c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkHandlerModule_ProvideDeeplinkRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcv/l;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/handler/registry/e;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.android.deeplink_handler.handler.registry.e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f393047c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f393048a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.registry.c f393049b;

    /* compiled from: DeeplinkHandlerModule_ProvideDeeplinkRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv/l$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k dagger.internal.l lVar, @Y61.k com.avito.android.deeplink_handler.handler.registry.c cVar) {
        this.f393048a = lVar;
        this.f393049b = cVar;
    }

    @n
    @Y61.k
    public static final l a(@Y61.k dagger.internal.l lVar, @Y61.k com.avito.android.deeplink_handler.handler.registry.c cVar) {
        f393047c.getClass();
        return new l(lVar, cVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40741c interfaceC40741c = (InterfaceC40741c) this.f393048a.f393949a;
        com.avito.android.deeplink_handler.handler.registry.b bVar = (com.avito.android.deeplink_handler.handler.registry.b) this.f393049b.get();
        f393047c.getClass();
        i.f393039a.getClass();
        return (com.avito.android.deeplink_handler.handler.registry.e) new P0(interfaceC40741c.c(), bVar).a(com.avito.android.deeplink_handler.handler.registry.e.class);
    }
}

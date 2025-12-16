package Ev0;

import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetFieldsModule_ProvideSimpleRecyclerAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEv0/l;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/j;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f4392c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f4393a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.a> f4394b;

    /* compiled from: ServiceTransportationWidgetFieldsModule_ProvideSimpleRecyclerAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEv0/l$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k f fVar, @Y61.k u uVar, @Y61.k Provider provider) {
        this.f4393a = uVar;
        this.f4394b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f4393a.get();
        com.avito.konveyor.a aVar = this.f4394b.get();
        f4392c.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        jVar.setHasStableIds(true);
        return jVar;
    }
}

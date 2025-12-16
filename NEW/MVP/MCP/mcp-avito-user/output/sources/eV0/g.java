package Ev0;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetFieldsModule_ProvideDataAwareAdapterPresenter$_avito_service_transportation_widget_publicFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEv0/g;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/a;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f4380d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f4381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f4382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.adapter.h> f4383c;

    /* compiled from: ServiceTransportationWidgetFieldsModule_ProvideDataAwareAdapterPresenter$_avito_service_transportation_widget_publicFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/services_transportation_widget/item/di/ServiceTransportationWidgetFieldsModule_ProvideDataAwareAdapterPresenter$_avito_service_transportation_widget_publicFactory.Companion", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k f fVar, @Y61.k Provider provider, @Y61.k u uVar, @Y61.k Provider provider2) {
        this.f4381a = provider;
        this.f4382b = uVar;
        this.f4383c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f4381a);
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f4382b.get();
        com.avito.konveyor.adapter.h hVar = this.f4383c.get();
        f4380d.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}

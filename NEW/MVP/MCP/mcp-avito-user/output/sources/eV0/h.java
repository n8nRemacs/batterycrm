package Ev0;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetFieldsModule_ProvideDiffCalculator$_avito_service_transportation_widget_publicFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEv0/h;", "Ldagger/internal/h;", "Lcom/avito/android/recycler/data_aware/e;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f4384b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f4385a;

    /* compiled from: ServiceTransportationWidgetFieldsModule_ProvideDiffCalculator$_avito_service_transportation_widget_publicFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/services_transportation_widget/item/di/ServiceTransportationWidgetFieldsModule_ProvideDiffCalculator$_avito_service_transportation_widget_publicFactory.Companion", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k f fVar, @Y61.k u uVar) {
        this.f4385a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f4385a.get();
        f4384b.getClass();
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), new com.avito.android.recycler.data_aware.j(), false, aVar);
    }
}

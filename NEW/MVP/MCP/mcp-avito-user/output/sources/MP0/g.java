package MP0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: WidgetFiltersWidgetsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f10683a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.utils.b> f10684b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43624b> f10685c;

    public g(Provider<com.avito.android.server_time.f> provider, Provider<com.avito.android.widget_filters.utils.b> provider2, Provider<C43624b> provider3) {
        this.f10683a = provider;
        this.f10684b = provider2;
        this.f10685c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = this.f10683a.get();
        com.avito.android.widget_filters.utils.b bVar = this.f10684b.get();
        this.f10685c.get();
        return new f(fVar, bVar);
    }
}

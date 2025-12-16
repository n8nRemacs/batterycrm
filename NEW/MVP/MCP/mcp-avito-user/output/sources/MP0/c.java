package MP0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersItemsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.utils.b> f10680a;

    public c(Provider<com.avito.android.widget_filters.utils.b> provider) {
        this.f10680a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f10680a.get());
    }
}

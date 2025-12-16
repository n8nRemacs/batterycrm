package KP0;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WidgetFiltersIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<com.avito.android.widget_filters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f9454a;

    public b(C30102l3 c30102l3) {
        this.f9454a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.widget_filters.a((Context) this.f9454a.get());
    }
}

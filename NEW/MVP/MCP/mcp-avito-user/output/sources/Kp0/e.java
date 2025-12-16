package KP0;

import com.avito.android.widget_filters.mvi.u;
import com.avito.android.widget_filters.mvi.v;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WidgetFiltersViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final v f9455a;

    public e(v vVar) {
        this.f9455a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((u) this.f9455a.get(), null, 2, null);
    }
}

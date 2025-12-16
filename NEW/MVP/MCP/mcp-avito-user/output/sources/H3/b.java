package H3;

import com.avito.android.active_orders.adapter.d;
import com.avito.android.active_orders.adapter.f;
import com.avito.android.active_orders.adapter.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActiveOrdersItemModule_ProvideHomeActiveOrdersItemPresenterFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.active_orders.adapter.e f6932a;

    public b(com.avito.android.active_orders.adapter.e eVar) {
        this.f6932a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f6932a.get();
        int i12 = a.f6931a;
        return new g(dVar);
    }
}

package BC0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelFeatureDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f1245a;

    public b(dv.b bVar) {
        this.f1245a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f1245a.get());
    }
}

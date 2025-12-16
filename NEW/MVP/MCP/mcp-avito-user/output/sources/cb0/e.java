package CB0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLevelFeatureHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f2048a;

    public e(dv.b bVar) {
        this.f2048a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.d) this.f2048a.get());
    }
}

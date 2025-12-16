package Lt0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SaveScheduleInfoConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f10167a;

    public c(u uVar) {
        this.f10167a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.service_booking.data.preferences.a) this.f10167a.get());
    }
}

package nB0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceManualDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f414919a;

    public e(dv.b bVar) {
        this.f414919a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.d) this.f414919a.get());
    }
}

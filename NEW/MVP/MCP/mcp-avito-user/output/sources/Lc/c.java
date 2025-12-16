package lC;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FakeDoorDialogDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C43615a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f413583a;

    public c(dv.b bVar) {
        this.f413583a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43615a((a.d) this.f413583a.get());
    }
}

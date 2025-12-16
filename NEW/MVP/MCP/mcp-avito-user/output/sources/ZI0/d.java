package Zi0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelfEmploymentRedirectDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<C19566a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f20485a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.registration_self_employment_redirect_screen.ui.d f20486b;

    public d(dv.b bVar, com.avito.android.registration_self_employment_redirect_screen.ui.d dVar) {
        this.f20485a = bVar;
        this.f20486b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C19566a((a.InterfaceC4053a) this.f20485a.get(), (com.avito.android.registration_self_employment_redirect_screen.ui.b) this.f20486b.get());
    }
}

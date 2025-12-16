package Ex;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationStatusDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C13540a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.document_verification_status_screen.ui.d f4431a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f4432b;

    public d(com.avito.android.document_verification_status_screen.ui.d dVar, dv.b bVar) {
        this.f4431a = dVar;
        this.f4432b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13540a((com.avito.android.document_verification_status_screen.ui.b) this.f4431a.get(), (a.InterfaceC4053a) this.f4432b.get());
    }
}

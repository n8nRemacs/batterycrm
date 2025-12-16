package Ex;

import com.avito.android.document_verification_status_screen.VerificationStatusDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VerificationStatusDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f4430a;

    public c(d dVar) {
        this.f4430a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f4430a;
        b.f4429a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VerificationStatusDeeplink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}

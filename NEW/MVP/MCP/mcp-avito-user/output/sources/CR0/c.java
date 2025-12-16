package cr0;

import com.avito.android.send_esia_data_screen.SendEsiaDataDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SendEsiaDataDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f392974a;

    public c(d dVar) {
        this.f392974a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f392974a;
        C39403b.f392973a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SendEsiaDataDeeplink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}

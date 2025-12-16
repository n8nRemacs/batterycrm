package N50;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportDuplicationFinishLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final E50.c f11203a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f11204b;

    public b(E50.c cVar, dv.b bVar) {
        this.f11203a = cVar;
        this.f11204b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((E50.a) this.f11203a.get(), (a.InterfaceC4053a) this.f11204b.get());
    }
}

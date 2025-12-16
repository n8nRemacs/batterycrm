package pC0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLevelsHandler_Factory.java */
@e
@y
@x
/* renamed from: pC0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46933c implements h<C46932b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f428269a;

    /* renamed from: b, reason: collision with root package name */
    public final hC0.e f428270b;

    public C46933c(dv.b bVar, hC0.e eVar) {
        this.f428269a = bVar;
        this.f428270b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C46932b((a.InterfaceC4053a) this.f428269a.get(), (hC0.c) this.f428270b.get());
    }
}

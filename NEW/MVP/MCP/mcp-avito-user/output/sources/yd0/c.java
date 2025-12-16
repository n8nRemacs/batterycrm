package YD0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff_select.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f19383a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_select.h f19384b;

    public c(dv.b bVar, com.avito.android.tariff_select.h hVar) {
        this.f19383a = bVar;
        this.f19384b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f19383a.get(), (f) this.f19384b.get());
    }
}

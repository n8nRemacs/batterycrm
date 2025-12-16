package u20;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.motivation_screen.ui.s;
import com.avito.android.motivation_screen.ui.u;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: u20.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48772d implements h<C48769a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f439732a;

    /* renamed from: b, reason: collision with root package name */
    public final u f439733b;

    public C48772d(dv.b bVar, u uVar) {
        this.f439732a = bVar;
        this.f439733b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48769a((a.InterfaceC4053a) this.f439732a.get(), (s) this.f439733b.get());
    }
}

package q70;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.phone_confirmation.P;
import com.avito.android.phone_confirmation.S;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneVerifySyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final S f429042a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f429043b;

    public e(S s5, dv.b bVar) {
        this.f429042a = s5;
        this.f429043b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((P) this.f429042a.get(), (a.InterfaceC4053a) this.f429043b.get());
    }
}

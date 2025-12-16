package FO0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.wallet.history.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletHistoryLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f4698a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f4699b;

    public d(f fVar, dv.b bVar) {
        this.f4698a = fVar;
        this.f4699b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.wallet.history.e) this.f4698a.get(), (a.InterfaceC4053a) this.f4699b.get());
    }
}

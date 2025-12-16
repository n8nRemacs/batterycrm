package OY;

import Hl0.InterfaceC14002a;
import com.avito.android.messenger.conversation.mvi.deeplinks.payout.q;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessengerPayoutModule_ProvideStrPayoutInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14002a> f12311a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f12312b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f12313c;

    public e(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f12311a = provider;
        this.f12312b = provider2;
        this.f12313c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14002a interfaceC14002a = this.f12311a.get();
        R0 r02 = this.f12312b.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f12313c.get();
        a.f12301a.getClass();
        return new q(interfaceC14002a, r02, fVar);
    }
}

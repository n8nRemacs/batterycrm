package OY;

import com.avito.android.remote.B;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessengerPayoutModule_ProvideDeliveryPayoutInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.deeplinks.payout.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f12305a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f12306b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f12307c;

    public c(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f12305a = provider;
        this.f12306b = provider2;
        this.f12307c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B b12 = this.f12305a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f12306b.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f12307c.get();
        a.f12301a.getClass();
        return new com.avito.android.messenger.conversation.mvi.deeplinks.payout.j(b12, interfaceC35745a5, fVar);
    }
}

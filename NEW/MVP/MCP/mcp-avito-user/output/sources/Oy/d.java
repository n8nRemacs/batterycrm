package OY;

import Mn0.InterfaceC14512b;
import com.avito.android.messenger.conversation.mvi.deeplinks.payout.n;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessengerPayoutModule_ProvideSafeDealPayoutInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14512b> f12308a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f12309b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f12310c;

    public d(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f12308a = provider;
        this.f12309b = provider2;
        this.f12310c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14512b interfaceC14512b = this.f12308a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f12309b.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f12310c.get();
        a.f12301a.getClass();
        return new n(interfaceC14512b, interfaceC35745a5, fVar);
    }
}

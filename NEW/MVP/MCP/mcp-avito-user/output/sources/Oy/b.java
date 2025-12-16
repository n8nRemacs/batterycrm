package OY;

import com.avito.android.remote.B;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessengerPayoutModule_ProvideDeliveryCourierPayoutInteractor$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.deeplinks.payout.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f12302a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f12303b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f12304c;

    public b(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f12302a = provider;
        this.f12303b = provider2;
        this.f12304c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B b12 = this.f12302a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f12303b.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f12304c.get();
        a.f12301a.getClass();
        return new com.avito.android.messenger.conversation.mvi.deeplinks.payout.g(b12, interfaceC35745a5, fVar);
    }
}

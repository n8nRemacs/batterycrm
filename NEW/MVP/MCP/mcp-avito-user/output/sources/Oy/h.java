package OY;

import com.avito.android.deep_linking.links.DeliveryPayoutInitLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PayoutDeeplinkHandlerModule_ProvideDeliveryPayoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.deeplinks.payout.i f12316a;

    public h(com.avito.android.messenger.conversation.mvi.deeplinks.payout.i iVar) {
        this.f12316a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.deeplinks.payout.i iVar = this.f12316a;
        f.f12314a.getClass();
        return new C43834a(DeliveryPayoutInitLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryPayoutInitLink.class), iVar));
    }
}

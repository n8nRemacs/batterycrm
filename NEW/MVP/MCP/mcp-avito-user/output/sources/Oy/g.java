package OY;

import com.avito.android.deep_linking.links.DeliveryCourierPayoutInitLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PayoutDeeplinkHandlerModule_ProvideDeliveryCourierPayoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.deeplinks.payout.f f12315a;

    public g(com.avito.android.messenger.conversation.mvi.deeplinks.payout.f fVar) {
        this.f12315a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.conversation.mvi.deeplinks.payout.f fVar = this.f12315a;
        f.f12314a.getClass();
        return new C43834a(DeliveryCourierPayoutInitLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DeliveryCourierPayoutInitLink.class), fVar));
    }
}

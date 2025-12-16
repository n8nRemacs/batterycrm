package OY;

import com.avito.android.deep_linking.links.SafeDealPayoutInitLink;
import com.avito.android.messenger.conversation.mvi.deeplinks.payout.m;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PayoutDeeplinkHandlerModule_ProvideSafeDealPayoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f12317a;

    public i(m mVar) {
        this.f12317a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = this.f12317a;
        f.f12314a.getClass();
        return new C43834a(SafeDealPayoutInitLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SafeDealPayoutInitLink.class), mVar));
    }
}

package OY;

import com.avito.android.deep_linking.links.StrPayoutInitLink;
import com.avito.android.messenger.conversation.mvi.deeplinks.payout.p;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PayoutDeeplinkHandlerModule_ProvideStrPayoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f12318a;

    public j(p pVar) {
        this.f12318a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = this.f12318a;
        f.f12314a.getClass();
        return new C43834a(StrPayoutInitLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrPayoutInitLink.class), pVar));
    }
}

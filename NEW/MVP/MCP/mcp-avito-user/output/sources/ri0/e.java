package Ri0;

import com.avito.android.referral_contacts.ReferralContactsDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ReferralContactsDeeplinkHandlerModule_ProvideReferralContactsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C15046b f14572a;

    public e(C15046b c15046b) {
        this.f14572a = c15046b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C15046b c15046b = this.f14572a;
        d.f14571a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ReferralContactsDeeplink.class, new c(), new C43834a.b.C11809b(c15046b));
    }
}

package Ri0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReferralContactsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ri0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15046b implements h<C15045a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f14569a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.referral_contacts.ui.d f14570b;

    public C15046b(dv.b bVar, com.avito.android.referral_contacts.ui.d dVar) {
        this.f14569a = bVar;
        this.f14570b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15045a((a.InterfaceC4053a) this.f14569a.get(), (com.avito.android.referral_contacts.ui.b) this.f14570b.get());
    }
}

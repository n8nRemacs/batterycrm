package c20;

import com.avito.android.mortgage_invite.deeplink.MortgageApplicationClientFormLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageInviteDeeplinkModule_ProvideMortgageApplicationClientFormLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: c20.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C26925b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.deeplinks.c f57624a;

    public C26925b(com.avito.android.mortgage_invite.deeplinks.c cVar) {
        this.f57624a = cVar;
    }

    public static C43834a a(com.avito.android.mortgage_invite.deeplinks.c cVar) {
        C26924a.f57623a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageApplicationClientFormLink.class, new com.avito.android.mortgage_invite.deeplinks.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageApplicationClientFormLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f57624a);
    }
}

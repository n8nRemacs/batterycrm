package c20;

import com.avito.android.mortgage_invite.deeplink.MortgageApplicationContactInfoLink;
import com.avito.android.mortgage_invite.deeplinks.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageInviteDeeplinkModule_ProvideMortgageApplicationContactInfoLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: c20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C26926c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f57625a;

    public C26926c(g gVar) {
        this.f57625a = gVar;
    }

    public static C43834a a(g gVar) {
        C26924a.f57623a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageApplicationContactInfoLink.class, new com.avito.android.mortgage_invite.deeplinks.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageApplicationContactInfoLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f57625a);
    }
}

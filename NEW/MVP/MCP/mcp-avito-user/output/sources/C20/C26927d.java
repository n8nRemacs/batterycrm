package c20;

import com.avito.android.mortgage_invite.deeplink.MortgageApplicationLeadLink;
import com.avito.android.mortgage_invite.deeplinks.k;
import com.avito.android.mortgage_invite.deeplinks.o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MortgageInviteDeeplinkModule_ProvideMortgageApplicationLeadLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: c20.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C26927d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f57626a;

    public C26927d(k kVar) {
        this.f57626a = kVar;
    }

    public static C43834a a(k kVar) {
        C26924a.f57623a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MortgageApplicationLeadLink.class, new o(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MortgageApplicationLeadLink.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f57626a);
    }
}

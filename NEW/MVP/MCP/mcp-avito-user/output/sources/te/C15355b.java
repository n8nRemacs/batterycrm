package Te;

import com.avito.android.deep_linking.links.BuyContactsLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BuyContactsDeepLinkHandlerModule_ProvideBuyContactLinkParserHandlerFactory.java */
@e
@y
@x
/* renamed from: Te.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15355b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auto_reseller_contacts.deepLink.e f15770a;

    public C15355b(com.avito.android.auto_reseller_contacts.deepLink.e eVar) {
        this.f15770a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auto_reseller_contacts.deepLink.e eVar = this.f15770a;
        C15354a.f15769a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BuyContactsLink.class, new com.avito.android.auto_reseller_contacts.deepLink.c(), new C43834a.b.C11809b(eVar));
    }
}

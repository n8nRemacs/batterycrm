package Te;

import com.avito.android.auto_reseller_contacts.deepLink.o;
import com.avito.android.auto_reseller_contacts.deepLink.p;
import com.avito.android.deep_linking.links.RequestMessageLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BuyContactsDeepLinkHandlerModule_ProvideRequestMessageLinkParserHandlerFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final o f15771a;

    public c(o oVar) {
        this.f15771a = oVar;
    }

    public static C43834a a(o oVar) {
        C15354a.f15769a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RequestMessageLink.class, new p(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RequestMessageLink.class), oVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f15771a);
    }
}

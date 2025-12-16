package Te;

import com.avito.android.auto_reseller_contacts.deepLink.s;
import com.avito.android.auto_reseller_contacts.deepLink.v;
import com.avito.android.deep_linking.links.SpendContactsLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BuyContactsDeepLinkHandlerModule_ProvideSpendContactLinkParserHandlerFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final v f15772a;

    public d(v vVar) {
        this.f15772a = vVar;
    }

    public static C43834a a(v vVar) {
        C15354a.f15769a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SpendContactsLink.class, new s(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SpendContactsLink.class), vVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f15772a);
    }
}

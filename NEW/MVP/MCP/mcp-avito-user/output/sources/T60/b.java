package t60;

import com.avito.android.deep_linking.links.SbpPaymentAppLink;
import com.avito.android.payment.deeplink.C;
import com.avito.android.payment.deeplink.D;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SbpPaymentAppDeepLinkHandlerModule_ProvideSbpDeeplinkMappingFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f439149a;

    public b(C c12) {
        this.f439149a = c12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f439149a;
        C48507a.f439148a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SbpPaymentAppLink.class, new D(), new C43834a.b.C11809b(c12));
    }
}

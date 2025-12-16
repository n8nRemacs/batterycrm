package D60;

import com.avito.android.payment_list.PaymentListDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PaymentListDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f2938a;

    public c(d dVar) {
        this.f2938a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f2938a;
        b.f2937a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PaymentListDeeplink.class, new e(), new C43834a.b.C11809b(dVar));
    }
}

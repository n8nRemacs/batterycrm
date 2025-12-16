package D60;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentListDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f2939a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.payment_list.ui.d f2940b;

    public d(dv.b bVar, com.avito.android.payment_list.ui.d dVar) {
        this.f2939a = bVar;
        this.f2940b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f2939a.get(), (com.avito.android.payment_list.ui.b) this.f2940b.get());
    }
}

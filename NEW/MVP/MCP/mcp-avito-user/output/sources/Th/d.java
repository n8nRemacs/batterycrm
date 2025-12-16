package tH;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigMotivationPaymentDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C48555a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f439217a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f439218b;

    public d(C30102l3 c30102l3, dv.b bVar) {
        this.f439217a = c30102l3;
        this.f439218b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48555a((Context) this.f439217a.get(), (a.InterfaceC4053a) this.f439218b.get());
    }
}

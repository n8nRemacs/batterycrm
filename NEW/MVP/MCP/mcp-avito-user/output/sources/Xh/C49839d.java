package xH;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigMotivationsListDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: xH.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49839d implements h<C49836a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f442319a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f442320b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f442321c;

    public C49839d(Provider provider, C30102l3 c30102l3, dv.b bVar) {
        this.f442319a = provider;
        this.f442320b = c30102l3;
        this.f442321c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49836a(this.f442319a.get(), (Context) this.f442320b.get(), (a.InterfaceC4053a) this.f442321c.get());
    }
}

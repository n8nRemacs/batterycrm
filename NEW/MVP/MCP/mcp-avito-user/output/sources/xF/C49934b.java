package xf;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaLandingDeepLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: xf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49934b implements h<C49933a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f442593a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f442594b;

    public C49934b(C30102l3 c30102l3, dv.b bVar) {
        this.f442593a = c30102l3;
        this.f442594b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49933a((Context) this.f442593a.get(), (a.InterfaceC4053a) this.f442594b.get());
    }
}

package oI0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: UserAdvertsDeeplinkHandler_Factory.java */
@e
@y
@x
/* renamed from: oI0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44653d implements h<C44650a> {

    /* renamed from: a, reason: collision with root package name */
    public final nI0.d f419699a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f419700b;

    public C44653d(nI0.d dVar, dv.b bVar) {
        this.f419699a = dVar;
        this.f419700b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44650a((InterfaceC44261b) this.f419699a.get(), (a.InterfaceC4053a) this.f419700b.get());
    }
}

package Qg0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserContactsLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: Qg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14894b implements h<C14893a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.h f13979a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f13980b;

    public C14894b(com.avito.android.rating.h hVar, dv.b bVar) {
        this.f13979a = hVar;
        this.f13980b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14893a((a.InterfaceC4053a) this.f13980b.get(), (f) this.f13979a.get());
    }
}

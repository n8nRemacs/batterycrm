package Cb0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile_settings.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: ProfileSettingsLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: Cb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13239b implements h<C13238a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f2288a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2289b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f2290c;

    public C13239b(q qVar, d dVar, dv.b bVar) {
        this.f2288a = qVar;
        this.f2289b = dVar;
        this.f2290c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13238a((o) this.f2288a.get(), (com.avito.android.profile_settings.b) this.f2289b.get(), (a.InterfaceC4053a) this.f2290c.get());
    }
}

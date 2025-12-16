package lq;

import Xp.InterfaceC17035a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iq.C42090c;

/* compiled from: PromoDeeplinkHandler_Factory.java */
@e
@y
@x
/* renamed from: lq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43817b implements h<C43816a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f414217a;

    /* renamed from: b, reason: collision with root package name */
    public final C42090c f414218b;

    public C43817b(dv.b bVar, C42090c c42090c) {
        this.f414217a = bVar;
        this.f414218b = c42090c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43816a((a.InterfaceC4053a) this.f414217a.get(), (InterfaceC17035a) this.f414218b.get());
    }
}

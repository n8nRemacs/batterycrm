package ws;

import com.avito.android.credits.f;
import com.avito.android.credits.i;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.navigation.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreditPartnerLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: ws.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49678b implements h<C49677a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f441830a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f441831b;

    /* renamed from: c, reason: collision with root package name */
    public final c f441832c;

    public C49678b(i iVar, dv.b bVar, c cVar) {
        this.f441830a = iVar;
        this.f441831b = bVar;
        this.f441832c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49677a((f) this.f441830a.get(), (a.InterfaceC4053a) this.f441831b.get(), (com.avito.android.navigation.a) this.f441832c.get());
    }
}

package kk;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<C42705e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f406576a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.player.router.f f406577b;

    public h(dv.b bVar, com.avito.android.player.router.f fVar) {
        this.f406576a = bVar;
        this.f406577b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42705e((a.InterfaceC4053a) this.f406576a.get(), (com.avito.android.player.router.d) this.f406577b.get());
    }
}

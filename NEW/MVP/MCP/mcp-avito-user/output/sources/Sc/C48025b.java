package sC;

import com.avito.android.account.E;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_favorites.InterfaceC35727l;
import com.avito.android.user_favorites.n;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteComparisonDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: sC.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48025b implements dagger.internal.h<C48024a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f437534a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f437535b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f437536c;

    public C48025b(n nVar, Provider provider, dv.b bVar) {
        this.f437534a = nVar;
        this.f437535b = provider;
        this.f437536c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48024a((InterfaceC35727l) this.f437534a.get(), this.f437535b.get(), (a.InterfaceC4053a) this.f437536c.get());
    }
}

package Bm;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarNavigatorLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: Bm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13162b implements h<C13161a> {

    /* renamed from: a, reason: collision with root package name */
    public final O f1692a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f1693b;

    public C13162b(O o12, dv.b bVar) {
        this.f1692a = o12;
        this.f1693b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13161a((L) this.f1692a.get(), (a.InterfaceC4053a) this.f1693b.get());
    }
}

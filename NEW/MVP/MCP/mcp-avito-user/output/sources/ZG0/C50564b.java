package zg0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserRatingDetailsLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: zg0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50564b implements h<C50563a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.h f444164a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f444165b;

    public C50564b(com.avito.android.rating.h hVar, dv.b bVar) {
        this.f444164a = hVar;
        this.f444165b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50563a((a.InterfaceC4053a) this.f444165b.get(), (f) this.f444164a.get());
    }
}

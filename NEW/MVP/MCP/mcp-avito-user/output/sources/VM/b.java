package VM;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f17086a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f17087b;

    public b(C30102l3 c30102l3, dv.b bVar) {
        this.f17086a = c30102l3;
        this.f17087b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f17086a.get(), (a.InterfaceC4053a) this.f17087b.get());
    }
}

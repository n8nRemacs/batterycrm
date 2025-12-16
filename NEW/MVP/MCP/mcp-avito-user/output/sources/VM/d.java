package VM;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsDeepLinkV2Handler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f17090a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f17091b;

    public d(C30102l3 c30102l3, dv.b bVar) {
        this.f17090a = c30102l3;
        this.f17091b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f17090a.get(), (a.InterfaceC4053a) this.f17091b.get());
    }
}

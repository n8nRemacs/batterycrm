package XW;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QualityServiceGrayLinkSyncHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final HW.c f18902a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f18903b;

    public c(HW.c cVar, dv.b bVar) {
        this.f18902a = cVar;
        this.f18903b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((HW.a) this.f18902a.get(), (a.InterfaceC4053a) this.f18903b.get());
    }
}

package UW;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CriteriaLinkSyncHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final HW.c f16402a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f16403b;

    public c(HW.c cVar, dv.b bVar) {
        this.f16402a = cVar;
        this.f16403b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((HW.a) this.f16402a.get(), (a.InterfaceC4053a) this.f16403b.get());
    }
}

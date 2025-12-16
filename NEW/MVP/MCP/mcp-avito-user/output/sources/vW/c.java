package VW;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CriteriaGrayLinkSyncHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final HW.c f17181a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f17182b;

    public c(HW.c cVar, dv.b bVar) {
        this.f17181a = cVar;
        this.f17182b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((HW.a) this.f17181a.get(), (a.InterfaceC4053a) this.f17182b.get());
    }
}

package sY;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MasterPlanShowLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C48133c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.master_plan.e f437714a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f437715b;

    public d(com.avito.android.master_plan.e eVar, dv.b bVar) {
        this.f437714a = eVar;
        this.f437715b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48133c((com.avito.android.master_plan.c) this.f437714a.get(), (a.InterfaceC4053a) this.f437715b.get());
    }
}

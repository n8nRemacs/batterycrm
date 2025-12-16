package Bq0;

import Aq0.InterfaceC13071a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.seller_coach.all_advices.provider.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AllAdvicesLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: Bq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13178c implements h<C13177b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f1732b;

    public C13178c(j jVar, dv.b bVar) {
        this.f1731a = jVar;
        this.f1732b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13177b((InterfaceC13071a) this.f1731a.get(), (a.InterfaceC4053a) this.f1732b.get());
    }
}

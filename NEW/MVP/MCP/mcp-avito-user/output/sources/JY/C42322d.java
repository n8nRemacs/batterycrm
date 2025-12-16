package jY;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.marketplace.p;
import com.avito.android.marketplace.q;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FinanceMarketplaceLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: jY.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42322d implements dagger.internal.h<C42319a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f405635a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f405636b;

    public C42322d(q qVar, dv.b bVar) {
        this.f405635a = qVar;
        this.f405636b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42319a((p) this.f405635a.get(), (a.InterfaceC4053a) this.f405636b.get());
    }
}

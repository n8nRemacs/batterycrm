package hv0;

import bv0.C25723b;
import bv0.InterfaceC25722a;
import com.avito.android.B2;
import com.avito.android.D2;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesPortfolioProjectBuyerLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: hv0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41174d implements h<C41171a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f398301a;

    /* renamed from: b, reason: collision with root package name */
    public final D2 f398302b;

    /* renamed from: c, reason: collision with root package name */
    public final C25723b f398303c;

    public C41174d(dv.b bVar, D2 d22, C25723b c25723b) {
        this.f398301a = bVar;
        this.f398302b = d22;
        this.f398303c = c25723b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C41171a((a.InterfaceC4053a) this.f398301a.get(), (B2) this.f398302b.get(), (InterfaceC25722a) this.f398303c.get());
    }
}

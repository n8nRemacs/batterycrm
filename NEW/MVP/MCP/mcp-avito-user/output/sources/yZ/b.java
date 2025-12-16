package YZ;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import t00.InterfaceC48454a;
import t00.c;

/* compiled from: MortgageVerificationFlowLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f19515a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19516b;

    public b(dv.b bVar, c cVar) {
        this.f19515a = bVar;
        this.f19516b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f19515a.get(), (InterfaceC48454a) this.f19516b.get());
    }
}

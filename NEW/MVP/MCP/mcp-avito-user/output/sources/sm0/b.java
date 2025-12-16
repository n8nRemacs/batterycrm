package SM0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import vM0.d;

/* compiled from: VerificationFormBuilderLinkAsyncHandler_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f14936a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f14937b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f14938c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f14939d;

    public b(d dVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f14936a = dVar;
        this.f14937b = bVar;
        this.f14938c = bVar2;
        this.f14939d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.verification.b) this.f14936a.get(), (a.InterfaceC4053a) this.f14937b.get(), (a.b) this.f14938c.get(), (a.i) this.f14939d.get());
    }
}

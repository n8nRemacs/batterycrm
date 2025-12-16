package On0;

import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SingleTimeDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f12519a;

    /* renamed from: b, reason: collision with root package name */
    public final f f12520b;

    public e(f fVar, u uVar) {
        this.f12519a = uVar;
        this.f12520b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC14715a) this.f12519a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f12520b.get());
    }
}

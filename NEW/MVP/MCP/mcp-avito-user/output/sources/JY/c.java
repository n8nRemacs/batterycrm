package JY;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ur.InterfaceC49101b;
import vN.C49237a;
import vN.C49239c;

/* compiled from: MessengerAvailableFeaturesProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final ur.e f9028a;

    /* renamed from: b, reason: collision with root package name */
    public final C49239c f9029b;

    public c(ur.e eVar, C49239c c49239c) {
        this.f9028a = eVar;
        this.f9029b = c49239c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC49101b) this.f9028a.get(), (C49237a) this.f9029b.get());
    }
}

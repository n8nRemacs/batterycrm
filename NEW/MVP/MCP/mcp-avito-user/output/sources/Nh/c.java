package Nh;

import Ui.InterfaceC15523b;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinHeaderButtonComponentFactory_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f11711a;

    public c(f fVar) {
        this.f11711a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC15523b) this.f11711a.get());
    }
}

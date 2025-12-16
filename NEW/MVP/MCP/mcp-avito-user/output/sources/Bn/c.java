package BN;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AmenityMarkerIconFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f1368a;

    public c(u uVar) {
        this.f1368a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f1368a.get());
    }
}

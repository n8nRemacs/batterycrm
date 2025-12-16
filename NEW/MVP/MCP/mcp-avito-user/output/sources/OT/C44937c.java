package ot;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: ot.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44937c implements h<C44936b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f422324a;

    public C44937c(l lVar) {
        this.f422324a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C44936b((Application) this.f422324a.f393949a);
    }
}

package zn0;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: zn0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50597d implements h<C50595b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f444242a;

    public C50597d(l lVar) {
        this.f444242a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C50595b((Application) this.f444242a.f393949a);
    }
}

package Mz;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaWebviewIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: Mz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14548d implements h<C14546b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f11152a;

    public C14548d(C30102l3 c30102l3) {
        this.f11152a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14546b((Context) this.f11152a.get());
    }
}

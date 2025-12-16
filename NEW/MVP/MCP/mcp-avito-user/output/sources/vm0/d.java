package vM0;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<com.avito.android.verification.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f440705a;

    public d(C30102l3 c30102l3) {
        this.f440705a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.verification.b((Context) this.f440705a.get());
    }
}

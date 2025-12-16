package vM0;

import android.content.res.Resources;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<com.avito.android.verification.c> {

    /* renamed from: a, reason: collision with root package name */
    public final h f440706a;

    public g(h hVar) {
        this.f440706a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.verification.c((Resources) this.f440706a.get());
    }
}

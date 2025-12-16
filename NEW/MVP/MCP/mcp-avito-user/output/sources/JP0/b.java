package jP0;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletSecuritySettingsIntentFactory_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<C42295a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f405603a;

    public b(C30102l3 c30102l3) {
        this.f405603a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42295a((Context) this.f405603a.get());
    }
}

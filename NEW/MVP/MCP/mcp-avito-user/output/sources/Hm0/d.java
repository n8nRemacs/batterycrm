package Hm0;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C14009c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f7693a;

    public d(C30102l3 c30102l3) {
        this.f7693a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14009c((Context) this.f7693a.get());
    }
}

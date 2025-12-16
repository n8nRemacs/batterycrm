package wN;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InfoIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C49542b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f441423a;

    public c(C30102l3 c30102l3) {
        this.f441423a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49542b((Context) this.f441423a.get());
    }
}

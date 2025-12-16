package HK;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDialerStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f7038a;

    public c(C30102l3 c30102l3) {
        this.f7038a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f7038a.get());
    }
}

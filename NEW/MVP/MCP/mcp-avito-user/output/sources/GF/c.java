package gF;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GalleryIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<C40578b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f396411a;

    public c(C30102l3 c30102l3) {
        this.f396411a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40578b((Context) this.f396411a.get());
    }
}

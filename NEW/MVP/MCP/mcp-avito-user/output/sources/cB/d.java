package Cb;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertisingCreativeIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f2284a;

    public d(O o12) {
        this.f2284a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((L) this.f2284a.get());
    }
}

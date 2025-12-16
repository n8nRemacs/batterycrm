package oO;

import android.content.Context;
import com.avito.android.C34160q2;
import com.avito.android.C34431s2;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemMapIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.android.item_map.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f419749a;

    /* renamed from: b, reason: collision with root package name */
    public final C34431s2 f419750b;

    /* renamed from: c, reason: collision with root package name */
    public final O f419751c;

    public g(C30102l3 c30102l3, C34431s2 c34431s2, O o12) {
        this.f419749a = c30102l3;
        this.f419750b = c34431s2;
        this.f419751c = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.item_map.a((Context) this.f419749a.get(), (C34160q2) this.f419750b.get(), (L) this.f419751c.get());
    }
}

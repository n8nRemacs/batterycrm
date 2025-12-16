package com.avito.android.profile.user_profile.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: UserProfileModule_ProvideItemBinder$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226107a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f226108b;

    public m(f fVar, dagger.internal.A a12) {
        this.f226107a = fVar;
        this.f226108b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Set set = (Set) this.f226108b.get();
        this.f226107a.getClass();
        a.C10493a c10493a = new a.C10493a();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}

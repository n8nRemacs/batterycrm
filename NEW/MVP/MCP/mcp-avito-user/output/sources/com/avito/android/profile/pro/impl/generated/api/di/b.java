package com.avito.android.profile.pro.impl.generated.api.di;

import com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.OkRespDataSuccessItemsItemTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ProfileProJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class b implements h<Set<r>> {

    /* compiled from: ProfileProJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f222665a = new b();
    }

    public static b a() {
        return a.f222665a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.pro.impl.generated.api.di.a.f222664a.getClass();
        return Collections.singleton(new OkRespDataSuccessItemsItemTypeAdapterFactory());
    }
}

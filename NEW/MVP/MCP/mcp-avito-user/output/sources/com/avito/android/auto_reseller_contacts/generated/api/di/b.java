package com.avito.android.auto_reseller_contacts.generated.api.di;

import com.avito.android.auto_reseller_contacts.generated.api.get_messenger_by_item_id_for_apiv_3.EaModalPopupTypeV2TypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: AutoResellerContactsJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class b implements h<Set<r>> {

    /* compiled from: AutoResellerContactsJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f95785a = new b();
    }

    public static b a() {
        return a.f95785a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.auto_reseller_contacts.generated.api.di.a.f95784a.getClass();
        return Collections.singleton(new EaModalPopupTypeV2TypeAdapterFactory());
    }
}

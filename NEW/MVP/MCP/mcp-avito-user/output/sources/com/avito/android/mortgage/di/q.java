package com.avito.android.mortgage.di;

import com.avito.android.mortgage.api.adapters.MortgageFormValidationDeserializer;
import com.avito.android.util.X5;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: MortgageJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<Set<X5>> {

    /* compiled from: MortgageJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final q f198919a = new q();
    }

    public static q a() {
        return a.f198919a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p.f198918a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(JZ.l.class, new MortgageFormValidationDeserializer()));
        return linkedHashSet;
    }
}

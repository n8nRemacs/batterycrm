package com.avito.android.beduin.network.module;

import com.avito.android.beduin.network.model.Condition;
import com.avito.android.beduin.network.parse.ConditionTypeAdapter;
import com.avito.android.util.C35975x3;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: BeduinOptimalJsonModule_ProvideCommonBeduinTypeAdaptersFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<Set<C35975x3>> {

    /* compiled from: BeduinOptimalJsonModule_ProvideCommonBeduinTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f104031a = new h();
    }

    public static h a() {
        return a.f104031a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f104028a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C35975x3(Condition.class, new ConditionTypeAdapter()));
        return linkedHashSet;
    }
}

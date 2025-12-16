package com.avito.android.reputation.di.components;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReputationPieChartComponentModule_ReputationPieChartStateFactoryFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<AbstractC36250j> {

    /* compiled from: ReputationPieChartComponentModule_ReputationPieChartStateFactoryFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f254724a = new f();
    }

    public static f a() {
        return a.f254724a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f254722a.getClass();
        com.avito.android.reputation.ui.items.reputation_pie_chart.k kVar = com.avito.android.reputation.ui.items.reputation_pie_chart.k.f254910c;
        t.d(kVar);
        return kVar;
    }
}

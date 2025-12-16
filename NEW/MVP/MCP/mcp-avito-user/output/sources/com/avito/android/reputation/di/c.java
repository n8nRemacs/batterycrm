package com.avito.android.reputation.di;

import com.avito.android.reputation.ui.items.reputation_progress_bar.B;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: ReputationBeduinViewComponentsModule_ProvideLocalViewComponentsFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<Set<AbstractC36250j>> {

    /* compiled from: ReputationBeduinViewComponentsModule_ProvideLocalViewComponentsFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f254718a = new c();
    }

    public static c a() {
        return a.f254718a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f254717a.getClass();
        Set setL0 = C42756l.l0(new AbstractC36250j[]{com.avito.android.reputation.ui.items.reputation_radial_progress_bar.t.f255047c, com.avito.android.reputation.ui.items.reputation_pie_chart.k.f254910c, com.avito.android.reputation.ui.items.reputation_header.m.f254893c, B.f254912c});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}

package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di;

import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.s;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: ExtendedProfileBeduinComponentsModule_ProvideLocalViewComponentsFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<Set<AbstractC36250j>> {

    /* compiled from: ExtendedProfileBeduinComponentsModule_ProvideLocalViewComponentsFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f151343a = new b();
    }

    public static b a() {
        return a.f151343a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.a.f151342a.getClass();
        Set setL0 = C42756l.l0(new AbstractC36250j[]{s.f151420c, com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.g.f151432c});
        t.d(setL0);
        return setL0;
    }
}

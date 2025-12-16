package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di;

import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: ExtendedProfileBeduinViewComponentsModule_LocalViewComponentsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<Set<n<?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f151351a;

    /* renamed from: b, reason: collision with root package name */
    public final u f151352b;

    public g(u uVar, Provider provider) {
        this.f151351a = provider;
        this.f151352b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = this.f151351a.get();
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.b bVar = (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget.b) this.f151352b.get();
        d.f151344a.getClass();
        Set setL0 = C42756l.l0(new n[]{iVar, bVar});
        t.d(setL0);
        return setL0;
    }
}

package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.di.C31132k0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BeduinBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/i;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f176326f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.handler.flow.processor.b> f176327a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.interaction.navigation_controller.c> f176328b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C31132k0 f176329c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<k> f176330d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC43160i<com.avito.beduin.v2.interaction.navigation.flow.t>> f176331e;

    /* compiled from: BeduinBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/j$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k C31132k0 c31132k0, @Y61.k Provider provider3, @Y61.k Provider provider4) {
        this.f176327a = provider;
        this.f176328b = provider2;
        this.f176329c = c31132k0;
        this.f176330d = provider3;
        this.f176331e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.handler.flow.processor.b bVar = this.f176327a.get();
        com.avito.beduin.v2.interaction.navigation_controller.c cVar = this.f176328b.get();
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) this.f176329c.get();
        k kVar = this.f176330d.get();
        InterfaceC43160i<com.avito.beduin.v2.interaction.navigation.flow.t> interfaceC43160i2 = this.f176331e.get();
        f176326f.getClass();
        return new i(bVar, cVar, interfaceC43160i, kVar, interfaceC43160i2);
    }
}

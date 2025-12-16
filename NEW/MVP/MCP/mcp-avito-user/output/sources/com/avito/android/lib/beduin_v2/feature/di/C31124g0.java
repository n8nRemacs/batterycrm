package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.InterfaceC36270g;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideNavigationControllerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/g0;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/interaction/navigation_controller/c;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.g0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31124g0 implements dagger.internal.h<com.avito.beduin.v2.interaction.navigation_controller.c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176102c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36238a> f176103a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176104b;

    /* compiled from: BeduinFeatureModule_ProvideNavigationControllerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/g0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.g0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31124g0(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f176103a = provider;
        this.f176104b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC36238a interfaceC36238a = this.f176103a.get();
        InterfaceC36270g interfaceC36270g = (InterfaceC36270g) this.f176104b.get();
        f176102c.getClass();
        L.f176033a.getClass();
        return com.avito.beduin.v2.interaction.navigation_controller.d.a(interfaceC36238a, interfaceC36270g);
    }
}

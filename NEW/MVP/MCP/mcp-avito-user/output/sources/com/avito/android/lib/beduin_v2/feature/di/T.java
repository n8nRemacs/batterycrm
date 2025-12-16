package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.Y1;

/* compiled from: BeduinFeatureModule_ProvideBeduinControllerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/T;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/engine/a;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class T implements dagger.internal.h<InterfaceC36238a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176060c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36274k> f176061a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176062b;

    /* compiled from: BeduinFeatureModule_ProvideBeduinControllerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/T$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public T(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f176061a = provider;
        this.f176062b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC36274k interfaceC36274k = this.f176061a.get();
        Y1 y12 = (Y1) this.f176062b.get();
        f176060c.getClass();
        L.f176033a.getClass();
        return new C36239b(interfaceC36274k, null, new M(y12), 2, null);
    }
}

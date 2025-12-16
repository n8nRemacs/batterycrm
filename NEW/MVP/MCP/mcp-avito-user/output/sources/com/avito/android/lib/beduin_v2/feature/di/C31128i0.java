package com.avito.android.lib.beduin_v2.feature.di;

import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideRegisteredComponentsFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/i0;", "Ldagger/internal/h;", "", "", "LX41/o;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.i0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31128i0 implements dagger.internal.h<Set<String>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176110b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.engine.component.o> f176111a;

    /* compiled from: BeduinFeatureModule_ProvideRegisteredComponentsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/i0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.i0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31128i0(@Y61.k Provider<com.avito.beduin.v2.engine.component.o> provider) {
        this.f176111a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.engine.component.o oVar = this.f176111a.get();
        f176110b.getClass();
        L.f176033a.getClass();
        Set<String> setKeySet = oVar.f336571a.keySet();
        dagger.internal.t.b(setKeySet, "Cannot return null from a non-@Nullable @Provides method");
        return setKeySet;
    }
}

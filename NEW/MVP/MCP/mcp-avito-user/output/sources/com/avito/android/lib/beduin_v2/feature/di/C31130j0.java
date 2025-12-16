package com.avito.android.lib.beduin_v2.feature.di;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureModule_ProvideScreenAwareListFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/j0;", "Ldagger/internal/h;", "", "LFV0/h;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.j0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31130j0 implements dagger.internal.h<Set<FV0.h>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176115b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.handler.flow.f> f176116a;

    /* compiled from: BeduinFeatureModule_ProvideScreenAwareListFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/j0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.j0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31130j0(@Y61.k Provider<com.avito.beduin.v2.handler.flow.f> provider) {
        this.f176116a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.handler.flow.f fVar = this.f176116a.get();
        f176115b.getClass();
        L.f176033a.getClass();
        Collection<com.avito.beduin.v2.handler.flow.j> collectionValues = fVar.f337162a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof FV0.h) {
                arrayList.add(obj);
            }
        }
        Set setP0 = C42745f0.P0(arrayList);
        dagger.internal.t.b(setP0, "Cannot return null from a non-@Nullable @Provides method");
        return setP0;
    }
}

package com.avito.android.lib.beduin_v2.feature.di;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinLocalComponentsProviderModule_ComponentStatesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/F0;", "Ldagger/internal/h;", "", "Lcom/avito/beduin/v2/engine/component/j;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class F0 implements dagger.internal.h<Set<AbstractC36250j>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176020b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D0 f176021a;

    /* compiled from: BeduinLocalComponentsProviderModule_ComponentStatesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/F0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public F0(@Y61.k D0 d02) {
        this.f176021a = d02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f176020b.getClass();
        Set<AbstractC36250j> setJ = this.f176021a.f176012a.j();
        dagger.internal.t.b(setJ, "Cannot return null from a non-@Nullable @Provides method");
        return setJ;
    }
}

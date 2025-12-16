package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeatureImpl_Builder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/s;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/r$a;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements dagger.internal.h<r.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176351b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f176352a;

    /* compiled from: BeduinFeatureImpl_Builder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/s$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(@Y61.k q qVar) {
        this.f176352a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f176352a.get();
        f176351b.getClass();
        return new r.a(pVar);
    }
}

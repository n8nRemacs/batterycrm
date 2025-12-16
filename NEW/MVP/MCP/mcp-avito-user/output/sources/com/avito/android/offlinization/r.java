package com.avito.android.offlinization;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.ab_tests.configs.OfflinizationTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t3.W;

/* compiled from: OfflinizationFeatureStrategyImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/r;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/q;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208593c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K1 f208594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final W f208595b;

    /* compiled from: OfflinizationFeatureStrategyImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/offlinization/r$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r(@Y61.k K1 k12, @Y61.k W w12) {
        this.f208594a = k12;
        this.f208595b = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = (I1) this.f208594a.get();
        OfflinizationTestGroup offlinizationTestGroup = (OfflinizationTestGroup) this.f208595b.get();
        f208593c.getClass();
        return new q(i12, offlinizationTestGroup);
    }
}

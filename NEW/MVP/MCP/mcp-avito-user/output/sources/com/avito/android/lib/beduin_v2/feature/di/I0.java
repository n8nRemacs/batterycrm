package com.avito.android.lib.beduin_v2.feature.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinLocalComponentsProviderModule_InteractionsFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/I0;", "Ldagger/internal/h;", "", "LdU0/c;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class I0 implements dagger.internal.h<Set<dU0.c>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176028b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D0 f176029a;

    /* compiled from: BeduinLocalComponentsProviderModule_InteractionsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/I0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public I0(@Y61.k D0 d02) {
        this.f176029a = d02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f176028b.getClass();
        Set<dU0.c> setB = this.f176029a.f176012a.b();
        dagger.internal.t.b(setB, "Cannot return null from a non-@Nullable @Provides method");
        return setB;
    }
}

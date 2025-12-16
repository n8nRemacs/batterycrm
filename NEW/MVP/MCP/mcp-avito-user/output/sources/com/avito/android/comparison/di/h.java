package com.avito.android.comparison.di;

import Vq.AbstractC15707a;
import com.avito.android.util.C35866p0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComparisonJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/di/h;", "Ldagger/internal/h;", "Lcom/avito/android/util/p0;", "a", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C35866p0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f123841a = new a(null);

    /* compiled from: ComparisonJsonModule_ProvideCustomTypeAdaptersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/di/h$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f123841a.getClass();
        return new C35866p0(AbstractC15707a.class, P0.g(new Q("limit_reached", AbstractC15707a.C1200a.class), new Q("ok", AbstractC15707a.b.class)));
    }
}

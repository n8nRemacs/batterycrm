package com.avito.android.lib.beduin_v2.feature.tracker;

import com.avito.android.remote.analytics.B;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LowLevelErrorTracker_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/h;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/g;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176382c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<String> f176383a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<B> f176384b;

    /* compiled from: LowLevelErrorTracker_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/h$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k Provider<String> provider, @Y61.k Provider<B> provider2) {
        this.f176383a = provider;
        this.f176384b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String str = this.f176383a.get();
        B b12 = this.f176384b.get();
        f176382c.getClass();
        return new g(str, b12);
    }
}

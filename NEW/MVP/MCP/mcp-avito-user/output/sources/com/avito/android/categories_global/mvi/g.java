package com.avito.android.categories_global.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesFeatureBuilder_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/categories_global/mvi/f;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f116425f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f116426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f116427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f116428c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<ScreenPerformanceTracker> f116429d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d f116430e;

    /* compiled from: CategoriesFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/g$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k b bVar, @Y61.k i iVar, @Y61.k k kVar, @Y61.k Provider provider, @Y61.k d dVar) {
        this.f116426a = bVar;
        this.f116427b = iVar;
        this.f116428c = kVar;
        this.f116429d = provider;
        this.f116430e = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.categories_global.mvi.a aVar = (com.avito.android.categories_global.mvi.a) this.f116426a.get();
        h hVar = (h) this.f116427b.get();
        this.f116428c.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f116429d.get();
        c cVar = (c) this.f116430e.get();
        f116425f.getClass();
        Ln.e.f10116e.getClass();
        return new f("CategoriesGlobal", Ln.e.f10117f, new e(aVar, screenPerformanceTracker, jVar, cVar, hVar));
    }
}

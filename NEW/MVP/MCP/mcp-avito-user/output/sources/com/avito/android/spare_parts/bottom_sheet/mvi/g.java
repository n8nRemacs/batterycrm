package com.avito.android.spare_parts.bottom_sheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import tx0.C48737c;

/* compiled from: SparePartsBottomSheetFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/f;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f284808f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f284809a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f284810b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f284811c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f284812d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f284813e;

    /* compiled from: SparePartsBottomSheetFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/g$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k d dVar, @Y61.k b bVar, @Y61.k i iVar, @Y61.k k kVar, @Y61.k u uVar) {
        this.f284809a = dVar;
        this.f284810b = bVar;
        this.f284811c = iVar;
        this.f284812d = kVar;
        this.f284813e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f284809a.get();
        com.avito.android.spare_parts.bottom_sheet.mvi.a aVar = (com.avito.android.spare_parts.bottom_sheet.mvi.a) this.f284810b.get();
        this.f284811c.getClass();
        h hVar = new h();
        this.f284812d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f284813e.get();
        f284808f.getClass();
        C48737c.f439673c.getClass();
        return new f("SparePartsBottomSheet", C48737c.f439674d, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}

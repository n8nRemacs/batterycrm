package com.avito.android.auto_contacts.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoContactsPackagesFeatureBuilder_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/h;", "Ldagger/internal/h;", "Lcom/avito/android/auto_contacts/presentation/mvi/g;", "a", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f94963f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f94964a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f94965b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f94966c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f94967d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f94968e;

    /* compiled from: AutoContactsPackagesFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/h$a;", "", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k e eVar, @Y61.k c cVar, @Y61.k j jVar, @Y61.k l lVar, @Y61.k u uVar) {
        this.f94964a = eVar;
        this.f94965b = cVar;
        this.f94966c = jVar;
        this.f94967d = lVar;
        this.f94968e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f94964a.get();
        b bVar = (b) this.f94965b.get();
        this.f94966c.getClass();
        i iVar = new i();
        this.f94967d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f94968e.get();
        f94963f.getClass();
        return new g("AutoContactsPackages", AutoContactsPackagesUiState.Loading.f94956b, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}

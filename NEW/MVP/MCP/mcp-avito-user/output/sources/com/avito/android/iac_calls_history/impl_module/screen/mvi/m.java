package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTab;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.LoadingCallsHistoryItem;
import dagger.internal.u;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryScreenFeatureBuilder_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/m;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/l;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f164867g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f164868a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f164869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f164870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f164871d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f164872e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.f> f164873f;

    /* compiled from: CallsHistoryScreenFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/m$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k f fVar, @Y61.k h hVar, @Y61.k j jVar, @Y61.k o oVar, @Y61.k u uVar, @Y61.k Provider provider) {
        this.f164868a = fVar;
        this.f164869b = hVar;
        this.f164870c = jVar;
        this.f164871d = oVar;
        this.f164872e = uVar;
        this.f164873f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_calls_history.impl_module.screen.mvi.a aVar = (com.avito.android.iac_calls_history.impl_module.screen.mvi.a) this.f164868a.get();
        g gVar = (g) this.f164869b.get();
        this.f164870c.getClass();
        i iVar = new i();
        this.f164871d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f164872e.get();
        com.avito.android.server_time.f fVar = this.f164873f.get();
        f164867g.getClass();
        CallsHistoryScreenState.a aVar2 = CallsHistoryScreenState.f164823g;
        LocalDate localDate = LocalDateTime.now(fVar.getF274002b().toZoneId()).toLocalDate();
        aVar2.getClass();
        return new l("CallsHistoryScreen", new CallsHistoryScreenState(C42745f0.U(new CallsHistoryTab(CallsHistoryTabType.f164755b, 0), new CallsHistoryTab(CallsHistoryTabType.f164756c, 0)), 0, null, Collections.singletonList(LoadingCallsHistoryItem.f164848b), localDate), new k(aVar, gVar, screenPerformanceTracker, nVar, iVar));
    }
}

package QJ0;

import Y61.k;
import Y61.l;
import androidx.view.M0;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import kotlin.Metadata;

/* compiled from: TabStatsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQJ0/d;", "Landroidx/lifecycle/M0;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class d extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f13676E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f13677J = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: K, reason: collision with root package name */
    @l
    public StatsConfig f13678K;

    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f13676E = aVar;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f13677J.dispose();
    }
}

package f90;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefComparisonUsageStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/n;", "Lf90/g;", "_avito-discouraged_persistence_comparison-usage"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements InterfaceC40258g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395700a;

    @Inject
    public n(@Y61.k AK0.l lVar) {
        this.f395700a = lVar;
    }

    @Override // f90.InterfaceC40258g
    public final void a(long j12) {
        this.f395700a.putLong("first_comparison_usage_timestamp", j12);
    }

    @Override // f90.InterfaceC40254c
    @Y61.l
    public final Long b() {
        AK0.l lVar = this.f395700a;
        if (lVar.contains("first_comparison_usage_timestamp")) {
            return Long.valueOf(lVar.getLong("first_comparison_usage_timestamp", -1L));
        }
        return null;
    }

    @Override // f90.InterfaceC40254c
    @Y61.l
    public final Long c() {
        AK0.l lVar = this.f395700a;
        if (lVar.contains("second_comparison_usage_timestamp")) {
            return Long.valueOf(lVar.getLong("second_comparison_usage_timestamp", -1L));
        }
        return null;
    }

    @Override // f90.InterfaceC40258g
    public final void d() {
        this.f395700a.putBoolean("comparison_screen_visited", true);
    }

    @Override // f90.InterfaceC40258g
    public final void e(long j12) {
        this.f395700a.putLong("second_comparison_usage_timestamp", j12);
    }
}

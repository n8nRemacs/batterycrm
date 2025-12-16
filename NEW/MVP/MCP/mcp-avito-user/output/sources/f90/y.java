package f90;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefUserAdvertsInfoStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/y;", "Lf90/K;", "_avito-discouraged_persistence_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class y implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395708a;

    @Inject
    public y(@Y61.k AK0.l lVar) {
        this.f395708a = lVar;
    }

    @Override // f90.K
    public final void a(int i12) {
        this.f395708a.a(i12, "expired_adverts_count");
    }

    @Override // f90.K
    public final int b() {
        return this.f395708a.getInt("expired_adverts_count", 0);
    }

    @Override // f90.K
    public final void clear() {
        this.f395708a.remove("expired_adverts_count");
    }
}

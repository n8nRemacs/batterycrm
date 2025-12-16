package f90;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefFingerprintStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/q;", "Lf90/d;", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements InterfaceC40255d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395703a;

    @Inject
    public q(@Y61.k AK0.l lVar) {
        this.f395703a = lVar;
    }

    @Override // f90.InterfaceC40255d
    @Y61.l
    public final String a() {
        return this.f395703a.getString("fpx", null);
    }

    @Override // f90.InterfaceC40255d
    @Y61.l
    public final String b() {
        return this.f395703a.getString("fpx_token", null);
    }

    public final long c() {
        return this.f395703a.getLong("fpx_calc_time", 0L);
    }

    public final void d(@Y61.l String str) {
        this.f395703a.putString("fpx_token", str);
    }
}

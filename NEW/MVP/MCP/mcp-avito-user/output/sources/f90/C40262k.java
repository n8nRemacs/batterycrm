package f90;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefSessionStartTimeStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/k;", "Lf90/e;", "_avito-discouraged_persistence_app-start-time"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f90.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40262k implements InterfaceC40256e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395697a;

    @Inject
    public C40262k(@Y61.k AK0.l lVar) {
        this.f395697a = lVar;
    }

    @Override // f90.InterfaceC40256e
    public final void a(long j12) {
        this.f395697a.putLong("app_start_time", j12);
    }
}

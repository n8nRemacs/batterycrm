package Yd;

import Wd.InterfaceC15745b;
import Y61.k;
import android.os.Bundle;
import com.avito.android.auth_tracker.tracker.m;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthTrackerRunner.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYd/b;", "LYd/a;", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC18254a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f19602a;

    @Inject
    public b(@k j jVar) {
        this.f19602a = jVar;
    }

    @Override // Yd.InterfaceC18254a
    public final void a(@k InterfaceC15745b.a aVar) {
        ShortTask.NetworkState networkState = ShortTask.NetworkState.f274023b;
        Bundle bundle = new Bundle();
        bundle.putString("postAuthId", aVar.f17991a);
        bundle.putString("postAuthIdWithHash", aVar.f17992b);
        this.f19602a.c(m.class, networkState, false, false, false, false, 0L, true, bundle, ShortTask.BackoffPolicy.f274019b, 0L);
    }
}

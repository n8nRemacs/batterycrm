package od;

import Y61.k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StartupTaskAnalyticsTrackerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lod/b;", "Lod/a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: od.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44757b implements InterfaceC44756a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.task.a f419973a;

    @Inject
    public C44757b(@k com.avito.android.analytics.task.a aVar) {
        this.f419973a = aVar;
    }

    @Override // od.InterfaceC44756a
    public final void a(@k String str, @k Y41.a<G0> aVar) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        aVar.invoke();
        this.f419973a.a(fA2.b(), str);
    }
}

package tL;

import BL.a;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import sL.AbstractC48067b;

/* compiled from: IacAppStatusLogWatcherListener.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LtL/a;", "LsL/b;", "LBL/a$b;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48568a extends AbstractC48067b<a.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b f439228a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439229b = "IacAppStatusLogWatcherListener";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f439230c = "IacWatcher.State";

    @Inject
    public C48568a(@k com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b bVar) {
        this.f439228a = bVar;
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF439229b() {
        return this.f439229b;
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF439230c() {
        return this.f439230c;
    }

    @Override // sL.AbstractC48067b
    public final void d(a.b bVar, a.b bVar2) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacAppStatusProvider", "Current app status: " + this.f439228a.a(), null);
    }

    @Override // sL.AbstractC48067b
    public final a.b b(a.b bVar) {
        return bVar;
    }
}

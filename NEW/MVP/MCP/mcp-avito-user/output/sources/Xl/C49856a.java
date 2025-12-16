package xL;

import BL.a;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import sL.AbstractC48067b;

/* compiled from: IacSocketConnectionWatcherListener.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, d2 = {"LxL/a;", "LsL/b;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/listeners/socketConnection/IsConnectionNeeded;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49856a extends AbstractC48067b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AL.a f442403a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442404b = "IacSocketConnectionWatcherListener";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f442405c = "isConnectionNeeded";

    @Inject
    public C49856a(@k AL.a aVar) {
        this.f442403a = aVar;
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF442404b() {
        return this.f442404b;
    }

    @Override // sL.AbstractC48067b
    public final Boolean b(a.b bVar) {
        return Boolean.valueOf(!bVar.f1353a.isEmpty());
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF442405c() {
        return this.f442405c;
    }

    @Override // sL.AbstractC48067b
    public final void d(Boolean bool, Boolean bool2) {
        bool.getClass();
        boolean zBooleanValue = bool2.booleanValue();
        String str = this.f442404b;
        AL.a aVar = this.f442403a;
        if (zBooleanValue) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "Socket connection is requested by IAC", null);
            aVar.a();
        } else {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "Socket connection is released by IAC", null);
            aVar.c();
        }
    }
}

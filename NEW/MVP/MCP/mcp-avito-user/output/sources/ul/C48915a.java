package uL;

import BL.a;
import Y61.k;
import com.avito.android.analytics.clickstream.C28395u;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import mM.InterfaceC43981a;
import sL.AbstractC48067b;

/* compiled from: IacCrashRegisterWatcherListener.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LuL/a;", "LsL/b;", "", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48915a extends AbstractC48067b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC43981a f439906a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439907b = "IacCrashRegisterWatcherListener";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f439908c = "HasCallsInWatcher";

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicBoolean f439909d = new AtomicBoolean();

    @Inject
    public C48915a(@k InterfaceC43981a interfaceC43981a) {
        this.f439906a = interfaceC43981a;
        Thread.setDefaultUncaughtExceptionHandler(new C28395u(this, Thread.getDefaultUncaughtExceptionHandler(), 2));
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF439907b() {
        return this.f439907b;
    }

    @Override // sL.AbstractC48067b
    public final Boolean b(a.b bVar) {
        return Boolean.valueOf(!bVar.f1353a.isEmpty());
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF439908c() {
        return this.f439908c;
    }

    @Override // sL.AbstractC48067b
    public final void d(Boolean bool, Boolean bool2) {
        bool.booleanValue();
        this.f439909d.set(bool2.booleanValue());
    }
}

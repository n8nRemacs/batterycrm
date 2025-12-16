package vL;

import BL.a;
import Y61.k;
import com.avito.android.error_reporting.app_state.C30363b;
import javax.inject.Inject;
import kotlin.Metadata;
import sL.AbstractC48067b;

/* compiled from: IacFirebaseKeyWatcherListener.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, d2 = {"LvL/a;", "LsL/b;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/watcher/listeners/firebase/IsInAppCallActive;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49229a extends AbstractC48067b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30363b f440690a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440691b = "IacFirebaseKeyWatcherListener";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f440692c = "IsInAppCallActive";

    @Inject
    public C49229a(@k C30363b c30363b) {
        this.f440690a = c30363b;
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF440691b() {
        return this.f440691b;
    }

    @Override // sL.AbstractC48067b
    public final Boolean b(a.b bVar) {
        return Boolean.valueOf(!bVar.f1353a.isEmpty());
    }

    @Override // sL.AbstractC48067b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF440692c() {
        return this.f440692c;
    }

    @Override // sL.AbstractC48067b
    public final void d(Boolean bool, Boolean bool2) {
        bool.getClass();
        boolean zBooleanValue = bool2.booleanValue();
        C30363b c30363b = this.f440690a;
        c30363b.getClass();
        c30363b.f147800a.b("in_app_call_active", String.valueOf(zBooleanValue));
    }
}

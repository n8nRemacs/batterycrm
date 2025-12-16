package NJ0;

import AK0.i;
import AK0.l;
import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserStatsStorageModule_ProvideEditorPreferencesFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f11361a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<i> f11362b;

    public c(Provider<Application> provider, Provider<i> provider2) {
        this.f11361a = provider;
        this.f11362b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = this.f11361a.get();
        i iVar = this.f11362b.get();
        b.f11360a.getClass();
        return iVar.a(application, "smb_stats_tooltip");
    }
}

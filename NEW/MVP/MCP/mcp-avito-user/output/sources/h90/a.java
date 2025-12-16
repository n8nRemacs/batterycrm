package H90;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveAnalytics_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class a implements h<ProfileRemoveAnalytics> {

    /* renamed from: a, reason: collision with root package name */
    public final u f6970a;

    /* renamed from: b, reason: collision with root package name */
    public final u f6971b;

    public a(u uVar, u uVar2) {
        this.f6970a = uVar;
        this.f6971b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ProfileRemoveAnalytics((E) this.f6971b.get(), (InterfaceC28373a) this.f6970a.get());
    }
}

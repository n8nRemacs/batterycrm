package PM;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImportantAddressesSelectionAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f13052a;

    public c(dagger.internal.f fVar) {
        this.f13052a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f13052a.get());
    }
}

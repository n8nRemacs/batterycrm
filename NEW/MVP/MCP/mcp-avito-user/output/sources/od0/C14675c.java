package Od0;

import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoricalSuggestsAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Od0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14675c implements h<C14674b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f12440a;

    public C14675c(u uVar) {
        this.f12440a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14674b((InterfaceC33535v) this.f12440a.get());
    }
}

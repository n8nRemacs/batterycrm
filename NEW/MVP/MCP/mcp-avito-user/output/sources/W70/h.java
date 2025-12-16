package W70;

import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhotoGalleryTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC22983P> f17757a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f17758b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f17759c;

    /* renamed from: d, reason: collision with root package name */
    public final u f17760d;

    public h(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f17757a = provider;
        this.f17758b = provider2;
        this.f17759c = provider3;
        this.f17760d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f17757a.get(), this.f17758b.get(), this.f17759c.get(), (o) this.f17760d.get());
    }
}

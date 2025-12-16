package MH;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_tutorials.gigtutorials.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigTutorialsDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f10538a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.gig_tutorials.gigtutorials.h f10539b;

    public b(dv.b bVar, com.avito.android.gig_tutorials.gigtutorials.h hVar) {
        this.f10538a = bVar;
        this.f10539b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f10538a.get(), (f) this.f10539b.get());
    }
}

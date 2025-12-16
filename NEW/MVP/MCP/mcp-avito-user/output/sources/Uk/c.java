package UK;

import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacFinishedFallbackScreenLinkHandlerModule_ProvideMappingFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f16342a;

    public c(d dVar) {
        this.f16342a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f16342a;
        b.f16341a.getClass();
        return new C43834a(IacFinishedFallbackScreenLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacFinishedFallbackScreenLink.class), dVar));
    }
}

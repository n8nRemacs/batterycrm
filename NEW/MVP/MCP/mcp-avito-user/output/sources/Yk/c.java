package YK;

import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacFinishedMicRequestScreenLinkHandlerModule_ProvideMappingFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f19442a;

    public c(d dVar) {
        this.f19442a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f19441a.getClass();
        return new C43834a(IacFinishedMicRequestScreenLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacFinishedMicRequestScreenLink.class), this.f19442a));
    }
}

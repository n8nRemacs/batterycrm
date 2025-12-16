package VK;

import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacFinishedFeedbackScreenLinkHandlerModule_ProvideMappingFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f17072a;

    public c(d dVar) {
        this.f17072a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f17072a;
        b.f17071a.getClass();
        return new C43834a(IacFinishedFeedbackScreenLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacFinishedFeedbackScreenLink.class), dVar));
    }
}

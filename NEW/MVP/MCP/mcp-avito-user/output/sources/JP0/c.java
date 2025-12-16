package jp0;

import com.avito.android.screen_flow.handler.g;
import com.avito.android.screen_flow.link.ScreenFlowV2Link;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lp0.C43815c;
import lv.C43834a;

/* compiled from: ScreenFlowLinkHandlerModule_ProvideScreenFlowV2MappingFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f405818a;

    public c(g gVar) {
        this.f405818a = gVar;
    }

    public static C43834a a(g gVar) {
        C42411a.f405816a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ScreenFlowV2Link.class, new C43815c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ScreenFlowV2Link.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f405818a);
    }
}

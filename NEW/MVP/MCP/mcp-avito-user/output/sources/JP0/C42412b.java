package jp0;

import com.avito.android.screen_flow.link.ScreenFlowLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lp0.C43814b;
import lv.C43834a;

/* compiled from: ScreenFlowLinkHandlerModule_ProvideScreenFlowMappingFactory.java */
@e
@y
@x
/* renamed from: jp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42412b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screen_flow.handler.e f405817a;

    public C42412b(com.avito.android.screen_flow.handler.e eVar) {
        this.f405817a = eVar;
    }

    public static C43834a a(com.avito.android.screen_flow.handler.e eVar) {
        C42411a.f405816a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ScreenFlowLink.class, new C43814b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ScreenFlowLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f405817a);
    }
}

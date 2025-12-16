package cM0;

import com.avito.android.vas_planning.deeplink.VasPlannerRemoveLink;
import com.avito.android.vas_planning.remove.deeplink.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasPlannerRemoveDeeplinkHandlerModule_ProvideVasPlannerRemoveDeeplinkHandlerFactory.java */
@e
@y
@x
/* renamed from: cM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27067b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_planning.remove.deeplink.b f57834a;

    public C27067b(com.avito.android.vas_planning.remove.deeplink.b bVar) {
        this.f57834a = bVar;
    }

    public static C43834a a(com.avito.android.vas_planning.remove.deeplink.b bVar) {
        C27066a.f57833a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VasPlannerRemoveLink.class, new c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasPlannerRemoveLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f57834a);
    }
}

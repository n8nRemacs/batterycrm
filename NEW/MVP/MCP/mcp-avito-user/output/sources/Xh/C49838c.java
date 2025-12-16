package xH;

import com.avito.android.gig_motivations_list.GigMotivationsListDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigMotivationsListDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: xH.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49838c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49839d f442318a;

    public C49838c(C49839d c49839d) {
        this.f442318a = c49839d;
    }

    public static C43834a a(C49839d c49839d) {
        C49837b.f442317a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigMotivationsListDeeplink.class, new C49840e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigMotivationsListDeeplink.class), c49839d));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f442318a);
    }
}

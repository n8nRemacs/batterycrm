package tI0;

import com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink;
import com.avito.android.user_adverts.root_screen.adverts_host.activate.c;
import com.avito.android.user_adverts.root_screen.adverts_host.activate.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ProfileUserItemsActivateMappingsModule_ProvideProfileUserItemsActivateLinkMappingFactory.java */
@e
@y
@x
/* renamed from: tI0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48561b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f439222a;

    public C48561b(c cVar) {
        this.f439222a = cVar;
    }

    public static C43834a a(c cVar) {
        C48560a.f439221a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileUserItemsActivateLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileUserItemsActivateLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f439222a);
    }
}

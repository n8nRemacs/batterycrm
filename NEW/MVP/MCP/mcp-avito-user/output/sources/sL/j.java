package SL;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeRecallLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacMakeRecallLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f14917a;

    public j(h hVar) {
        this.f14917a = hVar;
    }

    public static C43834a a(h hVar) {
        i.f14916a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacMakeRecallLink.class, new k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacMakeRecallLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f14917a);
    }
}

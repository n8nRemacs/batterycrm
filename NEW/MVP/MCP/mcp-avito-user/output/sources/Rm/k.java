package rM;

import com.avito.android.iac_util_deeplinks.public_module.control_flow.SetExecutableArgsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SetExecutableArgsLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f429767a;

    public k(i iVar) {
        this.f429767a = iVar;
    }

    public static C43834a a(i iVar) {
        j.f429766a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SetExecutableArgsLink.class, new l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SetExecutableArgsLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f429767a);
    }
}

package rM;

import com.avito.android.iac_util_deeplinks.public_module.control_flow.RunExecutableArgsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RunExecutableArgsLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: rM.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47567e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C47565c f429763a;

    public C47567e(C47565c c47565c) {
        this.f429763a = c47565c;
    }

    public static C43834a a(C47565c c47565c) {
        C47566d.f429762a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RunExecutableArgsLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RunExecutableArgsLink.class), c47565c));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f429763a);
    }
}

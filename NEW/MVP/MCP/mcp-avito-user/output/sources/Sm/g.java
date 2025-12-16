package sM;

import com.avito.android.iac_util_deeplinks.public_module.run_once.RunOnceLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RunOnceLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f437621a;

    public g(e eVar) {
        this.f437621a = eVar;
    }

    public static C43834a a(e eVar) {
        f.f437620a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RunOnceLink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RunOnceLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f437621a);
    }
}

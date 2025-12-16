package MH;

import com.avito.android.gig_tutorials.GigTutorialsDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigTutorialsDeeplinkModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f10541a;

    public d(b bVar) {
        this.f10541a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f10540a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigTutorialsDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigTutorialsDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10541a);
    }
}

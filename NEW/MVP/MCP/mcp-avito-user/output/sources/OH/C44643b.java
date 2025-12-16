package oH;

import com.avito.android.gig_apply.GigSlotMapDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GigSlotDeeplinkMapHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: oH.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44643b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f419686a;

    public C44643b(d dVar) {
        this.f419686a = dVar;
    }

    public static C43834a a(d dVar) {
        C44642a.f419685a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(GigSlotMapDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(GigSlotMapDeeplink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f419686a);
    }
}

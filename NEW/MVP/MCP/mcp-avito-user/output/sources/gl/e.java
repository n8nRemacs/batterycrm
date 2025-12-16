package GL;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_enable.IacEnableDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacEnableDeeplinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f6466a;

    public e(c cVar) {
        this.f6466a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f6465a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacEnableDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacEnableDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f6466a);
    }
}

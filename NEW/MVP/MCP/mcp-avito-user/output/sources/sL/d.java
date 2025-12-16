package SL;

import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacMakeCallLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f14910a;

    public d(b bVar) {
        this.f14910a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f14909a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacMakeCallLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacMakeCallLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f14910a);
    }
}

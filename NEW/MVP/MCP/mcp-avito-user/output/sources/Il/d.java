package IL;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_profile_settings_show.IacProfileSettingsShowLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacProfileSettingsShowLinkModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f8150a;

    public d(b bVar) {
        this.f8150a = bVar;
    }

    public static C43834a a(b bVar) {
        c.f8149a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacProfileSettingsShowLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacProfileSettingsShowLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f8150a);
    }
}

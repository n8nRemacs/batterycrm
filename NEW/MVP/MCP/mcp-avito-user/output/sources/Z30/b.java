package Z30;

import com.avito.android.notifications_settings.deep_linking.ProfileNotificationsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: NotificationsSettingsMappingsModule_ProvideProfileNotificationsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19846a;

    public b(f fVar) {
        this.f19846a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f19846a;
        a.f19845a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileNotificationsLink.class, new d(), new C43834a.b.C11809b(fVar));
    }
}

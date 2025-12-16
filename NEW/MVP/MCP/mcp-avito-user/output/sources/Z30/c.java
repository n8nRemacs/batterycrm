package Z30;

import com.avito.android.deep_linking.links.SettingsNotificationsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: NotificationsSettingsMappingsModule_ProvideSettingsNotificationsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f19847a;

    public c(h hVar) {
        this.f19847a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = this.f19847a;
        a.f19845a.getClass();
        return new C43834a(SettingsNotificationsLink.class, null, new C43834a.b.C11809b(hVar));
    }
}

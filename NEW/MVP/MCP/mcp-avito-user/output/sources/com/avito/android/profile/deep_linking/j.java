package com.avito.android.profile.deep_linking;

import com.avito.android.profile.deeplinks.IacProfilePhonesSettingsLink;
import lv.C43834a;

/* compiled from: IacProfilePhonesSettingsLinkModule_IacProfilePhonesSettingsLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f221909a;

    public j(h hVar) {
        this.f221909a = hVar;
    }

    public static C43834a a(h hVar) {
        i.f221908a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(IacProfilePhonesSettingsLink.class, new k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacProfilePhonesSettingsLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f221909a);
    }
}

package com.avito.android.phones_actualization.deep_linking;

import com.avito.android.deep_linking.links.auth.ActualizePhonesStatusLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ActualizePhonesDeeplinkMappingsModule_ProvidePhoneActualizationStatusLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final i f216182a;

    public c(i iVar) {
        this.f216182a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = this.f216182a;
        a.f216180a.getClass();
        return new C43834a(ActualizePhonesStatusLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ActualizePhonesStatusLink.class), iVar));
    }
}

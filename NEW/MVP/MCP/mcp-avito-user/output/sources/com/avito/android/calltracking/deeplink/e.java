package com.avito.android.calltracking.deeplink;

import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: MessengerPhoneCallLinkHandlerModule_ProvideMessengerCallPhoneLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f113653a;

    public e(f fVar) {
        this.f113653a = fVar;
    }

    public static C43834a a(f fVar) {
        d.f113652a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(MessengerReallContactMethodLink.class, new com.avito.android.calltracking.remote.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(MessengerReallContactMethodLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f113653a);
    }
}

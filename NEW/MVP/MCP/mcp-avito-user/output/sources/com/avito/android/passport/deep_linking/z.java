package com.avito.android.passport.deep_linking;

import com.avito.android.N1;
import com.avito.android.deeplink_handler.view.a;
import mb0.C44043c;

/* compiled from: PhoneManagementAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f211115a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f211116b;

    /* renamed from: c, reason: collision with root package name */
    public final C44043c f211117c;

    public z(dv.b bVar, dv.b bVar2, C44043c c44043c) {
        this.f211115a = bVar;
        this.f211116b = bVar2;
        this.f211117c = c44043c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f211115a.get();
        return new y((N1) this.f211117c.get(), (a.InterfaceC4053a) this.f211116b.get(), bVar);
    }
}

package com.avito.android.profile_phones.deep_linking;

import com.avito.android.N1;
import com.avito.android.code_confirmation.phone_management.C29417e;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import mb0.C44043c;

/* compiled from: PhoneAddAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f227138a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f227139b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f227140c;

    /* renamed from: d, reason: collision with root package name */
    public final C44043c f227141d;

    /* renamed from: e, reason: collision with root package name */
    public final C29417e f227142e;

    public f(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, C44043c c44043c, C29417e c29417e) {
        this.f227138a = bVar;
        this.f227139b = bVar2;
        this.f227140c = fVar;
        this.f227141d = c44043c;
        this.f227142e = c29417e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a.b) this.f227138a.get(), (a.InterfaceC4053a) this.f227139b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f227140c.get(), (N1) this.f227141d.get(), (PhoneManagementIntentFactory) this.f227142e.get());
    }
}

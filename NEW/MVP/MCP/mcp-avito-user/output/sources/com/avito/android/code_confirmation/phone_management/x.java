package com.avito.android.code_confirmation.phone_management;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;

/* compiled from: PhoneManagementPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f119720a;

    /* renamed from: b, reason: collision with root package name */
    public final C15204c f119721b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f119722c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f119723d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC30274a> f119724e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f119725f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f119726g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f119727h;

    public x(Provider provider, C15204c c15204c, Provider provider2, dagger.internal.l lVar, Provider provider3, dagger.internal.l lVar2, Provider provider4, dagger.internal.l lVar3) {
        this.f119720a = provider;
        this.f119721b = c15204c;
        this.f119722c = provider2;
        this.f119723d = lVar;
        this.f119724e = provider3;
        this.f119725f = lVar2;
        this.f119726g = provider4;
        this.f119727h = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f119720a.get(), (InterfaceC15202a) this.f119721b.get(), this.f119722c.get(), (PhoneManagementIntentFactory.CallSource) this.f119723d.f393949a, this.f119724e.get(), (CodeConfirmationSource) this.f119725f.f393949a, this.f119726g.get(), (Kundle) this.f119727h.f393949a);
    }
}

package com.avito.android.verification.verification_input_inn;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInputInnViewModelImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f325664a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f325665b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325666c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325667d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.verification.inn.q f325668e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.verification.inn.o f325669f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f325670g;

    /* renamed from: h, reason: collision with root package name */
    public final b f325671h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.verification.inn.b> f325672i;

    public x(Provider provider, dagger.internal.l lVar, Provider provider2, Provider provider3, com.avito.android.verification.inn.q qVar, com.avito.android.verification.inn.o oVar, Provider provider4, b bVar, Provider provider5) {
        this.f325664a = provider;
        this.f325665b = lVar;
        this.f325666c = provider2;
        this.f325667d = provider3;
        this.f325668e = qVar;
        this.f325669f = oVar;
        this.f325670g = provider4;
        this.f325671h = bVar;
        this.f325672i = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f325664a.get();
        VerificationInputInnArgs verificationInputInnArgs = (VerificationInputInnArgs) this.f325665b.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = this.f325666c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f325667d.get();
        com.avito.android.verification.inn.p pVar = (com.avito.android.verification.inn.p) this.f325668e.get();
        this.f325669f.getClass();
        com.avito.android.verification.inn.n nVar = new com.avito.android.verification.inn.n();
        InterfaceC35745a5 interfaceC35745a5 = this.f325670g.get();
        this.f325671h.getClass();
        return new w(eVar, verificationInputInnArgs, screenPerformanceTracker, aVar, pVar, nVar, interfaceC35745a5, new a(), this.f325672i.get());
    }
}

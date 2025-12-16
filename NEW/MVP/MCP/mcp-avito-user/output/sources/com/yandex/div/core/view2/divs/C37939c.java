package com.yandex.div.core.view2.divs;

/* compiled from: DivActionBeaconSender_Factory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.view2.divs.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37939c implements dagger.internal.h<C37935b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368349a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.div.core.M f368350b;

    /* renamed from: c, reason: collision with root package name */
    public final com.yandex.div.core.P f368351c;

    public C37939c(dagger.internal.u uVar, com.yandex.div.core.M m12, com.yandex.div.core.P p12) {
        this.f368349a = uVar;
        this.f368350b = m12;
        this.f368351c = p12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C37935b(dagger.internal.g.b(this.f368349a), ((Boolean) this.f368350b.get()).booleanValue(), ((Boolean) this.f368351c.get()).booleanValue());
    }
}

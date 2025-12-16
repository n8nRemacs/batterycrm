package com.avito.android.publish;

import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.S1;

/* compiled from: PublishIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.l0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33879l0 implements dagger.internal.h<C33877k0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237376a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f237377b;

    /* renamed from: c, reason: collision with root package name */
    public final S1 f237378c;

    public C33879l0(dagger.internal.l lVar, com.avito.android.O o12, S1 s12) {
        this.f237376a = lVar;
        this.f237377b = o12;
        this.f237378c = s12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33877k0((Application) this.f237376a.f393949a, (com.avito.android.L) this.f237377b.get(), (Q1) this.f237378c.get());
    }
}

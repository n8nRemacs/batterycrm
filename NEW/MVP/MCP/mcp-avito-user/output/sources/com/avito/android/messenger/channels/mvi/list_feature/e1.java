package com.avito.android.messenger.channels.mvi.list_feature;

import androidx.fragment.app.Fragment;
import javax.inject.Provider;

/* compiled from: ChannelsListDataConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class e1 implements dagger.internal.h<c1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f188035a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f188036b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f188037c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f188038d;

    /* renamed from: e, reason: collision with root package name */
    public final v1 f188039e;

    public e1(dagger.internal.l lVar, s1 s1Var, Provider provider, dagger.internal.u uVar, v1 v1Var) {
        this.f188035a = lVar;
        this.f188036b = s1Var;
        this.f188037c = provider;
        this.f188038d = uVar;
        this.f188039e = v1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c1((Fragment) this.f188035a.f393949a, (q1) this.f188036b.get(), this.f188037c.get(), (com.avito.android.date_time_formatter.o) this.f188038d.get(), (t1) this.f188039e.get());
    }
}

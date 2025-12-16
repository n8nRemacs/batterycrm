package com.avito.android.service.short_task;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: WorkManagerScheduler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f274117a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.q f274118b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f274119c;

    public t(C30102l3 c30102l3, dagger.internal.q qVar, Provider provider) {
        this.f274117a = c30102l3;
        this.f274118b = qVar;
        this.f274119c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((Context) this.f274117a.get(), (Map) this.f274118b.get(), this.f274119c.get());
    }
}

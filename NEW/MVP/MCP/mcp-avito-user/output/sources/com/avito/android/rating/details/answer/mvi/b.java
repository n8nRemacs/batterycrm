package com.avito.android.rating.details.answer.mvi;

import com.avito.android.rating.details.answer.RatingAddAnswerArguments;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f246612a;

    /* renamed from: b, reason: collision with root package name */
    public final l f246613b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f246614c;

    public b(l lVar, l lVar2, Provider provider) {
        this.f246612a = lVar;
        this.f246613b = lVar2;
        this.f246614c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((RatingAddAnswerArguments) this.f246612a.f393949a, ((Boolean) this.f246613b.f393949a).booleanValue(), this.f246614c.get());
    }
}

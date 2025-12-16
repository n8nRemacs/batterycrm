package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: RatingAddAnswerPhotoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating.details.answer.photo.a> f246720a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating.details.answer.upload.a> f246721b;

    /* renamed from: c, reason: collision with root package name */
    public final u f246722c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f246723d;

    public e(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f246720a = provider;
        this.f246721b = provider2;
        this.f246722c = uVar;
        this.f246723d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f246720a.get(), this.f246721b.get(), (InterfaceC50647a) this.f246722c.get(), (RatingAddAnswerPhotoArguments) this.f246723d.f393949a);
    }
}

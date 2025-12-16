package com.avito.android.rating.details.answer.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlin.G0;

/* compiled from: RatingAddAnswerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f246617a;

    /* renamed from: b, reason: collision with root package name */
    public final h f246618b;

    public f(b bVar, h hVar) {
        this.f246617a = bVar;
        this.f246618b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f246617a.get();
        this.f246618b.getClass();
        return new d("RatingAddAnswer", G0.f406611a, new c(aVar, new g()));
    }
}

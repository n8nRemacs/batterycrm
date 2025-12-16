package com.avito.android.rating.details.answer;

import com.avito.android.rating.details.answer.mvi.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingAddAnswerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f246604a;

    public e(f fVar) {
        this.f246604a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.rating.details.answer.mvi.d) this.f246604a.get(), null, 2, null);
    }
}

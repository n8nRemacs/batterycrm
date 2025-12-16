package com.avito.android.rating.details;

import com.avito.android.rating.details.mvi.O;
import com.avito.android.rating.details.mvi.P;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: RatingDetailsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final P f247523a;

    public s(P p12) {
        this.f247523a = p12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        O o12 = (O) this.f247523a.get();
        i2.f411430a.getClass();
        return new r(o12, i2.a.f411433c);
    }
}

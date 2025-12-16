package com.avito.android.publish.screen.step.suggest.category;

import com.avito.android.publish.screen.step.suggest.category.mvi.m;
import com.avito.android.publish.screen.step.suggest.category.mvi.n;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: SuggestCategoryViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final n f242340a;

    public e(n nVar) {
        this.f242340a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f242340a.get();
        i2.f411430a.getClass();
        return new d(mVar, i2.a.f411433c);
    }
}

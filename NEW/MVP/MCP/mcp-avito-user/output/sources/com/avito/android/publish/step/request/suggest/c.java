package com.avito.android.publish.step.request.suggest;

import com.avito.android.publish.step.request.suggest.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: SuggestRequestViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.step.request.suggest.mvi.h f245464a;

    public c(com.avito.android.publish.step.request.suggest.mvi.h hVar) {
        this.f245464a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f245464a.get();
        i2.f411430a.getClass();
        return new b(gVar, i2.a.f411433c);
    }
}

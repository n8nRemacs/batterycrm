package com.avito.android.publish.details.adapter.historical_suggest;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoricalSuggestRe23ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233249a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233250b;

    public j(u uVar, u uVar2) {
        this.f233249a = uVar;
        this.f233250b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((k) this.f233249a.get(), (u3.l) this.f233250b.get());
    }
}

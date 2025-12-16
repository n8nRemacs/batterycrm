package com.avito.android.publish.screen.step.request.mergedpretendpremoderation;

import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi.j;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MergedPretendPremoderationViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f241736a;

    public c(k kVar) {
        this.f241736a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((j) this.f241736a.get(), null, 2, null);
    }
}

package cK0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SmbStatsTooltipSessionStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final NJ0.c f57818a;

    public d(NJ0.c cVar) {
        this.f57818a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((l) this.f57818a.get());
    }
}

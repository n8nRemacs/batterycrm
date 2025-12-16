package com.avito.android.service.short_task.metrics;

import com.avito.android.di.module.C30093k5;
import com.avito.android.util.I1;

/* compiled from: GooglePlayServicesInfoProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final C30093k5 f274088a;

    public l(C30093k5 c30093k5) {
        this.f274088a = c30093k5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((I1) this.f274088a.get());
    }
}

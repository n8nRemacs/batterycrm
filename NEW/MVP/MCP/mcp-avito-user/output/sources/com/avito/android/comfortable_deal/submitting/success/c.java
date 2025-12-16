package com.avito.android.comfortable_deal.submitting.success;

import com.avito.android.comfortable_deal.submitting.success.mvi.i;
import com.avito.android.comfortable_deal.submitting.success.mvi.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SubmittingSuccessViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f123382a;

    public c(j jVar) {
        this.f123382a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((i) this.f123382a.get(), null, 2, null);
    }
}

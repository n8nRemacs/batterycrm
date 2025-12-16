package com.avito.android.comfortable_deal.submitting.select;

import com.avito.android.comfortable_deal.submitting.select.mvi.m;
import com.avito.android.comfortable_deal.submitting.select.mvi.n;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SubmittingSelectViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final n f123294a;

    public d(n nVar) {
        this.f123294a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((m) this.f123294a.get(), null, 2, null);
    }
}

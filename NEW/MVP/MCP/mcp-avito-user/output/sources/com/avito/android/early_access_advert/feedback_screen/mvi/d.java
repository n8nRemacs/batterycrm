package com.avito.android.early_access_advert.feedback_screen.mvi;

import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessAdvertFeedbackBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f145680a;

    /* renamed from: b, reason: collision with root package name */
    public final l f145681b;

    /* renamed from: c, reason: collision with root package name */
    public final l f145682c;

    public d(l lVar, l lVar2, l lVar3) {
        this.f145680a = lVar;
        this.f145681b = lVar2;
        this.f145682c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f145680a.f393949a, (EarlyAccessAdvertFeedbackType) this.f145681b.f393949a, (EarlyAccessFeedback) this.f145682c.f393949a);
    }
}

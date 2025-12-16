package com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent;

import com.avito.android.util.S3;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResponsibleAgentPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121458a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f121459b;

    public e(l lVar, S3 s32) {
        this.f121458a = lVar;
        this.f121459b = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f121458a.f393949a;
        this.f121459b.getClass();
        return new d(lVar, S3.a());
    }
}

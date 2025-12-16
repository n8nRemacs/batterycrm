package com.avito.android.comfortable_deal.deal.item.teammember;

import com.avito.android.util.S3;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TeamMemberPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121546a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f121547b;

    public f(l lVar, S3 s32) {
        this.f121546a = lVar;
        this.f121547b = s32;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f121546a.f393949a;
        this.f121547b.getClass();
        return new e(lVar, S3.a());
    }
}

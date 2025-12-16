package com.avito.android.comfortable_deal.comment.mvi;

import com.avito.android.comfortable_deal.repository.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommentActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f120549a;

    public c(l lVar) {
        this.f120549a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.comfortable_deal.repository.a) this.f120549a.get());
    }
}

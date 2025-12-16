package com.avito.android.comfortable_deal.comment;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommentViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.comment.mvi.f f120533a;

    public h(com.avito.android.comfortable_deal.comment.mvi.f fVar) {
        this.f120533a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.comment.mvi.e) this.f120533a.get(), null, 2, null);
    }
}

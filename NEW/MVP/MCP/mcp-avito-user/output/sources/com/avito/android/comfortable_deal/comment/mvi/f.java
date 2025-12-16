package com.avito.android.comfortable_deal.comment.mvi;

import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import mp.C44116d;

/* compiled from: CommentFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f120553a;

    /* renamed from: b, reason: collision with root package name */
    public final h f120554b;

    /* renamed from: c, reason: collision with root package name */
    public final j f120555c;

    /* renamed from: d, reason: collision with root package name */
    public final l f120556d;

    public f(c cVar, h hVar, j jVar, l lVar) {
        this.f120553a = cVar;
        this.f120554b = hVar;
        this.f120555c = jVar;
        this.f120556d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f120553a.get();
        this.f120554b.getClass();
        g gVar = new g();
        this.f120555c.getClass();
        i iVar = new i();
        CommentArguments commentArguments = (CommentArguments) this.f120556d.f393949a;
        C44116d.f414758e.getClass();
        return new e("Comment", new C44116d(false, commentArguments.f120535c, commentArguments.f120536d), new d(bVar, iVar, gVar));
    }
}

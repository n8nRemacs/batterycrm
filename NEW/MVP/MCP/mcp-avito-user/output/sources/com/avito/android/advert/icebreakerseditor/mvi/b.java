package com.avito.android.advert.icebreakerseditor.mvi;

import com.avito.android.advert.icebreakerseditor.analytics.IcebreakersEditorAnalyticsData;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IcebreakersEditorActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f71242a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.icebreakerseditor.h f71243b;

    /* renamed from: c, reason: collision with root package name */
    public final l f71244c;

    public b(u uVar, com.avito.android.advert.icebreakerseditor.h hVar, l lVar) {
        this.f71242a = uVar;
        this.f71243b = hVar;
        this.f71244c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a4.b) this.f71242a.get(), (com.avito.android.advert.icebreakerseditor.g) this.f71243b.get(), (IcebreakersEditorAnalyticsData) this.f71244c.f393949a);
    }
}

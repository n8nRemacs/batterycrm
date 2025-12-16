package com.avito.android.item_report.di;

import com.avito.android.deep_linking.links.ItemReportLink;
import com.avito.android.item_report.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ItemReportHandlerModule_ProvideItemReportHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f173868a;

    /* renamed from: b, reason: collision with root package name */
    public final f f173869b;

    public e(d dVar, f fVar) {
        this.f173868a = dVar;
        this.f173869b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f173869b;
        this.f173868a.getClass();
        return new C43834a(ItemReportLink.class, null, new C43834a.b.C11809b(fVar));
    }
}

package com.avito.android.body_condition_sheet.di;

import com.avito.android.body_condition_sheet.l;
import com.avito.android.deep_linking.links.BodyConditionBottomSheetLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BodyConditionSheetDeepLinkHandlerModule_MakeBodyConditionSheetDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f106854a;

    /* renamed from: b, reason: collision with root package name */
    public final l f106855b;

    public f(e eVar, l lVar) {
        this.f106854a = eVar;
        this.f106855b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f106855b;
        this.f106854a.getClass();
        return new C43834a(BodyConditionBottomSheetLink.class, null, new C43834a.b.C11809b(lVar));
    }
}

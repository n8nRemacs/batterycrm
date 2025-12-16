package com.avito.android.details_sheet.di;

import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.details_sheet.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DetailsSheetDeepLinkHandlerModule_MakeDetailsSheetDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f135941a;

    /* renamed from: b, reason: collision with root package name */
    public final g f135942b;

    public e(d dVar, g gVar) {
        this.f135941a = dVar;
        this.f135942b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f135942b;
        this.f135941a.getClass();
        return new C43834a(DetailsSheetLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DetailsSheetLink.class), gVar));
    }
}

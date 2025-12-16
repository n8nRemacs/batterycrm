package com.avito.android.rating.details.text_sheet;

import com.avito.android.rating.details.text_sheet.mvi.f;
import com.avito.android.rating.details.text_sheet.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextSheetViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final g f247549a;

    public e(g gVar) {
        this.f247549a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f247549a.get(), null, 2, null);
    }
}

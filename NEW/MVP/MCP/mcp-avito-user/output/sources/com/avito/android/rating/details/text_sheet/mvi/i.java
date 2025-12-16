package com.avito.android.rating.details.text_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextSheetOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final cv.e f247572a;

    public i(cv.e eVar) {
        this.f247572a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.deeplink_handler.handler.composite.a) this.f247572a.get());
    }
}

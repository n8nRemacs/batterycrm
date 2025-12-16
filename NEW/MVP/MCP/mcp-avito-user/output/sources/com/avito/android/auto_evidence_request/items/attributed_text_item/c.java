package com.avito.android.auto_evidence_request.items.attributed_text_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AttributedTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final e f95184a;

    public c(e eVar) {
        this.f95184a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f95184a.get());
    }
}

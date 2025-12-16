package com.avito.android.loyalty.ui.items.text_item;

import com.avito.android.R;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoyaltyTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f183750a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.loyalty.di.quality_service_gray.h f183751b;

    public c(f fVar, com.avito.android.loyalty.di.quality_service_gray.h hVar) {
        this.f183750a = fVar;
        this.f183751b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f183750a.get();
        this.f183751b.get();
        return new b(eVar, Integer.valueOf(R.layout.item_text_h25).intValue());
    }
}

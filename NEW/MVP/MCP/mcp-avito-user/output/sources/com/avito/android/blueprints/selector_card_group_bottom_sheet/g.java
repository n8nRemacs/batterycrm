package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectorCardGroupBottomSheetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f106691a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106692b;

    public g(u uVar, Provider provider) {
        this.f106691a = provider;
        this.f106692b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f106691a.get(), (com.avito.android.util.text.a) this.f106692b.get());
    }
}

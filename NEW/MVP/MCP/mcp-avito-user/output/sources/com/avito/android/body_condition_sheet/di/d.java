package com.avito.android.body_condition_sheet.di;

import Mj.C14497b;
import Mj.InterfaceC14496a;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BodyConditionSheetActivityModule_ProvideCarBodySidePointToPxPositionConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<InterfaceC14496a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f106852a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f106853b;

    public d(c cVar, Provider<C> provider) {
        this.f106852a = cVar;
        this.f106853b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f106853b.get();
        this.f106852a.getClass();
        return new C14497b(c12);
    }
}

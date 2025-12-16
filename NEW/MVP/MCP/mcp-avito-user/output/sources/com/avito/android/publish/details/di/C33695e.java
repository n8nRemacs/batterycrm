package com.avito.android.publish.details.di;

import Mj.C14497b;
import Mj.InterfaceC14496a;

/* compiled from: BodyConditionModule_ProvideCarBodySidePointToPxPositionConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33695e implements dagger.internal.h<InterfaceC14496a> {

    /* renamed from: a, reason: collision with root package name */
    public final C33691c f233916a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233917b;

    public C33695e(C33691c c33691c, dagger.internal.u uVar) {
        this.f233916a = c33691c;
        this.f233917b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = (com.avito.android.util.C) this.f233917b.get();
        this.f233916a.getClass();
        return new C14497b(c12);
    }
}

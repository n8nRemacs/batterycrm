package com.avito.android.body_condition_sheet.mvi;

import com.avito.android.deep_linking.links.BodyCondition;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BodyConditionSheetBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f106904a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f106905b;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f106904a = lVar;
        this.f106905b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((BodyCondition) this.f106904a.f393949a, (String) this.f106905b.f393949a);
    }
}

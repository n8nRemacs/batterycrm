package com.avito.android.rating_form.step.dialog.mvi;

import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DialogActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249429a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f249430b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f249431c;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f249429a = lVar;
        this.f249430b = lVar2;
        this.f249431c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((RatingFormStepArguments) this.f249429a.f393949a, (DialogInfo) this.f249430b.f393949a, this.f249431c.get());
    }
}

package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideJobToastSlotItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.b0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33690b0 implements dagger.internal.h<com.avito.android.publish.slots.job_warning_toast.item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.job_warning_toast.item.d> f233907a;

    public C33690b0(Provider<com.avito.android.publish.slots.job_warning_toast.item.d> provider) {
        this.f233907a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.job_warning_toast.item.d dVar = this.f233907a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.job_warning_toast.item.b(dVar);
    }
}

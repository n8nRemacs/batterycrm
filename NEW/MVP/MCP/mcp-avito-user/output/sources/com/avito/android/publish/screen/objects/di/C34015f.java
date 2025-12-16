package com.avito.android.publish.screen.objects.di;

import javax.inject.Provider;

/* compiled from: ObjectFillFormItemsModule_ProvideGenerateTextButtonsBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.screen.objects.di.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34015f implements dagger.internal.h<com.avito.android.publish.slots.generate_text_buttons.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34014e f239866a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.generate_text_buttons.item.e> f239867b;

    public C34015f(C34014e c34014e, Provider<com.avito.android.publish.slots.generate_text_buttons.item.e> provider) {
        this.f239866a = c34014e;
        this.f239867b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.generate_text_buttons.item.e eVar = this.f239867b.get();
        this.f239866a.getClass();
        return new com.avito.android.publish.slots.generate_text_buttons.item.a(eVar);
    }
}

package com.avito.android.ai_assistant.adapter.assistant_text_message;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AssistantTextMessageItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f88753a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f88754b;

    public e(u uVar, Provider provider) {
        this.f88753a = uVar;
        this.f88754b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f88753a.get(), this.f88754b.get());
    }
}

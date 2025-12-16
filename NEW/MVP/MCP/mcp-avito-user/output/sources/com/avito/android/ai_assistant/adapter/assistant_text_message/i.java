package com.avito.android.ai_assistant.adapter.assistant_text_message;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AssistantTextMessageItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f88759a;

    public i(Provider<R0> provider) {
        this.f88759a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f88759a.get());
    }
}

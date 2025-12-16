package com.avito.android.rating.details.answer.photo;

import Mg0.InterfaceC14487a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f246655a;

    public c(Provider<InterfaceC14487a> provider) {
        this.f246655a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f246655a.get());
    }
}

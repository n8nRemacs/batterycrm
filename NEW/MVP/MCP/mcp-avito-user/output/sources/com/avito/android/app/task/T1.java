package com.avito.android.app.task;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SerpDbDeleteTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class T1 implements dagger.internal.h<SerpDbDeleteTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91531a;

    public T1(Provider<InterfaceC35745a5> provider) {
        this.f91531a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SerpDbDeleteTask(this.f91531a.get());
    }
}

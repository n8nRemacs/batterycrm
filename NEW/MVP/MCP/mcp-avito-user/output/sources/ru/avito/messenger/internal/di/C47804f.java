package ru.avito.messenger.internal.di;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.analytics.C31667x;

/* compiled from: ErrorTrackerModule_ProvideErrorTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47804f implements dagger.internal.h<InterfaceC14725a> {

    /* renamed from: a, reason: collision with root package name */
    public final C47803e f431627a;

    public C47804f(C47803e c47803e) {
        this.f431627a = c47803e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C31667x c31667x = this.f431627a.f431626a;
        return c31667x == null ? new C47802d() : c31667x;
    }
}

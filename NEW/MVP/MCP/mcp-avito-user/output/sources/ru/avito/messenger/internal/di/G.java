package ru.avito.messenger.internal.di;

import com.avito.android.util.C35768c5;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: SchedulersModule_ProvideSchedulers3Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class G implements dagger.internal.h<InterfaceC35745a5> {

    /* renamed from: a, reason: collision with root package name */
    public final F f431552a;

    public G(F f12) {
        this.f431552a = f12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f431552a.getClass();
        return new C35768c5();
    }
}

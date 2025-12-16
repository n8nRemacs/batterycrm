package iq;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoDealIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: iq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42090c implements dagger.internal.h<C42089b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f405249a;

    public C42090c(C30102l3 c30102l3) {
        this.f405249a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42089b((Context) this.f405249a.get());
    }
}

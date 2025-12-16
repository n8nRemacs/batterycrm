package pF0;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSearchIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: pF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46947c implements dagger.internal.h<com.avito.android.travel_search.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f428282a;

    public C46947c(C30102l3 c30102l3) {
        this.f428282a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.travel_search.a((Context) this.f428282a.get());
    }
}

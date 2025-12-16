package rw;

import android.content.Context;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAgencySearchIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: rw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47925c implements h<com.avito.android.developments_agency_search.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f437166a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.navigation.c f437167b;

    /* renamed from: c, reason: collision with root package name */
    public final O f437168c;

    public C47925c(C30102l3 c30102l3, com.avito.android.navigation.c cVar, O o12) {
        this.f437166a = c30102l3;
        this.f437167b = cVar;
        this.f437168c = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.developments_agency_search.a((Context) this.f437166a.get(), (com.avito.android.navigation.a) this.f437167b.get(), (L) this.f437168c.get());
    }
}

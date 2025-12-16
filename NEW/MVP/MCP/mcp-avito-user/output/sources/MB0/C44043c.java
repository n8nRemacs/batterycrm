package mb0;

import android.content.Context;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhonesIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: mb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44043c implements h<com.avito.android.profile_phones.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f414605a;

    /* renamed from: b, reason: collision with root package name */
    public final O f414606b;

    public C44043c(C30102l3 c30102l3, O o12) {
        this.f414605a = c30102l3;
        this.f414606b = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.profile_phones.a((Context) this.f414605a.get(), (L) this.f414606b.get());
    }
}

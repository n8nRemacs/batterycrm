package ys0;

import android.content.Context;
import com.avito.android.D2;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingFlowIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C50296g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f443553a;

    /* renamed from: b, reason: collision with root package name */
    public final D2 f443554b;

    public h(C30102l3 c30102l3, D2 d22) {
        this.f443553a = c30102l3;
        this.f443554b = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f443553a.get();
        this.f443554b.get();
        return new C50296g(context);
    }
}

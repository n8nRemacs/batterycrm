package l20;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageInviteIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f413411a;

    public c(C30102l3 c30102l3) {
        this.f413411a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f413411a.get());
    }
}

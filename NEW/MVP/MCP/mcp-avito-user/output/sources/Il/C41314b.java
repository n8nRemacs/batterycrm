package iL;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacCallActivityIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: iL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C41314b implements h<C41313a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f398505a;

    public C41314b(C30102l3 c30102l3) {
        this.f398505a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C41313a((Context) this.f398505a.get());
    }
}

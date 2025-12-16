package kO0;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InviteIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: kO0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42612c implements h<C42611b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f406254a;

    public C42612c(C30102l3 c30102l3) {
        this.f406254a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42611b((Context) this.f406254a.get());
    }
}

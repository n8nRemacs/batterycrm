package uK;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacProximityWakeLockerImpl_Factory.java */
@e
@y
@x
/* renamed from: uK.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48912c implements h<C48911b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f439904a;

    public C48912c(C30102l3 c30102l3) {
        this.f439904a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48911b((Context) this.f439904a.get());
    }
}

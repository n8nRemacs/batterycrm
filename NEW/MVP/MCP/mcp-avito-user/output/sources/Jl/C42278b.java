package jL;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacCallActivityLauncherImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: jL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42278b implements h<C42277a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f405554a;

    public C42278b(C30102l3 c30102l3) {
        this.f405554a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42277a((Context) this.f405554a.get());
    }
}

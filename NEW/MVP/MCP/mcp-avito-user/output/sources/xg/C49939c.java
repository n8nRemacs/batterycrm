package xg;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvlIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: xg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49939c implements h<C49937a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f442597a;

    public C49939c(C30102l3 c30102l3) {
        this.f442597a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49937a((Context) this.f442597a.get());
    }
}

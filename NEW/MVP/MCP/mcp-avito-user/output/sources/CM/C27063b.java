package cM;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacProblemBackgroundRestrictionCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: cM.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27063b implements dagger.internal.h<C27062a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f57820a;

    public C27063b(dagger.internal.l lVar) {
        this.f57820a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C27062a((Application) this.f57820a.f393949a);
    }
}

package uQ;

import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InterviewIntentFactoryImpl_Factory.java */
@e
@y
@x
/* renamed from: uQ.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48936c implements h<C48935b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f439930a;

    public C48936c(l lVar) {
        this.f439930a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C48935b((Application) this.f439930a.f393949a);
    }
}

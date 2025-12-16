package sK;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacOverlayDialerMediatorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f437604a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f437605b;

    public c(C30102l3 c30102l3, f fVar) {
        this.f437604a = fVar;
        this.f437605b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.b(this.f437604a), (Context) this.f437605b.get());
    }
}

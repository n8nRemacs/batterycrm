package eY;

import com.avito.android.favorite.m;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavouritePinsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: eY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40072c implements h<C40071b> {

    /* renamed from: a, reason: collision with root package name */
    public final m f395232a;

    public C40072c(m mVar) {
        this.f395232a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40071b((com.avito.android.favorite.h) this.f395232a.get());
    }
}

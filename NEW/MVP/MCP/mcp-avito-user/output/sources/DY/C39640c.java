package dY;

import com.avito.android.map.di.v;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AreaConverterImpl_Factory.java */
@e
@y
@x
/* renamed from: dY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39640c implements h<C39639b> {

    /* renamed from: a, reason: collision with root package name */
    public final v f393905a;

    public C39640c(v vVar) {
        this.f393905a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39639b((com.avito.android.map_core.view.e) this.f393905a.get());
    }
}

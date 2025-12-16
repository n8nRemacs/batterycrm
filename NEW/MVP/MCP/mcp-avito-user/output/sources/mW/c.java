package Mw;

import android.app.Activity;
import com.avito.android.location.find.o;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FindCurrentLocationUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f11103a;

    /* renamed from: b, reason: collision with root package name */
    public final u f11104b;

    public c(l lVar, u uVar) {
        this.f11103a = lVar;
        this.f11104b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Activity) this.f11103a.f393949a, (o) this.f11104b.get());
    }
}

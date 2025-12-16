package Yd;

import com.avito.android.service.short_task.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthTrackerRunnerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f19603a;

    public c(u uVar) {
        this.f19603a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((j) this.f19603a.get());
    }
}

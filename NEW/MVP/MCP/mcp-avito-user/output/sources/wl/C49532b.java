package wL;

import com.avito.android.iac_dialer_watcher.impl_module.logging.writing.o;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacLogSavingWatcherListener_Factory.java */
@e
@y
@x
/* renamed from: wL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49532b implements h<C49531a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f441405a;

    public C49532b(u uVar) {
        this.f441405a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49531a((o) this.f441405a.get());
    }
}

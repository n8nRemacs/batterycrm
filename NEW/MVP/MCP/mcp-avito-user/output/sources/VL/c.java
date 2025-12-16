package vL;

import com.avito.android.error_reporting.app_state.C30363b;
import com.avito.android.error_reporting.app_state.C30364c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacFirebaseKeyWatcherListener_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<C49229a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30364c f440693a;

    public c(C30364c c30364c) {
        this.f440693a = c30364c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49229a((C30363b) this.f440693a.get());
    }
}

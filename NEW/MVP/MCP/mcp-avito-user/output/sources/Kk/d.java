package kK;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacBroadcastReceiverLauncherImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C42591c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f406237a;

    public d(C30102l3 c30102l3) {
        this.f406237a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42591c((Context) this.f406237a.get());
    }
}

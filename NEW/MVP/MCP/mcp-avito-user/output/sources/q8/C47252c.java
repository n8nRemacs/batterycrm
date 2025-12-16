package q8;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryEventTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: q8.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C47252c implements h<C47251b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f429047a;

    public C47252c(u uVar) {
        this.f429047a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47251b((InterfaceC28373a) this.f429047a.get());
    }
}

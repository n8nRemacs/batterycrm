package YK;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mL.InterfaceC43977a;

/* compiled from: IacFinishedMicRequestScreenLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f19443a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43977a> f19444b;

    public d(dv.b bVar, Provider provider) {
        this.f19443a = bVar;
        this.f19444b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f19443a.get(), this.f19444b.get());
    }
}

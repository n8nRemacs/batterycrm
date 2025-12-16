package VK;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mL.InterfaceC43977a;

/* compiled from: IacFinishedFeedbackScreenLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f17073a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43977a> f17074b;

    public d(dv.b bVar, Provider provider) {
        this.f17073a = bVar;
        this.f17074b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f17073a.get(), this.f17074b.get());
    }
}

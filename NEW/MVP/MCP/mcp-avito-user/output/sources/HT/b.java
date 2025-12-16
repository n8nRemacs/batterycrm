package Ht;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RestartPublishDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C14031a> {

    /* renamed from: a, reason: collision with root package name */
    public final C33879l0 f7802a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f7803b;

    public b(C33879l0 c33879l0, dv.b bVar) {
        this.f7802a = c33879l0;
        this.f7803b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14031a((PublishIntentFactory) this.f7802a.get(), (a.InterfaceC4053a) this.f7803b.get());
    }
}

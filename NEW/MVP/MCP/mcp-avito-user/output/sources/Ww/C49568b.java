package wW;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobAssistantPickLocationDeeplinkHandler_Factory.java */
@e
@y
@x
/* renamed from: wW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49568b implements h<C49567a> {

    /* renamed from: a, reason: collision with root package name */
    public final C33879l0 f441517a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f441518b;

    public C49568b(C33879l0 c33879l0, dv.b bVar) {
        this.f441517a = c33879l0;
        this.f441518b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49567a((PublishIntentFactory) this.f441517a.get(), (a.InterfaceC4053a) this.f441518b.get());
    }
}

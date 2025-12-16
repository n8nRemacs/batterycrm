package tQ;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import uQ.C48936c;
import uQ.InterfaceC48934a;

/* compiled from: JobInterviewInvitationLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C48595a> {

    /* renamed from: a, reason: collision with root package name */
    public final C48936c f439247a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f439248b;

    public d(C48936c c48936c, dv.b bVar) {
        this.f439247a = c48936c;
        this.f439248b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48595a((InterfaceC48934a) this.f439247a.get(), (a.InterfaceC4053a) this.f439248b.get());
    }
}

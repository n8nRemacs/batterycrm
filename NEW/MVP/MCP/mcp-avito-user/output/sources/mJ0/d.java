package MJ0;

import aK0.C19785c;
import aK0.InterfaceC19783a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserStatsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C19785c f10590a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f10591b;

    public d(C19785c c19785c, dv.b bVar) {
        this.f10590a = c19785c;
        this.f10591b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC19783a) this.f10590a.get(), (a.InterfaceC4053a) this.f10591b.get());
    }
}

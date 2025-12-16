package rF0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import pF0.C46947c;
import pF0.InterfaceC46946b;

/* compiled from: TravelSearchLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: rF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47535a implements h<com.avito.android.travel_search.deeplink.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f429666a;

    /* renamed from: b, reason: collision with root package name */
    public final C46947c f429667b;

    public C47535a(dv.b bVar, C46947c c46947c) {
        this.f429666a = bVar;
        this.f429667b = c46947c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.travel_search.deeplink.a((a.InterfaceC4053a) this.f429666a.get(), (InterfaceC46946b) this.f429667b.get());
    }
}

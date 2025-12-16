package rF0;

import com.avito.android.travel_search.deeplink.TravelSearchLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TravelSearchLinkModule_ProvideTravelSearchLinkMappingFactory.java */
@e
@y
@x
/* renamed from: rF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47537c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C47535a f429669a;

    public C47537c(C47535a c47535a) {
        this.f429669a = c47535a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C47535a c47535a = this.f429669a;
        C47536b.f429668a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TravelSearchLink.class, new com.avito.android.travel_search.deeplink.b(), new C43834a.b.C11809b(c47535a));
    }
}

package gI0;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.deeplink.v;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UserAdvertDeepLinkHandlerModule_MakeMyAdvertReserveDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C40587a f396447a;

    /* renamed from: b, reason: collision with root package name */
    public final v f396448b;

    public j(C40587a c40587a, v vVar) {
        this.f396447a = c40587a;
        this.f396448b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = this.f396448b;
        this.f396447a.getClass();
        return new C43834a(MyAdvertLink.UpdateReservation.class, null, new C43834a.b.C11809b(vVar));
    }
}

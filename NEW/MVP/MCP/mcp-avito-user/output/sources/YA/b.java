package Ya;

import com.avito.android.advert_stats.l;
import com.avito.android.advert_stats.o;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertStatsDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<C18248a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f19519a;

    /* renamed from: b, reason: collision with root package name */
    public final o f19520b;

    public b(dv.b bVar, o oVar) {
        this.f19519a = bVar;
        this.f19520b = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C18248a((a.InterfaceC4053a) this.f19519a.get(), (l) this.f19520b.get());
    }
}

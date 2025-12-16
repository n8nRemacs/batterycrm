package Ya;

import com.avito.android.deep_linking.links.ItemStatsLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AdvertStatsHandlerModule_ProvideAdvertStatsHandlerFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f19522a;

    public d(b bVar) {
        this.f19522a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f19522a;
        c.f19521a.getClass();
        return new C43834a(ItemStatsLink.class, null, new C43834a.b.C11809b(bVar));
    }
}

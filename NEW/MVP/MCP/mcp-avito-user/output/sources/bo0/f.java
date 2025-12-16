package Bo0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchMainModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.header.b f1701a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.b f1702b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.name.b f1703c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.b f1704d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.switcher.b f1705e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.banner.b f1706f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.b f1707g;

    public f(com.avito.android.saved_searches.presentation.items.header.b bVar, com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.b bVar2, com.avito.android.saved_searches.presentation.items.name.b bVar3, com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.b bVar4, com.avito.android.saved_searches.presentation.items.switcher.b bVar5, com.avito.android.saved_searches.presentation.items.banner.b bVar6, com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.b bVar7) {
        this.f1701a = bVar;
        this.f1702b = bVar2;
        this.f1703c = bVar3;
        this.f1704d = bVar4;
        this.f1705e = bVar5;
        this.f1706f = bVar6;
        this.f1707g = bVar7;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.saved_searches.presentation.items.header.a aVar = (com.avito.android.saved_searches.presentation.items.header.a) this.f1701a.get();
        com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.a aVar2 = (com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.a) this.f1702b.get();
        com.avito.android.saved_searches.presentation.items.name.a aVar3 = (com.avito.android.saved_searches.presentation.items.name.a) this.f1703c.get();
        com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.a aVar4 = (com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.a) this.f1704d.get();
        com.avito.android.saved_searches.presentation.items.switcher.a aVar5 = (com.avito.android.saved_searches.presentation.items.switcher.a) this.f1705e.get();
        com.avito.android.saved_searches.presentation.items.banner.a aVar6 = (com.avito.android.saved_searches.presentation.items.banner.a) this.f1706f.get();
        com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.a aVar7 = (com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.a) this.f1707g.get();
        c.f1696a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        return c10493a.a();
    }
}

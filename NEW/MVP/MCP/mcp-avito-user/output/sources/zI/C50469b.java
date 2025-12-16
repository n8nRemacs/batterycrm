package zI;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionTabsItemModule_ProvideSectionTabsItemBlueprintFactory.java */
@e
@y
@x
/* renamed from: zI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50469b implements h<com.avito.android.home.tabs_item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C50468a f444006a;

    /* renamed from: b, reason: collision with root package name */
    public final u f444007b;

    public C50469b(C50468a c50468a, u uVar) {
        this.f444006a = c50468a;
        this.f444007b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.tabs_item.c cVar = (com.avito.android.home.tabs_item.c) this.f444007b.get();
        this.f444006a.getClass();
        return new com.avito.android.home.tabs_item.b(cVar);
    }
}

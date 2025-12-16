package com.avito.android.fakedoor_dialog.di;

import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FakeDoorDialogDeepLinkHandlerModule_ProvideFakeDoorDialogDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final lC.c f155120a;

    public d(lC.c cVar) {
        this.f155120a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        lC.c cVar = this.f155120a;
        c.f155119a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FakeDoorDialogLink.class, new lC.g(), new C43834a.b.C11809b(cVar));
    }
}

package pf0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LinkSlotModule_ProvideLinkSlotBlueprintFactory.java */
@e
@y
@x
/* renamed from: pf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47072b implements h<com.avito.android.publish.slots.link.item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.link.item.d> f428710a;

    public C47072b(Provider<com.avito.android.publish.slots.link.item.d> provider) {
        this.f428710a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.link.item.d dVar = this.f428710a.get();
        C47071a.f428709a.getClass();
        return new com.avito.android.publish.slots.link.item.b(dVar);
    }
}

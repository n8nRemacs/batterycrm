package bx0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvailableItemModule_ProvideBlueprint$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: bx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25735b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f57568a;

    public C25735b(u uVar) {
        this.f57568a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.social_management.adapter.available.b bVar = (com.avito.android.social_management.adapter.available.b) this.f57568a.get();
        int i12 = C25734a.f57567a;
        return new com.avito.android.social_management.adapter.available.a(bVar);
    }
}

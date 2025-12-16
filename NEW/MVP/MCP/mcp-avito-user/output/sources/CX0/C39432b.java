package cx0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConnectedItemModule_ProvideBlueprint$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: cx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39432b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393094a;

    public C39432b(u uVar) {
        this.f393094a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.social_management.adapter.connected.b bVar = (com.avito.android.social_management.adapter.connected.b) this.f393094a.get();
        int i12 = C39431a.f393093a;
        return new com.avito.android.social_management.adapter.connected.a(bVar);
    }
}

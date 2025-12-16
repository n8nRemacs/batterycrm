package dx0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HeaderItemModule_ProvideBlueprint$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: dx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39823b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f394181a;

    public C39823b(u uVar) {
        this.f394181a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.social_management.adapter.header.b bVar = (com.avito.android.social_management.adapter.header.b) this.f394181a.get();
        int i12 = C39822a.f394180a;
        return new com.avito.android.social_management.adapter.header.a(bVar);
    }
}

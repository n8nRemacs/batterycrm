package fx0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkGroupItemModule_ProvideBlueprint$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: fx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40494b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f396200a;

    public C40494b(u uVar) {
        this.f396200a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.social_management.adapter.vk_group.c cVar = (com.avito.android.social_management.adapter.vk_group.c) this.f396200a.get();
        int i12 = C40493a.f396199a;
        return new com.avito.android.social_management.adapter.vk_group.a(cVar);
    }
}

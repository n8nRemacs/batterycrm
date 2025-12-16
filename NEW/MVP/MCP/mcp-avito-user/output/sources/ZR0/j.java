package Zr0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerticalPublishModule_ProvidePublishSelectItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f20534a;

    public j(u uVar) {
        this.f20534a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.vertical_main.publish.item.a aVar = (com.avito.android.serp.adapter.vertical_main.publish.item.a) this.f20534a.get();
        int i12 = d.f20527a;
        return new com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.o(aVar);
    }
}

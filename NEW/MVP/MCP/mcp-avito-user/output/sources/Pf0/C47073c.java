package pf0;

import com.avito.android.publish.slots.link.item.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LinkSlotModule_ProvideLinkSlotPresenterFactory.java */
@e
@y
@x
/* renamed from: pf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47073c implements h<com.avito.android.publish.slots.link.item.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f428711a;

    public C47073c(u uVar) {
        this.f428711a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f428711a.get();
        C47071a.f428709a.getClass();
        return new g(aVar);
    }
}

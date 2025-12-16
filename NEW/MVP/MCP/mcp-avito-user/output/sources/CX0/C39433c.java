package cx0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConnectedItemModule_ProvidePresenter$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: cx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39433c implements h<com.avito.android.social_management.adapter.connected.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393095a;

    public C39433c(u uVar) {
        this.f393095a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c cVar = (com.jakewharton.rxrelay3.c) this.f393095a.get();
        int i12 = C39431a.f393093a;
        return new com.avito.android.social_management.adapter.connected.e(cVar);
    }
}

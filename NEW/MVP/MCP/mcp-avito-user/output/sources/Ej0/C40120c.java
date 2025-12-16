package ej0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RelatedProductsApi_Module_ProvideRelatedProductsApiFactory.java */
@e
@y
@x
/* renamed from: ej0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40120c implements h<InterfaceC40118a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f395328a;

    public C40120c(f fVar) {
        this.f395328a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f395328a.get();
        C40119b.f395327a.getClass();
        InterfaceC40118a interfaceC40118a = (InterfaceC40118a) r02.create(InterfaceC40118a.class);
        t.d(interfaceC40118a);
        return interfaceC40118a;
    }
}

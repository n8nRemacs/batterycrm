package Ii0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecommendationItemsLoaderApi_Module_ProvideRecommendationItemsLoaderApiFactory.java */
@e
@y
@x
/* renamed from: Ii0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14118c implements h<InterfaceC14116a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f8491a;

    public C14118c(f fVar) {
        this.f8491a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f8491a.get();
        C14117b.f8490a.getClass();
        InterfaceC14116a interfaceC14116a = (InterfaceC14116a) r02.create(InterfaceC14116a.class);
        t.d(interfaceC14116a);
        return interfaceC14116a;
    }
}

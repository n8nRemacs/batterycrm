package Tn;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryItemsTreeApi_Module_ProvideCategoryItemsTreeApiFactory.java */
@e
@y
@x
/* renamed from: Tn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15381c implements h<InterfaceC15379a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f15839a;

    public C15381c(f fVar) {
        this.f15839a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f15839a.get();
        C15380b.f15838a.getClass();
        InterfaceC15379a interfaceC15379a = (InterfaceC15379a) r02.create(InterfaceC15379a.class);
        t.d(interfaceC15379a);
        return interfaceC15379a;
    }
}

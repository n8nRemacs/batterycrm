package tY;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MasterPlanApi_Module_ProvideMasterPlanApiFactory.java */
@e
@y
@x
/* renamed from: tY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48616c implements h<InterfaceC48614a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439271a;

    public C48616c(f fVar) {
        this.f439271a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439271a.get();
        C48615b.f439270a.getClass();
        InterfaceC48614a interfaceC48614a = (InterfaceC48614a) r02.create(InterfaceC48614a.class);
        t.d(interfaceC48614a);
        return interfaceC48614a;
    }
}

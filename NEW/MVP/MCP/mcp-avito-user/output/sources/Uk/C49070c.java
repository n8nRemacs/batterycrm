package uk;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BtobBusinessTripApi_Module_ProvideBtobBusinessTripApiFactory.java */
@e
@y
@x
/* renamed from: uk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49070c implements h<InterfaceC49068a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f440225a;

    public C49070c(f fVar) {
        this.f440225a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f440225a.get();
        C49069b.f440224a.getClass();
        InterfaceC49068a interfaceC49068a = (InterfaceC49068a) r02.create(InterfaceC49068a.class);
        t.d(interfaceC49068a);
        return interfaceC49068a;
    }
}

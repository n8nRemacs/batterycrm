package Pg;

import Qg.C14892a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeEncoder_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Pg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14782a implements h<com.avito.android.barcode_encoder.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Qg.b f13225a;

    public C14782a(Qg.b bVar) {
        this.f13225a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.barcode_encoder.a((C14892a) this.f13225a.get());
    }
}

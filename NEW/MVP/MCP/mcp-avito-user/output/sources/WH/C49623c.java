package wh;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblApi_Module_ProvideBblApiFactory.java */
@e
@y
@x
/* renamed from: wh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49623c implements h<InterfaceC49621a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f441744a;

    public C49623c(f fVar) {
        this.f441744a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441744a.get();
        C49622b.f441743a.getClass();
        InterfaceC49621a interfaceC49621a = (InterfaceC49621a) r02.create(InterfaceC49621a.class);
        t.d(interfaceC49621a);
        return interfaceC49621a;
    }
}

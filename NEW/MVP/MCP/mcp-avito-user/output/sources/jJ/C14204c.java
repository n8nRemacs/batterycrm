package Jj;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HeaderTooltipStorage_Factory.java */
@e
@y
@x
/* renamed from: Jj.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14204c implements h<C14202a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9126a;

    public C14204c(u uVar) {
        this.f9126a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14202a((l) this.f9126a.get());
    }
}
